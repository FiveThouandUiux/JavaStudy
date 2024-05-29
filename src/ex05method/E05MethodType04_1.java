package ex05method;

import java.util.Scanner;
/*
  메소드 형식4] 매개변수도 있고 반환값도 있는 형식으로 4가지 형식 중에 가장 많이 사용
  
 */
public class E05MethodType04_1 {

	public static void main(String[] args) {
		/*
		 3명의 나이를 입력받은 후 합을 반환받아 출력
		 반환값이 있는 메소드는 주로문장의 우측항이나 출력문의 일부로 사용
		 */
		int sumOfAge = getTotalAge(3);
		System.out.println("입력받은 나이의 합은? " +sumOfAge);
	}
	
	static int getTotalAge(int personCnt) {

	/*
	  시나리오] 인원수를 매개변수로 전달방아 인원수 만큼 나이를 입력ㅂ받아
	  그 나이의 합을 반환하는 메소드를 작성하시오.
	 */
		Scanner scanner = new Scanner(System.in);
		//나이의 합을 저장할 변수
		int sumAge=0;
		// main에서 전달안 힌수 3을 매개변수로 받아 for문에 적용
		for(int i=1; i<=personCnt; i++){
			System.out.print(i+"번째 사람의 나이:");
			int age = scanner.nextInt();
			//입력받은 나이는 변수에 누적해서 합산
			sumAge += age;
		}
		//나이의 합은 호출한 지점으로 반환
		return sumAge;
	}
}
