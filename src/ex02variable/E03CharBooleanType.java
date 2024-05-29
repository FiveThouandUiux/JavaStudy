package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
		
		/*
		 char : 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할 때
		  '(single quotation)으로 사용하여 표현
		  "(double quotation)으로 사용하면 문자열로 인식하므로 string으로 변경하여 선언
		 */
		char ch1 = '가';
		// 믄지열이므로 char 선언 할 수 없으므로 에러 발생
		// 문자열 선언 시 String으로 변경 후 선언 필수
//		char chStr = '가나다라'; 
		String chStr = "가나다라";
		System.out.println("ch1 = " + ch1);
		System.out.println("chStr = " + chStr);
		
		/*
		  아스키코드 : 1byte로 표현할 수 있는 문자로 영문, 숫자를 10진수로 정의한 것
		   ex) A = 65, a =97
		  유니코드 : 1byte로 표현할 수 없는 문자로 영문, 숫자를 제외한 모든 2byte 문자(한글, 한자 등 16진수 표현)
		 */
		// A를 메모리에 65(아스키코드)로 저장 
		char ch2 = 'A';
		// 정수형 변수를 선언 및 초기화
		int num1 = 2;
		// 문자 + 정수 = 65(아스키코드) + 2 = 67 
		// 아스키코드로 저장되므로 연산 가능
		int num2 = ch2 + num1;
		// 정수로 출력하면 67 출력
		System.out.println("num2 = " + num2);
		// 문자로 강제 현변환 후 출력하면 C 출력
		System.out.println("char(num2) = " + (char)num2);
		
		// char + int 연산은 int타입이 char 타입보다 크므로 int 타입으로 출력
		// (char)(char + int => int) => char 타입으로 강제 형변환 
		char ch3 = (char)(ch2 + num1);
		System.out.println("ch3(문자출력) => " + ch3);
		System.out.println("ch3(아스키코드출력) => " + (int)ch3);
		
		// '(single quotation)을 사욯한 문자'1'은 아스키코드의 49에 해당 
		char ch4 = '1';
		// 연산결과는 50으로 아스키코드 50에 해당하는 '2' 출력
		char ch4_1 = '1' + 1;
		// 문자 '2'와 정수 50이 출력
		System.out.println("ch4 = " + ch4 + ", ch4_1 = " + ch4_1 +", ch4_1 = " + (int)ch4_1);

		
		/*
		  boolean 타입 : true 혹은 false 두가지의 값만 가질 수 있는 자료형 
		   산술연산(+, -), 비교연산(<, >=)에서 사용할 수 없으며 논리연산에서만 사용 가능
		 */
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1 = " + bn1 +", bn2 = " + bn2);
		
		/*
		  &&(논리And) : 엠퍼센트를 사용하고 양쪽 모두 참일때 참을 반환, 그 외에는 거짓 반환
		  ||(논리Or) : 파이프를 사용하고 둘 중 하나만 참이어도 참을 반환, 둘 다 거짓일때 거짓 반환
		 */
		// T && F = False를 출력
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3(And) = " + bn3);
		// T || F => True를 출력
		bn3 = bn1 || bn2;
		System.out.println("bn3(Or) = " + bn3);
		
		// 문자 '가'의 유니코드는 44032이므로 true를 출력
		bn3 = '가' > 30000;
		System.out.println("bn3 = " + bn3);
	}

}
