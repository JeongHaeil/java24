package xyz.itwill.util;

import java.util.Random;
import java.util.UUID;

//새로운 비밀번호 생성하여 제공하는 프로그램
public class NewPasswordApp {
	//새로운 비밀번호를 생성하여 반환하는 메소드
	public static String getPasswordOne() {
		Random random=new Random();
		
		//비밀번호 생성에 필요한 문자들이 저장된 문자열 생성
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		
		StringBuffer password=new StringBuffer();
		for(int i=1;i<=8;i++) {
			
			//문자열의 갯수를 반환받아 해당 범위까지 정수 난수값 제공받은 후 해당 난수값
			//위치의 문자를 문자열에 추가하여 저장
			password.append(str.charAt(random.nextInt(str.length())));
		}
		
		return password.toString();
	}
	
	//새로운 비밀번호를 생성하여 반환 메소드 -UUID 클래스 사용
	public static String getPasswordTwo() {
		
		//UUID 클래스 : 범용적으로 사용되는 식별자가 저장된 객체를 생서하기 위한 클래스
		//UUID.randomUUID() : 자동으로 생성된 식별자가 저장된 UUID 객체를 반환하는 메소드
		//=> 자동으로 생성된 식별자는 숫자와 영문자(소문자). 4개의 [-] 기호를 조합하여 36개의 문자로 구성된 문자열
		//UUID.toString() : UUID 객체에 저장된 식별자를 문자열로 반환하는 메소드
		return UUID.randomUUID().toString().replace("-", "").substring(0,10).toUpperCase();
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("새로운 비밀번호 =  "+getPasswordOne());
		System.out.println("새로운 비밀번호2 =  "+getPasswordTwo());
	}
}
