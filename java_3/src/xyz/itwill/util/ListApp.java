package xyz.itwill.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//List 인터페이스를 상속받은 콜렉션 클래스 - ArrayList 클래스, Vector 클래스, LinkedList 등
// => List 객체는 객체를 저장한 요소의 순서가 있으며 동일한 객체 저장 가능
// => List 객체의 첨자를 사용하여 요소 구분
// => List 객체에 저장된 요소값(객체)가 많은 경우 검색 속도가 느린 단점



public class ListApp {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		//List.add(E element) : 매개변수로 전달받은 객체를 List 객체의 요소에 추가하여 저장
		// => List 객체 요소에 차례대로 요소값(객체) 저장
		
		list.add("홍길동");
		list.add("전우치");
		list.add("임꺽정");
		//List.toSting() : List 객체에 저장된 모든 요소값을 문자열로 반환하는 메소드
		
		System.out.println(list);
		System.out.println("================================================================");		
		
		list.add("임꺽정");
		System.out.println(list);
		
		System.out.println("================================================================");		
		
		System.out.println(list.size());
		
		
		System.out.println("================================================================");		
		//List.get : List 객체에 저장된 요소값 중 매개변수로 전달받은 첨자 위치의
		//요사값을 반환하는 메소드
		System.out.println(list.get(3));
		System.out.println("================================================================");		
		
		//List.add (int index, E element) : List 객체에 매개변수로 전달받은 첨자 위치에
		//요소값을 삽입하여 저장하기 위한 메소드
		list.add(3, "일지매");
		System.out.println(list);
		System.out.println("================================================================");		
		
		//list.remove(E element) : List 객체에서 매개변수로 전달받은 객체의 요소값을 삭제하는 메소드
		// => List 객체에 저장된 요소값이 VO 클래스 생성된 객체인 경우에만 사용 가능
		// => List 객체에 동일한 객체에 여러개 저장되어 있는 경우 첫번째 요소값 삭제
		//list.remove("임꺽정");
		
		//List.removr (int index) : List 객체에서 매개변수로 전달받은 첨자 위치 요소값 삭제
		list.remove(4);
		System.out.println(list);
		
		System.out.println("================================================================");		
		//List.set(int index, E element) : List 객체에서 매개변수로 전달받은 첨자 위치의
		//요소값을 변경하는 메소드
		
		list.set(1, "임걱정");
		System.out.println(list);
		System.out.println("================================================================");		
		//List 객체에 저장된 모든 요소값에 대한 일괄 처리 - 일반 for 구문 사용
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
		
		System.out.println("================================================================");		
		//List 객체에 저장된 모든 요소값 일괄처리 - Iterator 객체사용
		//List.iterator() : List 객체에 저장된 모든 요소값 일괄 처리 할수있는 iterator 객체
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		System.out.println();
		System.out.println("================================================================");		
		//List 개게에 저장된 모든 요소값 일괄 처리 - 향상된 for 구문
		for(String str : list) {
			System.out.println(str+" ");
		}
		System.out.println("================================================================");		
		//List.contains : List 객체에 매개변수로 전달받은 객체와 동일한 객체가 요소값으로
		//없는경우 [false] 반환하고 동일한 객체가 요소값으로 있는경우 [true]를 반환하는 메소드
		if(list.contains("홍길동")) {
			System.out.println("List 객체에 저장된 요소값이 맞습니다");
		}else {
			System.out.println("List 객체에 저장된 요소값이 아닙니다");
			
		}
		
		System.out.println("================================================================");		
		//List.clear() : List 객체에 저장된 모든 요소값 삭제
		list.clear();
		System.out.println(list);
		
		//List.isEmpty() : List 객체에 저장된 요소값이 있는 경우 [false] 반환
		//요소값이 하나도 없는 경우 [true] 반환
		if(list.isEmpty()) { //if(list.size() ==0 { } 명령과 도일
			System.out.println("List 객체에 저장된 요소값이 하나도 없습니다");
		}
		System.out.println("================================================================");		
		//Arrats.asList(E ... elements) : 매개변수로 0개 이상 객체를 전달받아 List 객체
		//요소값으로 저장하여 List 객체 반환
		List<Integer> memberList=Arrays.asList(10, 20, 30, 40, 50); //배열 >> List 객체
		System.out.println(memberList);
		
		
	}
}
