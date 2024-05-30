package ex05method;

/*
 매소드 오버로딩(Method OVerloading)
 : 동일한 이름의 메소드를 2개 이상 정의
 - 매개변수의 갯수가 다르거나 자료형이 다를 때 성립
 - 반환타입만 다른 것을 불허용
 - 컴파이럴는 메소드 호출시 전달되는 인수를 통해 호출할 메소드 구분
 */
public class E07Overloading {
	//주민번호와 군번을 매개변수로 정의한 메소드(남성 표현)
	static void person(int juminNum, int milNum) {
		System.out.println("군필자 이시군요!");
		System.out.println("주민번호:"+juminNum);
		System.out.println("군번:"+milNum);
	}
	
	//주민번호만 있는 메소드(여성 표현)
	static void person(int juminNum) {
		System.out.println("미필자이거나 여성이시군요");
		System.out.println("주민번호 : " +juminNum);
	}
	
	/*
	 해당 메소드는 앞에서 선언한 것과 반환 타입만 다른 경우이므로 person(10)으로 호출 했을 때
	 어떤 메소드를 호출할지 애매하므로 에러 발생
	 */
//	static int person(int juminNum) {
//		System.out.println("미필자이거나 여성이시군요");
//		System.out.println("주민번호 : " +juminNum);
//		return 1;
//	}

	public static void main(String[] args) {
		//인수의 갯수를 통해 호출한 메소드를 구분
		//매개변수가 2개인 메소드 호출(남성)
		person(123456, 7890123);
		System.out.println("====================");
		//매개변수가 1개인 메소드 호충(여성)
		person(987654);
		
		/*
		 출력을 위해 사용하는 print()가 대표적인 오버로딩으로 정의된 메소드
		 정수, 실수, 문자 등 모든 타입에 대해 출력
		*/
		System.out.println(10);
		System.out.println(3.14);
		System.out.println('a');
		System.out.println("오버로딩");
		System.out.println(true);

	}

}
