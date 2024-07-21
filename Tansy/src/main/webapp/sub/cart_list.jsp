<%@ page import="xyz.itwill.dto.OrdDTO"%>
<%@ page import="xyz.itwill.dao.OrderDAO"%>
<%@ page import="xyz.itwill.dto.ClientDTO"%>
<%@ page import="xyz.itwill.dao.ClientDAO"%>
<%@ page import="xyz.itwill.dto.CartDTO"%>
<%@ page import="xyz.itwill.dao.CartDAO"%>
<%@ page import="xyz.itwill.dao.ProductDAO"%>
<%@ page import="xyz.itwill.dto.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" type="text/css" href="../css/common.css">
<link rel="stylesheet" type="text/css" href="../css/font.css">
<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css">
<link rel="stylesheet" type="text/css" href="../css/slick-theme.css">
<link rel="icon" href="../images/logo_favicon.png" />
<link rel="apple-touch-icon" href="../images/logo_favicon.png" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>

<link rel="stylesheet" type="text/css" href="../css/styles.css">
<%
    int clientNum = (Integer) session.getAttribute("clientNum");

    CartDAO cartDAO = CartDAO.getCartDAO();
    ProductDAO productDAO = new ProductDAO();
    ClientDAO clientDAO = ClientDAO.getClientDAO();

    List<CartDTO> cartList = cartDAO.selectCartClient(clientNum);
    ClientDTO client = clientDAO.selectClient(clientNum);

    if (cartList.isEmpty()) {
        out.println("장바구니가 비어있습니다");
    } else {
        int totalSum = 0;
%>
<!DOCTYPE html>
<html>
<head>
    <title>구매 페이지</title>
    <!-- CSS and JavaScript includes -->
</head>
<body>
    <div id="header">
        <jsp:include page="/header.jspf" />
    </div>

    <div id="mainArticle" class="cont_article">
        <div class="contents">
            <div id="locationWrap">
                <br>홈 > 주문서작성/결제
            </div>
            <div class="sub_content">
                <div class="content_box">
                    <div class="order_title">
                        <h2>주문서작성/결제</h2>
                        <ol class="order_steps">
                            <li class="step_completed">03 주문완료</li>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <li class="step_current">02 주문서작성/결제</li>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <li class="step_pending">01 장바구니</li>
                        </ol>
                    </div>

                    <div class="cart_content_list">
                        <div class="order_cart_title">
                            <h3>주문상세내역</h3>
                        </div>
                        <div class="order_table">
                            <table>
                                <colgroup>
                                    <col>
                                    <col style="width: 5%;">
                                    <col style="width: 10%;">
                                    <col style="width: 13%;">
                                    <col style="width: 10%;">
                                </colgroup>
                                <thead class="form_element">
                                    <tr>
                                        <th>상품/옵션 정보</th>
                                        <th>수량</th>
                                        <th>상품금액</th>
                                        <th>합계금액</th>
                                        <th>배송비</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <% for (CartDTO cart : cartList) { %>
                                    <%
                                        ProductDTO product = productDAO.selectProduct(cart.getCartProductNum());
                                        int productPrice = product.getPrice();
                                        int itemTotal = cart.getCartCount() * productPrice;
                                        totalSum += itemTotal;
                                    %>
                                    <tr class="order_goods">
                                        <td class="td_left"><%= product.getName() %></td>
                                        <td class="td_order_amount">
                                            <div class="order_goods_num">
                                                <strong><%= cart.getCartCount() %> 개</strong>
                                            </div>
                                        </td>
                                        <td><strong class="order_sum_txt price"><%= productPrice %> 원</strong></td>
                                        <td><strong class="order_sum_txt"><%= itemTotal %> 원</strong></td>
                                        <td class="td_delivery">기본 - 금액별 배송비 <br> 원 <br>(택배선결제)</td>
                                    </tr>
                                    <% } %>
                                </tbody>
                            </table>
                        </div>
                    </div>

                    <div class="btn_left_box">
                        <a href="https://www.naver.com" class="shop_go_link">&lt;장바구니가기</a>
                    </div>
                </div>

                <div class="price_summary">
                    <div class="price_summary_content">
                        <div class="price_summary_list">
                            <dl>
                                <dt>총 <%= cartList.size() %> 개의 상품금액</dt>
                                <dd><%= totalSum %> 원</dd>
                            </dl>
                            <span> <img src="../images/order_price_plus.png">
                            </span>
                            <dl>
                                <dt>배송비</dt>
                                <dd>원</dd>
                            </dl>
                            <span> <img src="../images/order_price_total.png">
                            </span>
                            <dl>
                                <dt>합계</dt>
                                <dd><%= totalSum %> 원</dd>
                            </dl>
                        </div>
                    </div>
                </div>

                <form action="processOrder.jsp" method="post">
                    <div class="order_information">
                        <div class="order_zone_title">
                            <h4>주문자 정보</h4>
                        </div>
                        <div class="order_table">
                            <table class="table_left">
                                <colgroup>
                                    <col style="width: 15%;">
                                    <col style="width: 80%;">
                                </colgroup>
                                <tbody>
                                    <tr>
                                        <th>
                                            <span class="important">주문하시는분</span>
                                        </th>
                                        <td>
                                            <input type="text" name="orderer_name" value="<%= client.getClientName() %>">
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <span class="important">전화번호</span>
                                        </th>
                                        <td>
                                            <input type="text" name="orderer_phone" value="<%= client.getClientMobile() %>">
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <span class="important">이메일</span>
                                        </th>
                                        <td>
                                            <input type="text" name="orderer_email" value="<%= client.getClientEmail() %>">
                                            <select name="email_domain">
                                                <option value="naver.com">naver.com</option>
                                                <option value="daum.net">daum.net</option>
                                                <option value="gmail.com">gmail.com</option>
                                            </select>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>

                    <div class="delivery_information">
                        <div class="order_zone_title">
                            <h4>배송 정보</h4>
                        </div>
                        <div class="order_table">
                            <table class="table_left">
                                <colgroup>
                                    <col style="width: 15%;">
                                    <col style="width: 80%;">
                                </colgroup>
                                <tbody>
                                    <tr>
                                        <th>
                                            <span class="important">받으실분</span>
                                        </th>
                                        <td>
                                            <input type="text" name="recipient_name" value="<%= client.getClientName() %>">
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <span class="important">받으실곳</span>
                                        </th>
                                        <td class="member_address">
                                            <div class="address_postcode">
                                                <input type="text" id="postcode" name="postcode" value="<%= client.getClientZipcode() %>">
                                                <button type="button" id="btn_post_search" class="btn_post_search">우편번호검색</button>
                                            </div>
                                            <div class="address_input">
                                                <input type="text" id="address" name="address" value="<%= client.getClientAddress1() %>" width="200">
                                                <input type="text" id="detailAddress" name="detailAddress" value="<%= client.getClientAddress2() %>" width="150">
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <span class="important">전화번호</span>
                                        </th>
                                        <td>
                                            <input type="text" name="recipient_phone" value="<%= client.getClientMobile() %>">
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>

                    <div class="payment_method">
                        <div class="order_zone_title">
                            <h4>결제수단 선택/결제</h4>
                        </div>
                        <div class="order_table">
                            <table class="table_left">
                                <colgroup>
                                    <col style="width: 15%;">
                                    <col style="width: 80%;">
                                </colgroup>
                                <tbody>
                                    <tr>
                                        <th>
                                            <span class="important">일반 결제</span>
                                        </th>
                                        <td>
                                            <input type="radio" name="payment_method" value="bank_transfer">계좌이체
                                            <input type="radio" name="payment_method" value="kakao_pay">카카오페이
                                            <input type="radio" name="payment_method" value="credit_card">신용카드
                                            <input type="radio" name="payment_method" value="mobile_payment">휴대폰결제
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>
                                            <span class="important">현금영수증/계산서 발행</span>
                                        </th>
                                        <td>
                                            <input type="radio" name="receipt" value="none">신청안함
                                            <input type="radio" name="receipt" value="cash_receipt">현금영수증
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>

                    <div class="payment_final_total">
                        <dl>
                            <dd>
                                <span> <strong><%= totalSum %> 원</strong>
                                </span>
                                <dt>최종 결제 금액</dt>
                            </dd>
                        </dl>
                    </div>
                    <div class="btn_center_box">
                        <button class="btn_order_buy" type="submit">
                            <em>결제하기</em>
                        </button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <div id="footer">
        <%@ include file="/footer.jspf" %>
    </div>
</body>
<%
    } // else 블록의 끝
%>
