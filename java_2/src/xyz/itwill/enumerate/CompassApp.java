package xyz.itwill.enumerate;

public class CompassApp {
	public static void main(String[] args) {
		//열거형의 상수필드 출력 - 상수필드 이름 출력
		System.out.println("동쪽 = "+Compass.EAST);
		System.out.println("서쪽 = "+Compass.WEST);
		System.out.println("남쪽 = "+Compass.SOUTH);
		System.out.println("북쪽 = "+Compass.NORTH);
		System.out.println("==============================================");
		//Eunmerate.valuse() : 열거형에 작성된 모든 상수필드를 배열로 변환하여 반환하는 메소드
		for(Compass compass : Compass.values()) {
			//Eunmerate.oredinal() : 상수필드를 구분하기 위한 첨자를 반환하는 메소드
			System.out.println(compass+" : "+compass.ordinal()+"="+compass.getValue());
		}
		System.out.println("==============================================");
		
		

	}
}
