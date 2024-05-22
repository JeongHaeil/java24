package xyz.itwill.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;



public class ObjectInputStreamApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//ObjectInputStream 클래스 : 객체를 전달 할수 있는 입력스트림을 생성
		// =>ObjectInputStream 생성자를 사용하여 ObjectInputStream 객체생성
		// =>매개변수로 입력스트림을 전달받아 원하는 자료형의 값을 전달받을
		//수 있는 입력스트림으로 확장

		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/data/object.txt"));

		//ObjectInputStream.readObject : 확장된 입력스트림으로 객체를 제공받아 반환하기 위한 메소드
		//=> 객체를 Objcet 타입의 객체를 반환하므로 반드시 명시적 객체형변환을 사용
		// => 반환된 객체의 자료형이 없는경우 ClassNotFoundException 발생
		String object1=(String)in.readObject();
		Date object2=(Date)in.readObject();
		@SuppressWarnings("unchecked")
		List<String> object3=(List<String>)in.readObject();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
		in.close();
		
	}
}
