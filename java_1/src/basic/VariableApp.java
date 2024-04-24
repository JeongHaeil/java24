package basic;

//리터럴(Literal) : 프로그램에서 값을 사용하기 위한 표현방법
// ex) 100 (정수값) ,11.1 (실수값), 대한민국 (문자열), 'A'(문자값), true,false(논리값)

//변수(Variable) : Literal(값)을 저장하기 위한 메모리 부여하여 사용하는 이름

//변수 선언 - 메모리에 값을 저장하기위한 이름 설정
//형식 - 자료형 변수명;
//자료형(DataType) : 변수에 저장될 값의형태를 표현하기위한단어 - 키워드 또는 식별자
//변수형 : 값을 저장하기 위한 메모리 공간의 이름 - 식별자
//값=Literal
//키워드(Keyword - 예약어) : Java 프로그램 개발을 위한 미리 약속된 단어
//식별자(Identifier - 사용자 정의 명칭) : Java 프로그램 개발을 개발자가 선언하여 사용하는 단어

//식별자 작성규칙 - 변수명, 메소드명, 클래스명 등을 식별자로 작성
//영문자, 숫자, 일부 특수문자(_또는$)를 조합하여 작성
//영문자외 다른문자 사용가능 권장x
//숫자로 식장되는 식별자 작성불가능(영문자는 대소문자 구분 작성)
//기존에 사용된 단어(키워드포함)로 식별자 작성불가능(영역이 다를경우 사용가능)


//Java 프로그램 작성시 사용되는 표기법(약속) - 영문자 소문자를 기본으로 사용하여 식별자 작성
//1.파스칼 표기법(PascalCase) : 조합된 단어의 첫문자를 대문자로 표현하여 작성 - 클래스명, 인터페이스
//2.카멜 표기법(CamelCase) : 조합된 단어 중 첫번째 단어를 제외한 나머지 단어의 첫문자를 대문자로 작성 - 변수명,메소드명
//3.스네이크 표기법(SnakeCase) : 조합된 단어를 (_) 기호로 구분하여 작성 - 상수명
//=> 상수명은 대문자로 작성하는 것을 권장(MAX,SCORE)

//자료형(DataType) : 값(객체)을 표현하기 위한 키워드 또는 식별자
//=> 값(객체)을 저장하기 위한 변수를 선언할 때 사용
//1.기본형,원시형(PrimitiveType) : 값을 표현하기위한 자료형 -키워드(8개)
//=> 숫자형(정수형, 실수형,문자형) - 연산 가능, 논리형( 참 true 과 거짓 false)
//2.참조형(ReferenceType) : 특정 대상을 표현하기 위한 자료형 - 식별자(클래스)
//=> String 클래스 : 문자열을 표현하기 위한 참조형



public class VariableApp {
	public static void main(String[] args) {
		int su;//정수값을 저장하기위한 변수 선언 - 메모리에 su 이름의 변수 생성
		//대입연산자 (=)를 사용하여 변수의 값을 저장
		su=100;//입력명령
		System.out.print("최소값 = ");
		System.out.println(su);// 변수 값을 화면에 출력 = 출려명령
		//=>동일한 이름으로 변수를 선언할 경우 에러 발생
		su=300;
		System.out.print("최대값 = ");
		System.out.println(su);
		System.out.println("===================================");
		int num=100;//변수 선언 및 초기값 저장
		//"문자열" + 값 또는 값+"문자열" >> 문자열에 값을 결합한 결과값(문자열)을 제공하는 연산식
		System.out.println("num = "+num);
		System.out.println("===================================");
		System.out.println("올해는 "+2+0+2+4+" 년입니다.");
		System.out.println("나는 "+1+9+9+5+" 돼지띠입니다.");
		System.out.println("===================================");
		String name=null;
		int hour = 12;
		int minute = 24;
		System.out.println(hour+"시간" + minute +"분");
		int totalMinute = (hour*60) + minute;
		System.out.println("총"+ totalMinute + "분");
		int num1=100,  num2=200;
		System.out.println("===================================");
		System.out.println("연산결과 = "+(num1+num2));//덧셈을하기위에서는 묶음처리를해야함("값="+(1+1));
		System.out.println("연산결과 = "+(num1*num2));
		System.out.println("===================================");
		int kor=88, eng=90;
		int tot=kor+eng;
		System.out.println("점수 합계 = "+tot);
		System.out.println("===================================");
		//변수 값이 저장되어 있지 않은 상태에서 변수 사용할 경우 에러 발생 ex: int count   ("count ="+count);
		//변수에 저장 할 수 없는 리터럴(값)을 저장 시킬 경우 에러 발생
		//=> int count=10.0;
		
	}
}
