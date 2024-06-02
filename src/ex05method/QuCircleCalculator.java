package ex05method;

/*
 원의 반지름을 인수(파라메타)로 전달하면 원의 넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하시오.
 메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름
 */

public class QuCircleCalculator {
	
	static void  circleArea(double a) {
		double area = 3.14 * a * a;
		System.out.printf("원의 공식 : %.3f\n", area);
	}
	
	static void  circleRound(double b) {
		double round = 2 * 3.14 * b;
		System.out.printf("원의 둘레 : %.2f\n",round);
	}

	public static void main(String[] args) {
		circleRound(5.5);
		circleArea(5.5);
	}

}
