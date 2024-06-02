package ex07string;

import java.util.Scanner;

/*
 사용자로 부터 아이디를 입력받은 후 다음 조건에 만족하는지 확인할 수 있는 프로그램을 작성하시오.
아이디는 8~12자 사이로만 사용할 수 있다. (length() 메서드 활용)
영문과 숫자로만 입력할 수 있다. (charAt() 메서드 활용)
특수기호, 공백, 그 외 모든 문자는 입력할 수 없다. 
위 조건에 만족하면 true, 만족하지 않으면 false를 반환한다. 
메서드명 : boolean idValidate(String inputId)
힌트 : (idChar>='a' && idChar<='z') 이와 같은 조건을 사용하면 된당^^*
실행결과]
아이디를 입력하세요 : kosmo123
사용할 수 있는 아이디입니다. 

아이디를 입력하세요 : ko^smo 99
사용할 수 없습니다.
 */
public class QuValidateId {

	static boolean idValidate(String inputId) {
		boolean use = false;
		if(inputId.length() <= 12 && inputId.length()>=8) {
			for(int i=0; i<inputId.length(); i++) {
				int idChar = inputId.charAt(i);
				if(idChar>='a' && idChar<='z') {
					use =  true;
				} else if (idChar>='A' && idChar<='Z') {
					use = true;
				} else {
					use = false;
				}
			}
		}
		return use;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String id = scanner.nextLine();
		System.out.println(idValidate(id) ? "사용할 수 있는 아이디입니다" : "사용할 수 없습니다");
	}

}
