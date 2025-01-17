<?xml version="1.0" encoding="utf-8"?>
<%@page import="xyz.itwill.dto.AjaxMemberDTO"%>
<%@page import="xyz.itwill.dao.AjaxMemberDAO"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 이름과 이메일을 전달받아 AJAX_MEMBER 테이블에 저장된 회원정보의 아이디를 검색해 XML로 응답하는 JSP 문서 --%>    
<%
	if(request.getMethod().equals("GET")) {
		response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		return;
	}

	//POST 방식으로 요청하여 전달된 값을 읽기 위한 문자형태 변경
	request.setCharacterEncoding("utf-8");
	
	//전달값을 반환받아 저장
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	
	//이름과 이메일을 전달받아 AJAX_MEMBER 테이블에 저장된 행의 아이디를 검색하여 문자열로 
	//반환하는 AjaxMemberDAO 클래스의 메소드 호출
	//String id=AjaxMemberDAO.getDAO().selectAjaxMemberId(name, email);
	
	//회원정보(AjaxMemberDTO 객체)를 전달받아 AJAX_MEMBER 테이블에 저장된 행의 아이디를 검색하여 
	//문자열로 반환하는 AjaxMemberDAO 클래스의 메소드 호출
	AjaxMemberDTO ajaxMember=new AjaxMemberDTO();
	ajaxMember.setName(name);
	ajaxMember.setEmail(email);
	String id=AjaxMemberDAO.getDAO().selectAjaxMemberId(ajaxMember);
%>
<result>
	<% if(id != null) {//검색된 아이디가 있는 경우 %>
	<code>success</code>
	<id><%=id%></id>
	<% } else {//검색된 아이디가 없는 경우 %>
	<code>empty</code>	
	<% } %>	
	}
</result>