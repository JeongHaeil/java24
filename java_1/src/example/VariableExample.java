package example;

public class VariableExample {
	public static void main(String[] args) {
		//가로 길이 7 세로길이 10 사각형 넓이를 계산하여 출력
		int garo=7, sero=10;
		int nuble=garo*sero;
		System.out.println("사각형 넓이 = "+nuble);
		
		System.out.println("===================================");
		//높이가 9이고 밑변 길이가 7인 삼각형 넓이를 계산 출력
		int above=9, below=7;
		double nuble1=above*below/2.;
		System.out.println("삼각형 넓이 = "+(nuble1));
		
		System.out.println("===================================");
		//10명 전체 몸무게가 759kg 경우 평균 몸무게를 계산 출력
		int weig=759, avg=10;
		double aveWeight=(double)weig/avg;
		System.out.println("평균 몸무게 = "+(aveWeight));
		
		int weight=1024, count=10;
		double average=(double)weight/count;
		System.out.println("평균 = "+ average);
				
		System.out.println("===================================");
		//이름이 [홍길동]인 학생 국어점수 89점, 영어 93점, 수학점수 95점 받은경우
		//총점과 평균을 계산하여 이름 총점 평균 출력
		//단 평균은 소숫점 한자리까지만 출력후 나머지 절삭
		int kor=89, eng=93, math=95;
		int tot=kor+eng+math;
		double avg1=tot/(double)3.;
		String name="홍길동";
		System.out.println("홍길동");
		System.out.println("총점 = "+tot);
		System.out.println("평균 = "+(int)(avg1*10)/10.);
		
		
		
		
		
		
	}
}
