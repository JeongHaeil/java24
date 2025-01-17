<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//내장객체를 사용하여 객체를 내장 객체의 속성값으로 저장
	// => 속성명(문자열)과 속성값(객체)을 묶어서 내장객체에 저장
	// => 내장객체에 동일한 이름의 속석명이 존재할 경우 속성값 변경 처리
	pageContext.setAttribute("pageName", "홍길동"); //Page Scope
	request.setAttribute("requestName", "임꺽정"); //Request Scope
	session.setAttribute("sessionName", "전우치"); // Session Scope
	application.setAttribute("applicationName", "일지매"); // Application Scope
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>객체의 사용범위</h1>
	<hr>
	<%
		//내장객체에 저장된 속성값을 객체로 반환받아 변수 저장
		// => 속성명을 사용하여 속성값을 구분하여 반환
		// => 속성명의 속성값이 없는 경우 [null] 반환
		// => 속성값을 Object 객체로 반환하므로 반드시 명시적 객체 형변환 필욪
		String pageName=(String)pageContext.getAttribute("pageName");
		String requestName=(String)request.getAttribute("requestName");
		String sessionName=(String)session.getAttribute("sessionName");
		String applicationName=(String)application.getAttribute("applicationName");
	%>
	<p><%=pageName %></p>
	<p><%=requestName %></p>
	<p><%=sessionName %></p>
	<p><%=applicationName %></p>
</body>
</html>