package xyz.itwill.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

//직렬 직렬화 (Objcet Serialization) : 객체를 원시데이터로 변환하여 입력스트림 또는 출력스트림의
//전달하기 위한 기능을 제공 - 객체를 byte 배열로 변환하여 전달 설정

//클래스를 객체 직렬화 처리하는 방법 -객체 직렬화 클래스
//1. implements 이용해 Serializable 상속 받아 클래스 작성
// => Serializable 인터페이스에는 추상메소드가 없으므로 메소드 오버라이딩 불필요
// => 객체의 모든 필드값 byte 배열로 변환하여 입력스트림 또는 출력스트림으로 전달

//2. implements 이용해 Externalizable 상속받아 클래스 작성
// => Externalizable 인터페이스에 작성된 writeExternal(ObjectOutput out) 추상메소드와
//readExternal(ObjectInput in) 오버라이딩 선언
// =>오버 라이딩 선언된 메소드에는 객체에서 웒는 필드값만 byte 배열로 변환하여 입력스트림
//또는 출력스트림으로 전달하는 명령작성

//회원정보를 저장하기 위한 클래스
// =>객체 단위로 입력 또는 출력 처리하기 위한 클래스를 반드시 객체 직렬화 클래스 선언
public class Member implements Serializable {
	private static final long serialVersionUID = 7579722335991274252L;
	//객체 직렬화 클래스는 클래스를 구분하기 위한 고유값이 저장된 serialVersionUID 필드를
	//작성하는 것을 권장 - 필드의 자료형은 [long] 타입으로 설정하고 static 제한자와 final
	// => 제한자를 사용하여 작성
	// => 이클립스에서는 고유값이 저장된 serialVersionUID 필드를 자동으로 생성하여 기능제공
	
	
	private String id;
	private String name;
	private String email;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}


	public Member(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "[아이디 = "+id+",이름 = "+name+" , 이메일 = "+email+"]";
	}


	
	
}
