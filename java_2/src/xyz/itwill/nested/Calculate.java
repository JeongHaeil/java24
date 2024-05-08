package xyz.itwill.nested;

import java.util.function.Predicate;

//함수형 인터페이스 : 추상메소드가 하나만 작성된 인터페이스
// => 람다 표현식을 사용하여 객체를 생성하기 위한 인터페이스
// => 하나의 추상메소드 외에 정적메소드 또는 기본메소드 작성 가능
// => @FunctionalInterface 어노테이션을 사용하는것을 권장

//@FunctionalInterface : 함수형 인터페이스의 작성 규칙을 위반할 경우 에러를 발생하는 어노테이션

@FunctionalInterface
public interface Calculate {
	int sum(int num1, int num2);
	
	
}
