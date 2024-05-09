package xyz.itwill.exception;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

//키보드로 정수값을 입력받아 변수에 저장된 비밀번호와 비교하여 결과 출력
public class PasswordMatchApp {
	public static void main(String[] args) {
		
		/*
		//비밀번호가 저정된 변수
		int password=123456;
		Scanner scanner=new Scanner(System.in);
				
		System.out.println("비밀번호 입력 >> ");				
		int number=scanner.nextInt();
				
		
		if(number == password){
			System.out.println("비밀번호 맞습니다");
		} else {
			System.out.println("비밀번호 틀렸습니다");
		}		
		scanner.close();		
		*/		
				
		int password=123456;		
		Scanner scanner=new Scanner(System.in);
		
		try {
			System.out.println("비밀번호 입력 >>");
			int number=scanner.nextInt();
			
			if(number != password) {
			//예외클래스로 객체를 생성하여 인위적 예외발생
			//)형식) throw new 예외클래스 (값,값,..);
			//=> 예외클래스의 매개변수가 작성된 생성자로 객체 생성
				
			//인위적으로 발생디는 예외에 대한 예외클래스는 직접 작성하여 사용하는 것을 권장	
			//=>발생되는 예외를 명확히 구분하
			//throw new RuntimeException("입력된 비밀번호가 틀립니다");
			throw new PasswordMismatchException("비밀번호가 틀립니다.");
			
			}
			
			System.out.println("비밀번호가 맞습니다");

		} catch (PasswordMismatchException e) {
			System.out.println("숫자만 입력");
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
