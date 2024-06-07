package ex12inheritance;

class A {
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
}

class B extends A {
	//오버라이딩으로 재정의 된 메소든
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod");
	}
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod");
	}
}

class C extends B {
	@Override
	public void rideMethod() {
		System.out.println("C의 rideMethod");
	}
	public void loadMethod(double num) {
		System.out.println("C의 loadMethod");
	}
}
public class E07RideAndLoad01 {

	public static void main(String[] args) {
		
		/*
		 부모타입의 참조변수로 자식 인스턴스를 참조할 수 있으므로 아래 문장은 모두 정상적으로 실행
		 */
		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		/*
		 참조변수에 상관없이 항상 최하위에 오버라이딩된 메소드가 호출
		 아래 부분은 모두 C클래스에 정의된 rideMethod()가 호출
		 오버라이딩은 참조변수의 영향을 받지 않는다
		 */
		System.out.println("오버라이딩 처리된 메소드");
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		
		System.out.println("오버라이딩 처리된 메소드");
		/*
		 c타입의 참조변수를 통해서 인스턴스를 참조하면 모든 영역에 접근 가능
		 아래 3개의 문장은 모두 실행
		 */
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);
		
		/*
		 B타입으로는 접근 범위가 B클래스까지로 제한되므로 C에 정의된 메소드 호출 불가
		 */
		ref2.loadMethod();
		ref2.loadMethod(1);
//		ref2.loadMethod(1.1);
		
		/*
		 A타입으로는 접근 범위가 A클래스까지로 제한되므로 B와 C에 정의된 메소드ㄹ는 호출 불가
		 */
		ref1.loadMethod();
//		ref1.loadMethod(1);
//		ref1.loadMethod(1.1);
		
		
/////////////////////////////////////////////////////////////////////////////////////
		/*
		 부모의 참조변수로 자식의 인스턴스를 참조할 수 있다
		 좌측은 부모, 우측은 자식이므로 모두 가능한 문장이다
		 */
		A refNum1 = new B();
		A refNum2 = new C();
		B refNum3 = new C();
		
		//같은 타입이므로 참조 가능
		C refAddr1 = new C();
		//B타입 -> C타입을 참조하므로 가능
		B refAddr2 = refAddr1;
		//A타입 -> C타입을 참조하므로 가능
		A refAddr3 = refAddr1;
		
		//A -> C 이므로 가능
		A refId1 = new C();
		//B -> A 이므롭 불가능(자식은 부모를 참조할 수 없다)
//		B refId2 = refId1;
		//C -> A 이므로 줄가능(이유 동일)
//		C refId3 = refId1;
		
		/*
		 자식으로 부모 인스턴스를 참조하는 것은 기본적으로 불가능
		 하지만 다운캐스팅(강제형변환)을 하면 참조가 가능
		 부모타입을 자식타입으로 변경하는 것
		 클래스가 상속관계에 있기때문에 가능하고 방식은 기본자료형과 도일하게 소괄호를 이용
		 */
		B refId2 = (B)refId1;
		C refId3 = (C)refId1;
	}

}
