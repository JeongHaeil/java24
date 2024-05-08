package xyz.itwill.record;

public class MemberTwoApp {
	public static void main(String[] args) {
		MemberTwo member=new MemberTwo("aaa22","홍길동", "ss@itwill.cdd");
		
		System.out.println("아이디  = "+member.id());
		System.out.println("이름 = "+member.name());
		System.out.println("이메일 = "+member.email());
		
	}
}
