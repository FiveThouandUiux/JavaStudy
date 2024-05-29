package ex05method;


/*
  지역변수(Local variable)
   - ㅈ변수는 사용범위(scope)를 가지고 있고 해당 지역에서만 사용 가능
   - 해당 지역을 벗어나면 메모리 삭제
   - 기본자료형은 스택(stack)이라는 메모리 사용
   - Stack은 입구 하나만 있는 컵과 같은 형태이며 선입후출의 특성을 보유
   - Stack은 CPU가 ㅁ모리의 생성 및 소멸을 주관
 */
public class E06LocalVariable {

	public static void main(String[] args) {
		
		boolean scope = true;
		/*
		  main 지역에서 num을 선언하면 그보다 좁은 지역인 if문에서는 가틍 이름의 변수를 선언 불가
		  큰 지역에서 이미 선언되어 메모리에 상주하고 있기 때문에 에러발생
		 */
		// 이 부분을 주석 처리라지 않으면 아래 코드는 에러 발생
//		int num=9;
		/*
		 main보다 좁은 지역인 if문의 블럭을 생성한 후 변수 num을 선언
		 if문과 else문은 서로 다른 지역이므로 동일한 이름의 변수 선언 가능
		 */
		if(scope) {
			int num =1;
			num++;
			System.out.println("첫번째 if문의 지역 : " + num);
		} else {
			int num=5;
			System.out.println("첫번째 if문의 else 지역 : " + num);
		}
		/*
		 if문의 블럭에서 선언된 변수 num은 해당 블럭을 벗어나는 순간 메모리에서 소멸되므로 아래에서 num을 새롭게 선언 가능
		 */
		int num = 100;
		System.out.println("main메소드 지역 : " + num);
	
		simpleFunc();
		
		System.out.println("main메소드 끝");

	}
	
	/*
	  main지역에서 선언한 변수 n um은 메모리에 아직 상주하고 있지만 
	  해당 메소드는 크기가 동일한 다른 지역에 정의되어 있으므로 같은 이름의 변수를 선언 가능
	  앞의 main메소드의 if-else문의 블러도 같은 개념으로 변수 선언이 가능
	 */
	static void simpleFunc() {
		int num= 1000;
		System.out.println("simple 메도스 지역 : " + num);
	}

}
