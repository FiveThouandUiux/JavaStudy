package ex08class;

/*
 생성자(Constructor)
  - 클래스를 인스턴스화 할때 자동으로 호출되는 메소드
  - 자동으로 호출되며, 개발자가 임의로 호출할 수 없다
  - 변환값이 없어서 선언시 void를 사용 불가
  - 생성자 내부에서 또 다른 생성자를 호출할 수 있다
  - 오버로딩 가능
 */
public class PersonConstructor {
	
	//멤버변수 선언
	String name;
	int age;
	String addr;
	
	/*
	 개발자가 생성자를 직접 정의하지 않으면 아래와 같이 매개변수와 실행부가 없는 디폴트 생성자가 컴파일러에 의해 자동으로 삽입
	 지금까지 인스턴스 생성시 new 클래스명()과 같이 사용했던 문장이 바로 디폴트 생성자를 호출하는 방식
	 */
	//생성자 메소드
	//public PersonConstructor() {}
	
	//생성자1 : 매개변수가 없는 형태로 정의
	public PersonConstructor() {
		//매개변수가 없으므로 항상 고정된 값으로만 초기화
		name = "이름없음";
		age =1;
		addr ="미상";
		System.out.println("나는 기본 생성자 입니다");
	}
	
	//생성자2 : 매개변수가 있는 형태로 정의
	public PersonConstructor(String name) {
		/*
		 해당 this는 멤버변수와 매개변수를 구분하기 위한 용도로 사용
		 클래스 자신, 즉 멤버를 가리킨다
		 좌측항은 멤버변수, 우측항은 매개변수가 된다.
		 */
		this.name =name;
		age=1;
		addr="출처불명";
		System.out.println("나는 인자생성자[1] 입니다");
	}
	
	//생성자3 
	public PersonConstructor(String name, int age) {
		/*
		 this()는 생성자에서 다른 생성자를 호출할 때 사용
		 단, 생성자 내에서만 사용할 수 있고 일반 멤버메소드에서 사용 불가
		 아래는 매개변수가 3개인 생성자를 호출하는 문장
		 */
		this(name, age, "미상");
		System.out.println("나는 인자생성자[2] 입니다");
	}
	
	//생성자4
	public PersonConstructor(String _name, int age, String addr) {
		//매개변수와 멤버변수명이 다르면 this를 사용하지 않아도 된다
		name=_name;
		//둘의 이름이 동일한 경우에는 this를 사용하도록 권고
		this.age=age;
		this.addr=addr;
		System.out.println("나는 인자생성자[3] 입니다");
	}
	
	
//	public PersonConstructor(String name, int age, String addr) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.addr = addr;
//	}

	//멤버메소드 : 멤버변수 초기화를 목적으로 정의
	void initialize(String name, int age, String addr) {
		/*
		 해당코드는 생성자 내에서만 사용할 수 있다
		 생성자는 인스턴스 생성시 딱 한번만 호출되고 개발자가 임의로 호출이 불가하다
		 멤버 메소드는 개발자가 월할 때 언제든 호출이 가능하므로 생성자와 특성이 다르다
		 멤버 메소드에서는 생성자를 호출 할 수 없다
		 */
//		this(name, age, "미상"); //에러발생
		
		//멤버변수 구분을 위한 this는 멤버 메소드에서도 사용이 가능
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	
	void showPersonInfo() {
		System.out.printf("%s 님의 정보 \n",this.name);
		System.out.printf("나이 : %d\n",age);
		System.out.printf("주소 : %s\n",addr);
	}
}
