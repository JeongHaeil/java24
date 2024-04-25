package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환 출력
		int time=245678; 
		int hour=time/(60*60); 
		int minute=time/60;
		int second=time%60;
		System.out.println(hour+"시,"+minute+"분," +second +"초");
		System.out.println("===================================");
		
		int cho=234567;
		System.out.println(cho+"초 =");
		
		int day=cho/(24*60*60);
		cho%=86400;   //%= 나누기해서 나머지 값 저장 ("일")
		int hour1=cho/(60*60);
		cho%=3600; //
		int min=cho/60;
		int sec=cho%60;
		System.out.println(day+"일 "+hour1+"시 "+min+ "분 "+sec+"초");
		
		System.out.println("===================================");
		
		//한대의 가격이 1억5천원만원 비행기를 20대 구매할 경우 지불해야될 금액 계산하여 출력
		// 단, 15대 이상 구매할 경우 1대당 25%의 할인율 적용하여 계산하세요
		
		int plane=150_000_000, num=20;
		long moy=(long)(plane*20);
			System.out.println("총 가격" + (long)(plane*num));
			System.out.println("할인된가격" +(long)((moy*0.75)));
		
			
		int car=150_000_000, count=20;
		long money=(long)(car >=15 ? car*0.75:car)*count;
				System.out.println("지불금액 = "+money);
			
			
			
			
			
	}
}
