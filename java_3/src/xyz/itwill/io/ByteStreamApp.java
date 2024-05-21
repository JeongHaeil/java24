package xyz.itwill.io;

import java.io.IOException;

//java.io 패키지 : 입력 스트림 과 출력스트림을 생성할 수 있는 Java 자료형이 선언된 패키지

//스트림(Stream) : 값을 전달하기 위한 목적으로 선언된 입력클래스 또는 출력클래스로 생성된 객체
// => 물이 흐르는 모양으로 만들어진 클래스로 한쪽방향으로 순차적으로 전달되도록 처리

//원시데이터 기반 스트림(ByteStream) : 가공되지 않은 순수수한 원시데이터(값)을 전달하기 위한
//입력 또는 출력클래스로 생성된 스트림(객체)
// => 전달값을 1Byte 단위로 입력 또는 출력하기 위한 스트림
// => InputStream 추상클래스와 OutputStream 추상클래스르 기반으로 선언된 클래스


//키보드로 입력받은 원시데이터(1Byte)를 모니터로 전달하여 출력하는 프로그램 작성
// => EOF(End Of File) 신호(Ctrl + Z - 입력종료)를 받기 전까지 반복 처리

public class ByteStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("키보드를 눌러 문자값을 입력해 주세요");
		
		//키보드 입력값(1Byte - 원시데이터) 을 저장하기 위한 변수
		int readByte;
		
		while(true) {
			//System.in : 프로그램 개발을 위해 제공되는 키보드 입력스트림이 저장된 필드
			// => InptStream 클래스 기반으로 생성된 입력스트림
			// => 키보드를 누르면 키보드 입력값(1Byte)을 입력스트림 전달
			
			//InptStream.read(): 입력스트림에 저장된 원시데이터(Byte)를 얻어와 정수값 
			//반환하는 메소드
			// => 입력스트림에 원시데이터가 하나도 없는 경우 스레드가 일시 중지 상태로 전환
			// => 키보드로 엔터를 입력하면 일시 중지된 스레드는 재실행
			
			//입력스트림 또는 출력스트림으로 메소드를 호출할 경우 대부분 IOException 발생
			// => IOException : 입력스트림 또는 출력스트림에 문제가 있는 경우 발생되는 일반예외
			readByte=System.in.read();
			
			//입력종료 신호(Crtl + Z : -1 )를 전달된 경우 반복문 종료
			if(readByte == -1 )break;
			
			//System.out : 프로램 개발을 위해 제공되는 모니터(콘솔) 출력 스트림
			// => PrintStream 클래스(OutputStream 클래스) 기반으로 생성된 입력스트림
			// OutputStream.write : 매개변수로 전달받은 정수값을 출력스트림에 원시데이터로 전달하는 메소드
			System.out.write(readByte);
			
		}
		System.out.println("프로그램 종료");
	}
}
