package xyz.itwill.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.itwill.dto.UserinfoDTO;
import xyz.itwill.exception.ExistsUserinfoException;
import xyz.itwill.service.UserinfoService;

//클라이언트가 [/write.do]로 페이지를 요청한 경우 객체로 생성될 모델 역활의 클래스
// => 회원정보를 전달받아 USERINFO 테이블에 행으로 삽입하고 [/loginform.do] 주소로 리다이렉트
//이동하기 위한 정보가 저장된 ActionForward 객체 반환
public class WriteModel implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ActionForward actionForward=new ActionForward();
		UserinfoDTO userinfo=null;
		try {
			if(request.getMethod().equals("GET")) {
				throw new Exception("비정상적인 요청 - GET 방식 요청");
			}
			
			request.setCharacterEncoding("utf-8");

			String userid=request.getParameter("userid");
			String password=request.getParameter("password");
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			int auth=Integer.parseInt(request.getParameter("auth"));
			
			userinfo=new UserinfoDTO();
			userinfo.setUserid(userid);
			userinfo.setPassword(password);
			userinfo.setName(name);
			userinfo.setEmail(email);
			userinfo.setAuth(auth);
			
			//UserinfoService 클래스의 addUserinfo() 메소드를 호출하여 회원등록 처리
			// => 전달받은 회원정보의 아이디가 USERINFO 테이블에 저장된 행의 아이디와 중복될
			//경우 ExistsUserinfoException 발생
			UserinfoService.getService().addUserinfo(userinfo);
			
			actionForward.setForward(false);
			actionForward.setPath("/loginform.do");
		} catch (ExistsUserinfoException e) {
			request.setAttribute("message", e.getMessage());
			request.setAttribute("userinfo", userinfo);
			actionForward.setForward(true);
			actionForward.setPath("/model_two/user_write.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			actionForward.setForward(false);
			actionForward.setPath("/error.do");
		}
		return actionForward;
	}

}