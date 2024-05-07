package xyz.itwill.access;

//package : 클래스 필드 생성자 메소드 접근을 제한하기 위한 접근 제한자
//=>클래스,필드,생성자,메소드를 같은 패키지 및 다른 패키지를 사용가능하도록 하는 접근 제한자
//=>클래스,필드,생성자,메소드 작성시 접근 제한자 관련 키워드(private, protected,public)를 사용하지 않으면 자동으로
//package 접근제한자로 처리

public class PackageMember {
	int num;
	void display() {
		System.out.println("num = "+num);
	}
}
