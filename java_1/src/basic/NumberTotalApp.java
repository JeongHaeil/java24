package basic;

import java.util.Scanner;

//키보드로 정수값 5개를 입력받아 합계를 계산 출력

public class NumberTotalApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int total=0;
		for(int i=1;i<=5;i++) {
			System.out.print("정수값 입력 >> ");
			int number=scanner.nextInt();
			total+=number;
		}
		System.out.println("합계 = "+total);
		scanner.close();
	}
}
