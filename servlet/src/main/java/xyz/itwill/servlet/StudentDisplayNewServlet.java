package xyz.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.itwill.dao.StudentDAO;
import xyz.itwill.dto.StudentDTO;

//STUDENT 테이블에 저장된 모든 행 검색하여 hTML 문서 포함 응답
@WebServlet("/new.itwill")
public class StudentDisplayNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		//STUDENT 테이블에 저장된 모든행 검색하여 List 객체로 반환하는 StudentDAO
		//클래스 메소드 호출
		List<StudentDTO> studentList=StudentDAO.getDAO().selectStudentList();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>학생목록</h1>");
		out.println("<hr>");
		out.println("<table border='1' cellspacing='0'>");
		out.println("<tr>");
		out.println("<th width='100'>학번</th>");
		out.println("<th width='150'>이름</th>");
		out.println("<th width='200'>전화번호</th>");
		out.println("<th width='300'>주소</th>");
		out.println("<th width='250'>생년월일</th>");
		
		for(StudentDTO student : studentList) {
			
			out.println("<tr>");
			out.println("<td align='center'>"+student.getNo()+"</td>");
			out.println("<td align='center'>"+student.getName()+"</td>");
			out.println("<td align='center'>"+student.getPhone()+"</td>");
			out.println("<td align='center'>"+student.getAddress()+"</td>");
			out.println("<td align='center'>"+student.getBirthday().substring(0, 10)+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}
