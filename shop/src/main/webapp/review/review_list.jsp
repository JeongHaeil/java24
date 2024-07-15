﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- REVIEW 테이블에 저장된 행을 검색하여 HTML 태그에 포함해 응답하는 JSP 목록 --%>    
<%-- => 게시글 REVIEW 테이블에 저장된 행을 페이지 단위로 구분하여 검색해 응답 처리 - 페이징 처리 --%>
<%-- => [페이지 번호] 태그를 클릭한 경우 [/review/review_list.jsp]문서를 요청하여 페이지 이동 - 
페이지 번호, 게시글 갯수, 조회대상, 조회단어 전달 - 조회기능을 유지하기 위해 조회 대상 ,단어 전달 --%>
<%-- => [게시글 갯수] 태그의 입력값을 변경한 경우 [/review/review_list.jsp]문서를 요청하여 페이지 이동
페이지 번호, 게시글 갯수, 조회대상, 조회단어 전달 - 조회기능을 유지하기 위해 조회 대상 ,단어 전달 --%> --%>

<%-- => [감색 태그]를 클릭한 경우 [/review/review_list.jsp]문서를 요청하여 페이지 이동 --%>
<%-- 조회대상, 조회 전달 - 페이지번호와 게시글갯수는 기본값 사용 --%>
<%-- => [글쓰기] 태그를 클릭한 경우 [/review/review_write.jsp 문서를 요청하여 페이지 이동 --%>
<%-- 로그인 사용자에게만 태그를 출력하여 링크가 제공죄도록 자성 --%>
<%-- 게시글의 [글제목]을 클릭한 경우 [/review/review_detail.jsp 문서를 요청하여 페이지 이동
-글번호, 페이지번호, 게시글 갯수, 조회대상 ,조회 단어 전달 --%>


<h1>게시판 목록</h1>