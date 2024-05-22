package xyz.itwill.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.xml.transform.stax.StAXSource;

public class MemberLoadApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//파일에 저장된 내용을 원시데이터를 전달받을 수 입력스트림을 생성해 객체를 전달받을
		//수있는 입력스트림으로 확장
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/data/member.txt"));
		System.out.println("회원 목록");
		
		while(true) {
			try {
				//objectInputStream.readObject() 메소드를 호출하여 파일에 저장된 Member 객체를
				//차례대로 제공받아 저장
				//=> readObject() 메소드를 호출시 제공받을 객체가 없는 경우 EOFException 발생
		Member member=(Member)in.readObject();
		System.out.println(member); //Member 클래스의 toString 메소드 호출
			}catch(EOFException e){
				break;
			}
		}
		
		in.close();
	}
}