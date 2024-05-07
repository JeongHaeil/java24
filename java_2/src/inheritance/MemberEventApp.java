package inheritance;

public class MemberEventApp {
	public static void main(String[] args) {
		
		//자식 클래스의 생성자로 객체를 생성하면 부모클래스 생성자가 자동으로 먼저 호출
		//부모 클래스의 객체가 생성된 후 자식클래스의 생성자로 자식 객체 생성하여 상속관계형성
		//=> 자식클래스로 생성된 참조변수에는 자식객체의 메모리 주소 저장되어
		//자식클래스의 필드 또는 메소드 사용가능하며 상속관계에 부모클래스
		//객체를 자동으로 참조하여 필드 또는 메소드 사용가능
		MemberEvent member1=new MemberEvent();
		 
		member1.setId(" dd13aa");
		member1.setName(" 장보고");
		member1.setEmail(" ada@dgd.com"); 
	
		member1.display();
		System.out.println("============================================");
		
		Member member2=new MemberEvent("asda44","홍길동","qwe@amz.zcx");
		member2.display();
		
		System.out.println("============================================");
		
	}
}
