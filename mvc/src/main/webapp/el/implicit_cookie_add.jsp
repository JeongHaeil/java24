<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//클라이언트에게 쿠키를 전달하여 저장하기 위해서는 Cookie 객체 생성
	// => Cookie 객체에 저장되는 쿠키명과 쿠키값은 영문자, 숫자, 일부 특수문자로만 구성된 문자열 사용
	// => 영문자, 숫자, 일부 특수문자를 제외한 문자룰 쿠키명 및 쿠키값으로 사용할 경우 부호화 처리하여 사용 가능
	Cookie cookie=new Cookie("userName", "HongGilDong");
	cookie.setMaxAge(60*60);//쿠키의 유지시간(초) 변경
	//response 객체로 addCookie() 메소드를 호출해 클라이언트에게 Cookie 객체를 전달하여 클라이언트에 쿠키 저장
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC</title>
</head>
<body>
	<h1>EL 내장객체 - Cookie</h1>
	<hr>
	<p>클라이언트에게 쿠키를 전달하여 저장 하였습니다.</p>
	<p><a href="implicit_cookie_use.jsp">쿠키값 출력</a></p>
</body>
</html>	