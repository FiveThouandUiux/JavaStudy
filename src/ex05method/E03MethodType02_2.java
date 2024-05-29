package ex05method;

import java.util.Scanner;

public class E03MethodType02_2 {

		//반환 타입이 String이므로 문자열의 결과를 반환
		static String getHakjum() {
			//사용자로부터 입력을 받기위해 인스턴스를 생성
			Scanner scanner = new Scanner(System.in);
			//과목의 점수를 정수형으로 입력
			System.out.print("국어점수 : ");
			int kor = scanner.nextInt();
			System.out.print("영어점수 : ");
			int eng = scanner.nextInt();
			System.out.print("수학점수 : ");
			int math = scanner.nextInt();
			
			//평균값을 구함
			double avg=(kor+eng+math)/3.0;
					String hakjum="";
			int result = (int)avg/10;
			//평균값을 통해 학점을 판단
			switch(result) {
			case 10: case 9:
				hakjum ="A학점"; break;
			case 8:
				hakjum ="B학점"; break;
			case 7:
				hakjum ="C학점"; break;
			case 6:
				hakjum ="D학점"; break;
			default:
				hakjum = "F학점";
			}
			return hakjum;
			}
		
	public static void main(String[] args) {
		/*
		 시나리오] 사용자로부터 국영수 점수를 입력받아 평균을 구한 후 학점을 반환하는 메소드를 정의하싱ㅎ
		 */
		System.out.println("너의 학점은 " + getHakjum()+"이란다");
		
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s 입니다", h);
			
	}//end of main

}//end of class
