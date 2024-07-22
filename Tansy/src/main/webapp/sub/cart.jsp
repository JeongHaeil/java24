<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="xyz.itwill.dto.CartDTO"%>
<%@ page import="xyz.itwill.dao.CartDAO"%>
<%@ page import="xyz.itwill.dto.ProductDTO"%>
<%@ page import="xyz.itwill.dao.ProductDAO"%>

<%
    int clientNum = (Integer) session.getAttribute("clientNum");
    CartDAO cartDAO = CartDAO.getCartDAO();
    List<CartDTO> cartList = cartDAO.selectCartClient(clientNum);

    ProductDAO productDAO = new ProductDAO();
%>

<!DOCTYPE html>
<html>
<head>
    <title>장바구니</title>
    <link rel="stylesheet" type="text/css" href="../css/common.css">
    <link rel="stylesheet" type="text/css" href="../css/font.css">
    <link rel="stylesheet" type="text/css" href="../css/cart.css">
</head>
<body>
    <div id="header">
        <jsp:include page="../header.jspf"/>
    </div>
    <div id="mainArticle" class="cont_article">
        <div class="contents">
            <div id="locationWrap"><br>홈 > 장바구니</div>
            <div class="sub_content">
                <div class="content_box">
                    <div class="order_tit">
                        <br>
                        <h2>장바구니</h2>
                        <ol>
                            <li class="page_on">03 주문완료</li>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <li>02 주문서작성/결제</li>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <li>01 장바구니</li>
                        </ol>
                    </div>
                </div>
                <div class="cart_cont">
                    <% if (cartList.isEmpty()) { %>
                        <p class='no_data'>장바구니에 담겨있는 상품이 없습니다</p>
                    <% } else { %>
                        <form id="orderForm" action="order.jsp" method="post">
                            <table>
                                <thead>
                                    <tr>
                                        <th><input type="checkbox" id="selectAll"> 전체선택</th>
                                        <th>상품명</th>
                                        <th>수량</th>
                                        <th>가격</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        int totalSum = 0;
                                        for (CartDTO cart : cartList) {    
                                            ProductDTO product = productDAO.selectProduct(cart.getCartProductNum());
                                            int productPrice = product.getProductPrice();
                                            int itemTotal = cart.getCartCount() * productPrice;
                                            totalSum += itemTotal;
                                    %>
                                        <tr>
                                            <td><input type="checkbox" name="selectedCart" value="<%= cart.getCartNum() %>"></td>
                                            <td>상품명: <%= product.getProductName() %></td>
                                            <td>수량: <%= cart.getCartCount() %></td>
                                            <td>가격: <%= productPrice %>원</td>
                                        </tr>
                                    <% } %>
                                </tbody>
                            </table>
                        </form>
                    <% } %>
                </div>
                <div class="btn_left_box"><a href="cart.jsp" class="shop_go_link">◁쇼핑 계속하기</a></div>
                <% if (!cartList.isEmpty()) { %>
                    <div class="price_sum">
                        <div class="price_sum_cont">
                            <div class="price_sum_list">
                                <dl>
                                    <dt>총 <%= cartList.size() %> 개의 상품금액</dt>
                                    <dd><%= totalSum %> 원</dd>
                                </dl>
                                <span><img src="../images/order_price_plus.png"></span>
                                <dl>
                                    <dt>배송비</dt>
                                    <dd>0원</dd>
                                </dl>
                                <span><img src="../images/order_price_total.png"></span>
                                <dl>
                                    <dt>합계</dt>
                                    <dd><%= totalSum %> 원</dd>
                                </dl>
                            </div>
                        </div>
                    </div>
                    <div class="btn_order_box">
                        <span class="btn_left_box">
                            <button type="button" class="btn_order_choice_del">선택 상품 삭제</button>
                            <button type="button" class="btn_order_choice_wish">선택 상품 찜</button>
                        </span>
                        <span class="btn_right_box">
                            <button type="button" class="btn_order_choice_buy" onclick="submitSelectedOrder()">선택 상품 주문</button>
                            <button type="button" class="btn_order_whole_buy" onclick="submitWholeOrder()"> 전체 상품 주문</button>
                        </span>
                    </div>
                <% } %>
            </div>
        </div>
    </div>
    <div id="footer">
        <%@ include file="../footer.jspf" %>
    </div>

    <script>
        // 전체 선택 기능
        document.getElementById('selectAll').addEventListener('click', function(event) {
            var checkboxes = document.querySelectorAll('input[name="selectedCart"]');
            for (var checkbox of checkboxes) {
                checkbox.checked = event.target.checked;
            }
        });

        // 선택 상품 주문
        function submitSelectedOrder() {
            document.getElementById('orderForm').submit();
        }

        // 전체 상품 주문
        function submitWholeOrder() {
            var checkboxes = document.querySelectorAll('input[name="selectedCart"]');
            for (var checkbox of checkboxes) {
                checkbox.checked = true;
            }
            document.getElementById('orderForm').submit();
        }
    </script>
</body>
</html>
