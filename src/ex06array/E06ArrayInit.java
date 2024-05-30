package ex06array;

public class E06ArrayInit {

	public static void main(String[] args) {
		/*
		 1차원, 2차원 배열은 크기가 지정된 경우 전체 원소가 0으로 초기화
		 만약 double 타입이라면 0.0으로 초기화 진행
		 */
		System.out.println("배열 선언 후 초기화 하지 않은 상태");
		//1차원배열 생성 및 출력
		int[] arr = new int[3];
		System.out.println("arr[0]="+arr[0]); // 0 출력
		
		//2차원배열도 동일한 결과가 출력
		int[][] arr2 = new int[3][4];
		System.out.println("arr2[0][0]="+arr2[0][0]); // 0 출력
		
		System.out.println("배열 선언과 동시에 초기화 한 상태");
		
		//3개의 원소로 초기화 되었으므로 크기는 3인 배열 생성
		int[] arrDim = {1,2,3};
		System.out.println("arrDim[0]="+arrDim[0]); // 1 출력
		
		/*
		 2차원 배열은 가장 큰 행과 열에 의해 전체크기가 결정
		 빈 공간이 발생할 수 있으므로 이 경우, null값이 설정
		 출력시 예외(에러) 발생
		 */
		int[][] arr2Dim= {
				{1},
				{2,3}
		};
		System.out.println("arr2Dim[0][0]="+arr2Dim[0][0]);// 1 출력
//		System.out.println("arr2Dim[0][1]="+arr2Dim[0][1]);// 예외(에러) 발생
	}

}
