package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
/*
 두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
인수(파라메타)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
 */
	static void arithmetic() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 정수 값을 입력하세요");
		int first = scanner.nextInt();
		System.out.println("첫번째 정수 값을 입력하세요");
		int second = scanner.nextInt();
		
		System.out.println("덧셈 : " + (first+second));
		System.out.println("뺄셈 : " + (first-second));
		System.out.println("곱셈 : " + (first*second));
		System.out.println("나눗셈 몫 : " + (first/second));
		System.out.println("나눗셈 나머지 : " + (first%second));
	}
	public static void main(String[] args) {
		arithmetic();
	}

}
