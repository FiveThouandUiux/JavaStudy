package ex03operator;

public class E01ArithOperator {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("덧셈"+(num1+num2));
		System.out.println("뺄셈"+(num1-num2));
		System.out.println("곱셈"+(num1*num2));
		/*
		  나눗셈 연산이라 할지라도 정수와 정수의 연산의 결과는 정수가 나오며
		   실수의 결과를 얻기 위해서는 실수와의 연산을 진행하거나 강제형변환이 필요
		 */
		System.out.println("나눗셈(몫)"+(num1/num2));
		System.out.println("나눗셈(나머지)"+(num1%num2));
		
		// 곱샘과 나눗셈이 덧셈, 뺄셈보다 우선순위가 높음
		int result = 3 * 2 + 5 % 2 -6 / 3 * 5;
		System.out.println("결과는?"+result);
	}

}
