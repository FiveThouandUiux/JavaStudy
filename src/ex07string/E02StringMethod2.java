package ex07string;

public class E02StringMethod2 {

	public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메소드2");
		
		String str1 = "Welcome to java";
		String str2 = "자바야, 놀자!";
		
		// 6] codePointAt(인덱스) : 문자열의 특정 인섹스의 문자를 찾은 후 아스키코드(혹은 유니코드)를 반환
		System.out.println("### 6 ###");
		// 대문자 W : 87
		System.out.println("str1의 첫번째 문자의 아스키코드 : " + str1.codePointAt(0));
		// 한글 '야' : 50556
		System.out.println("str2의 세번째 문자의 아스키코드 : " + str2.codePointAt(2));
		
		// 7] endWith() : 특정 문자열로 끝나면 true를 반환
		// 8] startaWith() : 특정 문자열로 시작하면 true를 반환 
		System.out.println("### 7,8 ###");
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));
		
		
		// 9] format() : 출력형식을 지정하여 문자열로 반환할 때 사용
		//				printf()와 사용법은 동일하고 주로 웹 애플리케이션 제작에 사용
		System.out.println("### 9 ###");
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n",81, 92, 100);
		/*
		  차후 웹 애릎리케이션 제작에서 이와같이 처리하여 웹브라우저에 출력
		 */
		String formatStr = String.format("국어:%d, 영어:%d, 수학:%d\n",81, 92, 100);
		System.out.println(formatStr);
		
		// 10] indexOf() : 문자열에서 특정 문자열의 시작인덱스를 반환
		// 				만약 존재하지 않으면 -1 반환하며 인덱스는 항상 0부터 시작하므로 -1은 문자열이 없다는 의미
		System.out.println("### 10 ###");
		String email = "hong@daum.net";
		System.out.println(str1.indexOf("ava")); // 12
		System.out.println(str1.indexOf("J")); // -1
		System.out.println(email.indexOf("@")!=-1 ? "이메일 형식이 맞음" : "이메일 형식 아님");
	}

}