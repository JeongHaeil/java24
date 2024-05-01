package oop;

public class CarApp {
	public static void main(String[] args) {
		//Car 클래스로 객체를 생성하여 참조변수에 객체의 메모리 주소 저장
		// => 하나의 클래스로 서로 다른 속성값을 저장할 수 있는 다수의 객체 생성
		// => 클래스는 다수의 객체를 생성하기 위한 틀(Template)
		// => 객체를 생성하면 객체 필드에는 기본값(숫자형 : 0, 논리형 : false, 참조형 : null)이 초기값으로 자동 저장 
		Car carOne=new Car(); // carOne : modelName = null engineStatus = false, currentSpeed = 0
		Car carTwo=new Car(); // carTwo : modelName = null engineStatus = false, currentSpeed = 0	
		
		System.out.println("carOne = "+carOne);
		System.out.println("carTwo = "+carTwo);
		
		//참조변수에 저장된 객체의 메모리 주소를 다른 참조변수에 저장
		// => 두 참조변수에는 동일한 객체의 메모리 주소 저장하고있고 같은 객체 참조
		Car carThree=carOne;
		System.out.println("carThree = "+carThree);
		System.out.println("=======================================================");
		//참조변수.필드명 : 참조변수에 저장된 메모리 주소로 객체를 참조하여 객체의 필드 사용
		
		//문제점) 객체를 사용하여 필드에 직접적인 접근을 허용하면 필드에 비정상적인 값 저장 가능
		//해결) 클래스를 만들때 필드가 숨겨지도록 은닉화 처리하여 선언
		// => 객체로 은닉화 처리된 필드를 사용할 경우 에러가 발생
		
		
		//carOne.modelName="제네시스"; //객체의 필드값 변경
		//Setter 메소드를 호출하여 매개변수에 전달된 값으로 필드값 변
		carOne.setModelName("제네시스");
		
		System.out.println("첫번째 자동차 모델명 = "+carOne.getModelName()); //객체의 필드값 출력
		System.out.println("첫번째 자동차 엔진상태 = "+carOne.isEngineStatus());
		System.out.println("첫번째 자동차 현재속도 = "+carOne.getCurrentSpeed());
		System.out.println("=======================================================");
		
		carTwo.setModelName("스팅어");
		carTwo.setEngineStatus(true);
		carTwo.setCurrentSpeed(100);
		
		System.out.println("두번째 자동차 모델명 = "+carTwo.getmodelName()); //객체의 필드값 출력
		System.out.println("두번째 자동차 엔진상태 = "+carTwo.isEngineStatus());
		System.out.println("두번째 자동차 현재속도 = "+carTwo.getCurrentSpeed());
		System.out.println("=======================================================");
		//참조 변수.메소드명(값,값, ...) : 참조변수에 저장된 메모리 주소로 객체참조하여
		//클래스의 메소드 호출 - 기능 구현
		
		carOne.startEngine();
		carOne.speedUp(50);
		carOne.speedUp(60);
		carOne.speedDown(110);
		carOne.speedZero();
		carOne.startEngine();
		System.out.println("=======================================================");
		
		
		
		
		
		
		
	}
}
