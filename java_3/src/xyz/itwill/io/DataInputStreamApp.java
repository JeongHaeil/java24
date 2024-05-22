package xyz.itwill.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamApp {
	public static void main(String[] args) throws IOException {
		//DataInputStream 클래스 : 원하는 자료형의 값을 전달받을 수 있는 입력 스트림을 생성
		// =>DataInputStream 생성자를 사용하여 DataInputStream 객체생성
		// =>매개변수로 입력스트림을 전달받아 원하는 자료형의 값을 전달받을
		//수 있는 입력스트림으로 확장
		DataInputStream in=new DataInputStream(new FileInputStream("c:/data/data.txt"));
		
		//파일에 저장된 자료형의 순서대로 메소드를 호출하여 값을 반환받아 사용
		// => 순서대로 메소드를 호출하지 않으면 비정상적인 결과가 발생하거나 EOFException 발생
		//DataInputStream.readInt : 확장된 입력스트림을 사용하여 정수값을 제공받아 반환하는 메소드
		int value1=in.readInt();
		
		//DataInputStream.readInt : 확장된 입력스트림을 사용하여 논리값을 제공받아 반환하는 메소드
		boolean value2=in.readBoolean();
		
		//DataInputStream.readInt : 확장된 입력스트림을 사용하여 문자열을 제공받아 반환하는 메소드
		String value3=in.readUTF();
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		in.close();
	}
}
