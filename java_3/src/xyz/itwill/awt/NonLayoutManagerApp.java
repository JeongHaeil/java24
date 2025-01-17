package xyz.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

//배치관리자 (LayoutManager) : 컨테이너에 컴퍼넌트를 자동으로 배치하기 위한 기능을 제공하는 객체
// => BorderLyout, FlowLayout, GridLayout, CardLayout, GridBagLayout 등

//컨테이너에는 컴퍼넌트를 자동 배치하기 위한 배치관리자가 기본적으로 설정되어 제공
// => Frame, Window, Dialog 등 - BorderLayout
// => Panel, Applet 등 - FlowLayout

//배치관리자를 사용하지 않고 프레임에 컴퍼넌트를 배치하여 사용하는 프로그램 작성
public class NonLayoutManagerApp extends Frame {
	private static final long serialVersionUID = 1L;

	public NonLayoutManagerApp(String title) {
		super(title);
		
		//Container.setLayout : 매개변수로 전달받은 LayoutManager 객체로
		//컨테이너의 배치관리자를 변경하는 메소드
		// => 매개변수에 [null]를 전달한 경우 배치관리자를 상용하지 않도록 설정
		setLayout(null);
		
		Button button1=new Button("Button-1");
		Button button2=new Button("Button-2");
		
		//배치관리자가 없는 컨테이너에 컴퍼넌트를 배치하기 위해서는 반드시 컴퍼넌트의 배치
		//위치와 크기를 변경한 후 컴퍼넌트를 컨테이너에 배치 처리
		
		button1.setBounds(10, 30, 150, 80);
		button2.setBounds(200, 150, 150, 80);
		
		add(button1);
		add(button2);

		
		setBounds(600, 100, 400, 500);
		setVisible(true);
	
		
		
	}
	public static void main(String[] args) {
		new NonLayoutManagerApp("배치관리자 미사용 프레임");
	}
}
