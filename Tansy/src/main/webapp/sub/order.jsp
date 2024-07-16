<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<link rel="stylesheet" type="text/css" href="../css/common.css">
<link rel="stylesheet" type="text/css" href="../css/font.css">
<link rel="stylesheet" type="text/css" href="../css/slick-theme.css">
<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css">
<link rel="icon" href="../images/logo_favicon.png"/>
<link rel="apple-touch-icon" href="../images/logo_favicon.png"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>   
<link rel="stylesheet" type="text/css" href="../css/styles.css">

<body>
<div id="header">
<jsp:include page="header.jspf"/>
	</div>
	<div id="campIndex">
		<a href="#camp"></a>
		<a href=""></a>
	</div>
	<div id="mainWrap" class="wrap_main">
		<div class="wrap_top">
			<div class="inner_top">
				<ul class="list_top">
					<li><a href="#" class="link_top">로그인</a></li>
					<li><a href="#" class="link_top">회원가입</a></li>
				</ul>
			</div>
		</div>
		<div id="wrapHead" class="wrap_head">
			<div class="inner_head clear_fix">
				<h1>
					<span class="screen_out">네이쳐기어</span>
					<a href="#" class="link_tit"><img src="../images/logo_camp.png" alt="네이쳐기어"></a>

				</h1>
				<div class="wrap_search">
					<h2 class="screen_out">검색</h2>
					<form action="#" method="get" class="form_search">
						<fieldset>
							<legend class="screen_out">통합검색</legend>
							<input type="text" name="inpSearch" id="inpSearch" class="inp_search">
							<button type="submit" class="btn_search"><span>검색</span></button>
						</fieldset>
					</form>
				</div>
				<div class="wrap_menu">
					<ul class="list_menu">
						<li>
							<a href="#" class="link_menu">
								<img src="../images/top_mypage.png" alt="마이페이지">
								<span>마이페이지</span>
							</a>
						</li>
						<li>
							<a href="#" class="link_menu">
								<img src="../images/top_cart.png" alt="장바구니">
								<span>장바구니</span>
								<span class="screen_out">상품갯수</span><span class="num_product">1</span>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="wrap_nav">
				<div class="inner_nav clear_fix">
					<div class="wrap_cate">
						<h2 class="all_cate">전체카테고리</h2>
						<ul class="list_cate">
							<li>
								<a href="#" class="link_cate">텐트</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">쉘터</a></li>
									<li><a href="#" class="link_cate">거실형텐트</a></li>
									<li><a href="#" class="link_cate">티피텐트</a></li>
									<li><a href="#" class="link_cate">팝업텐트</a></li>
									<li><a href="#" class="link_cate">에어텐트</a></li>
									<li><a href="#" class="link_cate">차박텐트</a></li>
									<li><a href="#" class="link_cate">루프탑텐트</a></li>
									<li><a href="#" class="link_cate">텐트소품</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">타프</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
									<li><a href="#" class="link_cate">텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">이블/체어/가구</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">매트/침낭/해먹</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">화로대/버너</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">쿨러/식기/물품</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">박스/웨건/가방</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">랜턴</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">전기용품</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">서큘레이터/에어컨</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">전기요/난로/난방용품</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">레저/자동차</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">의류/잡화/키즈</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
							<li>
								<a href="#" class="link_cate">푸드</a>
								<ul class="list_cate_sub">
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
									<li><a href="#" class="link_cate">돔텐트</a></li>
								</ul>
							</li>
						</ul>
					</div>
					<div class="wrap_gnb">
						<h2 class="screen_out">서비스 주요 메뉴</h2>
						<ul class="list_gnb">
							<li><a href="#" class="link_gnb">신상품</a></li>
							<li><a href="#" class="link_gnb">베스트</a></li>
							<li><a href="#" class="link_gnb">특가혜택</a></li>
							<li><a href="#" class="link_gnb">재입고</a></li>
							<li><a href="#" class="link_gnb">리퍼</a></li>
						</ul>
					</div>	
					<ul class="list_board">
						<li><a href="#" class="link_board">공지사항</a></li>
						<li><a href="#" class="link_board">고객문의</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="mainArticle" class="cont_article">
            <div class="contents"> 
                <div id="locationWrap"><br>홈 > 주문서작성/결제</div>
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
                                            <th><input type="checkbox" class="infoselect"> 상품/옵션 정보</th>
                                            <th>수량</th>
                                            <th>상품금액</th>
                                            <th>합계금액</th>
                                            <th>배송비</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="order_goods">
                                            <td class="td_left"><input type="checkbox" class="select">상품정보</td>
                                            <td class="td_order_amount">
                                                <div class="order_goods_num">
                                                    <strong>개</strong>
                                                </div>
                                            </td>
                                            <td>
                                                <strong class="order_sum_txt price">원</strong>
                                            </td>
                                            <td>
                                                <strong class="order_sum_txt">원</strong>
                                            </td>
                                            <td class="td_delivery">
                                                기본 - 금액별 배송비
                                                <br>
                                                 원
                                                <br>
                                                (택배선결제)
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="btn_left_box"><a href="https://www.naver.com" class="shop_go_link">&lt;장바구니 가기</a></div>
                    </div>
                    <div class="price_summary">
                        <div class="price_summary_content">
                            <div class="price_summary_list">
                                <dl>
                                    <dt>총 0 개의 상품금액</dt>
                                    <dd>원</dd>
                                </dl>
                                <span>
                                    <img src="../images/order_price_plus.png">
                                </span>
                                <dl>
                                    <dt>배송비</dt>
                                    <dd>원</dd>
                                </dl>
                                <span>
                                    <img src="../images/order_price_total.png">
                                </span>
                                <dl>
                                    <dt>합계</dt>
                                    <dd> 원</dd>
                                </dl>
                            </div>
                        </div>
                    </div>
                </div>  
            </div>
            <div class="order_view_info">
                <div class="order_agree">
                    <div class="order_zone_title">
                        <h4>상품 공급사 개인정보 제공 동의</h4>
                        <div class="agreement_box">
                            - 제공받는 자 : 엘레컴코리아 공급사
                            <br>
                            - 이용목적 : 상품 및 경품(서비스) 배송(전송), 반품, 환불, 고객상담 등 정보통신서비스제공계약 및 전자상거래(통신판매)계약의 이행을 위해 필요한 업무의 처리
                            <br>
                            - 수집항목 : 구매자정보(닉네임, 이름, 휴대전화 번호, 이메일주소), 수령인정보(이름, 휴대전화 번호, 수령인 주소), 상품 구매, 취소, 반품, 교환정보, 송장정보
                            <br>
                            - 보유 / 이용기간 : 상품 제공 완료 후 3개월  
                        </div>
                        <div class="form_element">
                            <input type="checkbox" class="require">
                            <label class="check_s">
                                <strong>(필수)</strong>
                                상품 공급사 개인정보 제공 동의에 대한 내용을 확인 하였으며 이에 동의 합니다.
                            </label>
                        </div>
                    </div>
                </div>
            </div>
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
                                    
                                    <input type="text">
                                </td>
                            </tr>
                            <tr>
                                <th>
                                    <span class="important">전화번호</span>
                                </th>
                                <td>
                                    <input type="text">
                                </td>
                            </tr>
                            <tr>
                                <th>
                                    <span class="important">휴대폰 번호</span>
                                </th>
                                <td>
                                    <input type="text">
                                </td>
                            </tr>
                            <tr>
                                <th>
                                    <span class="important">이메일</span>
                                </th>
                                <td>
                                    <input type="text">
                                    <select class="chosen-select">
                                        <option value="self">직접입력</option>
                                        <option value="naver.com">naver.com</option>
                                        <option value="daum.net">daum.net</option>
                                        <option value="gmail.com">gmail.com</option>
                                    </select>
                
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="delivery_information">
                    <div class="order_zone_title">
                        <h4>배송 정보</h4>
                    </div>
                    <form type="" name="order" id="order" method="post">
                    <div class="order_table">
                        <table class="table_left">
                            <colgroup>
                                <col style="width: 15%;">
                                <col style="width: 80%;">
                            </colgroup>
                            <tbody>
                                <tr>
                                    <th>
                                        <span class="important">배송지 확인</span>
                                    </th>
                                    <td>
                                        <div class="form_element">
                                            <ul>
                                                <li>
                                                    <input type="radio" name="coopng">
                                                    <label class="choice_s">기본배송지</label>    
                                              
                                                <br>
                                                <li>
                                                    <input type="radio" name="coopng">
                                                    <label class="choice_s">주문자정보와동일</label>    
                                                </li>
                                                
                                                <li>
                                                    <input type="radio" name="coopng">
                                                    <label class="choice_s">최근 배송지</label>    
                                                </li>
                                            </ul>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <span class="important">받으실분</span>
                                    </th>
                                    <td>
                                        <input type="text">
                                    </td>   
                                </tr>
                                <tr>
                                    <th>
                                        <span class="important">받으실곳</span>
                                    </th>
                                    <td class="member_address">
                                        <div class="address_postcode">
                                            <input type="text" id="postcode">
                                            <button type="button" id="btn_post_search" class="btn_post_search">우편번호검색</button>
                                        </div>
                                        <div class="address_input">
                                            <input type="text" id="address" style="width:250px";>
                                            <input type="text" id="detailAddress" style="width:180px";>
                                        </div>
                                    </td>
                                    <script src="../js/order.js"></script>
                                </tr>
                                <tr>
                                    <th>
                                        <span class="important">전화번호</span>
                                    </th>
                                    <td>
                                        <input type="text">
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <span class="important">휴대폰번호</span>
                                    </th>
                                    <td>
                                        <input type="text">
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                </form>
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
                                        <input type="radio" name="paypay">계좌이체
                                        <input type="radio" name="paypay">카카오페이
                                        <input type="radio" name="paypay">신용카드
                                        <input type="radio" name="paypay">휴대폰결제
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <span class="important">현금영수증/계산서 발행</span>
                                    </th>
                                    <td>
                                        <input type="radio"name="pay_pay">신청안함
                                        <input type="radio"name="pay_pay">현금영수증
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        
            <div class="payment_final_total">
                <dl>
                    <dd>
                        <span>
                            <strong>0원</strong>
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
            <div id="paymentModal" class="modal">
                <div class="modal-content">
                    <span class="close">&times;</span>
                    <h2>결제 정보</h2>
                    <form id="paymentForm">
                        <label for="cardNumber">생년 월일</label>
                        <input type="text" id="cardNumber" name="cardNumber" required>
        
                        <label for="expiryDate">핸드폰번호</label>
                        <input type="text" id="expiryDate" name="expiryDate" required>
        
                        <label for="cvv">인증번호</label>
                        <input type="text" id="cvv" name="cvv" required>
        
                        <button type="submit">결제하기</button>
                    </form>
                </div>
                
            </div>
        
            <script src="../order_pay.js"></script>
        </div>
       
<div id="footer">
		<%@include file="footer.jspf" %>
</div>


</body>