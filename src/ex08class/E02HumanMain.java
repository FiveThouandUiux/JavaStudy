package ex08class;

/*
 해당 예제에서는 Human클래스를 별도의 파일로 작성
 동일한 패키지에 정의되었다면 컴파일러는 해당 클래스를 찾아 즉시 인스턴스화 할 수 있다
 만약 다른 패키지에 선언된 클래스라면 반드시 import 선언이 필수
 */
public class E02HumanMain {

	public static void main(String[] args) {

		/*
		 1. 클래스를 통해 인스턴스를 생성.
		  참조변수(인스턴스형 변수)는 스택영역에 인스턴스는 힙영역에 생성
		 */
		Human human = new Human();
		
		/*
		 2. 인스턴스 초기화 : 참조변수를 통해 .(닷)으로 접근할 수 있다.
		  여기서 멤버변수의 초기값을 할당
		 */
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		
		/*
		 3. 멤버메소드를 호출
		  이를 통해 걷가, 먹다 등의 동작을 실행
		 */
		human.showState(); //인스턴스의 초기상태 확인
		human.eating();
		human.Walking();
		human.thinking();
		human.showState();//메소드 호출 후의 상태 확인
		
		/*
		 4. 반복문을 통해 메소드를 여러번 호출
		  시나리오의 조건이 정확히 구현되었는지 확인
		 */
		for(int i=1; i<=20; i++) {
			human.Walking();
		}
		human.showState();
		
		for(int i=1; i<=20; i++) {
			human.eating();
		}
		human.showState();
	}

}
