
<%@page import="org.apache.commons.httpclient.HttpClient"%>
<%@page import="org.apache.commons.httpclient.methods.GetMethod"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 가상의 브라우저를 사용해 다른 서버의 웹프로그램을 요청하여 실행결과를 재공받아 그대로
응답하는 JSP 문서 - Proxy 프로그램 --%>
<%-- => HttpClient 객체를 사용해 Proxy 기능을 제공하는 웹프로그램 작성 --%>
<%-- => https://apache.org 사이트에서 필요한 라이브러리 파일을 다운로드 받아 프로젝트에 빌드 처리 --%>
<%-- => commons-httpclient-3.1.jar, commons-codec-1.17.1.jar, commons-logging-1.3.3.jar --%>    
<%
	//요청 웹프로그램의 URL 주소 저장
	String url="https://www.khan.co.kr/rss/rssdata/kh_sports.xml";

	//HttpClient 객체 생성 - 가상의 브라우저 기능을 제공하기 위한 객체
	HttpClient client=new HttpClient();
	
	//GetMethod 객체 ㅇ생성 - 가상의 브라우저를 사용해 GET 방식으로 웹프로그램을 요청하기 위한 방법
	//Postmethod 객체 : 가상의 브라우저를 사용해 POST 방식으로 웹프로그램을 요청하기 위한 객체
	GetMethod method=new GetMethod();
	
	
	try{
		//HttpClient.executeMethod : 가상의 브라우저를 사용해 매개변수로 전달받은
		//Method 객체에 저장된 정보로 웹프,로그램을 요청하는 메소드
		// => 요청 웹프로그램에 대한 상태코드(StatusCode - int) 반환
		inf statusCode=client.executeMethod(method);
		
		//클라이언트에게 응답하기 위한 프록시 프로그램의 response 객체 초기화
		response.reset();
		
		//프록시 프로그램의 출력 스트림 초기화(out 객체)
		out.clearBuffer();
		
		//프록시 프로그램을 요청한 웹프로그램에게 상태코드를 전달하여 응답 처리
		response.setStatus(statusCode);
		
		if(statusCode == HttpServletResponse.SC_OK){//정상적인 실행결과를 응답 받은 경우 : 상태코드가 20인걍어
			
			String result=method.getResponseBodyAsString();
			
		}
		
		
	}catch(){
		
	}fin
%>