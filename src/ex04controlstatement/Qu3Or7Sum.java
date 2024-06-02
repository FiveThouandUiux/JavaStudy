package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		/*
		 문제1) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 while, do~while, for문으로 각각 작성하시오.
		  단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의 결과는 누적되는 모든 수를 콘솔에 print한다. 
		하나의 파일에 한꺼번에 작성하므로 동일한 결과가 3번 출력됩니다. 
		 */
		int total1 = 0;
		int cnt1 = 1;
		
		while (cnt1 <=100) {
			if(cnt1%3==0 || cnt1%7==0) {
				total1 += cnt1;
//				System.out.println("+ : "+cnt1);
				if(cnt1%3==0 && cnt1%7==0) {
					total1 -= cnt1;
//					System.out.println("- : "+ cnt1);
				}
			}
			cnt1++;
		}
		System.out.println("While 문제 답 : " + total1);
		System.out.println();
		
		int total2 = 0;
		int cnt2 = 1;
		
		do {
			if(cnt2%3==0 || cnt2%7==0) {
				total2 += cnt2;
				System.out.println("+ : "+cnt2);
				if(cnt2%3==0 && cnt2%7==0) {
					total2 -= cnt2;
					System.out.println("- : "+ cnt2);
				}
			}
			cnt2++;
		} while (cnt2<=100);
		System.out.println("do-While 문제 답 : " + total2);
		System.out.println();
		
		
		int total3 =0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 || i%7==0) {
				total3 += i;
//				System.out.println("+ : "+i);
				if(i%3==0 && i%7==0) {
					total3 -= i;
//					System.out.println("- : "+ i);
				}
			}
		}
		System.out.println("for 문제 답 : " + total3);
	}

}
