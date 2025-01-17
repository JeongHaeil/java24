<%@page import="java.util.Map"%>
<%@page import="xyz.itwill.dao.MyHewonDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<Map<String, Object>> hewonList=MyHewonDAO.getDAO().selectMapHewonList();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYBATIS</title>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
}

td {
	border: 1px solid black;
	text-align: center;
	padding: 3px;	
}

.id { width: 150px; }
.name { width: 150px; }
.phone { width: 200px; }
.email { width: 200px; }
.scope { width: 100px; }
</style>
</head>
<body>
	<h1>회원목록</h1>
	<hr>
	<table>
		<tr>
			<td class="id">아이디</td>
			<td class="name">이름</td>
			<td class="phone">전화번호</td>
			<td class="email">이메일</td>
			<td class="scope">공개범위</td>
		</tr>
		<% if(hewonList.isEmpty()) { %>
		<tr>
			<td colspan="5">검색된 회원정보가 없습니다.</td>
		</tr>
		<% } else { %>
			<% for(Map<String, Object> hewon : hewonList) { %>
			<tr>
				<td class="id"><%=hewon.get("HEWON_ID") %></td>
				<td class="name"><%=hewon.get("HEWON_NAME") %></td>
				<td class="phone"><%=hewon.get("HEWON_PHONE") %></td>
				<td class="email"><%=hewon.get("HEWON_EMAIL") %></td>
				<td class="scope"><%=hewon.get("HEWON_SCOPE") %></td>
			</tr>	
			<% } %>
		<% } %>
	</table>
</body>
</html>