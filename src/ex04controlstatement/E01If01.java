package ex04controlstatement;

import java.io.IOException;

/*
if문형식 1 
 if(조건문){
 	실행문장;
 	}
 	 - if문의 조건문으 반드시 비교식 혹은 놀리식
 	 - 결과값이 boolean 타입으로 true/false 반환
 	 - 실행할 문장이 하나면 중괄호 생략 가능
*/

public class E01If01 {

	public static void main(String[] args) throws IOException {
		
		
		int num =10;
		
		// 아래 문장의 조건문은 조건식이 아닌 산술식이므로 에러 발생
//		if(num%2) {
//			System.out.println("잘못된 조건식 입니다");
//		} 
//		if(num) {
//			System.out.println("이것도 잘못된 조건식 입니다");
//		}
		
		// if문의 조건은 아래와 같이 boolean값을 반환하는 조건식
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다",num);
		}
		// 2가지 조건 모두 만족하므로 print()문이 실행
		if(num%2==0 && num>=10) {
			System.out.printf("%n%d는 짝수이고 10보다 크거나 같다. %n" , num);
		}
		
		if(true) {
			System.out.println("무조건 실행되는 if문입니다");
		}
		
		/*
		  if(조건식); => 세미콜론은 문장의 끝을 나타내므로 조건에 상관없이 중괄호에 있는 문장이 실행
		 */
		if(num%2 != 0) {
			System.out.printf("%d는 홀수 입니다",num);
		}
		
		/*
		 조건 검사 후 실행할 문장이 1개인 경우에는 중괄호 생략 가능
		 실행문이 2개 이상이라면 한 문장만 if문에 포함되므로 중괄후 필 사용
		 */
		if(num%2 == 0) 
			System.out.printf("%d는 짝수 입니다",num);
		if(num%2 != 0) {
			System.out.println("\n"+num+"입니다");
			System.out.println(num+"은 홀수입니다");
		}
		
		/*
		시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 이용해서 작성하시오.
		참조) System.in.read() : 키보드를 통해 입력한 문자의 아스키코드를 정수형으로 반환하는 메서드. 두글자 이상 입력하더라도 첫번째 문자만 입력된다.  
		 */
		
		System.out.println("하나의 문자를 입력하세요");
		int asciicode = System.in.read();
		System.out.println("입력한 문자는 : " + asciicode);
		
		/*
		  아스키코드를 알고 있을 때의 구현 방법 
		   - 문자 0과 9가 아스키코드 48, 57에 해당되므로 구간 내에 있는 확인
		 */
		if(asciicode>=48 && asciicode<=57) {
			System.out.println("입력한 문자는 숫자 입니다");
		} else {
			System.out.println("입력한 문자는 숫자가 아닙니다");
		}
		
		/*
		 아스키코드를 모를 때 구현하는 방법으로 문자 '0'과 '9'는 메모리에 저장시 아스키코드로 변환되므로
		  아래와 같은 조건으로 확인 가능
		 */
		if(asciicode>='0' && asciicode<=9) {
			System.out.println("입력한 문자는 숫자 입니다[1]");
		} else {
			System.out.println("입력한 문자는 숫자가 아닙니다[1]");
		}

	}

}
