package basic;

import java.util.Scanner;

//가위바위보 게임
// => 컴퓨터(난수값)과 사용자(키보드입력값) 가위바위보
//=> 사용자가 이기거나 비길 경우 대결 반복실행   질 경우 종료
//=> 대결 종료 후 사용자 승리 횟수 출력
public class RpaGameApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 사용자 승리 횟수 저장 변수
		int count = 0;

		// 가위바위보 대결위한 반복문
		while (true) {
			// 컴퓨터에게 가위 바위 보 중 하나 제공받아 저장
			// ==> 약속 1 : 가위 , 2 : 바위 3 : 보
			// => 1~3 범위의 정수값을 난수값으로 제공받아 변수 저장
			int computer = (int) (Math.random() * 3) + 1;

			// 사용자로부터 키보드 가위바위보 중 하나를 제공받아 변수에 저장
			// => 키보드 입력 값 1~3 범위의 정수값이 아닌 경우 에러 메시지 출력 하고 재입력

			int user;
			// 키보드 입력값 검증을 위한 반복문
			while (true) {
				System.out.print("가위바위보[1 : 가위, 2 : 바위, 3 : 보 >> ");
				user = scanner.nextInt();
				if (user >= 1 && user <= 3)
					break;
				System.out.println("[에러] 가위 바위 보 중에 선택해서 입력해주세요");

			}
			// 컴퓨터와 사용자의 가위바위보 출력
			System.out.print("컴퓨터 = ");
			switch (computer) {
			case 1:
				System.out.print("가위");
				break;
			case 2:
				System.out.print("바위");
				break;
			case 3:
				System.out.print("보");
				break;
			}
			System.out.print("사용자 = ");
			switch (user) {
			case 1:
				System.out.print("가위");
				break;
			case 2:
				System.out.print("바위");
				break;
			case 3:
				System.out.print("보");
				break;
			}
			System.out.println();

			// 컴퓨터와 사용자의 가위바위보 승패 비교하여 결과 출력
			if (computer == user) {
				System.out.println("[결과] 비겼습니다.");
			} else if (computer == 1 && user == 2 || computer == 2 && user == 3 || computer == 3 && user == 1) {
				System.out.println("[사용자]가 컴퓨터를 이겼습니다");
				count++;
			} else {
				System.out.println("[결과] 사용자가 컴퓨터에게 졌습니다.");
				break; // 반복문 종료 = 대결종료
			}
		}
		System.out.println("================================================");
		if (count == 0) {
			System.out.println("[메세지] 사용자가 컴퓨터에게 한번도 이기지 못했습니다");
		} else {
			System.out.println("[메세지] 노력하세요.");
		}
		System.out.println("[메세지]사용자가 컴퓨터에게 연속적으로 " + count + "번 이겼습니다");
		scanner.close();
	}
}
