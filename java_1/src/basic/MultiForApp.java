package basic;

public class MultiForApp {
	public static void main(String[] args) {
		int count = 0; // 이동방법의 갯수를 저장하기위한 변수

		for (int i = 1; i <= 3; i++) { // [가]나라 >> 3번 반복
			for (int j = 1; j <= 4; j++) { // [나]나라- 4번 반복
				count++;
			}
		}

		System.out.println("이동방법 = " + count);
		System.out.println("===============================================================");

		
		/*  
		  for(int j=1;j<=4;j++) { //행 을 처리하기 위한 반복문 for(int i=1;i<10;i++) { //열 을 처리하기
		  위한 반복문 System.out.print("★"); } System.out.println(); } System.out.println(
		 System.out.println("==============================================================="); //구구단
		 for(int i=1;i<=9;i++) 
		 { for(int j=2;j<=9;j++) 
		 { System.out.print(j+"*"+i+ "="+(j*i)+" \t"); //\t 탭기능 } System.out.println(); }
		 
		 */
		System.out.println("===============================================================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("☆");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j < 6) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}

			}
			System.out.println();
		}
		System.out.println("===============================================================");
		//246810
		for(int i=1;i<=5;i++) {  //행  i가 1일때 1은 5보다 작거나같으면 1은 증감한다
			for(int j=5;j>=1; j--) { //열 j는 5일때 j는 1보다 크거나 같을때 감소한다
				if (i + j < 6) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");
		
		
		
		
		
	}
}
