package ex03operator;

public class E05ShortCircuitEvaluation {

	public static void main(String[] args) {
		
		/*
		  SCE(Short-Circuit-Evaluation) :
		   하나의 조건검사만으로 결과를 알 수 있는 경우, JAVA 컴파일러는 뒤의 조건을 검사하지 않고 스킵
		    변수의 값이 변경되는 코드가 있으면 실행되지 않으므로 주의
		 */
		int num1=0, num2=0;
		boolean result;
		
		/*
		  논리And의 경우 둘 중 하나만 false면 무조건 false를 반환
		  첫번째 조건이 false면 두번째 조건은 검사 미실행
		 */
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result="+result);
		// num2는 초기값인 0을 유지
		System.out.println("num1="+num1+", num2="+num2);
		
		/*
		  논리Or의 경우 둘 중 하나만 true면 주조건 true 반환
		   첫번째 조건에 true면 두번째 조건 미실행
		 */
		result = (num1+=10)>0 || (num2+=10) >0;
		System.out.println("result="+result);
		// num2는 증가자히 않으므로 num2가 프로그램의 실행결과에 영향을 미칠 수 있다면 주의
		System.out.println("num1="+num1+", num2="+num2);
		
	}

}
