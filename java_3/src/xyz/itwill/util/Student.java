package xyz.itwill.util;

//Comparable 인터페이스 : 객체 필드값 비교한결과 반환하는 compareTo() 추상메소드가 작성된 인터페이스
// => compareTo 오버라이딩 선언 자식클래스의 객체(this) 필드값을 매개변수로 전달
//받은 객체 필드값과 비교하여 양수, 음수 , 0 중 하나를 반환하는 메소드
//=> 객체의 필드값을 비교하기 우한 클래스가 반드시 상속받아야 돠는 인터페이스



//학생정보(학번,이름) 저장하는 클래스
// => List 객체에 저장돈 학생정보를 비교하여 정렬하기 위해서 Comparable 상속
public class Student implements Comparable<Student> {
	private int num;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "{학번 = "+num+"이름 = "+name+"}";
	}

	//메소드를 호출한 객체의 필드값과 매개변수로 전달받은 객체의 필드값을 비교하여 
	//양수 , 0 , 음수 중 하나를 반환하는 메소드
	// => Collections.sort  메소드가 객체의 필드값을 비교하여 정렬하기위 자동
	@Override
	public int compareTo(Student o) {
		// 학번 비교하여 결과값을(양수 ,음수 , 0 ) 반환처리
		return this.num-o.num;
		
		//return o,num-this.num;  //내림차순 정렬
		
		//이름[문자열]은 String 클래스 compareTo() 메소드 호출하여 값(양수 음수 0)  제공 
		//return  o.name.compareTo(); //문자 오름차순
		return o.name.compareTo(name);
		
	}
	
	
	
	
}
