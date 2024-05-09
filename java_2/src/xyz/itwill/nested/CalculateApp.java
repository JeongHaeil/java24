package xyz.itwill.nested;

import javax.print.DocFlavor.INPUT_STREAM;

//람다 표현식 : 익명클래스로 객체를 보다 쉽게 생성하기 위해 만들어진 표현식
//=>주의사항) 반드시 함수형 인터페이스로만 람다표현식 사용 가능


//람다표현식을 사용하여 익명클래스로 객체를 사용하는 방법
// 형식) (자료형 변수명, 자료형 변수명,...) ->{명령; 명령;...};
// => 함수형 인터페이스에 작성된 추상메소드의 반환형 및 메소드명 생략
// => 소괄호 기호안에 함수형 인터페이스에 작성된 추상메소드의 매개변수 작성
// => 매개변수의 자료형을 생략할 수 있으며 매개변수가 하나인 경우 (소괄호) 기호 생략 가능
// => { 블럭 }에 함수형 인터페이스의 추상메소드를 오버라이딩 선언하여 실행될 명령 작성 
// => { 블럭 }에 작성된 명령이 하나인 경우 블럭 생략 가능하지만 return 키워드에 의해
//값을 반환하는 경우 블럭 기호 생략 불가능
// => 블럭 기호에 작성된 하나의 명령이 return 키워드에 의해 값을 반환하는 경우 return 키워드
//생략 하면 블럭 기호 생략 가능


public class CalculateApp {
	public static void main(String[] args) {
		/*
		//class CalculateImpl implements Calculate{
			
			@Override
			public int sum(int num1, int num2) {
				return num1+num2;
			}
			
		} 
		
		//Calculate clCalculate=new CalculateImpl();
		//System.out.println(Calculate.sum(10,20));
		*/
		
		
		//지역클래스를 선언하지 않고 익명클래스를 이용하여 객체를 생성해 참조변수에 저장
		//=> 익명클래스에서는 반드시 모든 추상메소드를 오버라이딩 선언
		/*
		Calculate calculate=new Calculate() {
			
			@Override
			public int sum(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		System.out.println(calculate.sum(10, 20));
		*/
		
		//Calculate calculate = (int num1, int num2) -> {return num1+num2;};
		//Calculate calculate = (num1,num2) -> {return num1+num2;};
		Calculate calculate = (num1,num2) -> num1+num2;
		System.out.println(calculate.sum(40, 50));
		
		
		
		
	}
}
