package oop;

public class SingletonApp {
	public static void main(String[] args) {
		
		/*
		//new 연산자로 생성자를 호출하여 객체를 생성해 참조변수 저장
		//=>다수의 객체를 생성하여 참조변수에 저장해 사용
		//=> 생성자가 은닉화 처리되어 있으면 new 연산자로 생성자를 호출하면 에러발생
		 *
		Singleton singleton1=new Singleton();
		Singleton singleton2=new Singleton();
		
		System.out.println("singleton1 = "+singleton1);
		System.out.println("singleton2 = "+singleton2);
		
		singleton1.display();
		singleton2.display();
		*/
		
		//싱글톤 클래스는 객체를 반환하는 정적 메소드를 호출하여객체 반환받아 참조변수 저장
		//=>클래스에 미리 생성되어 정적 필드에 저장된 객체를 반환받아 참조변수에 저장
		
		Singleton singleton1=Singleton.getInstance();
		Singleton singleton2=Singleton.getInstance();
		
		System.out.println("singleton1 = "+singleton1);
		System.out.println("singleton2 = "+singleton2);
		
		singleton1.display();
		singleton2.display();
		System.out.println("=====================================================");
		//싱글톤 클래스는 참조변수에 객체를 저장하여 메소드를 호출하지 않고 메소드를 호출하여
		//객체를 반환받아 직접 메소드 호출
		Singleton.getInstance().display();
		System.out.println("=====================================================");
		
		
		
		
		
	}
}
