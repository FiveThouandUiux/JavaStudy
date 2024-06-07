package ex10accessmodifier.sub;

/*
  E01AccessModifier1 클래스와 선언된 패키지만 다르고 모든 내용이 동일하게 작성된 클래스
 */
class DefaultClass2 {
	
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc() 메소드 호출");
	}
}

public class E01AccessModifier2 {

	//멤버 변수 : 3가지 접근 지정자 사용
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	//멤버 메소드 : 3가지 접근 지정자 사용
	private void privateMethod() {
		privateVar = 400;
		System.out.println("priateVarMethod() 메소드 호출");
	}
	
	void defaultMethod() {
		privateVar = 500;
		System.out.println("defaultMethod() 메소드 호출");
	}
	
	public void publicMethod() {
		privateVar = 600;
		System.out.println("publicMethod() 메소드 호출");
		privateMethod();
	}
	
}
