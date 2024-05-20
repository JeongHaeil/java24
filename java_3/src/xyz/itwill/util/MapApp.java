package xyz.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Map 인터페이스를 상속받은 콜렉션 클래스 - HashMap 클래스, Hashtable 클래스, Properties 등
// => 이름(Key - 값을 구분하는 식별자) 과 값(객체) 을 하나의 그룹으로 묶어 Map 객체의 요소값으로 저장하여 사용
//Map 객체 요소값(Entry) 으로 사용
// => 이름(Key)을 사용하여 값(Value) 을 빠르게 검색하여 제공하기 위해 사용
public class MapApp {
	public static void main(String[] args) {
		//이름과 값에 대한 제네릭에 Java 자료형을 전달하여 객체 새성
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		//map.put(K key , V value) : 매개변수로 전달받은 이름과 값을 엔트리로 묶어
		//map 객체에 추가하여 저장
		// => Map 객체에 저장된 엔트리의 이름 은 내부적으로 Set 객체로 저장되고
		//동일한이름의 엔트리는 중복되지 않으며 순서없이 저장
		map.put(1000, "홍길동");
		map.put(2000, "이순신");
		map.put(3000, "장보고");
		map.put(4000, "전우치");
		map.put(5000, "임꺽정");
		
		System.out.println(map);
		System.out.println("=====================================================");
		
		//map 객체에 동일한 이름 의 엔트리를 저장할 경우 엔트리값 변경
		map.put(5000, "임걱정");
		System.out.println(map);
		
		System.out.println("=====================================================");
		
		//Map.get : Map 객체에 저장된 엔트리중 매개변수로 전달 받은 이름 엔트리
		//값 을 반환하는 메소드
		// => 매개변수로 전달받은 이름의 엔트리가 Map 객체에 없는 경우 [null] 반환
		String name=map.get(1000);
		System.out.println(name);
		
		System.out.println("=====================================================");
		//Map.remove : Map 객체에 저장된 엔트리중 매개변수로 전달받은 이름의 엔트리를 삭제
		
		map.remove(4000);
		System.out.println(map);
		System.out.println("=====================================================");
		//Map.keySet : Map 객체에 저장된 모든 엔트리의 이름 이 저장된 Set 객체 반환
		
		Iterator<Integer> iteratorKey=map.keySet().iterator();
		
		while (iteratorKey.hasNext()) {
			Integer key =  iteratorKey.next();
			String value=map.get(key);
			
			System.out.println(key+"="+value);
		}
		
		System.out.println("=====================================================");
		
		
		for(Integer key : map.keySet()) {
			System.out.println(key+"="+map.keySet());
		}
		
		System.out.println("=====================================================");
		//Map.values() : Map 객체에 저장된 모든 엔트리값 저장된 Collection 객체 반환
		Iterator<String> iteratorvalue=map.values().iterator();
		
		while (iteratorvalue.hasNext()) {
			String value =  iteratorvalue.next();
			System.out.println(value);
		}
		System.out.println("=====================================================");
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
