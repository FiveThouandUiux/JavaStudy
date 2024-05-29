package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
  do-while문 :
   반드시 한번은 실행해야 할 경우 사용하는 반복문으로 조건검사없이 무조건 한 번 실행
  형식] 
   반복을 위한 변수;
   do{
   	실행문;
   	증감식;
   	} while(조건식); <= 세미콜론으로 끝 표시
 */
public class E04DoWhile {

	public static void main(String[] args) throws IOException {
		//시나리오] E03 예제의 1-10까지의 더하는 수열문제를 d0-while문으로 변경하여 구현하시오
		// 누적합과 반복을 위한 변수 생성
		int sum = 0;
		int i=1;
		// 조거검사 없이 무조건 진입해서 실행
		do {
			//증가하는 변수 i를 누적해서 sum에 더함
			sum += i;
			i++;
			//탈출의 조건을 위해 증가 시킨 후 확인
		} while(i<=10);
		System.out.println("1-10까지의 누적합 : " + sum); // 누적합 : 55
		
		
		// 시나리오] 1부터 1000까지의 정수 중 4의 배수이거나 7의 배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오
		//단, do-while문 사용
		int total = 0;
		int j = 1;
		do {
			//4 혹은 7의 배수인지 확인
			if(j%4==0 || j%7==0) {
				System.out.println("j="+j);
				//증가하는 j를 누적해서 더해준다
				total += j;
			}
			j++;
			//앞의 문장을 먼저 실행한 후 탈출 조건을 확인
		} while(j<=1000);
		System.out.println("1-1000사이 4 또는 7의 배수합 : " + total); //배구합 : 178931
		
		
		// 시나리오] 국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 A-F학점을 판단하여
		// 출력하는 프로그램을 작성하시오
		// 단, 사용자가 X,x(대소문자 구분없음)을 입력하면 프로그램이 종료되어야 하며 do-while문으로 구현해야한다.
		//사용자로부터 점수를 입력받기 위해 인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		//저무와 탈출 문자 입력을 위한 변수 선언 
		int kor, eng, math, avg;
		int exitCode;
		do {
			//조건 확인없이 진입하여 점수를 입력받음
			System.out.print("국어점수는 : ");
			kor = scanner.nextInt();
			System.out.print("영어점수는 : ");
			eng = scanner.nextInt();
			System.out.print("수학점수는 : ");
			math = scanner.nextInt();
			
			/*
			 switch문은 조건식은 사용할 수 없고, 산술식만 사용할 수 있으므로
			 평균점수의 구간을 설정하기 위해 10으로 나누는 연산을 추가
			 */
			avg = (kor+eng+math) / (3*10);
			switch(avg) {
				case 10: case 9:
					System.out.println("A학점");break;
				case 8:
					System.out.println("B학점");break;
				case 7:
					System.out.println("C학점");break;
				case 6:
					System.out.println("D학점");break;
				default:
					System.out.println("F학점");
			}
			System.out.println("종료하려면 X(x)를 입력하세요.");
			System.out.println("계속하려면 아무 키나 입력하세요.");
			exitCode = System.in.read();
		}while(!(exitCode=='x' || exitCode=='X'));
		/*
		 x를 입력한 경우
		 	!(true || false) => !(true) => false
		 	false가 대입되므로 while문을 탈출
		 
		 a를 입력한 경우
		 	!(false || false) => !(false) => true
		 	true가 대입되므로 반복문의 처음으로 리턴
		 */
	}

}
