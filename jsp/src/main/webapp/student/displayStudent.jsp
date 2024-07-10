<%@page import="xyz.itwill.dto.StudentDTO"%>
<%@page import="java.util.List"%>
<%@page import="xyz.itwill.dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- STUDENT 테이블에 저장된 모든 행(학생정보)를 검색하여 HTML 태그에 포함하여 응답하는 JSP 문서 --%>
<%--  --%>
<%
List<StudentDTO> studentList=StudentDAO.getDAO().selectStList();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<style type="text/css">

h1 {
	margin: 0 auto;
	width: 850px; 
	text-align: center; 
}

div {
	margin: 10px auto;
	width: 850px;
	text-align: right;
}

table {
	margin: 0 auto;
	border: 1px solid black;
	border-collapse: collapse; 	
}

th {
	background-color: black;
	color: white; 
}

th, td {
	border: 1px solid black;
	text-align: center;
	padding: 5px;	
}

.no { width: 100px; }
.name { width: 100px; }
.phone { width: 150px; }
.address { width: 250px; }
.birthday { width: 150px; }
.remove { width: 50px; }
.modify { width: 50px; }
</style>
</head>
<body>
	<h1>학생목록</h1>
	<div>
		<button type="button">학생추가</button>
	</div>
	<table>
		<tr>
			<th class="no">학번</th>
			<th class="name">이름</th>
			<th class="phone">전화번호</th>
			<th class="address">주소</th>
			<th class="birthday">생년월일</th>
			<th class="remove">삭제</th>
			<th class="modify">변경</th>
		</tr>
		<%-- List 객체에 저장된 요소값(StudentDTO 객체)을 차례대로 제공받아 변수에 저장하는 반복문 --%>
		<%-- => StudentDTO 객체의 필드값을 반환받아 HTML 태그에 포함하여 출력 처리 --%> 
		<% for(StudentDTO student : studentList) { %>
		<tr align="center">
			<td><%=student.getNo() %></td>				
			<td><%=student.getName() %></td>				
			<td><%=student.getPhone() %></td>				
			<td><%=student.getAdress() %></td>				
			<td><%=student.getBirthday().substring(0, 10) %></td>				
			<td><button type="button">삭제</button></td>		
			<td><button type="button">변경</button></td>
		</tr>	
		<% } %>
	</table>
</body>
</html>
