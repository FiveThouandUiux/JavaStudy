package ex06array;

/*
  Call By Reference(참조의 의한 호출)
  : 메소드를 호출할때 참조값을 전달함으로서 서로 다른 지역에서도 동일한 메모리(Heap)를 참조할 수 있게 하는 호출 방식
  메소드의 지역이 다르더라도 참조값을 통해 인스턴스를 참조하게 되므로 A지역에서의 값의 변경이 B지역에서도 그대로 참조
  참조값만 전달하므로 프로그램의 퍼포먼스(성능)도 향상되고 메모리도 절약이 가능
 */
public class E04CallByReference {

	public static void main(String[] args) {
		//크기가 2인 정수형 배열을 생성한 후 초기화
		int[] arr = {100, 200};
		System.out.println("[메인메소드]-Swap전 출력");
		//출력1 : 100, 200
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		//배열 인스턴스의 참조값을 인수로 전달
		callByReference(arr);
		
		/*
		 지역은 달라도 참조값을 통해 동일한 메모리를 참조
		 동일한 출력결과가 나온다.
		 출력3 : 200, 100
		 */
		System.out.println("[메인메소드]-Swap 이후 출력");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	static void callByReference(int[] ref) {
		/*
		 매개변수를 통해 전달바든 배열 인스턴스의 참조값을 통해 0번 인자와 1번 인자를 서로 교환
		 배열에 저장된 값이 서로 교환
		 */
		int temp;
		temp=ref[0];
		ref[0]=ref[1];
		ref[1]=temp;
		
		System.out.println("[callByReference메소드]-Swap이후 출력");
		//출력2 : 200, 100
		for(int i=0; i<ref.length; i++) {
			System.out.println(ref[i]+" ");
		}
		System.out.println();
	}
	

}
