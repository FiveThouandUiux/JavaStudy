package ex06array;

/*
 Call By Value(값에 의한 호출)
 : 메소드 호출과 관련된 개념으로 매개변수를 통해 값을 전달할때 메모의 '복사'를 통해 값이 전달
  다른 지역의 메소드에서 값이 변경이 있더라도 호출한 메소드의 값에는 무영향
  메모리적 관점에서 보면 스택영역만 사용하는 케이스로 main과 호출된 메소드는 서로 다른 지역이므로 서로에게 무영향
 */
public class E03CallByValue {

	public static void main(String[] args) {
		//main 지역에서 치초로 변수를 생성
		int first=100, second=200;
		//출력1 : 100, 200
				System.out.println("[main메소드 안 호출전]"+"first="+first+", second="+second);
				//매서드 호출시 인수로 값을 전달
				callByValue(first, second);
				
				//출력2 : 매개변수로 전달된 값은 복사되어 다른 지역의 메소드 내에서만 변경되므로 main의 초기값은 그대로 유지
				System.out.println("[main메소드 안 호출후"+"first="+first+", second="+second);
	}
	
	/*
	 매개변수로 전달된 값은 복사되어 해당 지역의 메소드에서 사용
	 매개변수의 전달은 메모리의 복사에 의해 이루어진다
	 */
	public static void callByValue(int fNum, int sNum) {
		/*
		 Swap(교환) : 두개의 변수가 할당받은 값을 서로 교환하는 알고리즘
		  교환시에는 임시변수(temp)가 하나 추가로 필요
		 */
		int temp;
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		/*
		 해당 메소드 내에서는 값의 교환이 완료되었으므로 출력결과는 200, 100이 된다
		 */
		
		System.out.println("[callByValue메소드 안 ]"+"first="+fNum+", second="+sNum);
	}

}
