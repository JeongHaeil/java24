package xyz.itwill.io;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

//문서파일 편집기 프로그램
public class NotepadApp extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	private JMenuItem init, open, save, exit;
	
	//현재 작업중인 문서파일의 경로가 저장된 File 객체를 저장하기 위한 필드
	private File file;
	
	//JFileChooser 클래스 : 파일을 선택하기 위한 파일 다이얼로그를 생성하기 위한 컨테이너 클래스
	private JFileChooser fileChooser;
	
	
	
	public NotepadApp(String title) {
		super(title);
		
		JMenuBar memuBar=new JMenuBar();
		
		//Mnemonic : [Alt] 기능키와 같이 사용해 메뉴 또는 메뉴 아이템을 키보드로 선택하기 위한
		JMenu fileMenu=new JMenu("파일(F)");
		fileMenu.setMnemonic('F'); // 메뉴를 선택할 수 있는 문자값을 변경
		
		init=new JMenuItem("새로만들기(N)",'N');
		open=new JMenuItem("열기(O)",'O');
		save=new JMenuItem("저장(S)",'S');
		exit=new JMenuItem("끝내기(X)",'X');
		
		//메뉴 아이템에 단축키 등록
		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.ALT_DOWN_MASK+InputEvent.SHIFT_DOWN_MASK));
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_DOWN_MASK+InputEvent.SHIFT_DOWN_MASK));
		
		
		
		
		fileMenu.add(init);
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		
		memuBar.add(fileMenu);
		setJMenuBar(memuBar);
		
		
		textArea=new JTextArea();
		textArea.setFont(new Font("굴림체", Font.PLAIN,20));
		JScrollPane scrollPane=new JScrollPane(textArea);
		
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		fileChooser=new JFileChooser();
		//JFileChooser.setCurrentDirectory : 파일 다이얼로그의 기본 작업 디렉토리를 변경하는 메소드
		fileChooser.setCurrentDirectory(new File("c:/"));
		
		//JFileChooser.addChoosableFileFilter : 파일 다이얼로그 선택
		//가능한 파일 필터 기능을 추가하는 메소드
		// => 파일 이름으로 피터 기능을 제공받기 위해 FileNameExtensionFilter 객체를 생성
		fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("텍스트 파일(*.txt", "txt"));
		
		
		//메뉴 아이템 선택한 경우 ActionEvent 발생 -  ActionListener 이벤트 처리
		init.addActionListener(new ActionHandle());
		open.addActionListener(new ActionHandle());
		save.addActionListener(new ActionHandle());
		exit.addActionListener(new ActionHandle());
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(450, 150, 1000, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NotepadApp("제목 없음 -Java 메모장");
	}
	
	public class ActionHandle implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventSource=e.getSource();
			
			if(eventSource == init) {
				textArea.setText("");
				setTitle("제목 없음 -Java 메모장");
				file=null; // 작업중인 파일이 없으므로 file 필드에 null 저장
			}else if(eventSource == open) {
				//JFileChooser.showOpenDialog : 열기 관련 파일 다이얼로그
				//화면에 출력하는 메소드 -[열기] 또는 [취소] 버튼선택에 따라 정수값 반환
				int option=fileChooser.showOpenDialog(NotepadApp.this);
				int cl=fileChooser.showSaveDialog(NotepadApp.this);
				
				if(option == JFileChooser.APPROVE_OPTION) {//파일선택후 [열기] 버튼 누른 경우
					//JFileChooser.getSelectedFile : 선택한 파일의 경로가 저장된 File 객체를 반환
					// => 파일 다이얼로그 [파일이름]에 입력된 문자열을 제공받아 File 객체 생성
					file=fileChooser.getSelectedFile();
					
					//프레임 제목변경
					setTitle(file.toString()+" - Java 메모장");
					
					try {
						BufferedReader in=new BufferedReader(new FileReader(file.getAbsoluteFile()));
						
						textArea.setText(""); //컴퍼넌트 초기화
						while(true) {
							//확장된 파일 입력스트림으로 파일에 저장된 문자값(문자열)들을 한줄씩 제공받아 저장
							String text=in.readLine();
							
							//파일을 제공받은 문자열이 없는 경우 반복문 종료
							if(text==null)break;
							
							//JTextArea 컴퍼넌트에 문자열을 추가하여 출력 처리
							textArea.append(text+"\n");
						}
					}catch(FileNotFoundException exception) {
						JOptionPane.showMessageDialog(NotepadApp.this , "파일을 찾을 수 없습니다");
					}catch(IOException exception) {
						JOptionPane.showMessageDialog(NotepadApp.this , "프로그램에 문제가 발생 하였습니다");						
					}
					
					
				}else if (option == JFileChooser.CANCEL_OPTION) {
					return;
				}
			}else if(eventSource == save) {
				try {
					 BufferedWriter writer=new BufferedWriter(new FileWriter(file));
				}catch( NullPointerException  exception) {
						JOptionPane.showMessageDialog(null, "파일저장");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
			}else if(eventSource == exit) {
				System.exit(0);
			}
			
		}
		
	}
}
