package basic;

//2차원 배열 : 1차원 배열의 모임


public class DoubleArrayApp {
	public static void main(String[] args) {
		//형식) 자료형[][] 참조변수=new 자료형[행갯수][열갯수];
		// => 행갯수 : 2차원 배열에 저장될 수 있는 1차원 배열의 갯수
		// => 열갯수 : 2차원 배열에 저장된 1차원 배열의 요소 갯수
		int[][] num=new int[2][3];
		System.out.println("numArray="+num);
		System.out.println("numArray[0]="+num[0]);
		System.out.println("numArray[1]="+num[1]);
		System.out.println("==================================");
		// 2차원 배열에 요소(값) 사용하기 위해서는 첨자를 1개 사용
		System.out.println("numArray[0][0]="+num[0][0]);
		System.out.println("numArray[0][1]="+num[0][1]);
		System.out.println("numArray[0][2]="+num[0][2]);
		
		
		System.out.println("numArray[1][0]="+num[1][0]);
		System.out.println("numArray[1][1]="+num[1][1]);
		System.out.println("numArray[1][2]="+num[1][2]);
		System.out.println("==================================");		
		
		System.out.println("num="+num.length);
		System.out.println("==================================");
		/*
		  // 2차원 배열로 접근 가능한 1차원 배열(행) 일괄처리하기 위한 반복 
		 
		for(int i=0;1<num.length;i++) {
			//1차원 배열로 접근 가능한 요소(열)을 일괄처리하기위한 반복문
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==================================");
	/*
		
		//int[][] suArray=new int[][] {{10,20,30},{40,50,60},{70,80,90}}; // 힙 영역 저장
		int[][] suArray={{10,20,30},{40,50,60},{70,80,90}}; //메소드 영역 저장
		
		
		
		//2차원 배열의 요소값 (1차원 배열의 메모리 주소) 차례대로 제공받아 변수에 저장하여 제공
		for(int[] array : suArray) {
			for(int num1 : array) {
				System.out.print(num1+"\t");
			}
			System.out.println();
		}
		*/
		System.out.println("==================================");
		//1차원 배열의 메모리 주소를 3개 저장할수있는 2차원 배열생성
		// => 2차원 배열의 참조 요소에는 초기값 [null] 저장
		int[][] valueArray=new int [3][];
		
		
		System.out.println("valueArray ="+valueArray);
		System.out.println("valueArray[0] ="+valueArray[0]);
		System.out.println("valueArray[1] ="+valueArray[1]);
		System.out.println("valueArray[2] ="+valueArray[2]);
		System.out.println("==================================");
		// 1차원 배열을 생성하여 2차원배열의 참조요소에 1차원 배열의 메모리 주소 저장
		// => 2차원 배열의 참조요소에는 요소의 갯수가 다른 1차원 배열의 메모리 주소 저장가능 - 가변 배열
		valueArray[0]=new int[3];
		valueArray[1]=new int[2];
		valueArray[2]=new int[1];
		
		System.out.println("valueArray[0] ="+valueArray[0]);
		System.out.println("valueArray[1] ="+valueArray[1]);
		System.out.println("valueArray[2] ="+valueArray[2]);
		System.out.println("==================================");
		
		int[][] doubleArray=new int[][] {{10,20,30},{40,50},{60,70,80,90}}; //가변 배열
		for(int[] array : doubleArray) {
			for(int num2 : array) {
				System.out.print(num2+"\t");
			}
			System.out.println();
		}
		System.out.println("==================================");
		
		

		
		
	}
}
