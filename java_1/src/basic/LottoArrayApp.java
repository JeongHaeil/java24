package basic;

//1~45 범위의 정수 난수값을 6개 제공 받아 출력하는 프로그램
// => 6개 난수값은 서로 중복되지 않도록 처리하고 오름차순 정렬
//정렬(Sort) : 값을 차례대로 비교하여 순서 나열하기 기능
//오름차순 정렬(Ascending Sort),  내림차순 정렬(Descending Sort)

public class LottoArrayApp {
	public static void main(String[] args) {
		// 6개 정수 난수값을 저장하기 위한 요소를 가진 배열을 생성하여 참조변수에 저장
		int[] lotto = new int[6];

		// 1~45범위의 정수,난수값을 배열받아 배열요소에 차례대로 저장
		for (int i = 0; i < lotto.length; i++) {

			// 난수값을 제공받아 요소 저장하고 이전 요소에 저장된 난수값과 비교하여
			// 같은 난수값을 저장되어 있는경우 새로운 난수값 제공받고 저장하기위한 반복문
			// => 중복된 난수값이 배열 요소에 저장되지 않도록 처리
			// => 제공받은 난수값이 이전에 제공받은 난수값과 비교하여 중복되지 않는 경우 종료
			while (true) {
				// 1~45 범위 정수 난수값을 저장
				lotto[i] = (int) (Math.random() * 45) + 1;

				// 중복 상태를 저장하기위한변수
				// false : 미중복 true : 중복
				boolean result = false;

				// 이전 난수값이 저장된 요소를 반복처리하기위한
				for (int j = 0; j < i; j++) {
					// lotto[i] : 새로운 난수값이 저장된 배열요소
					// lotto[j] : 이전 난수값이 저장된 배열요소
					if (lotto[i] == lotto[j]) { // 새로운 난수값과 이전 난수값이 중복된경우
						result = true;
						break; // for(int j=0;j<i;i++) 종료
					}
				}

				if (!result) break; // while(true) 종료
			}

		}
		//배열 요소에 저장된 값을 비교하여 오름차순 정렬되도록 요소값 바꾸어 저장
		// => 선택 정렬 알고리즘 사용, 오름차순 정렬되도록 처리
		for(int i=0;i<lotto.length-1;i++) { //비교하는 //비교요소의 첨자를표현하기 위한 반복문 : 처음부터 ~ 끝 -1
			for(int j=i+1;j<lotto.length;j++) { //비교당하는 //피비교 요소의 첨자를 표현하기위한 : 비교+1~끝까지
				//lotto[i] : 비교하는 요소 lotto[j] 비교 당하는 요소
				//비교 요소값이 비교당하는 요소값보다 큰경우 요소값 바꾸어 저장 -오름차순
				if(lotto[i] > lotto[j]) {
					//요소값을 바꾸어 저장 치환알고리즘 사용
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		
		System.out.print("행운의 숫자 >> ");
		for (int num : lotto) {
			System.out.print(num + " ");
		}

	}
}
