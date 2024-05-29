package ex02variable;

public class E06EscapeSequence {

	public static void main(String[] args) {
		
		//tab(탭) 기능으로 띄워쓰기 4칸
		System.out.println("4월엔 벚꽃~~!");
		System.out.println("4월엔\t벚꽃~~!");
		
		//줄바꿈(New Line) 기능
		System.out.println("Java World에 오신걸 환영합니다\n");
		System.out.println("열심히\n해봅시다");
		
		//문자열 사이에 "(double quotation)을 표현하고 싶을 때 사용
//		System.out.println("나는 "개발자"가 되고싶어요");
		System.out.println("나는 \"개발자\"가 되고싶어요");
		
		// printf(): 문자열을 서식에 맞춰 울력할 때 사용
		int kor=81, eng=97, math=79;
		// 정수는 %d, 줄바꿈은 %n으로 표현
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor, eng, math);
		/*
		 같은 출력 문장이지만 println()을 사용하면 아래와 같이 문자열과 변수를 분리하여 작성해야므로 조금 더 복잡하다
		 */
		System.out.println("\n국어:"+kor+", 영어:"+eng+", 수학:"+math);
		
		/*
		 실수는 %f를 사용하며 정수와 실수의 연산 결과는 실수로 반환되어 double 타입 변수에 대입
		 */
		double avg = (kor+eng+math) / 3.0;
		System.out.printf("평균점수 : %f%n", avg);
		/*
		 자리수 지정하기
		 %4d : 4칸을 확보한 후 정수 출력
		 %6.2f : 전체 자리수 6자리, 소수 이하 2자리로 실수 출력
		  양수는 우측정렬, 음수는 좌측정렬
		 */
		System.out.printf("국어:%d, 영어:%d, 수학:%d" + "평균:%f%n",kor, eng, math, avg);
		System.out.printf("국어:%6d, 영어:%6d, 수학:%6d" + "평균:%7.4f %n",kor, eng, math, avg);
		System.out.printf("국어:%-6d, 영어:%-6d, 수학:%-6d" + " 평균:%-7.2f %n",kor, eng, math, avg);
		
	}
}
