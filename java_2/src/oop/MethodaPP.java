package oop;

import java.util.Arrays;

//프로그램 실행을 목적으로 작성된 클래스 - main() 메소드
public class MethodaPP {
	//JVM 에 의해 자동 호출ㄷ되는 메소드
	public static void main(String[] args) {
		//클래스 객체를 생서아여 객체 메모리주소를 참조변수 저장
		//=> 같은 패키지에 작성된 클래스는 패키지 표현하지 않아도 클래스 사용가능
		   //참조변수 method
		Method method=new Method();
		
		
		//참조변수를 출력할 경우 "클래스@메모리주소" 형식의 문자열 변환 출력
		System.out.println("method = "+method);
		System.out.println("====================================================");
		//참조변수에 저장된 메모리 주소로 객체를 참조하여 객체로 클래스에 작성된 메소드 호출
		// -> 메소드를 호출하면 프로그램의 흐름이 메소드로 이동하여 메소드 명령을
		//실행하고 메소드가 종료 다시 되돌아옴
		
		method.displayone();
		method.displaytwo();
		
		
		System.out.println("====================================================");
		method.printOne();
		method.printOne();
		
		System.out.println("====================================================");
		method.printTwo(34);
		
		System.out.println("====================================================");
		
		method.printThree(60, 70);
		method.printThree(19, 88);
		
		System.out.println("====================================================");
		boolean result=method.isOddEven(10);
		
		
		//조건식 대신 boolean 변수에 저장된 논리값을 비교하여 명령을 선택 실행
			if(result) {
				System.out.println("매개변수 전달된 값은 짝수");
			} else {
				System.out.println("매개변수 전달된 값은 홀수");
			}
			
			//조건식 대신 메소드를 호출하여 메소드 반환값 비교 하여 명령 선택 실행
			if(method.isOddEven(12)) {
				System.out.println("매개변수 전달된 값은 짝수");
			} else {
				System.out.println("매개변수 전달된 값은 홀수");
			}
			
		System.out.println("====================================================");
			int[] numArray=method.returnArray();
			System.out.println("배열 요소 값 = "+Arrays.toString(numArray));
		System.out.println("====================================================");
		//메소드 매개변수에 참조변수에 저장된 배열 주소값 전달
		int[] suArray= {10, 20, 30};
		System.out.println("합계 = "+method.sumOne(suArray));
		
		//배열 생성하여 메소드 매개변수 배열 주소값 전달
		System.out.println("합계 = "+method.sumOne(new int[] {10, 20, 30}));
		
		System.out.println("====================================================");
		// 0개 이상의 요소를 가진 배열을 생성하여 메소드 매개변수에 전달
		System.out.println("합계 = "+method.sumOne(new int[] {}));
		System.out.println("합계 = "+method.sumOne(new int[] {10,20,30,40,50}));
		
		System.out.println("====================================================");
		System.out.println("합계 = "+method.sumTwo());
		System.out.println("합계 = "+method.sumTwo(10, 20));
		System.out.println("합계 = "+method.sumTwo(20,30,40));
		System.out.println("합계 = "+method.sumTwo(50,60,70,80,90));

		System.out.println("====================================================");
		
		
		
		
	}
}
