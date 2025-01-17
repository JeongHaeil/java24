<%@page import="xyz.itwill.dto.StudentDTO"%>
<%@page import="xyz.itwill.dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 학생정보를 전달받아 STUDENT 테이블에 행으로 삽입하고 [displayStudent.jsp] 문서를 요청할
수 있는 URL 주소로 응답하는 JSP 문서--%>    
<%
	if(request.getMethod().equals("GET")){
		response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		return;
	}

	//POST 방식으로 요청하여 전달된 값을 읽기 위한 문자형태 변경
	request.setCharacterEncoding("utf-8");
	
	//전달값을 반환받아 저장
	int no=Integer.parseInt(request.getParameter("no"));
	String name=request.getParameter("name");
	String phone=request.getParameter("phone");
	String adress=request.getParameter("address");
	String birthday=request.getParameter("birthday");
	
	
	
	//StudentDTO 객체를 생성하여 전달값으로 필드값 변경
	StudentDTO student=new StudentDTO();
	student.setNo(no);
	student.setName(name);
	student.setPhone(phone);
	student.setAdress(adress);
	student.setBirthday(birthday);
	
	//문제점)전달받은 학생번호가 STUDENT 테이블에 저장된 학생정보의 학생번호와 중복될 경우
	//PRIMARY KEY 제약조건을 위반하여 삽입 처리 불가능 - SQLException 발생
	//해결법)전달받은 학생번호가 STUDENT 테이블에 저장된 학생정보의 학생번호와 중복될 경우
	//[insertStudent.jsp] 문서를 요청할 수 있는 URL 주소 응답 처리 
	
	//학생번호를 전달받아 STUDENT 테이블에 저장된 하나으 ㅣ행을 검색하여 검색된 학생정보
	//(StudentDTO 객체)를 반환하는 StudentDAO 클래스의 메소드를 호출
	// => null 반환 : 행(학생정보) 미검색 - 학번 미중복 , StudentDTO 객체 반환 : 행 검색 - 학번 중복
	
	if(StudentDAO.getDAO().selectStudent(no) != null){
		session.setAttribute("message", "이미 사용중인 학생번호 입니다.");
		session.setAttribute("student", student);
		response.sendRedirect(request.getContextPath()+"/student/insertFormStudent.jsp");
		return;
	}
	
	
	//학생정보를(StudentDTO 객체) 전달받아 STUDENT 테이블에 행으로 삽입하고 행의갯수를
	//반환하는 StudentDAO 클래스 호출
	StudentDAO.getDAO().insertStudent(student);
	
	//클라이언트에게 URL 주소를 전달하여 응답
	response.sendRedirect(request.getContextPath()+"/student/displayStudent.jsp");
%>