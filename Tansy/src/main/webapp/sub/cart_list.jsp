<%@page import="xyz.itwill.dto.CartDTO"%>
<%@page import="xyz.itwill.dao.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<link rel="stylesheet" type="text/css" href="../css/common.css">
<link rel="stylesheet" type="text/css" href="../css/font.css">
<link rel="stylesheet" type="text/css"
	href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css">
<link rel="stylesheet" type="text/css" href="../css/slick-theme.css">
<link rel="icon" href="../images/logo_favicon.png" />
<link rel="apple-touch-icon" href="../images/logo_favicon.png" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript"
	src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
	
<link rel="stylesheet" type="text/css" href="../css/styles.css">
<%
	int clientNum=(Integer)session.getAttribute("cartClientNum");

	CartDAO cartDAO=CartDAO.getCratDAO();	
	CartDTO cart=cartDAO.selectCratClient(cartClientNum);
	
	if(cart == null){
		out.println("장바구니가 비어있습니다");
	}  else

%>
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
										<th><%= cart.getCartProductNum() %>상품/옵션 정보</th>
										<th><%= cart.getCartCount() %>수량</th>
										<th><%= cart.getCartSum() %>상품금액</th>
										<th>합계금액</th>
										<th>배송비</th>
									</tr>
								</thead>
								<tbody>
									<tr class="order_goods">
										<td class="td_left"></td>
										<td class="td_order_amount">
											<div class="order_goods_num">
												<strong>개</strong>
											</div>
										</td>
										<td><strong class="order_sum_txt price">원</strong></td>
										<td><strong class="order_sum_txt">원</strong></td>
										<td class="td_delivery">기본 - 금액별 배송비 <br> 원 <br>
											(택배선결제)
										</td>
									</tr>
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
								<dt><%=cart.getCartSum() %>총 개의 상품금액</dt>
								<dd>원</dd>
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
								<dd>원</dd>
							</dl>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="payment_final_total">
			<dl>
				<dd>
					<span> <strong>원</strong>
					</span>
				<dt>최종 결제 금액</dt>
				</dd>
			</dl>
		</div>
		<div class="btn_center_box">
			<button class="btn_order_buy" type="button">
				<em>결제하기</em>
			</button>
		</div>
	</div>

	<div id="footer">
		<%@include file="/footer.jspf"%>
	</div>
</body>
