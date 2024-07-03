package xyz.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//입력페이지(form.html)로부터 전달된 입력값(회원정보)을 반환받아 HTML 문서에 포함하여 출력처리 
//되도록 응답하는 서블릿
// => 입력페이지의 form 태그를 사용해 post 방식으로 요청 하여 실행되는 서블릿
@WebServlet("/join.itwill")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//클라이언트 정보를 가져올때 HttpServletRequest
	//클라이언트 보낼때  HttpServletResponse
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		//서블릿을 GET 방식으로 요청한 경우 비정상적인 요청이므로 클라이언트에게 에러코드(4XX or 5XX)를
		//전달하여 응답하거나 에러메세지를 출력하는 에러페에지의  URL 주소를 전달하여 응답
		//HttpServletRequest.Method() : 클라이언트가 서블릿을 요청한 요청 방식(GET or POST)을 
		//반환하는 메소드
		//System.out.println(request.getMethod()); //get 방식
		if(request.getMethod().equals("GET")) { //서블릿을 GET 방슥으로 요청한 경우
			
			
			//HttpServletResponse.sendError(int sc) : 클라이언트에게 에러코드를 전달하여 응답하는 메소드
			//=> 매개변수에 전달되는 에러코드 HttpServletResponse 인터페이스의 상수필드를 사용하는것을 권장한다
			// => [web.xml] 파일에서 error-page 엘리먼트를 사용해 에러코드에 대한 에러메세지를
			//저장한 웹문서를 전달하여 출력하는 기능 제공
			
			//response.sendError(400);
			//response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			
			//response.sendError(405);
			//response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			//return;
		
			
			//HttpServletResponse.sendRedirect(String url) : 클라이언트에게 URL 주소를 전달하여 응답하는 메소드
			// => URL 주소를 응답받은 클라이언트는 브라우저의 URL 주소를 변경하여 URL 주소의
			//웹프로그램을 요청해 실행결과를 응답받아 출력 처리 - 리다이렉트 이동(페이지 이동)
			//response.sendRedirect("/servlet/error.html");
			//return;
			
			
			//응답파일 (HTML 문서)에 자바스크립트 저장하여 응답 처리
			// => 경고창을 사용해 메세지를 출력한 후 원하는 페이지로 이동되도록 처리
			out.println("<script>");
			out.println("alert('비정상적인 방법으로 페이지를 요청 하였습니다.');");
			out.println("location.href='/servlet/form.html';");
			out.println("<script>");
			return;
		}
		
		//스벌릿을 post 방식으로 요청한 경우 사용자 입력값을 리퀘스트 메세지 몸체부에 문서
		//파일에 저장하여 전달한다
		// => 리퀘스트 메세지 몸체부에 저장된 문서파일의 서블릿은 기본적으로 서유럽어(ISO-885-1)
		//읽어서 반환하므로 전달값을 비정상적으로 반환받아 사용 가능
		// => 전달값을 반환받기 전에 리퀘스트 메세지 몸체부에 저장된 문서파일을 읽기 위한 문자형태
		//(CHaracterSet - Encoding)변경
		//HttpServletRequest.setCharacterEncoding : 리쉐크스 메세지 몸체부에
		//저장된 문서파일의 전달값을 읽기 위한 문자형태를 변경하는 메소드
		// => GET 방식으로 요청한 경우 리퀘스트 메세지 몸체부를 사용하지 않아 메소드 호출 불필요
		request.setCharacterEncoding("utf-8"); //post 방식으로 사용
		
		
		
		//서블릿을 요청할 때 전달된 값을 반환받아 저장
		//HttpServletRequest.getParameter(String name) : 매개변수로 전달받은 이림의 전달값을 반환하는 메소드
		// => 매개변수로 전달받은 이름의 전달값이 없는 경우 null 반환
		String id=request.getParameter("id");
		
		//전달값에 대한 검증
		if(id==null || id.equals(""))  { //전달값이 없는 경우 - 비정상적인 요청
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		/*
		 * if(!Pattern.matches("^[a-zA-Z]\\w{5,19}$", id)) { //전달값이 정규표현식의 패턴과 다른 경우 -
		 * 비정상적인 요청 return;
		 * 
		 * }
		 */
		String passwd=request.getParameter("passwd");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		
		//하나의 이름의 다수의 값이 전달될 경우 getParameter() 메소드 대신 getParameterValues()
		//메소드를 호출하여 전달되는 모든 값을 배열로 반환
		//String hobby=request.getParameter("hobby");
		String[] hobby=request.getParameterValues("hobby");
		String job=request.getParameter("job");
		String profile=request.getParameter("profile");
		
		//전달값이 포함된 HTML 문서를 생성해 클라이언트 전달 응답 처리
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>회원가입 확인</h1>");
		out.println("<hr>");
		out.println("<p>아이디 ="+id+"</p>");
		out.println("<p>비밀번호 ="+passwd+"</p>");
		out.println("<p>이름 ="+name+"</p>");
		out.println("<p>이메일 ="+email+"</p>");
		out.println("<p>성별 ="+gender+"</p>");
		//out.println("<p>취미 ="+hobby+"</p>");
		out.println("<p>취미 =");
		for(int i=0;i<hobby.length;i++) {
			out.println(hobby[i]);
			if(i < hobby.length -1) {
				out.println(", ");
			}
		}
		
		out.println("<p>직업 ="+job+"</p>");
		//전달값에 엔터(Enter) 있는 경우 <br> 태그로 변환 
		out.println("<p>자기소개 ="+profile+"</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
