package example;

import java.util.Scanner;

//컴퓨터로부터 제공받은 정수 난수값을 키보드로 입력하여 맞추는 프로그램을 작성하세요.
// => 1~100 범위의 정수 난수값을 제공받도록 작성
// => 난수값을 맞출 수 있는 기회는 10번만 제공되도록 작성
// => 키보드 입력값이 1~100 범위가 아닌 경우 메세지 출력 후 재입력
// => 난수값과 입력값이 같은 경우 입력 횟수 출력 후 프로그램 종료
// => 난수값과 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
// => 난수값을 10번 안에 맞추지 못한 경우 난수값이 출력되도록 작성
// for if while
public class UpAndDownExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1~100 범위 정수 난수 값 제공받아 변수 저장
		int dap = (int) (Math.random() * 100) + 1;
		// 정답 상태를 저장하기위한 변수
		// false : 정답을 맞추지 못한 상태, true : 정답을 맞춘 상태
		boolean result = false;

		for (int i = 1; i <= 10; i++) {
			int input; // 키보드 입력값을 저장하기위한변수

			// 키보드 입력값 검증 위한 반복문 - 정상적인 값 입력된 경우 반복문 종료
			while (true) {
				System.out.println(i + "번 정수값 입력 >> ");
				input = scanner.nextInt();
				if (input >= 1 && input <= 100)
					break;
				System.out.println("에러 1~100범위 정수값 입력가능합니다.");
			}

			// 난수값 키보드 입력값 비교하여 처리 결과 출력
			if (dap == input) {
				System.out.println("축하합니다" + i + "번째 맞췄습니다");
				result = true;
				break; // (난수값을 맞추기 위한 반복문 종료)
			} else if (dap < input) {
				System.out.println("결과" + input + "보다 큰값 입력");
			} else {
				System.out.println("결과" + input + "보다 작은값 입력");
			}

		}
		if (!result) {
			System.out.println("정답을 맞추지못했습니다. 정답은 = " + dap);
		}

	}
}