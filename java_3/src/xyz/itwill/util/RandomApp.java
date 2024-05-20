package xyz.itwill.util;

import java.util.Random;

//java.util 패키지 : 프로그램 작성에 유용한 기능을 제공하는 Java 자료형이 작성된 패키지

//Scanner 클래스 : 입력장치로부터 값을 입력받기 위한 기능을 제공하는 객체를 생성하는 클래스
//Arrays 클래스 : 배열 요소값을 처리하기 위한 기능

//Random 클래스 : 난수값 관련 기능을 제공하는 객체를 생성하기 위한 클래스
public class RandomApp {
	public static void main(String[] args) {
		//시관과 무관한 난수값을 발생할 수 있는 Random 객체 생성
		Random random=new Random();
		
		for(int i=1;i<=5;i++) {
			//Random.nextint(int bound)  : Random 객체를 사용해 0부터 bound-1 범위 정수 난수값 반환
			System.out.println(i+"번째 난수값 = "+random.nextInt(100)); // 0~99
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
