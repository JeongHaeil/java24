package xyz.itwill.access;

//접근 제한자(Access Modifier) : 클래스, 필드 ,생성자 , 메소드 작성시 클래스 외부의
//접근을 제한하기 위해 사용하는 제한자
// => private, package, protected, public

// private : 필드 생성자 메소드의 접근을 제한하기 위한 접근 제한자
// => 필드,생성자,메소드를 클래스에서만 사용 가능하도록 설정하는 접근 제한자 - 은닉화
// => 다른 클래스에서 필드,생성자,메소드를 사용할 경우 에러 발생



public class PrivateMember {
	private int num;
	
	@SuppressWarnings("unused")
	private void display() {
		System.out.println("num = "+num);
	}
}
