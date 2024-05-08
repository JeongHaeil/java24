package xyz.itwill.enumerate;

public class EnumerateApp {
	public static void main(String[] args) {
		//인터페이스에 작성된 상수필드 출력 
		//=>열거형에 작성된 상수필드의 이름을 하나의 값으로 사용
		System.out.println("삽입(EnumerateOne.INSERT ="+EnumerateOne.INSERT);
		System.out.println("변경(EnumerateOne.UPDATE ="+EnumerateOne.UPDATE);
		System.out.println("삭제(EnumerateOne.DELETE ="+EnumerateOne.DELETE);
		System.out.println("검색(EnumerateOne.SELECT ="+EnumerateOne.SELECT);
		System.out.println("===============================================================");
		
		System.out.println("삽입(EnumerateTwo.INSERT ="+EnumerateTwo.ADD);
		System.out.println("변경(EnumerateTwo.UPDATE ="+EnumerateTwo.MODIFY);
		System.out.println("삭제(EnumerateTwo.DELETE ="+EnumerateTwo.REMOVE);
		System.out.println("검색(EnumerateTwo.SELECT ="+EnumerateTwo.SEARCH);
		System.out.println("===============================================================");
		
		//열거형으로 생성된 변수에 해당 열거형에 작성된 상수필드 저장 가능
		// =>상수필드가 작성된 열거형을 하나의 자료형으로 사용 가능
		
		EnumerateOne choice=EnumerateOne.INSERT;
		System.out.println(choice);
		
		System.out.println("===============================================================");
		
		//나열형으로 선언된 변수값은 같은 자료형(자료형)의 상수필드로만 비교가능
		// =>case 키워드에는 switch 키워드의 열거형과 같은 상수필드만 작성하여 비교가능
		
		
		switch(choice) {
		case INSERT:
			System.out.println("# 학생정보를 삽입합니다.");
			break;
		case UPDATE:
			System.out.println("# 학생정보를 변경합니다.");
			break;
		case DELETE:
			System.out.println("# 학생정보를 삭제합니다.");
			break;
		case SELECT:
			System.out.println("# 학생정보를 검색합니다.");
			break;
		}
		
		
		
	}
}
