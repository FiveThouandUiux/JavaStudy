package ex02variable;

public class E02SilsuType {

	public static void main(String[] args) {
		
		/*
		 실수 자료형
		  - 0과 1 사이에 무한히 많은 실수가 존재하므로 정수형보다는 실수형이 더 큰 자료형
		  - long(정수형)과 float(실수형)을 연산하면 float의 결과 발생 
		 */
		long long1 = 100;
		float float1 = 200;
		// 실수형으로 자동형변환
		float result1 = long1 + float1;
		// 300.0의 결과가 출력
		System.out.println("long1 + float1 = " + result1);
		
		/*
		 float(실수)와 long(정수)의 연산결과를 정수로 받는 방법
		  1. float를 long으로 강제 형변환 후 연산
		  2. 계산결과 전체를 long으로 강제 형변환
		 */
		long result2 = long1 + (long)float1;
		System.out.println("형변환 후 연산 = " + result2);
		long result3 = (long)(long1 + float1);
		System.out.println("계산 후 형변환 = " + result3);
		
		/*
		 - 실수형의 기본은 double 
		 - 소수점이 있는 데이터의 컴파일러는 무조건 double로 인식
		 - 소수점이 없는 데이터는 float에 대입 가능
		 - 소수점이 있는 데이터를 float에 대입하려면 접미사(F 또는 f)를 붙여야 가능
		 - 형변환 후 대입은 가능하지만 비권장
		 */
		float f3 = 100;
		// 3.14를 double로 인식하므로 에러 발생
//		float f4 = 3.14;
		
		// 강제형변환 후 대입
		float f4 = (float)3.14;
		System.out.println("f4 = " + f4);
		
		// 접미사를 통한 float 타입을 명시(권장) 
		float f5 = 3.14f;
		System.out.println("f5 = " + f5);
		
		// float 타입끼리의 연산은 기본 규칙에 따라 float으로 결과 출력
		float f6 = f3 + f4;
		System.out.println("f6 = " + f6);
		
		// float과 double의 연산은 큰 자료형인 double로 결과 출력
		double d1 = 3.14;
		double d2 = f6 + d1;
		System.out.println("d2 = " + d2);
		/*
		 CPU는 실수의 계산에 기본적인 오차지를 가지고 있으므로 JAVA의 문제가 아니난 컴퓨터 태생적인 문제
		  정확한 계산을 위해서는 약간의 보정이 필요
		 */
	}

}
