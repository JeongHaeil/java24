package inheritance;

//상속(Inheritance) : 클래스 선언시 다른 클래스를 물려받아 작성하는 기능
//=> 기존 클래스를 재사용하여 새로운 클래스를 쉽고 빠르게 작성 - 생산성 증가
//=> 공통적인 속성과 행위를 포함한 다수의 클래스를 작성할 때 공통적인 속성과 행위를 구현한
//  -클래스를 선언하고 클래스를 물려받아 새로운 클래스를 작성 - 유지보수 효율성 증가

//물려주는 클래스 - 부모클래스,선조클래스, 기본클래스, [슈퍼클래스]
//물려받는 클래스 - 자식클래스,후손클래스, 파생클래스, [서브클래스]


//형식) public class 자식클래스 extends 부모클래스{
//			자식클래스에서는 부모클래스의 필드와 메소드를 상속받아 사용가능
//      }
//=> 부모클래스의 생성자는 자식클래스에 상속 되지 않으며 부모클래스 은닉화 처리된 필드 또는
//메소드는 자식 크래스에서 사용불가능
//=> Java 언어에서는 자식클래스가 하나의 부모클래스만 상속받아 작성 - 단일 상속


//super : 자식클래스의 메소드에서 부모클래스의 객체의 메모리 주소 저장하여 부모 객체 참조
//부모클래스 필드 또는 메소드를 사용
//=> 자식클래스의 메소드에서 this 키워드 참조하는 자식클래스  객체에 필드,메소드 없는경우
//=> 자동으로 super 로 저장된 부모객체 참조 하여 필드,메소드 사용 

//super 사용하는 경우
//1.자식클래스 생성자에서 부모클래스의 매개변수가 있는 생성자 호출하여 부모클래스 객체 생성
//하기 위해 super 키워드 사용
//형식) super(값, 값, ....);
// =>자식 클래스 생성자에서 부모클래스 매개변수가 있는 생성자 호출 명령 - 부모클래스 객체 필드 초기화
// =>자식 클래스 생성자에서 부모클래스 매개변수가 있는 생성자 호출 반드시 첫번째 명령

//2.자식클래스에서 부모클래스 메소드를 오버라이딩 선언하면 자식 메소드에서
//=> 숨겨진 부모 메소드 를 호출하기 위해 super 사용



//이벤트 관련 회원정보(아이디, 이메일, 이름) 저장
// => 회원정보를 저장하기 위한 클래스(Member 클래스) 상속 받아 작성
public class MemberEvent extends Member{
	
	//부모클래스부로부터 상속받은 필드 또는 메소드 작성 불필요
	//private String id;
	//private String name;
	private String email;
	
		public MemberEvent() {
		//부모클래스의 매개변수가 없는  기본 생성자를 호출하는 명령	- 생략 가능
		//super();
	}

	/*
	public MemberEvent(String id, String name, String email) {
		//부모클래스의 매개변수가 있는 기본 생성자를 호출 - 부모클래스 객체 초기화
		super(id, name);
		//this.id = id;
		//자식클래스의 메소드에서 this 키워드로 자식객체를 참조하여 자식클래스 필드 또는
		//메소드를 사용하며 자식클래스에 필드 또는 메소드가 없는경우 부모클래스에 사용 가능
		//setId(id);
		//this.name = name;
		//setName(name);
		this.email = email;
	}*/
		
	//Alt + Shift + S >> 메뉴 > O >>부모클래스 생성자 선택 및 필드 선택	
	public MemberEvent(String id, String name, String email) {
		super(id, name);
		this.email = email;
	}
	
/*
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//메소드 오버라이딩 : 상속 관계의 클래스에서 부모클래스의 메소드 
	//자식클래스에서 다시 선언하는기능
	//=> 부모클래스의 메소드를 자식클래에서 사용하기 부적절한 경우 부모클래스의 메소드를
	//자식클래스에서 작성하여 사용
	
	//부모클래스의 메소드와 같은 접근제한자,반환형
	//=>메소드명,매개변수, 예외전달을 자식클래스에서 동일하게 작성 - 오버라이딩 작성 규칭 
	//=> 메소드 오버라이딩 선언하면 부모클래스의 메소드는 숨겨지고 자식클래스 메소드만 가능
	
	
	/*
	public void display() {
		//System.err.println("아이디"+id());
		
		System.err.println("아이디"+getId());
		System.err.println("이름"+getName());
		System.err.println("이메일"+email);
		
	}
	*/
	
	//이클립스에서는 부모클래스의 메소드를 자식클래스에서 오버라이딩 자동완성 가능
	//=> 오버라이딩 선언하고 부모클래스 메소드명 입력 > Ctrl + Space > override 가능
	// @Override : 오버라이딩 선언된 메소드를 표현하기 위한 어노테이
	//	 => 오버라이딩 작성 규칙을 위반한 경우 에러 발생
	//어노테이션(Annotation) : 특별한 기능(명령의모임)을 제공하기 위한 Java 자료형
	// => @Override, @Deprecated, @SuppressWarnings
	@Override 
	public void display() {
		//super 키워드 사용해 부모클래스의 숨겨진 메소드 호출
		super.display();
		System.out.println("이메일 "+email);
	}
}
