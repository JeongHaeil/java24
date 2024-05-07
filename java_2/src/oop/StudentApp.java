package oop;

import java.text.NumberFormat.Style;

public class StudentApp {
	public static void main(String[] args) {
		/*
		Student student1=new Student(1000, "홍길동",88,83);
		Student student2=new Student(2000, "전우치",45,23);
		Student student3=new Student(3000, "이순신",95,89);
		Student student4=new Student(4000, "장보고",91,80);
		Student student5=new Student(5000, "일지매",52,70);
		
		
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		
		System.out.println("======================================================");
		student1.setKor(100);
		student1.calcTot();
		student1.display();
		*/
		System.out.println("======================================================");
		/*
		//객체를 저장할수있는 요소가 5개인 배열 생성하여 배열참조변수에 저장
		// => 모든 배열 요소에는 기본값 [null] 저장
		Student[] students=new Student[5];
		
		students[0]=new Student(1000, "홍길동",88,83);
		students[1]=new Student(2000, "전우치",45,23);
		students[2]=new Student(3000, "이순신",95,89);
		students[3]=new Student(4000, "장보고",91,80);
		students[4]=new Student(5000, "일지매",52,70);
		
		//반복문을 사용하여 배열 요소에 저장된 모든 객체를 참조해 메소드 호출 가능 - 일괄처리
		//length  첨자
		//=> 배열 요소에 [null] 저장이 된 경우 메소드를 호출 할 경우 nullPointerException 발생
		 * 
		//nullPointerException : 참조변수에 [null]이 저장된 상태에서 메소드르 호출할 경우 참조할 객체가없기때문에 발생되는 예외
		for(int i=0;i<students.length;i++) {
			//nullPointerException 발생을 방지하기 위한 선택문
			if(students[i] != null) {//배열 요소값이 [null]아닌 경우에만 메소드 호출
				students[i].display();
			}
			
		}
		*/
		System.out.println("=======================================================");
		
		//int total=0;
		
		//객체배열
		
		Student[] students={new Student(1000, "홍길동",88,83), new Student(2000, "전우치",45,23)
				, new Student(3000, "이순신",95,89), new Student(4000, "장보고",91,80), new Student(5000, "일지매",52,70) };
		//향상된 for 구문을 사용하여 배열 요소가 참조하는 객체를 차례대로 제공받아 일괄 처리 가능
		
		for(Student student : students) {
			student.display();
			//total+=student.getTot();
			Student.setTotal(Student.getTotal()+student.getTot());
		}
		System.out.println("=======================================================");
		//모든 학생들의 성적 합계를 계산하여 출력	
		System.out.println("총 합계 = "+Student.getTotal());
		
		System.out.println("=======================================================");
		
		
	
		
		
		
	}

}
