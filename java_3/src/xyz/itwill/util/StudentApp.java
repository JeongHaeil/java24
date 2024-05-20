package xyz.itwill.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentApp {
	public static void main(String[] args) {
		List<Student> studentListOne=new ArrayList<Student>();
		
		
		studentListOne.add(new Student(5000, "이순신"));
		studentListOne.add(new Student(2000, "임꺽정"));
		studentListOne.add(new Student(1000, "홍길동"));
		studentListOne.add(new Student(4000, "장보고"));
		studentListOne.add(new Student(3000, "일지매"));
		
		System.out.print("정렬 전 >> ");
		System.out.println(studentListOne);
		
		//Collections 클래스 : 콜렉션 클래스로 생성된 객체 처리하는 기능 제공
		//Collections.sort(List<T> , list : 매개변수로 전달받은 List 객체의 요소값 정렬해주는 기능
		// => List 객체에 저장된 요소값의 필드값을 비교하는 compaerTo() 메소드 호출하여 정렬		
		Collections.sort(studentListOne);
	
		System.out.print("정렬 후 >> ");
		System.out.println(studentListOne);
		
		System.out.println("=============================================");
		
		List<Student> studentListTwo=new ArrayList<Student>();
		
		studentListOne.add(new Student(6000, "유"));
		studentListOne.add(new Student(7000, "강"));
		studentListOne.add(new Student(8000, "정"));
		studentListOne.add(new Student(9000, "동"));
		
		//제네릭을 인터페이스로 설정한 경우 인터페이스를 상속받은 자식클래스의 객체 저장
		Map<Integer, List<Student>> studentListMap=new HashMap<Integer, List<Student>>();
		studentListMap.put(1, studentListOne);
		studentListMap.put(2, studentListTwo);
		
		for(Integer ban : studentListMap.keySet()) {
			System.out.println(ban+"반의 정보");
			
			List<Student> studentList=studentListMap.get(ban);
			
			for(Student student : studentList) {
				System.out.println(student);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
