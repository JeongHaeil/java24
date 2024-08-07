<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>core_import_source.jsp 문서의 실행 결과입니다.</p>
	
	<%-- <c:import url="https://www.yonhapnewstv.co.kr/browse/feed/" var="xml"></c:import>
	<p>${xml }</p> --%>
	
	<c:import url="core_import_target.jsp">
		<c:param name="name" value="홍길동"></c:param>
	</c:import>
</body>
</html>