package xyz.itwill.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//EXIT 버튼 누른경우 프로그램 종료 
// => 이벤트 처리 클래스를 UI 클래스의 내부클래스로 작성하면 이벤트 처리 클래스의 메소드에서
//UI 클래스의 컴퍼넌트(컨테이너)를 사용할수있다
public class EventInnerHandleApp extends Frame {
	private static final long serialVersionUID = 1L;

	public EventInnerHandleApp(String title) {
		super(title);
		setLayout(new FlowLayout());
		Button exit = new Button("EXIT");
		exit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		add(exit);

		// 외부클래스의 메소드에소ㅓ는 내부클래스 생성자로 객체를 생성하여 내부클래스 필드
		// 또는 메소드를 접근제한자에 상관없이 접근하여 사용
		exit.addActionListener(new ButtonEventHandel());

		setBounds(800, 200, 300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new EventHandleApp("이벤트처리");
	}

}

public class EventInnerApp implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}