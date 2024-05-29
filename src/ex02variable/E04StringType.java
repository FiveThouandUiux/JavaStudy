package ex02variable;

public class E04StringType {

	public static void main(String[] args) {
		
		/*
		 String 클래스 : 참조형 변수로서 기본자료형이 아닌 클래스로 문자열을 저장 및 조작
		  JAVA에서 "으로 사용하며 연결시에는 +기호를 사용
		 */
		int number;
		number = 99;
		
		/*
		 클래스를 통해 생성한 참조형 변수와 기본자료형 사이에서는 서로 사용하는 메모리 공간이 다르므로 형변환이 불가
		  - 기본자료형 : Stack(스택) 영역 사용
		  - 참조형(클래스)변수 : Heap(힙) 영역 사용
		 */
		// 아래 2개의 문장은 위 주석과 같은 이유로 에러 발생
//		int stringNumber1 = (int)"100";
//		String stringNumber2 (String)100;
		
		// String + int는 연산되지 않고 단순 연결되어서 출력
		String strNumber = "100";
		System.out.println(strNumber + number);
		
		// String 클래스는 new를 사용해서 변수 생성이 가능
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		// String 변수는 주로 "(double Quotation)을 통해 사용
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		// +기호를 사용하여 문자열과 문자열을 연결
		System.out.println(stringBasic + " " + plusString);
		
		/*
		 문자열+정수 : 우선순위가 없다면 일반적으로 문자열 출럭되지만 소괄호()를 사용하여 우선순위를 주면 산술연산 출력 가능
		 */
		int kor = 100, eng = 99, math = 98;
		// 1009998 형태로 출력
		System.out.println("총점 : " +kor+eng+math );
		// 소괄호가 들어가므로 우선순위인 덧셈 훔 결과인 297 출력
		System.out.println("총점 : " +(kor+eng+math));

	}

}

