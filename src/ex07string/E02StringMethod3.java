package ex07string;

public class E02StringMethod3 {

	public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메소드2");
		
		String str1 = "Welcome to java";
		String str2 = "자바야, 놀자!";
		
		// 11] lastIndexOf() : 사용법은 infexOF()와 동일하지만 문자열의 뒤에서부터 찾는 것이 특징
		//						파일의 확장자를 찾아야 하는 업무에서는 뒤에서부터 찾아야 하는 경우가 밣생
		System.out.println("### 11 ###");
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J"));
		System.out.println("indesof : " + str1.indexOf("a"));
		System.out.println("lastIndexOF : " + str1.lastIndexOf("a"));
		
		// 12] replace : 특정 문자열을 찾아서 지정된 문자열로 변경 
		//				찾는 문자열이 없다하더라도 에러가 발생하지 않는다.
		System.out.println("### 12 ###");
		System.out.println("j를 g로 변경하기");
		System.out.println(str1.replace("j", "g"));
		System.out.println("java를 korea로 변경하기");
		System.out.println(str1.replace("java", "korea"));
		
		
		// 13] split() : 문자열을 구분자를 통해 분리해서 String형의 배열로 반환
		//					해당 구분자가 없는 경우에는 크기가 1인 배열로 반환
		System.out.println("### 13 ###");
		String phoneNumber = "010-1234-5678";
		// 전화번호를 -(하이픈)으로 분리하여 크기가 3인 배열로 반환
		String[] phoneArr = phoneNumber.split("-");
		// 배열의 크기만큼 반복하여 분리된 문자열을 출력
		for(int i=0; i<phoneArr.length; i++) {
			System.out.printf("phoneArr[%d]=%s\n",i, phoneArr[i]);
		}
		/*
		 구분자로 사용한 문자열이 없는 경우 문자열 전체가 통째로 반환되어 크기가 1인 배열이 된다.
		 */
		phoneArr = phoneNumber.split("%");
		for(int i=0; i<phoneArr.length; i++) {
			System.out.printf("phoneArr[%d]=%s\n",i, phoneArr[i]);
		}
		
		
		// 14] substring() : 시작인데스와 마지막인덱스 사이의 문자열을 잘라서 반환
		// 방법1 : 인덱스 하나만 사용하면 사용한 인덱스부터 끝까지 잘라낸다
		// 방벙2 : 2개의 인데스를 사용하면 시작과 종료 인덱스가 되므로 해당 구간의 문자열을 잘라낸다.
		System.out.println("### 14 ###");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
	}

}
