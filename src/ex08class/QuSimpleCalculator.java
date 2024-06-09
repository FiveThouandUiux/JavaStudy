package ex08class;

class CalculatorEx {
	double addResult, minResult, mulResult, divResult;
	int addCnt=0, minCnt=0, mulCnt=0, divCnt=0;
	double num1, num2;
	double add (double num1, double num2) {
		  addCnt ++;
		  return addResult = num1 + num2;
	}
	
	double min (double num1, double num2) {
		  minCnt ++;
		  return minResult = num1 - num2;
	}
	
	double mul (double num1, double num2) {
		  mulCnt ++;
		  return mulResult = num1 * num2;
	}
	
	double div (double num1, double num2) {
		  divCnt ++;
		  return divResult = num1 / num2;
	}
	
	void init() {
		addResult=0;
		minResult=0;
		mulResult=0;
		divResult=0;
	 }
	
	void showOpCount() {
		System.out.println("덧셈횟수 : " + addCnt);
		System.out.println("뺄셈횟수 : " + minCnt);
		System.out.println("곱셈횟수 : " + mulCnt);
		System.out.println("나눗횟수 : " + divCnt);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = "+ cal.add(1, 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}

}
