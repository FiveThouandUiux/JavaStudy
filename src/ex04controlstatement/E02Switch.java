package ex04controlstatement;

import java.util.Scanner;

/*
  switch문 
   : if문처럼 조건에 따라 분기하는 제어문으로 정수식의 값과 동일한 부분을 찾아 실행
   switch문에서는 조건문을 사용할 수 없고 산술식 혹은 정수식을 사용
 */
public class E02Switch {

	public static void main(String[] args) {
		
		/*
				  Scanner클래스 : 사용자로부터 입력값을 받기위한 클래스로 해당 클래스의 메소드가 실행되면 잠깐 실행을 중지하고
				  문자열이나 정수를 입력받기 위해 대기
				 */
		Scanner scanner = new Scanner(System.in);
			System.out.print("숫자를 입력하세요");
			// nextInt()는 정수를 입력받기 위하 메소드이므로 문자를 입력하면 예외(에러)가 발생하면서 프로그램 중지
			int iNum = scanner.nextInt();
			System.out.println("입력한 숫자는 : " + iNum);
			scanner.close();
			
			//정수를 3으로 나누면 나머지는 0,1,2만 생성
			int remain= iNum % 3 ;
			switch (remain) {
			case 0: {
				System.out.println("나머지는 0 입니다");
				break;
			}
			case 1: {
				System.out.println("나머지는 1 입니다");
				break;
			}
			default:
				System.out.println("나머지는 2 입니다");
				//default 다음에는 실행할 문장이 없으므로 break 셍략
			}
		
		
		/*
		 switch문 사용시 주의사항
		 - long타입의 변수는 사용 불가
		 - byte,short, int, char, string만 사용
		 - 논리식, 조건식 사용 불가
		 */
//		long ln=100;
//		switch (ln) {
//		case 100: {
//			System.out.println("long 타입 사용");
//		}
//		default:
//			System.out.println("사용 불가");
//		}
		// 조건식은 사용할 수 없으므로 에러발생
//		switch (iNum%3==0) { 
//		System.out.print("논리식 사용 불가");
//		}
		
		// 문자열이나 문자는 사용 가능
		String title = "자바";
		switch (title) {
		case "자바": 
			System.out.println("자바 좋아");
			break;
		
		case "JAVA": 
			System.out.println("JAVA GOOD");
			break;
		}
		
		/*
		  여러 case를 동시에 처리할 때는 break문 없이 case를 나열 
		  if문에서 ||(논리Or)와 같은 기능
		 */
		int season = 5;
		switch (season) {
		case 3: case 4: case 5: 
			System.out.println("봄 입니다");
			break;
		
		case 6: case 7: case 8: case 9: 
			System.out.println("여름 입니다");
			break;
		
		case 10: 
			System.out.println("가을 입니다");
			break;
		
		case 11: case 12: case 1: case 2: 
			System.out.println("겨울 입니다");
			break;
		}
		
		/*
		시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
			프로그램을 작성하시오. 90점이상은 A학점...
			60점 미만은 F학점을 출력하면 된다. 
			단, switch문으로 작성하시오. 
		 */
		
//		int kor=90, eng=70, math=64;
//		double avg = (kor+eng+math) / 3.0;
//		String result;
//		if(avg >= 90) {
//			result = "A";
//		} else if (avg >=80) {
//			result = "B";
//		} else if (avg >=70) {
//			result = "C";
//		} else if (avg >=60) {
//			result = "D";
//		} else {
//			result = "F";
//		}
		
//		switch(result) {
//		case "A": 
//			System.out.println("A학점");
//			break;
//		case "B": 
//			System.out.println("B학점");
//			break;
//		case "C": 
//			System.out.println("C학점");
//			break;
//		case "D": 
//			System.out.println("D학점");
//			break;
//		default :
//			System.out.println("F, 학사경고");
//	
//	}
		int kor=90, eng=70, math=64;
		/*
		  평균점수를 10으로 나눈 몫을 통해 점수의 구간을 특정
		 */
		int avg = (kor+eng+math) / (3*10);
		System.out.println("평균점수 : " + avg);
		switch(avg) {
		case 10: case 9: 
			System.out.println("A학점");
			break;
		case 8: 
			System.out.println("B학점");
			break;
		case 7: 
			System.out.println("C학점");
			break;
		case 6: 
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}
				
	}}
