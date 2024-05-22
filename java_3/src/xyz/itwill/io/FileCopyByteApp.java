package xyz.itwill.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//원본파일 (c:\date\windows.exe) 에 저장된 내용을 원시데이타로 읽어 타켓파일 ((c:\date\windows.exe)
//원파일에 저장된 내용을 원시데이터로 읽어 타겟파일에 전달하여 저장하는 프로그램 
public class FileCopyByteApp {
	public static void main(String[] args) throws IOException {
		//BufferedInputStream 클래스 : 대량의 원시데이터를 전달받을 수 있는 입력스트림
		//생성하기 위한 클래스
		// => BufferedInputStream(InputStream in) : 매개변수로 전달받은 입력스트림(InputStream 객체 )을
		//전달받아 대량의 원시데이터를 전달 받을  수 있도록 확장 
		BufferedInputStream in=null;
		
		try {
			in=new BufferedInputStream (new FileInputStream("c:/data/windows.exe"));
					
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾을수 없습니다");
			System.exit(0);
		}
		System.out.println("파일에 저장된 내용입니다");
		
		//BufferedOutputStream 클래스 : 대량의 원시데이터를 전달 할 수 있는 출력스트림
		// => BufferedOutputStream 생성자를 사용해 BufferedOutputStream 객체
		// => 매개변수로 입력스트림 을 전달받아 대량의 원시데이터 전달
	
		BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream("c:/data/windows_windows.exe", true));
		int readByte;
		
		
		while(true) {
			readByte=in.read();
			
			if(readByte == -1)break;
			out.write(readByte);
		
		}
		in.close();
		out.close();
		System.out.println("파일을 확인하세요");
	}


	

}
