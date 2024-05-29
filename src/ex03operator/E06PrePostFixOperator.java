package ex03operator;

public class E06PrePostFixOperator {

	public static void main(String[] args) {
		
		/*
		  증감연산자 
		   - 변수를 +1 혹은 -1 한 것과 같은 결과를 반환하며 주로 반복문에서 사용
		  prefix(전위 증가 혹은 감소)
		   - 연산자가 벼수 앞에 있는 경우, 변수의 값이 먼저 변경되고 변경된 값이 좌측항 혹은 다른 코드에 반영
		  postfix(후위 증가 혹은 감소)
		   - 연산자가 변수 뒤에 있는 경우, 변수의 값이 먼저 다른 코드에 반영되고 반영된 이후 변수의 값이 저장
		 */
		
		
		int num1 =7;
		int num2, num3; // num1 = 7, num2 = x, num3 = x
		num2 = ++num1; /*
		 1. num1의 값이 먼저 1 증가
		 2. 증간된 num1이 num2에 대입
		 num1 = 8, num2 = 8, num3 = x
		 */ 
		num3 = --num1;
		/*
		 1. num1의 값이 먼저 1 감소
		 2. 감소된 num1이 num3에 대입
		 num1 = 7, num2 = 8, num3 = 7
		 */ 
		System.out.println("전위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d %n%n",num1, num2, num3);
		
		num1 =7; // num1 = 7, num2 = 8, num3 = 7
		num2 = num1++; /*
		 1. num1의 값이 num2에 먼저 대입
		 2. num1의 값이 1 증가
		 num1 = 8, num2 =7 , num3 = 7 
		*/
		num3 = num1--;/*
		 1. num1의 값이 num3에 먼저 대입
		 2. num1의 값이 1 감소
		 num1 = 7, num2 =7 , num3 = 8 
		*/
		System.out.println("후위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d %n%n",num1, num2, num3);

	}

}
