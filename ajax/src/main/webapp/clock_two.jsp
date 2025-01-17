<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//request.getProtocol() : 웹프로그램을 요청할 때 사용한 통신규약(Protocol)을 반환하는 메소드
	String protocol=request.getProtocol();

	if(protocol.equals("HTTP/1.0")) {
		response.setDateHeader("Expires", -1);//캐싱 만료기간 변경	
		response.setHeader("Pragma", "no-cache");//캐싱 기능 비활성화	
	} else if(protocol.equals("HTTP/1.1")) {
		//response.setHeader(String name, String value) : 매개변수로 전달받은 이름과 값으로
		//리스폰즈 메세지 머릿부의 정보를 변경하는 메소드
		response.setHeader("Cache-control", "no-cache");//캐싱 기능 비활성화
	}

	Date now=new Date();
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy년 M월 d일 H시 m분 s초");
	String displayTime=dateFormat.format(now);
%>
<%=displayTime%>