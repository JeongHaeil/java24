<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 전달값을 반환받아 다른 JSP 문서로 포워드 이동하는 JSP 문서  --%>
<%
	//전달값 반환받아 저장
	String pageName=request.getParameter("pageName");

	if(pageName == null){
		//클라이언트,에게 URL 주소 전달하여 응답처리
		//=> URL 주소를 전달받은 클라이언트는 브루아저의 요청 URL 주소 변경하여 JSP 문서를
		//요청해 실행결과(HTML 문서)를 응답받아 출력
		
		response.sendRedirect("index.jsp");
		return;
	}
	//전달값을 사용하여 JSP 문서의 컨텍스트 경로를 변수 저장
	String contentPath="/action/forward/"+pageName+".jsp";
%>	
	<%--forward 태그 : 요청 JSP 문서에서 다른 JSP 문서로 스레드를 이동하여 스레드가 이동된
	JSP 문서로 클라이언트에게 응답 처리하기 위한 기능을 제공하는 태그 - 포워드 이동 --%>
	
	<%-- 요청 JSP 문서의 request 객체와 response 객체를 스레드가 이동될 JSP 문서로 전달하여
	사용할수 있도록 제공 --%>
	<%-- => 클라이언트와 상관없이 서버에서 JSP 문서의 스레드를 이동하여 처리하므로 클라이언트의 요청 URL 주소 미변경 --%>
	<%-- 형식) <jsp:forward page="<%=JSP %>"/> 문서의 컨텍스트 경로 /jsp:include--%>
	<jsp:forward page="<%=contentPath %>"/>