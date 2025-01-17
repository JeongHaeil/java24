package xyz.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;

//키보드로 이름과 태어난 년도를 입력받아 나이를 계산하여 이름과 나이를 출력하는 프로그램
public class ConsoleIOApp {
	public static void main(String[] args) throws IOException {
		
		//키보드 입력스트림(System.im)을 InputStreamReader 클래스로 문자데이터를 입력받을 수
		//있는 입력스트림으로 확장하고 BufferedReader 클래스를 사용해 대량의 문자데이터를
		//입력받을 수 있는 입력스트림으로 확장 - 스트림의 다단계 영역 (확장 후 한번더 확장)
		
	
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		
		/*
		//모니터 입력스트림(System.im)을 OutputStreamWriter 클래스로 문자데이터를 입력받을 수
				//있는 출력스트림으로 확장하고 BufferedReader 클래스를 사용해 대량의 문자데이터를
				//입력받을 수 있는 입력스트림으로 확장 - 스트림의 다단계 영역 (확장 후 한번더 확장)
		
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		out.write("이름 입력 >>");
		out.flush();
		*/
		
		//모니터 입력스트림(System.out - PrintStream ) : print() 또는 println() 메소드를
		//사용해 매개변수로 전달받은 모든 형태의 값을 문자열로 변환하여 출력스트림으로 전달해
		//출력 처리 - 다단계 연결을 이용한 출력스트림 확장 불필요
		System.out.print("이름입력 >> ");
		
		//BufferedReader.readLine () : 입력스트림의 문자값을 문자열로 얻어와 반환하는 메소드
		String name=in.readLine();
		
		System.out.print("태어난 년도 >> ");
		int birthYear=Integer.parseInt(in.readLine());
		
		
		int age=Calendar.getInstance().get(Calendar.YEAR)-birthYear;
		
		System.out.println("결과"+name+"님의 나이는"+age+"살 입니다.");
		
		
		
		
		
		
		
		
	}
}
