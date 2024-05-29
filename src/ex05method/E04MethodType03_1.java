package ex05method;

import java.util.Scanner;

/*
  메소드 형식3] 매개변수는 있으나 반환값은 없는 경우
   : 값을 전달받은 후 연산하고 해당 결과를 반환하지 않고 즉시 출력하는 경우
   값을 소비하는 형태의 메소드
 */

public class E04MethodType03_1 {

		/*
		 시나리오] 사용자가 입력한 2개의 시작값과 끝값 사이에 있는 수를 모두 더하여 출력하는 프로그램을 작성하시오
		 출력겨로가]
			 시작값 : 5
			 종료값 : 9
			 결과 : 5+6+7+8+9=??
		 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작값 : ");
		int s = scanner.nextInt();
		System.out.print("시작값 : ");
		int e = scanner.nextInt();
		/*
		  반환값이 없는 메소드이므로 단독적으로 호출
		  앞에서 입력받은 2개의 정수를 인수(arguments)로 전달
		 */
		myWantSum(s,e);
	}
	
	/*
	 main메소드에서 호출시 전달한 2개의 인수를 매개변수를 통해 순서대로 받는다
	  매개변수는 해당 메소드에서 즉시 사용 가능한 지역변수
	 */
	static void myWantSum(int startNum, int endNum) {
		/*
		 1에서 10까지의 합을 구하는 수열프로그램을 시작값과 종료값만 변수로 변경하여
		  원하는 구간의 합을 구하는 프로그램 커스터마이징 재정
		 */
		int sum=0;
		for(int i=startNum; i<=endNum; i++) {
			sum +=i;
		}
		//결과는 반환하지 않고 즉시 출력
		System.out.printf("%d~%d까지의 합은 : %d",startNum,endNum,sum);
	}

}
