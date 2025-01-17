package xyz.itwill.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램 작성
//ex) 생년월일 입력[ex. 2000-01-01] >> 2024-05-12
//    [결과]태어난지 <1일>이 지났습니다.
// => 형식에 맞지 않는 생년월일을 입력한 경우 에러 메세지 출력 후 프로그램 종료
public class DayCalculateApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		Date birthday=null;
		System.out.print("생년월일 입력 [ex. 2000-01-01] >> ");
		
		
		try {
			//키보드로 입력받은 생년월일 (String 객체) Date 객체로 변환
			//=> 키보드로 입력받은 생년월일이 SimpleDateFormat 객체의 패턴정보와 일치하지
			//않을 경우 ParseException 발생
			birthday=dateFormat.parse(scanner.nextLine());
		} catch (ParseException e) {
			System.out.println("생년월일을 형식에 맞게 입력해 주세요. ");
			System.exit(0);
		}finally {
			scanner.close();
		}
		//살아온 날짜 계산하여 출력
		long day=(System.currentTimeMillis()-birthday.getTime())/(1000*60*60*24);
		
		System.out.println(day+"일 지났습니다");
	}
}
=======


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

