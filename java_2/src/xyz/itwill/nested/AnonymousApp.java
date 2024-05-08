package xyz.itwill.nested;

public class AnonymousApp {
	// 인터페이스를 사용해 참조변수 생성은 가능하지만 인터페이스에는 생성자가없으므로 객채생성불가능
	// => 인터페이스는 클래스가 상속받아 사용하기 위한 자료형 - 작업지시서의 역할
	// =>인터페이스를 상속받은 자식클래스는 인터페이스의 모든 추상메소드를 무조건
	// 오버라이딩 선언

	// Anonymous anonymous=new Anonymous();

	// 인터페이스를 상속받은 자식클래스 작성 - Local Class(지역클래스)
	/*
	class AnonymousParent implements Anonymous {

		@Override
		public void display() {
			System.out.println("지역클래스의 display() 메소드 호출");

		}
	*/
	// 인터페이스를 상속받은 이름이 없는 자식클래스의 기본 생성자를 호출하여 객체를 생성해서
	// 인터페이스 참조변수에 저장
	// 인터페이스 상속받은 이름이없는 자식클래스 자동생성 - 익명 내부클래스
	// 익명 내부클래스 : 추상클래스 또는 인터페이스를 상속받아
	// 자동으로 만들어진 이름이 없는 지역클래스
	// => 익명 내부클래스로 메소드에서 사용될 하나의 객체만을 생성할 목적으로 사용
		//=> 추상클래스 또는 인터페이스에 작성된 모든 추상메소드를 익명 내부클래스에서
		//무조건 오버라이딩 선언
			Anonymous anonymous = new Anonymous() {
			@Override
			public void display() {
				System.out.println("호출");
			}
		};
		
	}

