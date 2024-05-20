package xyz.itwill.util;

//Generic (제네릭) : 필드의 자료형이 부정확한 경우 Java 자료형 대신 사용될 식별자 - 미지정 자료형
// => Java 자료형(클래스, 인터페이스) 선언 시 < > 기호에 Generic 타입 작성

//형식) public class 클래스명<Generic, Generic,...> { }
// => < > 기호에 클래스에서 사용할수있는 다수의 Generic 타입을, 기호로 구분하여 선언
// => Generic 타입의 식별자는 대문자로 사용을 권장

//Generic 사용하여 선언된 클래스 - Generic 클래스
// => Generic 타입 대신 사용될 Java 자료형을 상속 기능을 사용해 제한 가능
//형식) public class 클래스명<Generic extends 부모클래스, Generic,...> { } 
// => Generic 타입 대신 사용될 Java 자료형은 반드시 부모클래스를 상속받은 자식클래스로만 사용 가능
public class Generic<A> {
//public class Generic<A extends Number> {
	private A field;
	
	public Generic() {
		// TODO Auto-generated constructor stub
	}

	public Generic(A field) {
		super();
		this.field = field;
	}

	public A getField() {
		return field;
	}

	public void setField(A field) {
		this.field = field;
	}
	
	
	
	
}
