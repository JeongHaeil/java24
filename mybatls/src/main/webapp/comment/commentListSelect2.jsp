<%@page import="xyz.itwill.dao.MyUserDAO"%>
<%@page import="xyz.itwill.dto.MyComment2"%>
<%@page import="xyz.itwill.dao.MyCommentDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<MyComment2> commentList=MyCommentDAO.getDAO().selectCommentList2();
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

.no { width: 100px; }
.name { width: 150px; }
.content { width: 250px; }
.date { width: 200px; }
</style>
</head>
<body>
	<h1>게시글 목록</h1>
	<hr>
	<table>
		<tr>
			<td class="no">게시글번호</td>
			<td class="name">게시글작성자</td>
			<td class="content">게시글내용</td>
			<td class="date">게시글작성일</td>
		</tr>
		<% for(MyComment2 comment : commentList) { %>
		<tr>
			<td class="no"><%=comment.getNo()%></td>
			<td class="name"><%=comment.getId()%></td>
			<td class="content"><%=comment.getContent()%></td>
			<td class="date"><%=comment.getDate()%></td>
		</tr>
		<% } %>
	</table>
</body>
</html>