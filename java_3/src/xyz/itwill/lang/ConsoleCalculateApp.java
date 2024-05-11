package xyz.itwill.lang;

import java.util.Scanner;

//키보드로 하나의 사칙 연산식을 입력받아 연산결과를 계산하여 출력하는 프로그램 작성
//ex) 연산식 입력 >> 20 + 10
//    [결과]30
// => 입력 연산식에서 사용 가능한 연산자는 사칙 연산자(*, /, +, -)만 허용
// => 형식에 맞지 않는 연산식이 입력될 경우 에러 메세지 출력 후 프로그램 종료
// => 입력 연산식에 공백 입력이 가능하도록 처리
public class ConsoleCalculateApp {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1=sc.nextInt();
		
		System.out.println("연산기호를 입력하세요(+, -, *, /)");
		char op=sc.next().charAt(0);
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num2=sc.nextInt();
		
		
		int result=0;
		
		switch(op) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			System.exit(0);
			return;
		}
		System.out.println("결과 = "+result);
		
		System.out.println();
		
		

	}
}