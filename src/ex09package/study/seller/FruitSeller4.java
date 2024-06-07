package ex09package.study.seller;

//세번째 예제에서는 생성자를 도입하고 멤법 상수를 재사용
public class FruitSeller4 {
	
	int numOfApple;
	int myMoney;
	//멤버 상수를 초기값이 없는 상태로 선언
	final int APPLE_PRICE;
	/*
	 멤버 상수는 값의 변경이 불가능하고 단 한번만 초기화되기 때문에 일반 멤버 메소드에서는 초기호 할 수 없다
	 초기값이 없는 상태로 선언 자체가 불가능하다
	 하지만 생성자는 인스턴스 생성시 딱 한번만 호출되고 개발자가 마음대로 호출할 수 없으므로 한 번 이상 초기화지 않음이 문법적 보장
	 멤버상수는 생성자에서 초기화가 가능
	 */
	
	//생성자 
	public FruitSeller4(int money, int appleNum, int price) {
		myMoney=money;
		numOfApple=appleNum;
		//상수는 반드시 초기화가 되어야 하기때문에 이 부분을 삭제하면 에러가 발생한다. 
		APPLE_PRICE=price;
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자] 남은 사과 갯수 : "+numOfApple);
		System.out.println("[판매자] 판매수익 : "+myMoney);
	}
}