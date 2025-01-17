package oop;

//클래스 : 객체를 생성하기 위한 자료형 - 참조형
// = > Java 언어에서는 (객체) 대신 (인스턴스)로 표현
// = > 현실에 존재하는 대상을 클래스라는 자료형으로 선언하고 프로그램에서 사용할 수 있는 객체 생성
//     ==> 클래스로 객체 생성



//클래스 선언 방법
//형식) public class 클래스형{
// 			필드 : 표현대상의 속성(값)을 저장하기 위한 변수 - 멤버 변수
//			생성자 : 객체를 생성하기 위한 특별한 메소드
//			메소드 : 표현 대상의 행위(기능)을 제공하기 위한 함수 - 멤버함수
//     }


// => 클래스명은 식별자로 파스칼표기법 사용하는 것을 권장
// => 메소드는 필드를 사용하여 필요한 행위(기능) 구현하도록 명령 작성
// => 클래스에 생성자를 작성하지 않으면 매개변수가 없는 기본 생성자가 자동으로 생성되어 제공


//클래스를 사용하여 객체를 생성하는 방법
//형식) 클래스명 참조변수=new 클래스명();
// => new 연산자로 클래스에 작성된 기본 생성자 를 호출하여 객체 생성
// => 힙 영역에 생성된 객체의 메모리 주소를 참조변수에 저장하여 참조변수에 저장된
//메모리 주소를 사용해 객체 참조
//=> 참조변수에 저장된 메모리 주소에 객체를 참조하여 클래스에 작성된 필드 또는 메소드를
//사용하기 위한 [.] 연산자 사용

//클래스를 작성할 때 클래스 요소(필드, 생성자, 메소드)에 접근 제한자를 사용해 작성하면 객체의 접근
//허용 관련 설정 가능
//접근 제한자 (Access Modifier) : private , package(default) , protected, public
// => 클래스 , 필드 ,생성자 , 메소드를 작성하여 접근 허용 관련 설정을 하기 위한 키워드

//private : 클래스에서만 접근 가능하도록 허용하는 접근 제한자
// => 필드, 생성자 , 메소드 작성시 사용하여 은닉화 처리하기 위한 접근 제한자
// => 클래스 외부에서 접근할 경우 에러 발생
// => 일반적으로 필드 작성시 사용 - 객체로 필드에 직접적인 접근을 제한해 비정상적인 값이 저장되는것을 방지
// => 데이터 은닉화(Data Hiding) : 값을 숨겨 보호하기 위한 기능 - 비정상적인 값 저장 방지


//public : 모든 패키지의 클래스에서 접근 가능 하도록 허용하는 접근 제한자 
//  => 클래스, 필드 ,생성자, 메소드 작성시 사용하는 접근 제한자
// => 일반적으로 메소드 작성시 사용하는 접근 제한자 - 프로그램 작성에 필요한 모든 클래스에서 
//객체의 사용하여 메소드를 호출할수있도록 허용한다





//자동차를 모델링하여 작성된 클래스
// => 속성 : 모델명, 엔진상태 , 현재속도 -필드
// => 행위 : 시동 온, 시동 오프, 속도 증가, 속도 감소, 이동 중지 - 메소드

// 필드 : 표현대상의 속성값을 저장하기 위한 변수
// =>클래스에 작성된 모든 메소드에서 필드 사용 가능

public class Car {
	private String modelName; // 모델명
	private boolean engineStatus; //엔진상태 - false : 엔진오프 , true : 엔진 온
	private int currentSpeed; // 현재속성
	//필드 생성
	
	//생성자 : 객체를 생성하기 위한 특별한 메소드
	//=> 클래스에 생성자를 작성하지 않으면 매개변수가 없는 기본 생성자가 
	//자동으로 생성되어 제공
	
	
	//메소드 : 표현대상의 행위(기능)을 제공하기 위한 함수
	// => 필드를 사용하여 메소드에 작성된 명령으로 원하는 기능 구현
	
	public void startEngine() {  // 시동 온
		engineStatus=true;
		System.out.println(modelName+"  부릉부릉 온");
	}
	//시동 오프
	public void stopEngine() {
		if (currentSpeed !=0) {
			//currentSpeed=0;
			//System.out.println(modelName+"자동차를 멈췄습니다.");
			
			//클래스에 작성된 메소드는 직접 호출 가능
			//코드의 중복성을 최소화하면 프로그램 생산성 증가 및 유지보수 효율 증가
			speedZero();
		}
		engineStatus=false;
		System.out.println(modelName+"  부릉부릉 오프");
	}
	//속도 증가
	
	public void speedUp(int speed) { //속도증가 
		if(!engineStatus) { //엔진이 꺼져이는경우
			System.out.println(modelName+"자동차 시동이 꺼져 있습니다.");
			return;
		}
		if(currentSpeed + speed > 150) {
			speed = 150 - currentSpeed;
		}
		
		currentSpeed+=speed;
		System.out.println(modelName+"자동차 속도가"+speed+"Km/h  현재 속도는 " +currentSpeed+"Km/h 입니다.");
	}
	public void speedDown(int speed) {  //속도감소
		if(!engineStatus) { //엔진이 꺼져이는경우
			System.out.println(modelName+"자동차 시동이 꺼져 있습니다.");
			return;
		}
		if(currentSpeed < speed) {
			speed = currentSpeed; 
		}
		
		currentSpeed-=speed;
		System.out.println(modelName+"자동차 속도가"+speed+"Km/h  현재 속도는 " +currentSpeed+"Km/h 입니다.");
		
	}
	public void speedZero() { //이동중지
		currentSpeed=0;
		System.out.println(modelName+"자동차가 멈췄습니다.");
	}	
	//은닉화 처리된 필드를 위해 필드값을 반환하는 Getter 메소드와 Setter 필드값 변경하는 Setter
	//메소드 작성 - 캡슐화
	//캡슐화 : 표현대상의 속성(필드) 과 행위(메소드) 를 하나의 자료형(클래스)으로 선언
	// -> 필드를 은닉화 처리하여 필드값을 보호하고 메소드를 호출하여 필드값을 변경하거나 반환처리
	
	//Getter 메소드 : 클래스 외부에서 필드값을 사용할 수 있도록 필드값을 반환하는 메소드
	// 형식 ) public 반환형 메소드명[] {return 필드명;}
	//  => 메소드의 이름은 [get필드명] 형식으로 작성하는것을 권좡
	//  => 필드의 자료형이 [boolean] 인 경우 메소드 이름을 [is필드명] 형식으로 작성
	
	public String getmodelName() {  //modelName 필드값을 반환하는 메소드
		return modelName;
	}
	
	
	//Setter 메소드 :  매개변수로 클래스 외부값을 전달받아 저장하여 필드값을 변경하는 메소드
	//형식) public void 메소드명(자료형 매개변수) {필드명=매개변수;}
	//=> 메소드의 이름은 [set필드명] 형식으로 작성하는것을 권좡
	//->매개변수에 전달되어 저장된 값을 검증 처ㅣ리한 후 필드에 저장 가능
	
	public void setmodelName(String modelName) { //modelName 필드값(모델명)을 반환하는 메소드
		//this : 메소드에서 메소드를 호출한 객체를 표현하기 위함
		//=> this 키워드를 사용하여 필드를 표현하고 this 키워드를 사용안하면 매개변수로 사용함 
		this.modelName=modelName;
	}
	//이클립스에서는 은닉화 처리된 필드에 대한 Getter 메소드 Setter 메소드 자동으로 만들어주는 기능
	// 단축키 Alt + Shift + S = R ==Getter 메소드 Setter 생성창
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public boolean isEngineStatus() {
		return engineStatus;
	}
	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	              
	
}	
