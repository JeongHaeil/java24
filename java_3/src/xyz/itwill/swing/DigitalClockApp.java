package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//플랫폼의 현재 날짜와 시간을 출력하는 프로그램
public class DigitalClockApp extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel clockLalbe;
	private JButton startButton, stopButton;

	// 스레드의 명령의 실행여부 상태를 저장하기 위한 필드
	// => false : 스레드로 명령 미실행, true : 스레드로 명령 실행
	private boolean isRun;

	public DigitalClockApp(String title) {
		super(title);
		
		isRun=true;
		
		
		/*
		Date date=new Date();		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String prinDate=dateFormat.format(date);
		*/
		
		//새롭게 생성된 스레드를 사용하여 JLabel 컴퍼넌트의 문자열
		clockLalbe=new JLabel("",JLabel.CENTER);
		clockLalbe.setFont(new Font("굴림체",Font.BOLD, 30));
		
		startButton=new JButton("다시 실행");
		stopButton=new JButton("일시 중지");
		startButton.setFont(new Font("굴림체",Font.BOLD, 20));
		stopButton.setFont(new Font("굴림체",Font.BOLD, 20));
		
		startButton.setEnabled(false); // 컴퍼넌트 비활성화 처리
		
		JPanel panel1=new JPanel();
		
		panel1.add(startButton);
		panel1.add(stopButton);
		
		
		//Thread 객체로 새로운 스레드를 생성하여 run() 메소드의 명령을 실행
		// new clockThread().start();
		
		getContentPane().add(clockLalbe,BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700,200,600,200);
		setVisible(true);
		
		//익명클래스로 Runnable 객체 생성해 Thread 클래스의 생성자  매개변수에 전달
		//Thread 객체를 생성한 후 start() 메소드를 호출해 새로운 스레드 생성
		// => 익명클래스로 Runnable 객체를 생성하지 않고 람다 표현식으로 생성 가능
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
				while(true) {
					
					//isRun 필드값이 [true]인 경우에만 플랫폼 현재 날짜와 시간을 제공받아
					//JLabel 컴퍼넌트의 문자열 변경
					if(isRun) {}	
					String printDate=dateFormat.format(new Date());
					//JLabel.setText : JLabel 컴퍼넌트의 라벨을 변경하는 메소드
					clockLalbe.setText(printDate);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
					
				}	
			
			}
		}).start();

		getContentPane().add(panel1, BorderLayout.SOUTH);

		
	}

	public static void main(String[] args) {
		new DigitalClockApp("디지털 시계");
	}

	/*
	 * public class clockThread extends Thread{
	 * 
	 * @Override public void run() { SimpleDateFormat dateFormat=new
	 * SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초"); while(true) { Date date=new
	 * Date(); String printDate=dateFormat.format(date); //JLabel.setText : JLabel
	 * 컴퍼넌트의 라벨을 변경하는 메소드 clockLalbe.setText(printDate);
	 * 
	 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * } }
	 */
	//JButton 컴퍼넌트를 누른 경우에 대한 이벤트 처리 기능을 제공 클래스
	// => JButton 컴퍼넌트 구분하여 isRun 필드값 변경
	public class ClockButtonEventHandle implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventSoure=e.getSource();

			
			if(eventSoure == startButton) {
				startButton.setEnabled(false);
				stopButton.setEnabled(true);
				isRun=true;
			}else if(eventSoure == stopButton)
				isRun=false;
		}
		
	}
	
}
