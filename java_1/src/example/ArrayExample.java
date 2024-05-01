package example;

public class ArrayExample {
	public static void main(String[] args) {
		//사람들의 나이를 저장한 배열 생성하여 참조변수에 저장		
		int[] age={27,16,22,36,57,60,43,23,14,29,44,52,59,51,39,33,11};
		
		//배열에 저장된 모든 사람들의 나이 평균을 계산하여 출력하세요.
		int tot=0;
		for(int nai : age) {
			tot += nai;
		}
		System.out.println("나이 = "+(tot /age.length) );
		
		
		
		
		System.out.println("===============================================================");
		//배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		//ex) 10대 = 3명
		//    20대 = 4명
		//    ...
		//    60대 = 1명
		
		/*
		int cnt10=0,cnt20=0,cnt30=0,cnt40=0,cnt50=0, cnt60=0;
		for(int nai : age) {
			if(nai >= 10 && nai <=20)cnt10++;
			else if(nai >= 20 && nai <=30) cnt20++;
			else if(nai >= 30 && nai <=40) cnt30++;
			else if(nai >= 40 && nai <=50) cnt40++;
			else if(nai >= 50 && nai <=60) cnt50++;
			else if(nai >= 60 && nai <=70) cnt60++;
		}
		System.out.println(cnt10);
		System.out.println(cnt20);
		System.out.println(cnt30);
		System.out.println(cnt40);
		System.out.println(cnt50);
		System.out.println(cnt60);
		*/
		/*
		int[] cnt=new int[6];
		for(int nai : age) {
			if(nai >= 10 && nai <=20)cnt[0]++;
			else if(nai >= 20 && nai <=30) cnt[1]++;
			else if(nai >= 30 && nai <=40) cnt[2]++;
			else if(nai >= 40 && nai <=50) cnt[3]++;
			else if(nai >= 50 && nai <=60) cnt[4]++;
			else if(nai >= 60 && nai <=70) cnt[5]++;
		}
		for(int i=0;i<cnt.length;i++) {
			System.out.println((i+1*10)+"대 = " +cnt[i]);
		}
		
		*/
		System.out.println("===============================================================");
		int[] cnt=new int[6];
		for(int nai : age) {
			cnt[nai / 10 -1]++;
			}
		for(int i=0;i<cnt.length;i++) {
			System.out.println((i+1)*10+" 대 = "+cnt[i]);
		}
		
		
		
		
		System.out.println("===============================================================");
	}
}