package xyz.itwill.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//회원정보를 파일에 전달하여 저장하는 프로그램
public class MamberSaveApp {
	public static void main(String[] args) throws IOException {
		//파일에 원시데이타를 전달할 수 있는 출력스트림을 생성해 객체를 전달할 수 있는 출력
		//스트림으로 확장
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("c:/data/member.txt"));
		
		//확장된 출력스트림으로 회원정보 전달
		// => writeObject() : 메소드 호출시 NotSerializableException 발생
		// NotSerializableException : 객체 직렬화 처리되지 않은 클래스로 생성된 객체를 출력
		//스트림으로 전달할 경우 발생되는 예외
		// => 출력스트림으로 전달되는 객체를 생성하는 클래스를 객체 직렬화 클래스로 작성
		out.writeObject(new Member("abc123","홍길동","sda332@itwill.xyz"));
		out.writeObject(new Member("dfd433","임꺽정","xca221@itwill.xyz"));
		out.writeObject(new Member("bkrc123","전우치","ngd333@itwill.xyz"));
		
		
		
		out.close();
		
		System.out.println("c:\\data\\member.txt 파일에 회원정보를 저장하였습니다.");
	}
}
