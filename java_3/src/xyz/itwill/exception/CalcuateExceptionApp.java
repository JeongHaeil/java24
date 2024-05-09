package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//키보드로 정수값 2개를 입력받아 첫번째 정수값에서 두번째 정수값을 나눈 몫 출력

public class CalcuateExceptionApp {
	public CalcuateExceptionApp() throws InputMismatchException { //메소드에서 발생되는 모든 예외 전달
		//throws Exception 
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("첫번째 정수값 입력 >> ");
		//sc.nextInt(); : 입력값을 얻어와 정수값으로 변환하여 반환하는 메소드
		// => 입력값을 정수값으로 변환할 수 없는 경우 InputMismatchException 발생
		int num1=scanner.nextInt();
		
		System.out.print("두번째 정수값 입력 >> ");
		int num2=scanner.nextInt();
		
		//어떤수를 [0]으로 나눈 경우 ArithmeticExeption 발생
		System.out.println("결과>>"  +num1+  " / "  +num2+  " ="+(num1/num2));
		
		scanner.close();
	
	}
	
	public static void main(String[] args) {
		try {
		// new 연산자로 클래스의 생성자를 호출하여 객체 생성 - 생성자의 명령실행
		// => 생성자에서 전달된 예외에 대한 예외 처리
		new CalcuateExceptionApp();
		
		} catch(InputMismatchException e){
			System.out.println("에러");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수없습니다");
		}
		 
		 //catch(InputMismatchException | ArithmeticExeption e){
			//catch 블럭에서 예외클래스를 | 연산자로 연결하여 다수의 예외클래스 객체 전달
		}
	}
	

