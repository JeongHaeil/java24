package xyz.itwill.util;

import java.text.DecimalFormat;

//DecimalFormat 클래스 : Number 객체에 저장된 숫자값(정수값 또는 실수값)을 원하는 패턴의 문자열로
//String 객체로 변환하는 기능을 제공하는 객체를 생성하기 위한 클래스

public class DecimalFormatApp {
	public static void main(String[] args) {
		int moyey=100_000_000;
		System.out.println("금액 = "+moyey+"원");
		
		//new 연산자로 DecimalFormat 클래스의 매개변수가 작성된 생성자 호출 하여 객체생성
		// => DecimalFormat 생성자로 매개변수에 숫자값 관련 패턴정보를 전달받아
		//저장한 DecimalFormat 객체 생성
		// => 패턴문자 : #(숫자 - 공백), 0(숫자 - 0),  콤마(,), 소숫점(.), 달러($)
		DecimalFormat decimalFormat=new DecimalFormat("###,###,##0");
		
		//decimalFormat.format(Number number) : 매개변수로 전달받은 Number 객체에 저장된 숫자값을
		//decimalFormat 객체에 저장된 패턴정보의 문자열로 변환하여 반환하는 메소드
		System.out.println("금액 = "+decimalFormat.format(moyey)+"원");
		
		//DecimalFormat.getInstance() : 패턴정보가 저장된 DecimalFormat 객체를 반환하는 메소드
		//=> 3자리마다 , 기호를 사용하여 숫자값을 표현한 패턴정보가 저장된 DecimalFormat 객체
		
		System.out.println("금액 = "+DecimalFormat.getInstance().format(moyey)+"원");
		
		//DecimalFormat.getInstance() : 패턴정보가 저장된 DecimalFormat 객체를 반환하는 메소드
		//=> 맨 앞자리에 플렛폼에서 사용하는 화폐단위를 붙이고 3자리마다 , 기호를 
		// 사용하여 숫자값을 표현한 패턴정보가 저장된 DecimalFormat 객체
				
		System.out.println("금액 = "+DecimalFormat.getCurrencyInstance().format(moyey)+"원");
		
		
		
		
	}
}
