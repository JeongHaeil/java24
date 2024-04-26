package basic;

import java.util.Scanner;

//키보드로 점수를 입력받아 학점계산 출력
// => 100 ~ 9 A , 89~80 B, 79~70 C, 69~60 D, 59~0 F
// => 입력된 점수가 0~100 범위의 정수값이 아닌 경우 에러 메시지 출력후 재입력 처리
public class InputCheckApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//System.out.println("점수 입력 >> ");
		//int score=scanner.nextInt();
		
		//변수의 비정상적인 값을 저장해야만 실행
		int score=-1;
		//비정상적인 점수가 입력된 경우 반복 실행하고 정상적인 점수 입력된경우 종료		
		// score 0보다 작거나 또는 100보다 크거나
		do {
			System.out.println("점수 입력 >> ");
			score=scanner.nextInt();
			if(score < 0 || score > 100) {
				System.out.println("[에러] 점수는 0~100 숫자만 입력 가능합니다.");
			} 
		} while(score < 0 || score > 100);
			
		String grade="";
		switch (score/10) {
		case 10: 
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F"; break; 
		}
		
		System.out.println("결과" +score+ "점 = "+grade+"학점");
		
	/*	
		int score;
		조건식 대신 [true] 사용한경우 무한루프 // 조건식이 true때 if문에 break 필수ㅡ
		while(true) {
			System.out.println("점수 입력 >> ");
			score=scanner.nextInt();
			
			//키보드로 입력받은 정수값이 정상적인 경우 break 명령 사용 반복문 종료
			if(score >= 0 && scroe <=100) break;
			
			// 비정상적인 정수값이 입력된 경우 에러 메소드 출력
			System.out.println("[에러] 점수는 0~100 숫자만 입력 가능합니다.")
	*/
			} 
		} 

