package ex03operator;

public class E02BokhapOperato {

	public static void main(String[] args) {
		
		/*
		 복합대입 연산자 : 산술연산자와 대입연산자를 연결해놓은 형태로 
		  좌우측의 값을 연산하여 좌측의 변수에 대입하는 구조
		  문법구조상 항상 현재의 타입을 유지하는 특성을 보유
		 */
		double e = 3.1;
		e += 2.1;
		e *= 2;
		e +=e;
		// 변수 e에 값이 누적
		System.out.println("e의 결과값 : " + e);
		
		int n = 5;
		/*
		 정수와 실수를 연산하면 실수의 결과가 나오므로 n에 대입 불가로 에러 발생
		 */
//		n = n*2.7;
		// 위 구문을 정상적으로 처리하게 위해서는 아래와 같이 강제형변환이 필요
		n = (int)(n*2.7);
		/*
		  복합대입연산자를 사용하면 문법구조상 기존 자료형을 그대로 유지하는 특성이 있으므로
		   연산의 결과는 정수로 출력
		 */
		n *= 2.7;
		System.out.println("n의 결과값 : " + n);

	}

}
