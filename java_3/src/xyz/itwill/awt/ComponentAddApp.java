package xyz.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;


//프레임에 버튼을 배치하여 출력하는 프로그램 작성


public class ComponentAddApp extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ComponentAddApp(String title) {
		super(title);
		
		
		//Button 클래스 : 버튼 컴퍼넌트를 구현하기 위한 클래스
		//new 연산자로 Button 클래스의 Button 생성자를 호출하여
		// => 매개변수로 전달받은 무자열을 라벨로 사용하는 생성

		Button button=new Button("Button");
		Button button1=new Button("Button");
		
		
		//Container.add : 매개변수로 전달받은 컴퍼넌트를 컨테이너에 배치하는 메소드
		// =>컨테이너에 설정된 배치관리자에 의해 컴퍼넌트의 출력위치와 크기가 자동으로 변경어 배치처리
		add(button);
		add(button1);
		
		setBounds(600, 100, 300, 300);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new ComponentAddApp("컴퍼넌트 배치");
	}
}
