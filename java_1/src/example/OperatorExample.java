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
		//한대의 가격이 1억5천원만원 비행기를 20대 구매할 경우 지불해야될 금액 계산하여 출력
		// 단, 15대 이상 구매할 경우 1대당 25%의 할인율 적용하여 계산하세요
		//삼항연산자
		long car=150000000, num=15;
			System.out.println("총 가격" + (long)(car*num));
			System.out.println("할인된가격" +(long)((car*0.25)));
		
	}
}
