package ex08class;

public class E05PersonConstructorMain {

	public static void main(String[] args) {
		
		//기본 생성자를 통해 인스턴스를 생성
		PersonConstructor person1 =new PersonConstructor();
		System.out.println("[멤버변수 초기화용 메소드 호출 전]");
		//'이름 없음'출력
		person1.showPersonInfo();
		
		System.out.println("[멤버변수 초기화용 메소드 호출 후]");
		//기존 생성된 person1을 초기화 메소드를 통해 값을 변경
		person1.initialize("홍길동", 20, "논현동");
		person1.showPersonInfo();
		
		/*
		 인스턴스 생성시 초기화 메소드를 사용하면 생성과 초기화를 별도로 진행해야한다.
		 하지만 생성자를 이용하면 생성과 동시에 초기화 할 수 있으므로 훨씬 편리하다
		 */
		
		//오버로딩한 생성자를 통해 인스턴스를 각가 생성
		System.out.println("[이름만 전달한 값으로 초기화하기]");
		PersonConstructor person2 = new PersonConstructor("박길동");
		person2.showPersonInfo();
		
		System.out.println("[이름과 아니만 전달한 값으로 초기화하기]");
		PersonConstructor person3 = new PersonConstructor("박길동", 40);
		person3.showPersonInfo();
		
		System.out.println("[이름과 아니만 전달한 값으로 초기화하기]");
		PersonConstructor person4 = new PersonConstructor("박길동", 40, "가산동");
		person4.showPersonInfo();
	}

}
