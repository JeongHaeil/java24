package basic;

//for : 조건식에 의해 명령을 반복 실행하기 위한 명령문을 작성하는 키워드

//형식) for : (초기식;조건식;증감식) {명령;...명령;...}
// => 초기식 : 변수에 초기값 저장하는 연산식
// => 조건식 : true 또는 false 만드는 연산식
// => 증감식 : 변수값을 증가하거나 감소하는 연산식
// => 반복의 횟수가 명확한 경우 사용 반복문(Loop Statement)
// => 초기식, 조건식, 증감식은 [;] 기호를 사용하여 구분
// => for 구문에는 반드시 [;] 기호가 2개 들어가야한다
// => 초기식 >> 조건식(참) >> 블럭 내부의 명령 실행 >> 증감식 >> 조건식(참) 
//     >> 블럭 내부의 명령 실행 >>...
// = 조건식의 결과값이 거짓인 경우 반복문 종료
// => 초기식, 조건식, 증감식 생략 가능 ex : for(;;) - 조건식이 생략된 경우 무조간 참으로 처리
// => 초기식과 증감식은 [,] 기호를 사용하여 나열 작성가능

//주의사항) 조건식의 결과값이 무조건 참인 경우 무한 반복 가능 -무한루프(Endless Loop)


//프로그램 흐름을 파악하기 위한 이클립스 기능
// 1. 중지점(BreakPoint) 설정 : 스레드를 일시적으로 중지하기 위한 위치 지정하는 작업
// 2. [F11] : Debug 기능을 사용하기 위한 단축키
// 3. Dubug Perspective 변환
// 4. [F6] : 스레드가 위치한 명령을 실행하기위한 작업
// 5. 프로그램 강제 종료
// 6. Java Perspective 변환 후 중지점 제거

public class ForApp {
	public static void main(String[] args) {
		//"Java Programming" 화면 출력
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("===============================================================");
		//for 명령이끝나면 변수 i 사라짐 = 사라지면 4번 반복 <= 5번
		for(int i=1;i<=5;i++) {
			System.out.println("Java Programming");
		}
		System.out.println("===============================================================");
		// int i=5 초기식 ; i>=1 조건식 ; i-- 증감식
		for(int i=5;i>=1;i--) {
			System.out.println("Java Programming");
		}
		System.out.println("===============================================================");
		for(int i=2;i<=10;i+=2) {
			System.out.println("Java Programming");
	}
		System.out.println("===============================================================");
		// " 1   2    3    4     5" 화면 출력
		for (int i=1;i<=5;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("===============================================================");
		for (int i=1;i<=10;i++) {
			if(i % 2 == 0)
			System.out.print(i+"\t");
		}
		//for안에 if문 사용법
		System.out.println();
		System.out.println("===============================================================");
		for (int i=2;i<=10;i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("===============================================================");
		//1~100 범위의 정수들 합계 계산 출력
		int tot=0;
		for (int i=1;i<=100;i++) {
			tot+=i; //tot = 1+2+3+4+5+6+.....+99+100
		}
		System.out.println("1~100범위의 정수들 합계 ="+tot);
		System.out.println("===============================================================");
		
		

		int begin=80, end=20;
		/*

		//시작값이 종료값보다 큰경우 에러 메세지 출력하고 프로그램 종료
		if(begin > end) {
			System.out.println("[에러]시작값이 종료값보다 작아야합니다.");
			System.exit(0);
		}
		*/
		
		if(begin> end) {
			//두 변수에 저장된 값을 서로 저장하는 명령 - 치환 알고리즘
			// 새로운 변수 만들어서 저장하는개념 temp 생성 temp >begin 저장 begin > end 저장 end > temp 저장
			//알고리즘: 프로그램 작성시 발생되는 문제를 해결하기 위한 명령
			int temp=begin;
			begin=end;
			end=temp;
		}
		
		int sum=0;
		for(int i=begin;i<=end;i++) {
			sum+=i;  //20~80 범위 합계 저장
		}
		System.out.println(begin+"~"+end+"범위 정수들의합계 ="+sum);
		
		System.out.println("===============================================================");
		//초기식 증감식 [,] 나열방법
		
		for(int i=1, j=5;i<=3;i++,j--) {
			System.out.println("i ="+i+", j ="+j);
		}
		System.out.println("===============================================================");
		//초기식 for문에 생략가능 밖에 저장
		// i 변수 저장 for문에는 초기식 생략
		// 밖에 저장된 변수값 i 는 안사라지며 1이 아닌 첫번째 연산한 값 저장
		int i=1; //실행시 변수 5
		for(;i<=4;i++) {
			System.out.println(i+"\t");
		}
		for(;i>=1;i--) {
			System.out.print(i+"\t");
		}
		System.out.println("===============================================================");
		
		/*
		for(;;) {
			System.out.println("무한반복");
		}
		*/
		System.out.println("===============================================================");
		
		
		
		
}
}