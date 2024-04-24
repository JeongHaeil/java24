package basic;

//지역변수(LocalVariable) : 메소드 블럭 {} 내부에서 선언된 변수
// => 지역변수는 선언된 블럭이 종료되면 자동 소멸되므로 선언된 블럭 내부에서만 사용가능

public class LocalVariableApp {
	public static void main(String[] args) {
		int num1=100;
		
		//임의블럭 : 선택문과 반복문 사용
		{
			int num2=200;
			System.out.println("=========임의블럭 내부==========");
			System.out.println("num1 =" +num1);
			System.out.println("num2 =" +num2);
		}
		System.out.println("=========임의블럭 내부==========");
		System.out.println("num1 =" +num1);
		//임의블럭 종료시 num2 변수가 자동 소멸 되므로 사용불가
		//System.out.println("num2 =" +num2);
	}

}
