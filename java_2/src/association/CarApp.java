package association;

public class CarApp {
	public static void main(String[] args) {
		//Engine 클래스의 기본 생성자를 사용하여 객체 생성 - 엔진 생성
		Engine engine=new Engine();
		//Setter 메소드 호출하여 객체 필드값 변경
		engine.setDisplacement(3000);
		engine.setFualType("경유");
		
		//engine.displayEngine();
	
		//Car 클래스의 기본 생성자를 사용하여 객체 생성 - 자동차 생성
		Car carOne=new Car();
		
		carOne.setModelName("아반떼");
		carOne.setProductionYear(2020);
		//Setter 메소드를 호출해서 Car 객체의 engine 필드에 엔진정보 저장
		//=> Setter 메소드를 사용하여 Car 객체의 피필드에 Engine 객체 저장 포함 관계 구현
		
		carOne.setEngine(engine);
		
		carOne.displayCar();
		System.out.println("=========================================================");
		//Car 클래스의 매개변수가 작성된 생성자를 사용하여 객체 새성 -자동차생성
		// Engine 클래스의 매개변수가 작성된 생서자를 사용하여 객체생성하여 매개변수 전달 - 엔진 생성
		//=> 생성자 메소드를 사용하여 포함 관계 구현
		Car carTwo=new Car("쏘나타", 2024, new Engine("디젤", 2900));
		
		carTwo.displayCar();
		
		System.out.println("=========================================================");
		
		System.out.println(carOne.getModelName()+"의 엔진 정보 >>");
		engine.displayEngine();
		
		System.out.println("=========================================================");
		//car 객체의 engine 필드에 저장된 Engine 객체 반환
		//직접 Engine 클래스 메소드 호출
		System.out.println(carTwo.getModelName()+"의 엔진 정보 >>");
		carTwo.getEngine().displayEngine();
		
		System.out.println("=========================================================");
		
	}
}
