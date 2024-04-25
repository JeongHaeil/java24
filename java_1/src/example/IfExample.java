package example;

public class IfExample {
	public static void main(String[] args) {
		//변수에 저장된 문자값을 출력하세요
		// 단 변수에 저장된 문자값이 소문자인 경우 대문자로 변환 출력
		char mun='x';
		if(mun>='a' && mun <= 'z') {
			mun-=32;
		}
		
		//변수에 저장된 정수값이 4의 배수인지 아닌지 구분하여 출력
		int numb=345644;
		
		if(numb % 4 ==0) {
			System.out.println(numb+"4의 배수가 맞습니다.");
		} else {
			System.out.println(numb+"4의 배수가 아닙니다.");
		}
		
		
		System.out.println("===================================");
		//이름이 [홍길동]인 학생 국어점수 89점, 영어 93점, 수학점수 95점 받은경우
		//총점과 평균을 계산하여 이름 총점 평균 출력
		//국어 영어 수학 점수 중 하나라도 ~100 범위가 아닌 경우 프로그램 강제 종료
		    //System.exit(0) : 프로그램 강제 종료 메솧드
		//평균을 이용한 학점계산 : 100~90 a 89 80 B 79~70 c 69~60D 59~0 f
		//평균 소숫점 두자리까지만 출력후 절삭처리
		//입력값 검증(Validation) || 또는 && ~~고 
		
		//if(kor>100 || kor<0 || eng>100 || eng<0 || mat>100 || mat<0) {
			//System.out.println("비정상적인 점수");
			//System.exit(0);
		//}
		
		String grade="";
		String name="홍길동";
		int kor=89, eng=93, mat=95;
		int tot=kor+eng+mat;
		double ave=tot/3.;
		switch ((int)ave/10) {
		case 10: grade="A"; break;
		case 9: grade="B"; break;
		case 8: grade="C"; break;
		case 7: grade="D"; break;
		case 6: grade="E"; break;
		default: grade="F"; break;	
		}
		System.out.println("이름 ="+ "+name+", "총점 = "+tot+", 평균 ="+(int)(ave*100)/100.+", 학점 = "+grade);
				
				if(kor>100 || kor<0) {
					System.out.println("비정상적인 국어점수 입력");
				}
				if(eng>100 || eng<0) {
					System.out.println("비정상적인 국어점수 입력");
				}
				if(mat>100 || mat<0) {
					System.out.println("비정상적인 국어점수 입력");
				}
				
				
	}
}