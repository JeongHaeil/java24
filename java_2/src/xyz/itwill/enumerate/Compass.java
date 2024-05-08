package xyz.itwill.enumerate;

public enum Compass {
	
	//열거형의 상수필드는 기본적으로 정수형(int) 설정되며 첨자가 초기값으로 자동 저장
	// => 매개변수가 없는 생성자를 사용할 상수필드 생성
	//EAST, WEST, SOUTH, NORTH;
	
	//매개변수가 있는 생성자를 사용할 상수필드 생성
	EAST("EAST"), WEST("WEST"), SOUTH("SOUTH"), NORTH("NORTH");
	
	//상수필드에 저장된 값을 표현하기 위한 필드 - 필드값으로 상수필드에 필요한 값 저장
	// => 필드에 final 제한자를 사용하먄 반드시 매개변수가 있는 생성자를 이용하여 필드 초기화 처리
	
	//상수필드에 원하는 자료형의 값을 저장하기 위해 작성된 필드 - final
	//final 사용하면 setter 불가능 대신 getter 사용가능
	//=> Getter 메소드를 작성하여 필드값을 반환받아 사용가능
	
	private final String value;
	
	//매개변수로 전달받은 값으로 필드를 초기화 처리하기 위한 생성자 - 상수필드 생성 하기위한 생성자
	//=> 상수필드를 생성하기 위한 생성자이므로 접근 제한자를 private 로 설정
	private Compass(String value) {
		this.value = value;
	}

	
	//=> Getter 메소드를 작성하여 필드값을 반환
	public String getValue() {
		return value;
	}
	
	
}
