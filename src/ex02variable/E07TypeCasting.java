package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {
		
		/*
		 자동형변환 : 작은 자료형의 데이터를 큰 자료형에 대입할 때 자동으로 형변환 진행
		 */
		byte b1 = 65;
		short s1;
		// byte가 short보다 작은 자료형이므로 자동형변환되어 대입
		s1 = b1;
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1);
		
		/*
		 아래 코드는 자동형변환이 아니며 int보다 작은 자료형을 연산할 때는 unt로 간주하여 진행하고 int로 반환(CPU 특성)
		 */
		int num1 = b1+s1;
		System.out.println("num1은" + num1);
		
		/*
		  char(문자)타입에 byte(정수) 타입을 바로 대입이 불가하므로 강제형변환 후 대입해야 가능
		 */
//		char ch1 = b1;
		char ch2 = (char)b1;
		System.out.println("b1="+b1+", ch2="+ch2);
		
		/*
		 명시적 형변환 : 큰 상자의 자료릉 작은 상자의 자료형에 할당해야 할 때 사용하지만 
		  자료의 손실이 있을 수 있으므로 필요한 경우에만 사용
		 */
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("데이터미손실:b2=%d, s2=%d\n",b2, s2);
		
		/*
		 소수점 아래부분이 버려지므로 데이터 손실이 있는 경우
		 "원 단위 절삭"과 같은 경우에 사용
		 */
		int num3;
		double dl = 3.14;
		num3 = (int)dl;
		System.out.printf("데이터손실:num3=%d, dl=%.2f %n",num3, dl);
		/*
		 서식문자 사용시 %.2f는 정수부분은 모두 출력하고 소수 이하는 2자리까지만 출력
		 */
		
		/*
		  문자는 메모리에 저장시 아스키코드로 저장되므로 int와의 연산을 진행한 후 문자로 표현하고 싶다면
		  char 타입으로 강제 형변환을 해야 가능
		 */
		char ch3 ='A', ch4;
		int num4 = 2;
//		ch4 = ch3 + num4;
		// A(65) + 2 => C(67)
		ch4=(char)(ch3+num4);
		System.out.println("ch4="+ch4);

	}

}
