<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="xyz.itwill.dto.CartDTO"%>
<%@ page import="xyz.itwill.dao.CartDAO"%>
<%@ page import="xyz.itwill.dto.ProductDTO"%>
<%@ page import="xyz.itwill.dao.ProductDAO"%>

<%
// 세션에서 clientNum 가져오기
// 사용자의 로그인 정보를 세션에서 가져와 loginClient 객체로 만듭니다.
ClientDTO loginClient = (ClientDTO) session.getAttribute("loginClient");

// loginClient 객체에서 clientNum(고객 번호)을 추출하여 cartNum 변수에 저장합니다.
int cartNum = loginClient.getClientNum();

// cartNum을 이용하여 해당 사용자의 장바구니 목록을 가져옵니다.
List<CartDTO> cartList = CartDAO.getCartDAO().selectCartClient(cartNum);

// ProductDAO 객체를 가져와서 상품 정보를 얻는 데 사용합니다.
ProductDAO productDAO = ProductDAO.getDAO();

// 총 금액을 계산하기 위해 필요한 변수들을 초기화합니다.
int totalSum = 0;
int delivery = 3000; // 배송비는 3000원으로 설정합니다.
int itemTotal = 0;
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
										// 장바구니 목록이 비어있지 않으면 아래의 코드를 실행합니다.
										if (cartList != null && !cartList.isEmpty()) { 
										
										    // 장바구니 목록에 있는 각 항목에 대해 반복합니다.
										    for (CartDTO cart : cartList) {
										
										        // 각 장바구니 항목에 해당하는 상품 정보를 가져옵니다.
										        ProductDTO product = productDAO.selectProduct(cart.getCartProductNum());
										
										        // 상품 정보를 가져오는 데 실패한 경우 에러 메시지를 출력하고 다음 항목으로 넘어갑니다.
										        if (product == null) {
										            out.println("<tr><td colspan='5'>상품 정보를 가져오는데 실패했습니다.</td></tr>");
										            continue;
										        }
										
										        // 상품의 가격을 가져옵니다.
										        int productPrice = product.getProductPrice();
										
										        // 상품의 총 가격을 계산합니다 (수량 * 가격).
										        itemTotal = cart.getCartCount() * productPrice;
										
										        // 총 금액에 상품의 총 가격을 더합니다.
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
