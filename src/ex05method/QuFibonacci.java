package ex05method;

import java.util.Scanner;

/*
 피보나치 수열은 첫항이 0, 두번째항이 1로 구성되어 이전 2개의 항을 더해서 다음 항을 만들어낸다. 입력한 정수의 갯수만큼 항목을 출력하도록 프로그램을 작성하시오. 
메서드명 : fibonacciProgression()
형식]
첫번째 항 0 / 두번째항 1
세번째항 : 0 + 1 = 1
네번째항 : 1 + 1 = 2
다섯번째항 : 1 + 2 = 3
 */
public class QuFibonacci {

	static void fibonacciProgression(int num) {
		
		int a = 0, b = 1;
		
		for (int i=0; i<=num; i++) {
			if(i==0) {
				System.out.printf("%d ",a);
			} else if(i==1) {
				System.out.printf("%d ",b);
			} 
		}
		for (int j=2; j<num; j++) {
			int sum = a+b;
			System.out.printf("%d ",sum);
			a=b;
			b=sum;
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int cnt = scanner.nextInt();
		
		fibonacciProgression(cnt);
	}

}
