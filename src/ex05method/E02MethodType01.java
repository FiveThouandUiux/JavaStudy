package ex05method;

/*
  Method(메소드, 함수) :
   객체지향 프로그래밍에서 행동 혹은 동작ㅇ을 의미
   어떤 하나의 업무를 처리하기 위한 모듈(부속품)
   메소드는 반드시 class 내부에 정의
   메소드 내부에 또 다른 메소드를 정의 불가(에러 발생)
   반환값이 없다면 void로 반드시 명시
   메소드명은 변수명과 동일한 규칙으로 작성
   
 JAVA Naming Rule(이름 작성 규칙)
  - 클래스명 : GoodMorning -> 대문자로 시작하는 Camel case
  - 메소드 혹은 변수명 : goodMorning => 소문자로 시작하는 Camel case
  - 상수명 : GOOD_MORNING -> 전체를 대문자로 작성하며 연결부위는 _(언더바) 사용
  - 패키지명 : good.morning -> 전체를 소문자로 작성하며 연결부위는 .(점) 사용
 */

/*
  메소드 형태1] 매개변수도 없고 반환값도 없는 메소드 
  : 둘 다 없는 형태의 메소드로 주로 메뉴를 출력하거나 하는 단순 출력 기능으로 사용
 */
public class E02MethodType01 {
	
	static void menuPrint() {
		System.out.println("==메뉴를 선택하세요==");
		System.out.println("1.열기, 2계속하기, 3.종료");
		System.out.println("=====================");
	}
	
	static void returnError() {
		int returnValue = 10;
		System.out.println("[Return문 이전]");
		
		// 이와같이 메솓, 중간에 return을 기술하면 즉시 종료되며 아래의 코드는 미실행
		// return은 반드시 조건문과 함께 기술
		// 메소드의 마지막 라이넹 기술한다면 조건문 없이도 사용 가능
//		return;
		
		// 이와같이 return문이 중간에 있으려면 조건부로 기술
		if(returnValue%2==0) {
			System.out.println(returnValue + "는 짝수" );
			//메소드에서 return은 종료를 의미
			return;
		}
		
		System.out.println(returnValue+"는 홀수");
		System.out.println("[return문 이후]");
	}

	public static void main(String[] args) {
		menuPrint();
		returnError();

	}

}
