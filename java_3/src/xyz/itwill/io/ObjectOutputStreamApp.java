package xyz.itwill.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.List;

public class ObjectOutputStreamApp {
	public static void main(String[] args) throws IOException {
		//ObjectOutputStream 클래스 : 객체를 전달 할수 있는 출력스트림을 생성
		// =>ObjectOutputStream 생성자를 사용하여 ObjectOutputStream 객체생성
		// =>매개변수로 입력스트림을 전달받아 원하는 자료형의 값을 전달받을
		//수 있는 입력스트림으로 확장
		
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("c:/data/object.txt"));
				//ObjectOutputStream.writeObjct : 매개뱐수로 전달받은 객체를 확장된 출력 스트림
				//으로 전달하기 위한 메소드
				out.writeObject("홍길동");
				out.writeObject(new Date());
				out.writeObject(List.of("임꺽정","전우치","일지매"));
				
				out.close();
				System.out.println("c:/data/object.txt 파일을 확인해보세요");
	}
}
