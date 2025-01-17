package xyz.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//STUDENT 테이블에 저장된 모든 행(학생정보)을 검색하여 HTML 문서에 포함하여 응답하는 서블릿
// => JDBC 기능을 구현하기 위해서는 JDBC 관련 라이브러리 파일(ojdbc 라이브러리)을 프로젝트에 빌드 처리
@WebServlet("/old.itwill")
public class StudentDisplayOldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//1.OracleDriver 클래스를 읽어 메모리에 저장
			// => OracleDriver 객체가 생성되는 DriverManager 클래스의 JDBC Driver 객체로 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.DriverManager 클래스에 등록된 JDBC Driver 객체를 사용해 DBMS 서버에 접속하여
			//접속정보가 저장된 Connection 객체를 반환받아 저장
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String username="scott";
			String password="tiger";
			con=DriverManager.getConnection(url, username, password);
			
			//3.Connection 객체로부터우 SQL 명령이 저장된 PreparedStatement 객체를 반환받아 저장
			String sql="select no,name,phone,address,birthday from student order by no";
			pstmt=con.prepareStatement(sql);
			
			//4.PreparedStatement 객체에 저장된 SQL 명령을 DBMS 서버에 전달하여 실행 후 실행
			//결과를 반환받아 저장
			rs=pstmt.executeQuery();
			
			//5.반환받은 결과를 HTML 문서에 포함하여 응답 처리
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
			out.println("</tr>");
			while(rs.next()) {
				out.println("<tr>");
				out.println("<td align='center'>"+rs.getInt("no")+"</td>");
				out.println("<td align='center'>"+rs.getString("name")+"</td>");
				out.println("<td align='center'>"+rs.getString("phone")+"</td>");
				out.println("<td align='center'>"+rs.getString("address")+"</td>");
				out.println("<td align='center'>"+rs.getString("birthday").substring(0, 10)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		} catch (ClassNotFoundException e) {
			System.out.println("[에러]OracleDriver 클래스를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("[에러]SQL 오류 = "+e.getMessage());
		} finally {
			//6.JDBC 관련 객체 제거
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {}
		}
	}
}