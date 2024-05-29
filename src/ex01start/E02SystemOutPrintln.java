package ex01start;

/*
 println() : 내용을 출력한 후 자동으로 줄바꿈 처리
 print() : 출력 후 줄바꿈 처리를 하지 않으므로 줄바꿈이 필요하면 '\n'사용
 printf() : 출력 내용을 서식에 맞춰 출력, 또한 자체적인 줄바꿈 기능이 없으므로 \n 혹은 %n(printf만 사용) 사용
  변수를 출력 서식문자 : %d, %f 등
 */

public class E02SystemOutPrintln {

	public static void main(String[] args) {
		
		//정수형 변수를 선언한 후 100으로 초기화
		int num1 = 100;
		
		//문자열과 정수형 변수를 +기호를 통해 연결한 후 출력
		System.out.println("num1 = " + num1); //println : 자동줄바꿈
		System.out.print("num1 = " + num1 + "\n");//print : 줄바꿈 없이 출력, 줄바꿈은 '\n' 사용
		System.out.printf("num1 = %d%n", num1);//printf : (현식문자열,값1,...)
		
		//정수, 실수를 단순히 출력
		System.out.println(7);
		System.out.println(3.14);
		
		/*
		print()문에서 +기호의 역할
		1. 숫자(정수 혹은 실수)끼리의 실제 덧셈 연산
		2. 문자열, 숫자 등 서로 자료형이 다른 데이커끼리는 단순 연결 기능만 제공
		 */
		System.out.println(3+5); //8
		System.out.println(3.5 + 5.1); //8.6
		
		/*
		 숫자와 문자열 혹은 문자열과 문자열은 단순 연결해서 출력
		 */
		System.out.println("3+5 = " + 8);
		System.out.println(3.15 + "는 실수 입니다.");
		System.out.println("3+5"+"의 연산 결과는 8입니다");
		
		//앞에서 정수형으로 선언한 변수를 이용해서 값을 출력
		//문자열 + 정수 + 문자열이므로 연결해서 출력
		System.out.println("num1은 " + num1 + " 입니다.");
	}

}
