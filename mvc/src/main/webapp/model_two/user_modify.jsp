﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%-- 사용자로부터 회원정보를 입력받기 위한 JSP 문서 --%>
<%-- => request 객체의 속성값을 반환받아 입력태그의 입력값으로 응답 처리 --%>
<%-- => [수정] 태그를 클릭한 경우 [/modify.do] 문서를 요청하여 페이지 이동 - 입력값 전달 --%>
<%-- => [목록] 태그를 클릭한 경우 [/list.do] 문서를 요청하여 페이지 이동 --%>
<html>
<head>
<title>MVC</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href="<%=request.getContextPath() %>/model_two/css/user.css" type="text/css">

<script language="JavaScript">
function userModify() {
	if ( f.name.value == "" ) {
		alert("이름을 입력하십시요.");
		f.name.focus();
		return false;
	}
	f.action = "<%=request.getContextPath() %>/modify.do";
	f.submit();
}
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br>
<table width=780 border=0 cellpadding=0 cellspacing=0>
	<tr>
	  <td width="20"></td>
	  <td>
	  <table width=590 border=0 cellpadding=0 cellspacing=0>
		  <tr>
			<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>회원관리 - 회원정보수정</b></td>
		  </tr>
	  </table>  
	  <br>
	  
	  <form name="f" method="post">
	  <table border="0" cellpadding="0" cellspacing="1" width="590" bgcolor="BBBBBB">
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">아이디</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				<input type="password" style="width:150" name="userid" value="<%=userinfo.getUserid()%>" readonly="readonly">
			</td> 
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">비밀번호</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				<input type="password" style="width:150" name="password">
				<span style="color: red;">** 비밀번호를 변경하지 않을 경우 입력하지 마세요.</span>
			</td>
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">이름</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				<input type="text" style="width:240" name="name" value="<%=userinfo.getName()%>">
			</td>
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">이메일 주소</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				<% if(userinfo.getEmail() != null) { %>
					<input type="text" style="width:240" name="email" value="<%=userinfo.getEmail()%>">
				<% } else { %>
					<input type="text" style="width:240" name="email">
				<% } %>
			</td>
		  </tr>		  
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">회원등급</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10px;">
				<select name="auth">
					<option value="1"   <% if(userinfo.getAuth() == 1) { %>selected<% } %>>일반회원</option>
					<option value="9" <% if(userinfo.getAuth() == 9) { %>selected<% } %>>관리자</option>
				</select>
			</td>
		  </tr>	
	  </table>
	  </form>
	  <br>
	  
	  <table width=590 border=0 cellpadding=0 cellspacing=0>
		  <tr>
			<td align=center>
			<input type="button" value="수정" onClick="userModify();">
			<input type="button" value="목록" onClick="location.href='<%=request.getContextPath() %>/list.do';">
			</td>
		  </tr>
	  </table>

	  </td>
	</tr>
</table>  

</body>
</html>