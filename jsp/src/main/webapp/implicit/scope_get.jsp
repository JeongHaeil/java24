<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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