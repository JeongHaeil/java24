<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    

<%
	if(request.getAttribute("hewon") == null){ //비정상적인 요청
		response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		return;
	}
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보확인</h1>
	<%-- useBean 태그를 사용해 request 내장객체에 저장된 속성값을 객체로 반환받아 jsp 문서에 --%>
	<jsp:useBean id="hewon" class="xyz.itwill.bean.HewonBean" scope="request"/>
	<%-- HewonBean hewon=(HewonBean)request.getAttribute ("hewon");동일 --%>
	
	<%-- getProperty 태그 useBean 태그로 제공받은 객체의 필드값을 반환하는 태그 --%>
	<%-- 객체로 Getter 메소드를 호출하여 필드값 반환하는 기능과 동일 - Getter 메소드 없으면 에러 --%>
	<hr>
	<p>이름 = <jsp:getProperty property="name" name="hewon" /></p>
	<p>전화번호 = <jsp:getProperty property="phone" name="hewon" /></p>
	<p>주소 = <jsp:getProperty property="address" name="hewon" /></p>
</body>
</html>