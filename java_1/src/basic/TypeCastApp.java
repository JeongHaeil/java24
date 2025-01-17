package basic;

//형변환(TypeCast) : 값의 자료형을 일시적으로 변환하여 사용하는 방법
// => 자동 형변환(JVM), 강제 형변환(개발자)
public class TypeCastApp {
	public static void main(String[] args) {
		//자동 형변환 : 자료형이 다른 값을 연산하기위해 JVM이 값의 자료형을 일시적으로 변환하여 사용하는 방법
		// => 표현의 범위가 작은 자료형의 값을 큰 자료형의 값으로 형변환하여 연산처리
		// => byte >> short >> shar >> int >> long >> float >> double
		System.out.println("결과 = "+(3+1.5));
		// => 3(int) + 1.5(double) >> 3.0(double) + 1.5(double) >> 4.5(double)
		
		double su=10;
		System.out.println("su = "+su);
		System.out.println("결과 = "+(95/10)); //int / int >> int
		System.out.println("결과 = "+(95.0/10.0)); //double /double >> double
		System.out.println("결과 = "+(95/10.)); //int(double) / double >> double
		
		int kor=65, eng=76;
		int tot=kor+eng;
		double ave=tot/2.;
		//double ave=tot/2; 연산 결과값(평균) = 정수값
		//double ave=tot/2. 연산 결과값(평균) = 실수값
		System.out.println("총점 = "+tot+" 평균 = "+ave);
		// => byte >> short >> char >> int >> long >> float >> double
		// int 자료형 보다 작은 작료형의 값을 연산할 경우 무조건 int 자료형으로 자동 형변환되어 연산
		byte su1=10, su2=20; // byte + byte = int, byte 변수에 저장할때는 int 사용
		int su3=su1+su2;
		System.out.println("su3 = "+su3);
		//강제 형변환 : 개발자가 Cast 연산자를 사용하여 값을 원하는 자료형의 값으로 일시적으로
		//변환하여 사용하는 방법
		// => Cast 연산자 : (자료형) 값
		
		int num=(int)12.3; //(int)12.3 >> 12
		System.out.println("num = "+num);
		//double num3=num1/num2; // 연산결과값 : 9 >> 변수값 9.0 (자동형변환)
		int num1=95, num2=10; // 연산결과값 : 9.5 >> 변수값 : 9.5
		double num3=(double)num1/num2;
		System.out.println("num3 = "+num3);
		//큰 정수값은 [_] 기호를 사용하여 표현
		int num4=100_000_000, num5=30;
		//문제점) 정수값은 Byte(-2147483648~2148483647)로 표현되므로 연산 결과 값이
		// 4Byte의 표현범위를 벗어날 경우 잘못된 결과값이 변수에 저장 - 실행 오류
		//해결법) 연산 결과값이 4Byte의 범위를 벗어날 경우 8Byte으로 연산 처리되도록
		//피연산자를 강제 형변환하여 연산 처리 - 연산 결과값을 저장할 변수도 long 자료형으로 변경
		long num6=(long)num4*num5;
		System.out.println("num6 = "+num6);
		
		// 변수에 저장된 실수값을 소숫점 2번째 자리까지만 출력되도록 변환 처리
		double numer=1.23456789;
		System.out.println("numer = "+numer);
		System.out.println("numer(내림) = "+(int)(numer*100)/100.); // 정수값은 / 먼저하고 곱하기 
		System.out.println("numer(올림) = "+(int)(numer*100+0.9)/100.);
		System.out.println("numer(반올림) = "+(int)(numer*100+0.5)/100.);
		
		
	}

}
