package xyz.itwill.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileReaderApp {
	public static void main(String[] args) throws IOException {
		FileReader in=null;
		try {
			in=new FileReader("c:/data/char.txt");
		} catch (FileNotFoundException e) {
			System.out.println("[오류] c:/data/char.txt 파일을 찾을수 없습니다");
			System.exit(0);
		}
		
		//모니터 출력스트림을 매개변수로 ㅓㄴ달받아 문자데이터를 전달 할 수있는 출력스트림 확장
		OutputStreamWriter out=new OutputStreamWriter(System.out);
		System.out.println("파일에 저장된 내용입니다");
		
		int readByte;
		while(true) {
			//확장된 키보드 입력스트림을 사용해 문자데이터를 반환받아 변수 저장
			readByte=in.read();
			if(readByte == -1) break;
			//파일 출력스트림을 사용해 파일에 문자데이터를 전달받아 저장
			out.write(readByte);
			out.flush();
			
			
		}
		in.close();
	}
}
