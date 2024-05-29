package ex04controlstatement;

/*
 while문 : 반복의 횟수가 명확하지 않은 경우 주로 사용하는 반복문
  반복을 위한 초기값, 조건식, 증감식을 따로 작성하는 형식
 형식] 
 	반복을 위한 변수의 초기값;
 	while(반복의 조건) {
 		실행문장;
 		증감식; <= 조건을 만족하면 반복문 탈출 
 		}
 */
public class E03While {

	public static void main(String[] args) {
//		시나리오] 1-10까지의 합을 구하는 프로그램을 while문으로 작성하시오
		//작성1
		//반복을 위한 변수i를 생성 후 1로 초기화
		int i = 1;
		//i가 10과 같아질 때까지 반복
		while(i<=10) {
			//변수의 증가값을 단순히 출력
			System.out.println("변수 i =" + i);
			//반복문 탈출을 위한 증가식. i가 10이면 반복 중지
			i++;
		}
		
		//작성2 
		//누적 합을 계산하기 위한 변수 생성
		int sum = 0;
		//반복을 위한 초기값 1로 설정
		int j = 1;
		//반복의 조건 : j가 10보다 작으면 같을 때까지 반복
		while(j<=10) {
			//복합대입연산자를 통해 증가하는 j의 값을 sum에 누적하여 더하기
			//sum = sum + j;
			sum += j;
			//반복문 탈출을 위한 증가식 
			j++;
		}
		
		System.out.println("1-10까지의 합 sum = " + sum);
		
//		시나리오] 1-100까지의 정수 중 3의 배수이거나 4의 배수인 정수의 합을 구하는 프로그램을
//		while문을 이용해서 작성하시오
		
		int total = 0;
		int k = 1;
		// k가 100이하 일 때 100과 같아질때까지 반복
		while(k<=100) {
			// 3의 배수 혹은 4의 배수이므로 논리Or를 사용
			if(k%3==0 || k%4==0) {
				total += k;
				// 조건에 맞는 k를 확인 목적으로 출력
				System.out.println("k = " + k);
			}
			k++;
		}
		System.out.println("3 또는 4의 배수의 합 : " + total);
		
//		시나리오] 구구단을 출력하는 프로그램을 while문으로 작성하시오
		int dan = 2;
		while(dan<=9) {
			int su = 1;
			while(su<=9) {
				System.out.printf("%-2d*%-2d=%2d",dan,su,(dan*su));
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n================================\n");
		
//		시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오
//		1 0 0 0
//		0 1 0 0
//		0 0 1 0
//		0 0 0 1
		
		//행으로 4번 반복하기 위한 변수 x 생성
		int x=1;
		while(x<=4) {
			//행이 고정된 상태에서 열을 4번 반복 하기 위한 변수 y 생성
			int y=1;
			while(y<=4){
				//행과 열의 번호가 동일할 때만 1을 출력
				if(x==y) {
					System.out.print("1 ");
				} else {
					//번호가 다르다면 0을 출력
					System.out.print("0 ");
				}
				y++;
			}
			//하나의 행이 출력되면 다음 행을 출력하기 위해 줄바꿈
			System.out.println();
			x++;
		}
		
		
	}
}
