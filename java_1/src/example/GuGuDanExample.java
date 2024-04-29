package example;

import java.util.Scanner;

//키보드로 정수값을 입력받아 1~9 범위의 정수값을 곱한 결과를 출력하는 프로그램을 작성하세요.
//단,키보드로 입력된 정수값은 2~9 범위의 정수값만 허용하며 범위를 벗어난 정수값을 입력한 경우
//에러 메세지 출력 후 재입력하도록 프로그램 작성
//ex) 단 입력[2~9] >> 7
//    7 * 1 = 7
//    ...
//    7 * 9 = 63
public class GuGuDanExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
				
			int dan;
			//키보드 입력값 검증하기 위한 반복문
			// => 정상적인 값이 입력된경우 break 명령 사용해 종료
			while(true) {
				System.out.println("단 입력 >> ");
				dan=scanner.nextInt();
				if(dan >= 2 && dan <=9 ) break;
				System.out.println("2~9범위 정수값만입력가능 다시입력하세요.");
			}
			for(int i=1;i<=9;i++) {
				System.out.println(dan+"*"+i+" = " +(dan*i));
			}
				
	}
}