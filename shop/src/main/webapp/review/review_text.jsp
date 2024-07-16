<%@page import="xyz.itwill.dao.ReviewDAO"%>
<%@page import="xyz.itwill.dto.ReviewDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- REVIEW 테이블에 행 (게시글)을 500개 삽입하는 JSP 문서 - 테스트 프로그램 --%>
<%
	ReviewDTO review=new ReviewDTO();
	for(int i=1;i<=500;i++){
		int nextNum=ReviewDAO.getDAO().selectReviewNextNum();
		review.setReviewNum(nextNum);
		review.setReviewMemberNum(1);
		review.setReviewSubject("테스트-"+i);
		review.setReviewContent("게시글테스트-"+i);
		review.setReviewIp("192.168.13.1");
		review.setReviewRef(nextNum);
		review.setReviewRestep(0);
		review.setReviewRelevel(0);
		review.setReviewNum(nextNum);
		review.setReviewStatus(1);
		
		ReviewDAO.getDAO().insertREview(review);
		
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>500개 테스트 게시글 삽입</h1>
</body>
</html>