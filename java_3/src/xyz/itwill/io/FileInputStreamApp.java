package xyz.itwill.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일에 저장된 내용을 원시 데이터로 제공받아 모니터(콘솔)에 출력하는 프로그램
public class FileInputStreamApp {
	public static void main(String[] args) throws IOException {
		
		//FileInputStream 클래스 : 파일에 저장된 내용을 원시데이터로 제공받을 수 있는 입력스트림
		//생성하기 위한 클래스
		// => FileInputStream(String name) 생성자를 사용하여 FileInputStream 객체 생성	
		// => name 매개변수에는 입력스트림을 생성하기 위한 파일경로를 전달하여 저장
		// => name 매개변수로 전달받은 파일경로에 파일이 없는 경우 FileNotFoundException 발생
		// => FileNotFoundException이 발생되면 반드시 try~catch 구문 사용해서 예외처리
			
		FileInputStream in=null;
		
		try {
			in=new FileInputStream("c:/date/byte.txt");
		}catch(FileNotFoundException e) {
			System.out.println("c:/date/byte.txt 파일을 찾을 수 없습니다");
			System.exit(0);
		}
		System.out.println("c:/date/byte.txt 파일에 저장된 내용입니다");
		
		int readByte;
		
		while(true) {
			//파일 입력스트림을 사용해 파일에 저장된 내용을 원시데이터를 제공받아 반환하여 변수저장 -Load
			//저장 - Load
			readByte=in.read();
			
			//파일 마지막에 존재하는 EOF(End Of File) 반환받은 경우 반복문 종료
			if(readByte == -1) break;
			
			//모니터 출력스트림으로 원시데이터를 전달하여 출력
			System.out.println(readByte);
			
		}
		// FileOutputStream.close() : 파일입력스트림을 제거
		in.close();
	}
}
