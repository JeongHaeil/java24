package xyz.itwill.util;

//Object 클래스로 필드가 작성된 클래스로 객체를 생성해 사용
//=> Object 클래스의 필드에는 모든 클래스의 객체를 전달받아 저장가능
//=> Object 클래스의 필드에는 저장된 객체를 반환받아 사용하기 위해서는 반드시 명시적 객체
//형변환 사용 - ClassCastException 발생 가능


public class NonGenericApp {
	public static void main(String[] args) {
		
		NonGeneric nonGeneric1=new NonGeneric();
		
		//매개변수에 Integer 객체를 전달하여 NonGeneric객체의 필드값 변경
		// => 매개변수의 자료형이 Object 클래스로 작성되어 있어 모든 Java 객체를 전달하여 
		//메소드 호출
		nonGeneric1.setField(100); // 오토박싱 : 정수값 >> Integer 객체
		
		//필드값을 Object 객체 반환하므로 반드시 명시적 객체 형변환을 사용해야만 자식클래스의
		//객체를 참조하여 자식클래스으 메소드 호출
		Integer returnObject1=(Integer)nonGeneric1.getField();
		
		System.out.println(returnObject1); //오토 언박싱 : Integer 객체 >> 정수값
		
		System.out.println("====================================================");
		
		NonGeneric nonGeneric2=new NonGeneric();
		//매개변수에 Double 객체를 전달하여 NonGeneric객체의 필드값 변경
		nonGeneric2.setField(12.34); //오토박싱 : 실수값 >> Double 객체
		//명시적 객체 형변환을 잘못한 경우 ClassCastException 발생
		// => instanceof 연산자를 사용하여 명시적 객체 형변환이 가능한 클래스 검증
		if(nonGeneric2.getField() instanceof Integer) {		
			Integer returnObject2=(Integer)nonGeneric2.getField();
			System.out.println(returnObject2);
			
		}else if (nonGeneric2.getField() instanceof Double) {
			Double returnObject2=(Double)nonGeneric2.getField();
			System.out.println(returnObject2);
		}
		

		System.out.println("================================================================");
		NonGeneric nonGeneric3=new NonGeneric();
		
		nonGeneric3.setField("홍길동");
		
		String retunrObjcet3=(String)nonGeneric3.getField();
		System.out.println(retunrObjcet3);		
		
		
		
		
		
		
		
		
	}
}
