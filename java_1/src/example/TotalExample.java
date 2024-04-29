package example;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSliderUI;

//키보드로 정수값을 계속 입력받아 합계를 계산하여 출력하는 프로그램을 작성하세요.
//단, 입력된 정수값이 0인 경우 입력을 종료하고 합계 출력
//ex) 정수값 입력[0:종료] >> 10
//    정수값 입력[0:종료] >> 20
//    정수값 입력[0:종료] >> 30
//    정수값 입력[0:종료] >> 0
//    [결과]합계 = 60
public class TotalExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			int total=0;
			//정수값을 입력받아 누적하기 위한 반복문
			//0이 입력되면 반복문 종료이기때문에 무한루프 와일문사요용
			while(true) {
				System.out.println("정수값 입력 >> ");
				int number=scanner.nextInt();
				if(number == 0) break;
				total+=number;
			}
			System.out.println("합계 = " +total);
				scanner.close();
		
		
	}
}
