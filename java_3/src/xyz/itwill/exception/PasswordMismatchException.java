package xyz.itwill.exception;

//프로그램 개발자가 필요에 의해 직접 선언한 예외 클래스
//=> 예외클래스는 반드시 Exception 클래스 상속받아 작성 - 일반예외
//=> RuntimeException 클래스는 상속받아 작성 - 실행 예외
public class PasswordMismatchException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public PasswordMismatchException() {
		
	}
	
	
	public PasswordMismatchException(String message) {
		//super 키워드를 사용하여 부모클래스의 생성자를 호출하여 객체를 생성할 때 예외메세지
		//전달하여 부모클래스 객체에 예외메세지가 저장
		super(message);
	}
}
