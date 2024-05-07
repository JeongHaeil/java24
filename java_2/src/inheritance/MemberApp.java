package inheritance;

public class MemberApp {
	public static void main(String[] args) {
		Member member1=new Member();
		
		
		
		member1.setId("asda22");
		member1.setName("장보고");
		
		member1.display();
		System.out.println("=================================================");
		
		Member member2=new Member("asdasd","이순신");
		
		member2.display();
		System.out.println("=================================================");
		
		
		
		
		
	}
}
