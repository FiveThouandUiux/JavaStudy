package ex04controlstatement;

/*
  else문에 조건식이 들어가면 에러 발생으로 주의
 */
public class E01If03 {

	public static void main(String[] args) {
		/*
		 시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는 프로그램을 작성하시오.
		  90점 이상은 A, 60점 미만은 F 출력
		 */
		// 점수는 소수자리가 없으므로 정수타입으로 할당
		int kor = 99, eng=70, math=64;
		/*
		 평균값은 소수점이 나올 수 있으므로 double 타입(실수)으로 선언
		 double의 결과를 얻기 위해 3.0으로 나눠준다
		 */
		double avg=(kor+eng+math)/3.0;
		System.out.println("평균점수는(그대로):"+avg);
		System.out.printf("평균점수는(소수2자리):%.2f\n",avg);
		
		if(avg>=90) {
			System.out.println("A");
		} else if (avg>=80) {
			System.out.println("B");
		}else if (avg>=70) {
			System.out.println("C");
		}else if (avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F, 학사경고");
		}
		
		System.out.println("잘못된 조건식의 if문");
		/*
		 앞에서 작성한 if문에서 조건의 순서만 변경되었지만
		  60점 이상이라는 조건에 만족하기 땨문에 높은 점수라도 모두 D가 출력
		 문법적이 오류가 없지만 논리적 오류가 발생하므로 주의
		 */
		if(avg>=60) {
			System.out.println("D");
		} else if (avg>=70) {
			System.out.println("C");
		}else if (avg>=80) {
			System.out.println("B");
		}else if (avg>=90) {
			System.out.println("A");
		}else {
			System.out.println("F, 학사경고");
		}
	}

}
