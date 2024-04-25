package example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ForExample {
	public static void main(String[] args) {
		// 본인 이름을 화면에 7번 출력하세요.
		// ex) 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동
		for (int i = 1; i <= 7; i++) {
			System.out.print("정해일\t");
		}
		System.out.println();

		System.out.println("=========================================");
		// 1~10 범위의 정수 중 홀수를 화면에 출력하세요.
		// ex) 1 3 5 7 9
		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 1) {

				System.out.println("홀수값 = " + i);
			}

		}

		System.out.println("=========================================");
		// 1~100 범위의 정수에서 3의 배수들의 합계와 5의 배수들의 합계를 계산하여
		// 3의 배수의 합계에서 5의 배수의 합계를 뺀 결과값을 출력하세요.
		// ex) 결과 = 633
		int tot = 0, sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				tot += i;
				System.out.println(i);
			}
		}
		for (int j = 1; j <= 100; j++) {
			if (j % 5 == 0) {
				sum += j;
				System.out.println(j);
			}
		}
		System.out.println("값 = " + (tot - sum));

		System.out.println("=========================================");
		// 구구단 중 7단을 화면에 출력하세요.
		// ex) 7 * 1 = 7
		// 7 * 2 = 14
		// ...
		// 7 * 8 = 56
		// 7 * 9 = 63

		for (int i = 1; i <= 7; i++)

			System.out.println("=========================================");
		// 5!의 결과값을 출력하세요.(5! = 5 * 4 * 3 * 2 * 1)
		// ex) 5! = 120
		int su = 1;
		for (int i = 5; i >= 1; i--) {
			su *= i;
			System.out.println(su);
		}

		System.out.println("=========================================");
		// 두 변수에 저장된 범위의 정수값을 화면에 출력하세요.
		// 단, 한 줄에 정수값이 7개씩 출력되도록 프로그램을 작성하세요.
		// ex) 36 37 38 39 40 41 42
		// 43 44 45 46 47 48 49
		// 50 51 52 53 54 55 56
		// 57
		//변수 하나 선언해서 값이 0부터 시작해서 하나씩 증가하는데 7되면은 엔터 줄바꿈
		int begin = 36, end = 57, cnt=0;
		for (; begin <= end; begin++) {
			if(begin < 7) {
			}
			System.out.print(begin);
		}
	
	}
}