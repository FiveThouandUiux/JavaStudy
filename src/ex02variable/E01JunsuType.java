package ex02variable;

public class E01JunsuType {

	public static void main(String[] args) {
		
		/*
		 정수자료형 
		  - byte, short, int, long 타입(형)
		  - 각 자료형의 표현범위는 교안을 참조
		  - 일반전으로 CPU(중알처리장치)는 정수형 연산을 할때 int 타입을 가장 빠르게 처리
		  - 정수형 변수를 사용할 때는 거의 대부분 int 타입을 사용
		 */
		
		// int 타입 변수를 선언한 후 초기값 할당
		int int1 = 100;
		int int2 = 200;
		// 300의 결과값이 변수(reuslt1)에 할당
		int result1 = int1 + int2;
		// int 타입끼리 연산은 int형의 결과가 반환
		System.out.println("int1 + int2 = " + result1);
		
		/*
		 100 / 200의 결과는 0이 나온다.
		 Java에서 정수와 정수의 연산결과이므로 정수로 반환
		 실수의 결과를 반환을 받고 싶으면 타입 변환(Type Casting) 필수
		 */
		result1 = int1 / int2;
		System.out.println("int1 + int2 = " + result1);
		
		/*
		 - 동일한 타입의 션수를 2개 이상 선언 할 때는 컴마를 이용해 사용 가능
		 - CPU는 정수의 연산인 경우 int 타입에 최적화 되어 있기 때문에
		  int 타입보다 작은 자료형을 연산하면 CPU는 int 타입으로 변환하여 계산
		 - byte, short 타입은 게임 캐릭터의 움직임이나 음원 파일 들을 표현할 때 사용
		 */
		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2;
		System.out.println("byte1 + byte2 = " + result2);
		
		short short1 = 60, short2 = 70;
		int result3 = short1 + short2;
		System.out.println("short1 + short2 = " + result3);
		
		/*
		  - 동일 자료형끼리의 연산은 동일 자료형이 되는것이 원칙
		  - 데이터의 손실(오차)이 있을 수 있기 때문에 큰 자료형과 작은 자료형을 연산하면 큰 자료형으로 자동 형변환
		 */
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1;
		System.out.println("int1 + long1 = " + result4);
		
		result4 = long1 + long2;
		System.out.println("long1 + long2 = " + result4);
		
		/*
		  자바 컴파일러는 정수형 상수를 기본적으로 int 타입으로 간주하기 때문에 
		   아래 정수를 메모리에 로드하는 순간 에러가 발생하므로 접미사(L 또는 l)을 사용하여
		   long 타입의 자료임을 컴파일러에게 알려줘야 한다
		  리터럴(literal) : 할달을 위해 입력되는 숫자를 자료형 기반으로 메모리 로드
		 */
//		long long3 = 2200000000;
		long long4 = 2200000000L;
		long long5 = 2200000000l;
		
		System.out.println("long4 = " + long4);
		
	}

}
