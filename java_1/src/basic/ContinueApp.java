package basic;

//continue : 반복문의 명령을 처음부터 다시 실행하기 위한 키워드
// => 반복문의 블록 내부에서 continue 명령이 실행되면 하단에 작성된
//     => 명령을 실행하지않고 처음부터 다시 실행
// =>사용법 for(조건식) continue 

public class ContinueApp {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i == 3) continue;
			System.out.println("i = "+i);
		}
		
		System.out.println("======================================================");
		loop:
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				//continue 라벨명 : 라벨명으로 지정된 반복문을 다시 실행
				if(j == 3)  continue loop; //컨티뉴 뒤에 루프를사용하면 브레이커랑 같은역할한다
				System.out.println("i = " +i+", j = "+j);
			}
		}
		
		
	}
}
