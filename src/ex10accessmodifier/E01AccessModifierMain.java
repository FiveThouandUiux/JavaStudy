package ex10accessmodifier;

/*
 이 클래스는 sub패키지에 정의되었으므로 사용을 위해서는 반드시 임포트 해야 한다.
 */
import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {

	public static void main(String[] args) {
		
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		/*
		 동일한 패지키에 선언된 클래스이므로 import 없이 인스턴스를 생성할 수 있다.
		 */
		E01AccessModifier1 one = new E01AccessModifier1();
		
		/*
		 private으로 선언된 멤버는 동일한 패키지에 선언하더라도 접근 할 수 없다.
		 동일한 클래스 내에서만 접근을 허용
		 */
//		System.out.println("one.privateVar="+one.privateVar);
		//동일한 패지키이므로 접근 가능
		System.out.println("one.defaultVar="+one.defaultVar);
		//접근범위가 없으므로 어디서든 접근 가능
		System.out.println("one.publicVar="+one.publicVar);
		
		//멤버 메소드도 접근범위는 멤버변수와 동일
//		one.privatemethod();
		one.defaultMethod();
		one.publicMethod();
		
		/*
		 동일한 패지키에 선언된 클래스이므로 import 없이 인스턴스 생성이 가능하다
		 */
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		
		//////////////////////////////////////////////////////////
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		E01AccessModifier2 two = new E01AccessModifier2();
		
		/*
		 다른 패키지에 선언된 클래스이므로 인스턴스 생성을 위해 import선언을 해야한다
		 import 선언 시 접근할 수 잇는 것은 public이고 private와 default는 접근할 수 없다
		 */
		//private는 동일한 클래슨 내에서만 접근을 허용
//		System.out.println("two.privateVar="+two.privateVar);
		//default는 동일한 패키지 내에서만 접근을 허용
//		System.out.println("two.defaultVar="+two.defaultVar);
		System.out.println("two.publicVar="+two.publicVar);
		
		
//		two.privatemethod();
//		two.defaultMethod();
		two.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		/*
		 다른 패키지에 선언된 default 클래스이므로 인스턴스 생성이 불가능
		 import 자체도 불가능하므로 아예 사용할 수 없는 클래스가 된다
		 */
//		new DefaultClass2().myFunc();
	}

}
