package ex05method;
/*
  재귀메소드(REcursive method)
  : 하나의 메소드에서 자신을 재귀적으로 호출하여 작업을 수행하는 방식
  반복만과 같은 형태로 동작하며 순환호출이라고 표현
 */
public class E08RecursiveMethod {
	static int factorial(int number) {
	int result;
	if(number==1) {
		/*
		  매개변수의 값이 1인경우 1을 반환
		  더이상 재귀호출은 하지 않는다
		 */
		result = 1;
	} else {
		//1이 아닌 경우에는 자신의 매소드를 재호출
		result = number * factorial(number-1);
	}
	
	System.out.println( "계산과정:numver="+number+", result="+result);
	return result;
	}
	public static void main(String[] args) {
		System.out.println("재귀함수를 이요한 팩토리얼 구하기");
		System.out.println("4factorial:"+factorial(4));
		System.out.println("10factorial:"+factorial(10));
	}

}
