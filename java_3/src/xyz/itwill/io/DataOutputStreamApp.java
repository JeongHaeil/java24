package xyz.itwill.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamApp {
	public static void main(String[] args) throws IOException {
		//DataOutputStream 클래스 : 원파는 자료형의 값을 전달할 수 있는 입력스트림 생성
		// =>DataOutputStream 생성자로 DataOutputStream 객체 생성
		// => 매개변수로 출력스트림을 전달받아 원하는 자료형의 값을 전달할
		//수 있는 출력스트림으로 확장하기 위해 사용
		DataOutputStream out=new DataOutputStream(new FileOutputStream("c:/data/data.txt"));
		
		//DataOutputStream.WriteInt : 확장된 출력스트림으로 정수값을 전달하기 위한 메소드
		out.writeInt(100);
		
		//DataOutputStream.writeBoolean : 확정된 출력 스트림으로 논리값을 전달하기위한메소드
		out.writeBoolean(true);
		
		//DataOutputStream.writeUTF : 확정된 출력스트림으로 문자열 전달하기 위한 메소드
		out.writeUTF("홍길동");
		
		out.close();
		
		System.out.println("c:/data/data.txt 파일을 확인해보세여");
	}
}
