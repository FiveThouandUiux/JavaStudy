package ex05method;

public class E08RecursiveError {

	public static void main(String[] args) {
		showHi(3);
	}
	
	public static void showHi(int cnt) {
		System.out.println("Hi");
		System.out.println("cnt="+cnt);
		/*
		 해당위치에서는 에러 발생
		 if문 상단에서 재귀호출 되므로 if문 블럭이 미실행
		 if문 하단으로 호출문장을 이동
		 */
//		showHi(--cnt);
		if(cnt==1) {
			return;
		}
		showHi(--cnt);
	}
	
	/*
	 StackOverfleow : 스태오버플로우, 스택은 함수가 종료되기 전까지으; 모든 정보를 저장하느 메모리
	 	무한한 공간이 아니므로 무란루프게 빠지게 되면 저장능력을 초과하므로 해당 예외(에러)가 발생
	 */

}
