package xyz.itwill.util;

//Generic 타입으로 필드가 작성된 클래스(Generic 클래스)로 객체를 생성해 사용
// => Generic 타입 대신 사용된 Java 자료형의 객체만 필드 저장 - 제한적인 객체 저장
// => 명시적 객체 형변환 없이 필드값을 객체로 반환받아 사용 가능

public class GenericApp {
	public static void main(String[] args) {
		
		//Generic 클래스의 Generic 타입에 필요한 Java 자료형을 전달해야만 필드 또는 메소드 완성
		//해야하므로 클래스로 객체생성 가능
		//=> 생성자의 Generic 타입에는 Java 자료형 전달 생략 가능 
		Generic<Integer> generic1=new Generic<Integer>();// A >> Integer
		
		
		//Generic 타입 대신 설정된 클래스의 객체를 매개변수로 전달하여 필드값으로 저장
		generic1.setField(100); //필드에 Integer 객체를 전달하여 저장
		//generic1.setField(25.34); //필드에 Double 객체를 전달하면 에러 발생
		
		Integer returnObject1=generic1.getField();
		System.out.println(returnObject1);
		System.out.println("=========================================================================");
		
		Generic<Double> generic2=new Generic<Double>();
		generic2.setField(25.34);
		
		Double returnObject2=generic2.getField();
		System.out.println(returnObject2);
		System.out.println("=========================================================================");
		
		Generic<String> generic3=new Generic<String>();
		generic3.setField("홍길동");
		
		String returnObject3=generic3.getField();
		System.out.println(returnObject3);
		
		
		
	}
}
