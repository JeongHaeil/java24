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
<<<<<<< HEAD
		/*
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1=sc.nextInt().replace(" "," ");
		
		System.out.println("연산기호를 입력하세요(+, -, *, /)");
		char op=sc.next().charAt(0).replace(" "," ");
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num2=sc.nextInt().replace(" "," ");
		
		
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
		*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("연산식 입력 >> ");
		//키보드로 입력받은 연산식에서 모든 공백을 찾아 제거 변수저장
		// =>연산식을 첨자로 구분하여 분리하기 위해 공백 불필요
		String operation=sc.nextLine().replace(" "," ");
		System.out.println();
		sc.close();
		
		//연산식에서 검색할 연산자가 저장된 문자열 배열 생성
		String[] operatorArray= {"*", "/", "+", "-"};
		
		//연산자식에서 연산자를 검색하여 연사자의 시작첨자를 저장하기위한 변수
		int index=-1;
		
		//배열 요소값(연산자) 을 차례대로 제공받아 반복처리
		for(String operator : operatorArray) {
			//연산식에서 연산자를 찾아 시작첨자를 반환받아 변수 저장
			//String.indexOf(String str)  : String 객체에 저장된 문자열에서
			//매개변수로 전달받은 문자열을 시작첨자부터 찾아 문자열의 첨자를 반환하는 메소드
			
			index=operation.indexOf(operator,1); //첨자가 [1]인 위치부터 문자열을 검색하여 첨자 반환
			
			//연산식에서 연산자를 찾은 경우 반복문 종류
			if(index != -1) break;
			
			
		}
		
		//연산식에 연산자가 없거나 연산자가 뒤에 있는 경우 프로그램 종료0
		if(index < 0 || index >= operation.length()-1) {
			System.out.println("연산식을 잘못 입력했습니다");
			System.exit(0);
		}
		
		try {
		//연산식에서 첫번째 피연산자를 분리한 후 정수값으로 변환하여 변수저장
		int num1=Integer.parseInt(operation.substring(0,index));
		
		//연산식에서 연산자를 분리하여 변수 저장
		String operator=operation.substring(index,index+1);
		
		
		//연산식에서 두번째 피연산자를 분리한 후 정수값으로 변환하여 변수저장
		int num2=Integer.parseInt(operation.substring(index+1));
		
		//연산자를 비교하여 피연산자에 대한 연산결과를 계산하여 저장
		
		int result=0;
		switch(operator) {
		case "*" : result=num1*num2; break;
		//두번째 피연산자의 값이 [0]인 경우 ArithmeticExcption
		case "/" : result=num1/num2; break;
		case "+" : result=num1+num2; break;
		case "-" : result=num1-num2; break;
		}
	
		System.out.println(result);
		
		
	}	catch( NumberFormatException e) {
			System.out.println("연산식 숫자가 아닌 값 입력");
	}	catch(ArithmeticException e) {
			System.out.println("0으로 나눌수없습니다");
	}	catch(Exception e) {
		System.out.println("프로그램에 오류 발생");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
=======
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
>>>>>>> branch 'main' of https://github.com/JeongHaeil/java24.git
		
		

	}
}