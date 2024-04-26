package example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MultiforExample {
	public static void main(String[] args) {
		//★★★★★   i=1 흰별= 0 검은별=5
		//☆★★★★	2	1	4
		//☆☆★★★    3	2	3 
		//☆☆☆★★	3	3	2
		//☆☆☆☆★	4	4	1
		
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1+i;j--) {
				System.out.print("☆");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		//for(int i=1;i<=5;7++{
		//} for(int j=1;j<=i-1;j++{
		//	System.out.println(흰별);	
		//}
		// for(int j=1;j=6-i;j++) {
		//} System.out.println(검은별);
		
		System.out.println("===============================================================");
		//★★★★★
		//☆★★★★
		//☆☆★★★
		//☆☆☆★★
		//☆☆☆☆★
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i == j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
			}
			System.out.println();	
		}
		
		System.out.println("===============================================================");
		//☆☆☆☆★    
		//☆☆☆★★★
		//☆☆★★★★★
		//☆★★★★★★★
		//★★★★★★★★★
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("☆");
			}
			//for(int j=1;j<=i*2-1;j++) {  *2 짝수 *2-1 홀수
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("===============================================================");
		//★☆☆☆★
		//☆★☆★☆
		//☆☆★☆☆
		//☆★☆★☆
		//★☆☆☆★
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i == j || i+j == 6) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("===============================================================");
	}
}