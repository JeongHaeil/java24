package xyz.itwill.record;

//레코드 : JDK14에서 만들어진 새로운 Java 자료형
// => 클래스보다 간결하게 값을 저장할 목적의 객체를 생성하기 위한 자료형
// =>필드값을 변경할 수 없는 객체를 생성하기 위한 자료형 -클래스 유사

//회원정보(아이디 이름 이메일) 저장하기 위한 레코드
//=> 레코드 선언시 필드를 ()안에 final 제한자없이 필드를  작성하면 생성자 및 메소드가 자동생성
//=> 필드명 동일한 이름으로 필드값을 반환하는 메소드 제ㅐ공

public record MemberTwo(String id,String name,String email) {
	
}
