<%@page import="xyz.itwill.bean.HewonBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%-- 전달값(회원정보)을 반홚받아 내장객체의 속성값으로 저장하고 [useBean_display.jsp]
    문서로 포워드 이동하는 JSP 문서 - 클라이언트 요청에 대한 데이타 처리 기능 제공하는 JSP 문서 --%>
<%
	//JSP문서를 GET 방식으로 요청한 경우 에러코드를 클라이언트에게 전달하여 응답처리
	if(request.getMethod().equals("GET")) { //비정상적인 요청한 경우
		response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		return;
	}
	request.setCharacterEncoding("utf-8");
%>
<%-- useBean 태그 : JSP 문서에 Java 객체 (JavaBean)를 제공하기 위한 태그 --%>
<%-- 형식) <jsp:useBean id="식별ㅈ" class="클래스" scope="사용범위"></jsp:useBean --%> 
<%-- 내장객체에 저장된 속성값을 객체로 반환받아 제공하거나 속성값이 없는 경우 객체를
생성하여 내장객체의 속성값으로 저장한 후 제공 --%>
<%-- id 속성 : useBean 태그에 제공되는 객체를 구분하기 위한 식별자 속성값으로 설정 --%>
<%-- => 내장객체에 저장된 속성값에 대한 속성명 사용 --%>
<%-- class 속성 : useBean 태그에 제공되는 객체의 자료형(클래스)을 속성값으로 설정 --%>
<%-- scope 속성 : useBean 태그에 제공되는 객체의 사용범위를 속성값으로 설정 --%>
<%-- => page, request, session, application 중 하나를 속성값으로 설정 --%>
<%-- => scope 속성을 생략한 경우 [page] 속성값을 기본값으로 사용 --%>
<jsp:useBean id="hewon" class="xyz.itwill.bean.HewonBean" scope="request"/>
<%--
	//useBean 태그를 사용하면 HewonBean 객체를 생성하여 request 객체의 속성값으로 저장
	//명령과 동일한 기능을 제공
	HewonBean hewon=HewonBean();
	request.setAttribute("hewon",hewon);
	
--%>
<%-- setProperty 태그 : useBean 태그로 제공받은 객체의 필드값을 변경하는 태그 --%>
<%-- =>useBean 태그의 종속된 태그 --%>
<%-- 형식) <jsp:setProperty name=식별자 property필드명 value=변경값  --%>
<%-- => 객체로 Setter 메소드를 호출하여 필드값을 변경하는 기능과 동일 --%>
<%-- name 속성 : useBean 태그로 제공받은 객체의 식별자 속성값으로 설정 --%>

<%--<jsp:setProperty name="hewon" property="name" value="홍길동"/>  --%>


<jsp:setProperty name="hewon" property="name"/>
<jsp:setProperty name="hewon" property="phone"/>
<jsp:setProperty name="hewon" property="address"/>
<%


%>



<jsp:forward page="/action/useBean/useBean_display.jsp"/>

<%--request.getRequestDispatcher("/action/useBean/non_useBean_display.jsp").forward(request, response); --%>