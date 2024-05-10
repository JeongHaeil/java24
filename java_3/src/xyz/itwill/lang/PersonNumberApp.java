package xyz.itwill.lang;

import java.util.Scanner;

//키보드로 주민번호 입력받아 생년월일과 성별 출력
// => 주민번호는 7번째 자리 [ - ] 문자가 존재하고 14자리로 입력 처리
// => 비정상적인 주민번호가 입력된 경우 에러메세지를 출력하고 재입력
//ex - 주민번호[901225-1234567] >>000101-4567890
//	결과 생년월 = 2000년 1월 1일, 여자
public class PersonNumberApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		String number; //주민번호 저장
		//사용자로부터 입력받은 주민번호 검증하기위한 반복문
		// => 정상적인 주민번호를 입력 받은 경우 반복문 종료
		while(true) {
			System.out.print("주민번호[901225-1234567] >> ");
			//키보드로 입력받은 문자열에서 앞뒤 공백 제거
			number=scanner.nextLine().trim();
			
			if(number.length() == 14 && number.charAt(6)== '-') break;
				
			System.out.println("형식에 맞게 주민번호 다시 입력하세요.");
			
		}
		scanner.close();
		
		//주민번호 8번째 위치 문자하나를 문자열로 분리하여 저장
		String separation=number.substring(7, 8);
		
		//생년월일 저장
		String bi="";
		//separation 변수에 저장된 문자열을 비교하여 태어난 년도 계산
		if(separation.equals("1")|| separation.equals("2")) { //20세기 태어난 경우
			bi+="19";
		} else if (separation.equals("3")|| separation.equals("4")) {
			bi+="20";
		}
		bi+=number.substring(0,2)+"년";
		bi+=number.substring(2,4)+"월";
		bi+=number.substring(4,6)+"일";
		
		String gender="";
		if(separation.equals("1")|| separation.equals("3")) { //20세기 태어난 경우
			gender="남자";
		} else if (separation.equals("2")|| separation.equals("4")) {
			gender="여자";
		}
		
		System.out.println("생년 월일 = "+bi+"성별은 = " +gender);
	}
}
