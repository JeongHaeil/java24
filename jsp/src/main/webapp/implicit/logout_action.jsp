<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 로그아웃 처리 후 클라이언트에게 [login.form.jsp] 문서를 요청할 수 있는 URL 주소를 전달하여 응답  --%>
<%-- => 로그아웃 : 세션에 저장된 권한 관련 정보의 속성값 삭제 처리 --%>

<%
	//session.removeAttribute("loginId");

	//session.invalidate(); : 세션을 언바인딩 처리한 후 삭제하는 메소드
	session.invalidate();

	response.sendRedirect("login_form.jsp");
	
%>
    