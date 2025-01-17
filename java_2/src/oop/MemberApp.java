package oop;

public class MemberApp {
	public static void main(String[] args) {
		//new 연산자로 member 클래스의 매개변수가 없는 기본 생성자를 호출하여 객체 생성해 참조변수에 저장
		// = > 생성된 객체 필드에는 기본값이 초기값으로 자동 저장
		Member member1=new Member();
		
		//객체로 필드의 Getter 메소드 호출하여 객체의 필드값을 반환바다 출력
		System.out.println("아이디 = " +member1.getId());
		System.out.println("이름 = " +member1.getName());
		System.out.println("이메일 = " +member1.getEmail());
		
		System.out.println("===============================================================");
		//객체로 필드의 Setter 메소드를 호출하여 매개변수에 전달된 값으로 객체의 필드값 변경
		member1.setId("sads");
		member1.setEmail("11");
		member1.setName("홍길동");
		
		System.out.println("===============================================================");
		
		System.out.println("아이디 = "+member1.getId());
		System.out.println("이메일 = "+member1.getEmail());
		System.out.println("이름 = "+member1.getName());
		System.out.println("===============================================================");
		//종속되어서 수정불가
		member1.display();
		
		System.out.println("===============================================================");
		//new 연산자로 매개변수가 있는 생성자를 호출하여 객체를 생성해 참조변수에 저장
		// => 매개변수에 전달된 값에 의해 객체 필드에초기값 저장
		// => 매개변수에 의해 생성자가 자동 선택되어 호출 - 메소드 오버로딩에 의한 다형성
		Member member2=new Member("opsd456","해","dsfs@dasda");
		member2.display();
		System.out.println("===============================================================");
		Member member3=new Member("전우치");
		member3.display();
		
	}
}
