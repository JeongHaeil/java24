package xyz.itwill.util;



import java.time.LocalDate;
import java.util.Scanner;


//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램 작성
//ex) 생년월일 입력[ex. 2000-01-01] >> 2024-05-12
//    [결과]태어난지 <1일>이 지났습니다.
// => 형식에 맞지 않는 생년월일을 입력한 경우 에러 메세지 출력 후 프로그램 종료
public class DayCalculateApp {
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("2000-01-01  >> ");
			 String input =scanner.nextLine();
			
			 LocalDate today = LocalDate.parse(input);
			 LocalDate day = LocalDate.now();
			
			 long ddo=day.until(today).getDays();
			 if (ddo == 0) {
	                System.out.println("[결과] 오늘 생일입니다!");
	            } else if (ddo == 1) {
	                System.out.println("태어난지 1일이 지났습니다");
	            } else {
	            	System.out.println("[결과] 태어난지 <" + ddo + "일>이 지났습니다.");
	            }
	         
	    } 
	}