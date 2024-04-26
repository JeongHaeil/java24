package basic;

//컴퓨터로부터 난수값을 제공받아 출력하는 프로그램
//=> 난수값 : 불규칙적인 값



public class MathRamdomApp {
	public static void main(String[] args) {
		//Math 클래스 :수학 관련 기능(메소드) 작성된 클래스
		//Math.random() : 0.0 보다 크거나 같고 1.0(1.0 포함x) 보다 작은 실수 난수값 생성하여 반환
		//=> 0.0<= 난수값 <1.0
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번째 실수 난수값 = "+Math.random());
		}
		System.out.println("====================================================");
		
		for(int i=1;i <= 5;i++) {
			// (int)(Math.random()*100) : 정수 난수값(0~99) 을 생성하여 변환
			System.out.println(i+"번째 정수 난수값"+(int)(Math.random()*100));
		}
		System.out.println("====================================================");
		
		for(int i=1;i <= 5;i++) {			
			// 1~45 범위의 정수 난수값을 생성하여 반환
			System.out.println(i+"번째 정수 난수값"+((int)(Math.random()*45)+1)); //1~45
		}
		
		System.out.println("====================================================");
		
		
		
		
		
		
		
		
		
		
	}
}
