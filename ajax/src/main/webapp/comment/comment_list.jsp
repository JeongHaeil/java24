<%@page import="xyz.itwill.util.Utility"%>
<%@page import="xyz.itwill.dao.AjaxCommentDAO"%>
<%@page import="xyz.itwill.dto.AjaxCommentDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- AJAX_COMMENT 테이블에 저장된 모든 행을 검색하여 JSON으로 응답하는 JSP 문서 --%>    
<%
	List<AjaxCommentDTO> ajaxCommentList=AjaxCommentDAO.getDAO().selectAjaxCommentList();
%>
<% if(ajaxCommentList.isEmpty()) {//검색된 댓글이 없는 경우 %>
{"code":"empty", "message":"첫번째 댓글을 입력해 주세요."}	
<% } else {//검색된 댓글이 있는 경우 %>
{
	"code":"success",
	"data":[
	<% for(int i=0;i<ajaxCommentList.size();i++) { %>
		<% if(i > 0 ) { %>,<% } %>
		{"num":<%=ajaxCommentList.get(i).getNum() %>
			, "writer":"<%=Utility.toJSON(ajaxCommentList.get(i).getWriter()) %>"
			, "content":"<%=Utility.toJSON(ajaxCommentList.get(i).getContent()) %>"
			, "regdate":"<%=ajaxCommentList.get(i).getRegdate() %>"}
	<% } %>	
	]
}
<% } %>