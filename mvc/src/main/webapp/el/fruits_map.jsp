<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Map<String, String> fruitsMap=new HashMap<String, String>();

	fruitsMap.put("one", "수박");
	fruitsMap.put("two", "복숭아");
	fruitsMap.put("three", "바나나");
	
	request.setAttribute("fruitsMap", fruitsMap);
	request.setAttribute("choice", "two");
	
	request.getRequestDispatcher("fruits_map_el.jsp").forward(request, response);
%>