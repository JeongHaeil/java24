<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>include Directive</h1>
	<hr>
	<p>파일을 제공받아 파일에 작성된 코드를 JSP 문서에 포함하는 지시어 - 정적 포함</p>
	<hr>
	<!-- 
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	<p>클라이언트에 응답될 아주 중요한 내용입니다.</p>
	 -->
	<%--include Directive의 file 속성에 외부파일의 컨텍스트 경로 속성값으로 설정
	하여 설정된 파일의 소스코드를 Directive 위치에 포함되도록 지시 --%>	 	
	<%-- file 속성값으로  --%>
	 <%@ include file="/directive/include_sub.jspf" %>
</body>
</html>