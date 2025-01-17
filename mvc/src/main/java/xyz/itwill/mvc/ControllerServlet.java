package xyz.itwill.mvc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//컨트롤러(Controller - Servlet) : 클라이언트의 모든 요청을 받아 모델(Model - Class) 역활의 
//객체로 요청 처리 메소드를 호출하여 클라이언트의 요청을 처리하고 처리결과를 뷰(View - JSP)에게
//제공하여 응답되도록 프로그램의 흐름을 제어하는 기능의 웹프로그램

//1.클라이언트의 모든 요청을 받을 수 있도록 서블릿의 URL 패턴을 설정하여 단일 진입점의 기능 구현
// => Front Controller Pattern
//@WebServlet("url") : 클래스를 서블릿으로 등록하고 서블릿을 요청할 수 있는 URL 주소를 매핑하는 어노테이션
// => 매핑 설정할 URL 주소에 패턴문자(* : 전체, ? : 문자 하나)를 사용해 URL 패턴으로 매핑 가능
// => @WebServlet("*.do") : 클라이언트가 [XXX.do] 형식의 URL 주소로 요청한 경우 서블릿 실행
// => @WebServlet 어노테이션 대신 [web.xml] 파일의 엘리먼트를 사용하여 클래스를 서블릿으로
//등록하고 URL 패턴을 매칭 처리 가능
//@WebServlet("*.do")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//HashMap 객체(Map 객체)가 저장될 필드 작성
	private Map<String, Action> actionMap;
	
	//서블릿 클래스가 객체로 생성된 후 가장 먼저 한번만 호출되는 메소드 - 초기화 처리 
	@Override
	public void init(ServletConfig config) throws ServletException {
		//System.out.println("ControllerServlet 클래스의 init() 메소드 호출");
		//HashMap 객체(Map 객체)를 생성하여 필드에 저장
		actionMap=new HashMap<String, Action>();

		/*
		//클라이언트의 요청정보(Command)를 맵키로 설정하고 Model 객체를 맵값으로 설정한 
		//엔트리(Entry)를 만들어 HashMap 객체에 저장
		actionMap.put("/loginform.do", new LoginFormModel());
		actionMap.put("/login.do", new LoginModel());
		actionMap.put("/logout.do", new LogoutModel());
		actionMap.put("/writeform.do", new WriteFormModel());
		actionMap.put("/write.do", new WriteModel());
		actionMap.put("/list.do", new ListModel());
		actionMap.put("/view.do", new ViewModel());
		actionMap.put("/modifyform.do", new ModifyFormModel());
		actionMap.put("/modify.do", new ModifyModel());
		actionMap.put("/remove.do", new RemoveModel());
		actionMap.put("/error.do", new ErrorModel());
		*/
		
		//Properties 파일에 저장된 요청정보와 모델 클래스를 읽어 엔트리로 만들어 Map 객체에 추가
		// => 컨트롤러 역활의 서블릿을 변경하지 않고 Properties 파일의 내용만 변경하여 요청정보에
		//따른 모델 객체 관리 가능 - 유지보수의 효율성 증가
		
		//Properties 객체(Map 객체)를 생성하여 저장
		// => Properties 객체 : Properties 파일의 이름(Key)과 값(Value)를 엔트리로 저장하기 위한 콜렉션 객체
		Properties properties=new Properties();
		
		//Properties 파일의 시스템 경로를 반환받아 저장
		//String configFilePath=config.getServletContext().getRealPath("/WEB-INF/model.properties");
		//ServletConfig.getInitParameter(String name) : [web.xml] 파일의 init-param 엘리먼트로
		//제공된 값을 읽어와 반환하는 메소드
		String configFilePath=config.getServletContext().getRealPath(config.getInitParameter("configFilePath"));
		//System.out.println("configFilePath = "+configFilePath);
		
		try {
			//Properties 파일의 시스템 경로로 파일 입력스트림을 생성하여 저장
			FileInputStream in=new FileInputStream(configFilePath);
						
			//Properties 파일의 파일 입력스트림을 사용해 Properties 파일에 저장된 요청정보와
			//모델 클래스를 엔트리로 만들어 Properties 객체에 저장
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Properties 객체에 저장된 모든 엔트리의 이름(Key)을 Set 객체로 반환받아 반복문을 사용해 일괄처리
		for(Object key : properties.keySet()) {
			//Properties 객체에 저장된 엔트리의 이름(Key)을 문자열(요청정보)로 반환받아 저장 
			String command=(String)key;
			
			//Properties 객체에 저장된 엔트리의 값(Value)을 문자열(모델클래스)로 반환받아 저장
			String actionClass=(String)properties.get(key);
			
			try {
				//문자열(Model 클래스)로 객체(Model 객체)를 생성하여 저장
				// => 리플렉션(Reflection) : 프로그램의 명령 실행시 Class 객체를 사용하여 객체를
				//생성해 접근 제한자와 상관없이 객체의 필드 또는 메소드를 사용할 수 있도록 제공하는 기능
				//Class.forName(String className) : 매개변수로 전달받은 문자열의 클래스를
				//읽어 메모리에 저장하고 클래스 정보가 저장된 Class 객체를 반환하는 정적메소드
				//Class.getDeclaredConstructor() : Class 객체에 저장된 클래스 정보에서 기본 
				//생성자 정보가 저장된 Constructor 객체를 반환하는 메소드
				//Constructor.newInstance() : Constructor 객체에 저장된 생성자로 Object 객체를
				//생성하여 반환하는 메소드
				Action actionObject=(Action)Class.forName(actionClass)
						.getDeclaredConstructor().newInstance();
				
				//클라이언트의 요청정보(Command)를 맵키로 설정하고 Model 객체를 맵값으로 설정한 
				//엔트리(Entry)를 만들어 HashMap 객체에 저장
				actionMap.put(command, actionObject);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//클라이언트가 서블릿을 요청할 때마다 자동 호출되는 메소드
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("ControllerServlet 클래스의 service() 메소드 호출");
		
		//2.요청 URL 주소 이용해 클라이언트 요청 분석 - http://localhost:8000/mvc/XXX.do
		//HttpServletRequest.getRequestURI() : 요청 URL 주소에서 URI 주소를 반환하는 메소드
		String requestURI=request.getRequestURI();
		//System.out.println("requestURI = "+requestURI);//requestURI = /mvc/XXX.do
		
		//HttpServletRequest.getContextPath() : 요청 URL 주소에서 컨텍스트의 최상위 경로를 반환하는 메소드
		String contextPath=request.getContextPath();
		//System.out.println("contextPath = "+contextPath);//contextPath = /mvc
		
		//요청 URL 주소를 사용해 클라이언트의 요청정보를 제공받아 저장
		String command=requestURI.substring(contextPath.length());
		//System.out.println("command = "+command);//command = /XXX.do
		
		//3.모델(Model) 객체를 이용해 요청 처리 메소드를 호출하여 클라이언트의 요청을 처리하고
		//뷰(View) 관련 정보를 반환받아 저장
		// => 하나의 요청에 대해 하나의 모델 객체가 요청을 처리할 수 있도록 설정 - Command Controller Pattern
		// => 요청 처리 메소드가 작성된 모델 역활의 클래스 선언 - 인터페이스를 상속받아 작성 
		
		//회원관리 프로그램에서 클라이언트 요청(Command)을 처리하기 위한 모델 클래스(Command Handler) 설정
		// => [/loginform.do]  - LoginFormModel 클래스
		// => [/login.do]      - LoginModel 클래스
		// => [/logout.do]     - LogoutModel 클래스
		// => [/writeform.do]  - WriteFormModel 클래스
		// => [/write.do]      - WriteModel 클래스
		// => [/list.do]       - ListModel 클래스
		// => [/view.do]       - ViewModel 클래스
		// => [/modifyform.do] - ModifyFormModel 클래스
		// => [/modify.do]     - ModifyModel 클래스
		// => [/remove.do]     - RemoveModel 클래스
		// => [/error.do]      - ErrorModel 클래스
		
		/*
		//모델 역활의 클래스가 상속받기 위한 인터페이스로 참조변수 생성
		// => 참조변수에는 인터페이스를 상속받은 모든 자식클래스(모델)의 객체 저장 가능
		Action action=null;

		//클라이언트 요청정보를 비교하여 요청을 처리하는 모델 역활의 클래스로 객체를 생성하여
		//인터페이스로 생성된 참조변수에 저장
		if(command.equals("/loginform.do")) {
			action=new LoginFormModel();
		} else if(command.equals("/login.do")) {
			action=new LoginModel();
		} else if(command.equals("/logout.do")) {
			action=new LogoutModel();
		} else if(command.equals("/writeform.do")) {
			action=new WriteFormModel();
		} else if(command.equals("/write.do")) {
			action=new WriteModel();
		} else if(command.equals("/list.do")) {
			action=new ListModel();
		} else if(command.equals("/view.do")) {
			action=new ViewModel();
		} else if(command.equals("/modifyform.do")) {
			action=new ModifyFormModel();
		} else if(command.equals("/modify.do")) {
			action=new ModifyModel();
		} else if(command.equals("/remove.do")) {
			action=new RemoveModel();
		} else if(command.equals("/error.do")) {
			action=new ErrorModel();
		} else {
			action=new ErrorModel();
		}
		*/
		
		//Map 객체에서 맵키(Command)를 사용해 맵값(Model 객체)을 반환받아 저장
		// => 프로그램의 가독성 증가
		Action action=actionMap.get(command);
		if(action == null) {//맵키에 대한 맵값이 없는 경우 
			action=actionMap.get("/error.do");
		}
		
		//인터페이스로 생성된 참조변수로 추상메소드를 호출하면 묵시적 객체 형변환에 의해 참조변수에
		//저장된 자식클래스(Model 객체)의 오버라이드 선언된 요청 처리 메소드를 호출하여 요청을 처리하고
		//뷰 관련 정보(ActionForward 객체)를 반환받아 저장 - 메소드 오버라이드에 의한 다형성
		ActionForward actionForward=action.execute(request, response);
		
		//4.뷰 관련 정보가 저장된 객체를 사용해 응답 처리
		if(actionForward.isForward()) {//ActionForward 객체의 forward 필드값이 [true]인 경우
			//JSP 문서로 포워드 이동하여 JSP 문서의 실행결과(HTML)로 클라이언트에게 응답 처리
			request.getRequestDispatcher(actionForward.getPath()).forward(request, response);
		} else {//ActionForward 객체의 forward 필드값이 [false]인 경우
			//서블릿(컨트롤러)에서 URL 주소(/XXX.do)로 클라이언트에게 응답 처리
			response.sendRedirect(request.getContextPath()+actionForward.getPath());
		}
	}
}