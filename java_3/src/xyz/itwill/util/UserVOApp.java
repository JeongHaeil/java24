package xyz.itwill.util;

import java.util.HashSet;
import java.util.Set;

public class UserVOApp {
	public static void main(String[] args) {
		
		Set<UserVO> set=new HashSet<UserVO>();
		
		set.add(new UserVO("dsad22", "홍길동", "das@itwill.dda"));
		set.add(new UserVO("d1ed22", "전우치", "vcs@itwill.dda"));
		set.add(new UserVO("ds23d22", "임꺽정", "abc@itwill.dda"));
		
		System.out.println(set);
		
		System.out.println("=============================================");
		
		//아이디가 중복된 UserVO 객체는 Set 객체의 요소값으로 저장 불가능
		set.add(new UserVO("dsad22", "홍길동", "das@itwill.dda"));
		System.out.println(set);
		
		System.out.println("=============================================");
		
		
		
		
		
		
		
	}
}
