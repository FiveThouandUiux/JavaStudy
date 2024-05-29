package ex04controlstatement;

public class E01If02 {

	public static void main(String[] args) {
		
		// 120을 2로 나누면 나머지가 0이므로 짝수로 판단
		int num = 120;
		if(num%2 ==0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}
		
		/*
		 삼항연산자(조건연산자) 
		  : if~else문과 동일하지만 짧은 코드로 표현 가능하며 실무에서 자주 사용
		 형식] 변수 = (조건식) ? 참 : 거짓;
		 */
		String numResult = (num%2==0) ? "짝수" : "홀수" ;
		System.out.println("숫자"+num+"은"+numResult);

		/*
		 시나리오] 숫자를 홀/짝인지 먼저 판단한 후
		  100 이상인지를 판단하는 프로그램을 if/else문으로 작성하시오
		 */
		int num2 = 120;
		if(num2%2==0) {
			if(num2>=100) {
				System.out.println("짝수이면서 100이상");
			} else {
				System.out.println("짝수이면서 100미만");
			}
		}else {
			// 포함된 문장이 1문장이므로 중괄호 생략 가능
			if(num2>=100) 
				System.out.println("홀수이면서 100이상");
			 else 
				System.out.println("홀수이면서 100미만");
			
		}
	}

}
