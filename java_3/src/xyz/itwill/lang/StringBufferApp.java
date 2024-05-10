package xyz.itwill.lang;

//StringBuffer 클래스 : 문자열을 저장한 객체를 생성하기 위한 클래스
// => String 클래스의 메소드는 String 객체에 저장된 문자열을 직접 사용하지 않고 필요한 기능을
//구현하여 처리 결과를 반환
// => StringBuffer 클래스의 메소드는 StringBuffer 객체에 저장된 문자열을 직접 사용하여
//필요한 기능을 구현하여 처리결과를 반환
// => String 클래스 메소드보다 StringBuffer 클래스 메소드가 문자열 처리 속도 우수

//StringBuilder : 문자열을 저장한 객체를 생성하기 위한 클래스
//=> StringBuffer 클래스와 동일한 메소드를 제공하지만 StringBuffer 클래스의 메소드는 일반
//메소드로 선언되어있는 StringBuilder 클래스는 동기화 메소드로 선언
public class StringBufferApp {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		
		System.out.println("sb.toString() = " + sb.toString());
		System.out.println("sb = "+sb);
		
		//StringBuffer 객체에 저장된 문자열을 반환받아 String 객체로 변환할 경우 toString() 메소드 호출
		String str=sb.toString();
		System.out.println(str);
		
		System.out.println("===============================================================================");
		//StringBuffer.append(Object o) : StringBuffer 객체에 저장된 문자열에 매개변수로 전달
		//받은 객체 추가하는 메솧드
		sb.append("def");
		System.out.println(sb); // sb = abcdef
		
		str+="def";
				System.out.println(str);
		
		System.out.println("===============================================================================");
		
		//StringBuffer.insert(int index , Object o ) : StringBuffer 객체에 저장된 문자열에
		//매개변수로 전달받은 객체를 첨자 위치에 삽입하는 메소드
		sb.insert(4, "X");
		
		System.out.println(sb); // sb = abcdXef
		
		System.out.println("===============================================================================");
		//StringBuffer.deleteCharAt(int index) : StringBuffer 객체에 저장된 문자열에서 매개변수
		//전달받은 첨자위치 문자 삭제
		sb.deleteCharAt(2);
		System.out.println(sb); // sb = abdXef
		
		System.out.println("===============================================================================");
		//StringBuffer.delete(int endIndex ) : StringBuffer 객체에 저장된 문자
		//매개변수로 전달받은 시작첨자 위치의 문자부터 종료첨자 위치의 문자전까지 문자들을 삭제하는 
		//메소드 - 원하는 범위의 문자열 삭제
		sb.delete(4, 6);
		System.out.println(sb); // sb = abdX
		
		System.out.println("===============================================================================");
		//StringBuffer.reverse() : StringBuffer 객체에 저장된 문자열의 문자를 반대로 나열하여
		//저장하는 메소드
		
		sb.reverse();
		System.out.println(sb); // sb = Xdba
		
	}
}
