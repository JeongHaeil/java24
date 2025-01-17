
<%-- <%@page import="java.util.List , java.util.ArrayList" %>  --%>
<%-- page 디렉티브의 import 속성과 속성값은 이클립스의 자동 완성 기능 --%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%-- page 디렉티브에 같은 이름의 속성을 여러번 사용 할 경우  에러 발생 --%>
<%-- => import 속성만 제외 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//java.util.List<java.long.String> nameList=new java.util.ArrayList<java.lang.String>();
	//List<String> nameList=new ArrayList<String>();// 객체 생성시 제네릭으로 사용할 Java 자료형 생략
	List<String> nameList=new ArrayList<>();
	nameList.add("홍길동");
	nameList.add("임꺽정");
	nameList.add("전우치");
	nameList.add("일지매");
	nameList.add("장길산");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>page Directive - import 속성</h1>
	<hr>
	<p> page Directive의 import 속성에는 JSP 문서에서 사용할 Java 자료형 (클래스 또는 인터페이스)
	속성값으로 설정 - 패키지를 사용해 Java 자료형을 명확하게 표현하기 위해 사용</p>
	<hr>
	<ul>
	<% for(String name : nameList){ %>
	<li> <%=name %></li>
	<% } %>
	</ul>
</body>
</html>