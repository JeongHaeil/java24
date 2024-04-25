package basic;

//제어문(Control Statement) : (프로그램의 흐름 - 스레드 Thread)을 바꾸는 명령
// => 선택문(if, switch) : 스레드를 명령해서 선택 실행 
// => 반복문(for, while) : 명령을 위에서 아래로 진행을하되 반복적으로 아래에서 위로 한번더 명령 실행
// => 기타제어문(break, continue, retrun) : 기타등등
// - 위에서부터 아래로 명령 실행

// if : 조건식에 의해 명령을 선택실행하기 위한 명령문을 작성하는 키워드

// 형식-1) if(조건식) {명령; 명령;...} 명령이 1개인경우 블록생성 x
// => 조건식의 결과값이 [true]인 경우 블럭 내부에 작성된 명령들을 실행
// => 블럭 내부에 작성된 명령이 하나인 경우 블럭 기호 생략 가능

// 형식-2) if(조건식) { 명령;.. 명령;...} else {명령;... 명령;...}
// => 조건식의 결과값을 구분하여 명령을 선택 실행

// 형식-3) if(조건식) { 명령;.. 명령;...} else if {명령;... 명령;...}
// =>       else if {명령;... 명령;...} [else {명령;....명령;...}]

// => 다수의 조건식에 작성하여 조건식이 참인 블럭 내부의 명령을 선택 실행
// => 모든 조건식이 거짓인 경우 else 블럭의 명령 실행 -else 생략 가능

public class IfApp {
	public static void main(String[] args) {
		int su=60;
		//변수값이 50 이상인 경우 변수값을 화면에 출력하는 프로그램생성
		//조건식이 참인 경우 실행될 명령이 하나인 경우 블럭 기호 생략 가능
		if(su >= 50) {  
			System.out.println("su  = " +su);
		}
		System.out.println("=================================================");
		int score=80;
		
		//변수값이 60 이상인 경우 합격메세지를 출력 60 미만인 경우 불합격 메시지
		
		if(score >= 60) {
			System.out.println("[결과] 점수가 60점 이상이므로 <합격>입니다.");
		}
		if(score < 60) {
			System.out.println("[결과] 점수가 60점 미만이므로 <불합격>입니다.");
		}
		System.out.println("=================================================");
		//변수값을 홀수와 짝수로 구분하여 출력하는 프로그램
		int num=10;
		
		if(num % 2 != 0) {
			System.out.println(num+"= 홀수");
		} else {
			System.out.println(num+"= 짝수");
		}
		System.out.println("=================================================");
		char mun='0';
		
		//변수값을 영문자 또는 비영문자로 구분하여 출력하는 프로그램
		if(mun >= 'A' && mun <= 'Z' || mun >= 'a' && mun <= 'z') {
			System.out.println("결과"+mun+" = 영문자");
			} else {
			System.out.println("결과"+mun+" = 비영문자");
			}
		
		System.out.println("=================================================");
		boolean bool=false;  //boolean 변수 많이 사용함 ! 연산자 사용도함
		//조건식 대신 논리값을 저장한 변수를 사용하여 명령 선택 실행
		if(bool) {
			System.out.println("현재 변수값은 [true] 입니다.");
			} else {
				System.out.println("현재 변수값은 [false] 입니다.");
			}
		System.out.println("=================================================");
		
		
		int jumsu=90;
		//변수값이 0~100 범위의 유효한 값이 맞는지 구분 출력
		String grade=""; //학점 저장하기 위한 변수
		//변수값(점수)을 이용해 등급(학점) 을 구분하여 출력처리
		// => 100 ~ 90 : A, 89 ~ 80 : B, 79 ~ 70 : C 69 ~ 60 : D, 59 ~ 0 : F
		
		if(jumsu >= 0 && jumsu <= 100) {
			if(jumsu >= 90 ) {
				grade="A";
			} else if(jumsu >=80) {
				grade="B";		
			} else if(jumsu >=70) {
				grade="C";
			} else if(jumsu >=60) {
				grade="D";
			} else {
				grade="F";
			} 
			System.out.println("출력");
		} else { System.out.println("합격");
		 
		}
	}
}
