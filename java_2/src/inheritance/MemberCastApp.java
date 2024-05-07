package inheritance;


//상속관계의 클래스에서 참조변수와 객체 관계
public class MemberCastApp {
	public static void main(String[] args) {
		//부모클래스 참조변수=new 부모클래스(); 가능
		//=> 부모클래스 생성자를 호출하여 객체를 생성해 부모클래스 참조변수 저장
		Member member1=new Member();
		
		//참조 변수로 부모클래스 객체를 참조해 부모클래스 메소드 호출
		member1.setId("asda22");
		member1.setName("장보고");
		member1.display();
		System.out.println("================================================");
		
		//자식클래스 참조변수=new 자식클래스(); 가능
		
		// 자식클래스 생성자를 호출하면 부모클래스 생성자 먼저 호출되어
		//=>부모클래스 객체 생성되고 자식클래서 객체 생성되 자식클래스 참조변수에  객체 저장
		MemberEvent member2=new MemberEvent();
		//참조 변수로 자식클래스 객체를 참조해 자식클래스 메소드 호출
		//상속관계에 의해 부모클래스 참조하여 메소드 호출 가능
		member2.setId("sdfs33");
		member2.setName("전우치");
		member2.setEmail("sqq@dda.xxd");
		member2.display();
		System.out.println("================================================");
		
		//자식 클래스 참조변수=new 부모클래스(); 불가능
		//자식클래스의 참조변수에는 자식클래스의 객체를 저장해야하지만 없으므로 에러발생 - 부모객체 x 
		//MemberEvent member3=new Member();
		
		//부모 클래스 참조변수=new 자식클래수(); 가능
		Member member4=new MemberEvent();
		//참조변수로 부모클래스 객체 참조하여 부모클래스 메소드 호출
		member4.setId("sdsa22");
		member4.setName("거북선");
		
		//객체 형변환을 사용하면 부모클래스 참조변수로 자식클래스 객체 참조하여 메소드 호출 가능
		//명시적 객체 형변환(강제적) , 묵시적 객체 형변환(자동)
		//=> 상속관계 클래스에서만 객체 형변환 사용가능
		
		//명시적 객체 형변환(강제) : Cast 연산자 사용하여 부모클래스 참조변수의 자료형을
		//자식클래스로 변경하면 일시적으로 자식클래스 객체 참조해서 메소드 호출 가능
		
		//형식) 명시적 객체 형변환
		MemberEvent event=(MemberEvent)member4;
		event.setEmail("ada@asda.ads");	
		((MemberEvent)member4).setEmail("dad@asdas.asd");
		
		//묵시적 객체 형변환(자동) : 부모클래스 메소드를 자식클래스에서 오버라이드 선언
		//부모클래스 숨겨지고 자식클래스 메소드 사용되므로 부모클래스 참조변수로 객체를 참조해 메소드 호출하면 자동으로 객체 형변환
		//되며 오버라이딩 선언된 메소드 호출
		member4.display();
		
		System.out.println("================================================");
		
		
	}
}
