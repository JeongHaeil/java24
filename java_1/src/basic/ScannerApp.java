package basic;
// import 다름 패키지의 클래스를 소스파일로 사용할수 있도록 제공 키워드
import java.util.Scanner;   //**scanner 컨트롤 스페이스바  나옴

//System.out : 값을 화면(콘솔)에 출력하기 위한 객체 - 출력스트림
//System.in : 키보드로부터 입력된 값을 얻어와 제공하기 위한 객체 - 입력스트림
//사용자로부터 키보드로 이름과 나이를 입력받아 화면에 출력하는 프로그램

public class ScannerApp {
	public static void main(String[] args) {
		//Scanner 클래스 : 입력스트림(키보드,파일 등) 을 이용하여 원하는 자료형의 값을 제공받을수있는 기능
		//기능은 [메소드] 제공하는 클래스
		// => Scanner 클래스로 객체를 생성해야지만 객체로 클래스의 메소드 호출 가능 
		// =** 객체 생성 명령어 : new Scanner(System.in); : 키보드 입력스트림을 사용하여 Scanner 생성
		// =** 생성된 객체를 참조 변수 저장 Scanner(컨트롤 스페이스) scanner(변수)=new .....
		// => 참조 변수에 저장된 객체를 사용하여 메소드 호출
		Scanner scanner=new Scanner(System.in);
		
		//=> 참조 변수에 저장된 객체를 사용하여 메소드 호출
		//문자저장 Scanner.nextLine() : Scanner 객체의 입력스트림 사용해 입력값을 문자열로 변환하여 
		//==> 반환하는 메소드 
		
		// 키보드로 입력된(콘솔) 값을 문자열로 변환하여 변수에 저장
		// => 키보드 입력값이 없는 경우 프로그램 흐름(스레드)이 일시 중지
		// => 키보드로 값을 입력한후 엔터 눌러 흐름이 재실행 되도록 처리
		System.out.print("이름 입력 >> ");
		
		String name=scanner.nextLine();
		
		
		System.out.println("나이 입력 >> ");
		int age=scanner.nextInt();
		
		// 정수저장 int age=scanner.nextInt(); : 키보드로 입력된 값을 정수값으로 변환하여 반환받아 변수저장
		//=> 입력값이 정수값이 아닌 경우 예외 발생 - 프로그램 강제 종료
		
		System.out.println(name+"나이는"+age+"살 입니다.");
		
		
		//scanner.close(); : Scanner 객체가 사용한 입력스트림을 제거하는 메소드
		scanner.close();
		
	}
}
