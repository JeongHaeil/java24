package xyz.itwill.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//키보드로 문자데이터를 입력받아 파일에 전달하여 저장하는 프로그램 작성
//=> EOF 신호(Crtl + Z 입력종료) 를 입력 받으면 프로그램 종료

public class FileWriterApp {
	public static void main(String[] args) throws IOException {
		
		//키보드 입력스트림(System.in) 매개변수로 전달받아 문자데이터를 제공 받을수 있는
		//입력스트림 확장
		InputStreamReader in=new InputStreamReader(System.in);
		
		//FileWriter 클래스 : 파일에 문자데이터를 전달하여 저장할 수 있는 출력스트림을
		//생성하기 위한 클래스
		// => FileOutputStream(String name) 생성자를 사용하여 FileOutputStream 객체 생성
		// => name 매개변수에는 출력스트림을 생성하기 위한 파일경로를 전달하여 저장
		// => name 매개변수로 전달받은 파일경로에 파일이 없는 경우 FileNotFoundException 발생
		//파일 출력스트림을 생성할 때 매개변수로 전달받은 파일이 없는 경우 자동으로 파일을 
		//생성하여 파일 출력스트림을 제공하므로 FileNotFoundException은 예외 처리하지 않고 전달
		// => name 매개변수로 전달받은 파일이 있는 경우 기존 내용을 초기화하여 새로운 내용으로 저장되도록 처리
		
		
		//FileWriter(String name, boolean append) 생성자를 사용하여 FileOutputStream 객체
		//=> append 매개변수에 [true] 전달할 경우 name 매개변수로 전달받은 파일이 있으면
		//기존내용의 새로운 내용을 추가하여 저장
		
		FileWriter out=new FileWriter("c:\\date\\char.txt", true);
		
		int readByte;
		while(true) {
			//확장된 키보드 입력스트림을 사용해 문자데이터를 반환받아 변수 저장
			readByte=in.read();
			if(readByte == -1) break;
			//파일 출력스트림을 사용해 파일에 문자데이터를 전달받아 저장
			out.write(readByte);
			
			
			
		}
		//FileWriter.close : 파일 출력스트림을 제거하는 메소드
		out.close();
		
		System.out.println("c:\\date\\char.txt 파일을 확인해 보세요");
	}
}
