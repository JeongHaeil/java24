﻿<%@page import="xyz.itwill.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//session 내장객체에서 권한 관련 정보가 저장된 속성값을 객체로 반환받아 저장
	// => null 반환 : 속성값이 없는 경우 - 비로그인 사용자
	// => MemberDTO 객체 반환 : 속성값이 있는 경우 - 로그인 사용자
	MemberDTO loginMember=(MemberDTO)session.getAttribute("loginMember");
%>    
<div id="profile">
	<% if(loginMember == null) { %>
		<a href="index.jsp?workgroup=member&work=member_login">로그인</a>&nbsp;&nbsp;
		<a href="index.jsp?workgroup=member&work=member_join">회원가입</a>&nbsp;&nbsp;
	<% } else { %>
		<span style="font-weight: bold;">[<%=loginMember.getMemberName() %>]님, 환영합니다.</span>&nbsp;&nbsp;
		<a href="index.jsp?workgroup=member&work=member_logout_action">로그아웃</a>&nbsp;&nbsp;
		<a href="index.jsp?workgroup=member&work=member_mypage">내정보</a>&nbsp;&nbsp;
		<% if(loginMember.getMemberAuth() == 9) {//로그인 사용자가 관리자인 경우 %>
			<a href="index.jsp?workgroup=admin&work=admin_main">관리자</a>&nbsp;&nbsp;
		<% } %>
	<% } %>
</div>
<div id="logo"><a href="index.jsp">쇼핑몰</a></div>
<div id="menu">
	<a href="index.jsp?workgroup=product&work=product_list">제품소개</a>
	<a href="index.jsp?workgroup=cart&work=cart_list">장바구니</a>
	<a href="index.jsp?workgroup=order&work=order_list">구매내역</a>
	<a href="index.jsp?workgroup=review&work=review_list">리뷰게시판</a>
</div>