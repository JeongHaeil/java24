package xyz.itwill.util;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//java.util.function 패키지 : 함수형 인터페이스가 선언된 패키지
// => 함수형 인터페이스로 사용해 람다 표현식 객체 



 
public class LamdaApp {
	public static void main(String[] args) {
		//Consumer<T> 함수형 인터페이스 : 제네릭으로 전달된 Java 자료형의 객체를 매개변수로
		//제공받아 아무것도 반환하지 않는 accept() 추상메소드가 선언된 함수형 인터페이스
		int number=100;
		
		/*
		//Consumer 인터페이스를 상속받은 익명클래스를 사용해 객체를 생성하여 참조변수에 저장
		Consumer<Integer> integerConsumer=new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(number+i);
				
			}
		};
		*/
		
		//Consumer 함수형 인터페이스를 람다표현식 참조변수에 저장
		Consumer<Integer> integerConsumer= i -> System.out.println(number+i);
		integerConsumer.accept(200);
		
		System.out.println("=========================================================");
		//Predicate<T> 함수형 인터페이스 : 제네릭으로 전달된 Java 자료형의 객체를 매개변수로
		//제공받아 boolean[논리값] 을 반환하는 test 추상메소드가 작성된 인터페이스
		//형식) 변수.test() 
		Predicate<Integer> isEven= i -> i % 2 == 0;
		
		if(isEven.test(10)) {
			System.out.println("입력값은 짝수 입니다");
		} else {
			System.out.println("입력값은 홀수 입니다.");
		}
		System.out.println("=========================================================");
		
		//Function<T 전달 , R 리턴> 함수형 인터페이스 : 첫번째 제네릭으로 전달된 Java 자료형의 객체를 
		//매개변수로 전달받아 처리하고 두번째 제네릭으로 전달된 Java 자료형의 객체를 반환하는
		// apply() 추상메소드가 작성된 함수형 인터페이스
		
		Function<String, Integer> stringLength = str -> str.length();
		
		System.out.println("문자 갯수 = "+stringLength.apply("Java"));
		System.out.println("=========================================================");
		
		
		
		
		
		
		
		
		
		
		
	}
}
