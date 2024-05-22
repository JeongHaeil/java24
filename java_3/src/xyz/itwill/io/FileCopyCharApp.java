package xyz.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//원본파일 (c:\date\windows.exe) 에 저장된 내용을 문자데이타로 읽어 타켓파일 ((c:\date\windows.exe)
//원파일에 저장된 내용을 원시데이터로 읽어 타겟파일에 전달하여 저장하는 프로그램
// => 가공하지 않은 원시데이타로 입력 또는 출력 처리하여 문서파일 형식의 원본파일을 타켓파일로 복사
// => 문서파일이 아닌 경우 원본파일의 내용을 변형해 타겟파일로 복사하므로 사용 불가능
public class FileCopyCharApp {
	public static void main(String[] args) throws IOException {
		//BufferedReader 클래스 : 대량의 문자데이터를 전달받을 수 있는 입력스트림
		//생성하기 위한 클래스
		// => BufferedReader(InputStream in) : 매개변수로 전달받은 입력스트림(InputStream 객체 )을
		//전달받아 대량의 문자데이터를 전달 받을  수 있도록 확장
		BufferedReader in=null;
		try {
			in=new BufferedReader(new FileReader("c:/data/windows.exe"));
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾을수 없습니다");
			System.exit(0);
		}
		
		
		//BufferedWriter 클래스 : 대량의 문자데이터를 전달 할 수 있는 출력스트림
		// => BufferedWriter(Writer out) 생성자를 사용해 BufferedWriter 객체
		// => 매개변수로 입력스트림 을 전달받아 대량의 문자데이터 전달
			
		BufferedWriter out=new BufferedWriter(new FileWriter("c:/data/windows_char.exe"));
		
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
