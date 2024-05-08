package xyz.itwill.record;

public class MemberOneApp {
	public static void main(String[] args) {
		Member member=new Member("asd123", "홍길동", "dsad@asda.asd");
				
		System.out.println("아이디 = "+member.getId());		
		System.out.println("이메일 = "+member.getEmail());		
		System.out.println("이름 = "+member.getName());		
				
	}
}
