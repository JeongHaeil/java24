package xyz.itwill.awt;

import java.awt.Frame;

//JDK >> Desktop Application
//1.CUI(Character User Interface) 프로그램 : 문자 중심의 사용자 환경에서 실행되는 프로그램

//2. GUI(Graphic User Interface) 프로그램 : 그래픽 중심의 사용자 환경에서 실행되는 프로그램
// 	=> 컴퍼넌트를 사용하여 작성한 프로그램

//java.awt 패키지 : GUI 프로그램을 작성하기 위한 Java 자료형 선언된 패키지
// => 플랫폼에(운용체제 - OS) 종속된 컴퍼넌트 사용 (운영체제 종속)

//javax.swing 패키지 : GUI 프로그램을 작성하기 위한 Java 자료형 선언된 패키지 -AWT 확장
// => javax.awt 패키지의 확장 패키지 
// => 플랫폼(운영체제 -OS)에 종속되지 않은 독립적인 Java 클래스로 컴퍼넌트 생성하여 사용

//컴퍼넌트(Component) : GUI 프로그램에서 사용자 환경(UI - User Interface)를 구현하기 위한 클래스로 생성된 객체
// => Button, List, Label, Canvas, Checkbox, Choice, Scrollbar, TextField, TextArea 등

//컨테이너(Container) : 컴퍼넌트를 배치할 수 있는 컴퍼넌트
// => 독립적 컨테이너 : Frame, Window, Dialog 등 - 독립적으로 출력하여 사용
// => 종속적 컨테이너 : Panel, ScrollPane 등 - 다른 컨테이너에 배치하여 사용

public class FrameOneApp {
	public static void main(String[] args) {
		//Frame 클래스 : 메뉴가 존재하는 컨테이너를 성생하기 위한 클래스
		// => new 연산자로 Frame 클래스의 기본 생성자를 호출하여 객체 생성 - 숨김상ㅌ
		// => Frame 클래스로 객체를 생성하면 프레임이 보여지지 않은 상태로 생성
		//Frame frame=new Frame();
		
		//new 연산자로 Frame 클래스의 기본 생성자를 호출하여 객체 생성
		// => 매개변수로 전달받은 문자열을 프레임의 제목으로 설정
		Frame frame=new Frame("프레임 연습");
		
		//Frame.setTitle : 프레임의 제목을 변경하는 메소드
		//frame.setTitle("프레임 연습");
		
		//Component.setSize(int width, int height) : 컴퍼넌트의 크기를 변경하는 메소드
		// => GUI 프로그램에서는 크기 또는 위치를 픽셀 단위로 표현
		//픽셀(Pixel) : 하나의 색으로 표현되는 점(Dot) 
		frame.setSize(500,400);
		
		//Component.setLocation(int x , int y) : 컴퍼넌트의 출력위치를 변경하는 메소드
		frame.setLocation(600, 100);
		
		//Component.setVisible(boolean b) : 컴퍼넌트를 보여지지 않도록 처리하거나 보여지도록
		//처리하는 메소드 - false : 보여지지 않도록 처리 , true - 보여지도록 처리
		frame.setVisible(true);
		
		
	}
	
}
