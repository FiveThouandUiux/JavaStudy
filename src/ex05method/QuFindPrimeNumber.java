package ex05method;

import java.util.Scanner;

/*
 전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고,
  이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.
  메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기 자신밖에 없는 수.

 */
public class QuFindPrimeNumber {
	
	static void isPrimeNumber(int a) {
		boolean b = false;
	
		if(a==2 || a==3 || a==5 || a==7) {
			 b = true;
		} else if (a==1 || a%2 == 0 || a%3==0 || a%5==0 || a%7==0) {
			 b = false;
		} else {
			b = true;
		}
		
		System.out.println(b ? "소수 입니다" : "소수가 아닙니다") ;
	
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int cnt = scanner.nextInt();
		
		isPrimeNumber(cnt);
		
		System.out.println("1-100까지 소수");
		for(int i=1; i<=100; i++) {
			if(i==2 || i==3 || i==5 || i==7) {
				 System.out.println(i);
			} else if (i!=1 && i%2 != 0 && i%3!=0 && i%5!=0 && i%7!=0) {
				 System.out.println(i);
			}
		}
		
		}
	}


