package xyz.itwill.app;

import java.util.Date;
import java.util.Scanner;

//키보드로 이름과 태어난 년도 입력받아 이름과 나이를 계산하여 출력
//ex) 이름 입력 >> 홍길동
// 		태어난 년도 입력 >> 2000
// 		결과
public class CalcAgeApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		String name=scanner.nextLine();
		
		System.out.print("태어난 년도 >> ");
		int age= 2024-scanner.nextInt();
		
		//Date 클래스로 객체를 생성하여 참조변수에 저장
		// =>java.util.Date 클래스 : 날짜와 시간을 저장하기 위한 클래스
		// => Data 클래스의 기본 생성자를 이용하여 객체를 생성할 경우 프로그램을 실랭한 플랫폼
		//플랫폼( OS - 운영체제)을 현재 날짜와 시간 저장된 Data 객체생성
		Date now=new Date();
		
		//now.getYea() : Data 객체에 저장된 날짜와 시간에서 년도를 얻어와 반환하는 메소드
		// => Data 객체에 저장된 년도는 1900년을 기준으로 1년에 1씩 증가하는 정수값 저장되어 있으므로 반드시 1900을 더해야 원하는 년도를 제공받아 사용가능
		//=> @Deprecated 적용된 메소드
		//=> @Deprecated : 메소드 사용을 권장하지 않도록 설정하는 어노테이션
		// = > @Deprecated 어노테이션이 적용된 메소드를 호출한 경우 경고 발생
		
		// @SuppressWarnings : 경고를 제거하는 기능을 제공하는 어노테이션
		//=> 어노테이션 속성을 사용하여 원하는 경고를 제거
		//형식) @SuppressWarnings(속성명 = 속성값, 속성명 = 속성값,)
		//=> value 속성에 경고 관련 속성값을 사용하여 경고 제거
		//=> value 속성외에 다른 속성이 없는 경우 속성값만 설정 가능
		// @SuppressWarnings 은 명령 위에 작성 가능하지만 클래스 또는 메소드 위에 작성 가능
		@SuppressWarnings("deprecation")
		// Ctrl 기능을 누른 상태에서 식별자를 클릭한 경우 해당 식별자가 선언된 위치로 이동
		int currentYear=now.getYear()+1900;
		
		//System.out.print("올해 년도 >> ");
		//int year=scanner.nextInt();
		
		System.out.println(name+"입니다. 나이는"+age+"입니다");
		
		scanner.close();
	}
}
