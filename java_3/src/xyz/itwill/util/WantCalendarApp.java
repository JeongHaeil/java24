package xyz.itwill.util;

<<<<<<< HEAD
import java.util.Calendar;
import java.util.Scanner;

//키보드로 [년]과 [월] 입력받아 해당 년월에 대한 달력을 출력하는 프로그램
public class WantCalendarApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("[년] 입력 >>");
		
		int year=scanner.nextInt();
		
		System.out.println("[월] 입력 >>");
		int month=scanner.nextInt();
		
		scanner.close();

		//플렛폼의 현재날짜와 시간이 저장된 Calendar 객체 반환 저장
		Calendar calendar=Calendar.getInstance();
		
		
		//Calendar 객체에 저장된 날짜와 시간 중 [년월일] 키보드로 입력받은
		//[년] [월] [1]일 변경
		// =>Calendar 객체는 [월] 0 ~ 11 범위의 정수값으로 표현하므로 키보드 입력값을 [-1] 감소
		calendar.set(year, month-1,1);
		
		int week=calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("         "+year+"년" +month+"월");
		System.out.println("===============================");
		System.out.println(" 일  월  화  수  목  금  토  일");
		System.out.println("===============================");
		
		for(int i=1;i<week;i++) {
			System.out.print("    ");
		}
		for(int i=1;i<=calendar.getActualMaximum(Calendar.DATE);i++) {
			if(i <= 9) {
				System.out.print("     "+i);
			}else {
				System.out.print("   "+i);
			}
			week++;
			if(week % 7 == 1) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
//키보드로 [년]과 [월]을 입력받아 해당 년월에 대한 달력을 출력하는 프로그램 작성
public class WantCalendarApp {
	public static void main(String[] args) {
		
	}
}
>>>>>>> branch 'main' of https://github.com/JeongHaeil/java24.git
