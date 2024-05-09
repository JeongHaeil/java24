package xyz.itwill.thread;

public class SingleThread {
	public void display() {
		System.out.println("SingleThread 클래스 main() 메소드 시작 ");
		

		for(char i='A';i<='Z';i++) {
			System.out.print(i);
		}
		System.out.println();
		
		
		System.out.println("SingleThread 클래스 main() 메소드 종료 ");
		
	}
}
