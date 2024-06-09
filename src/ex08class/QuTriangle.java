package ex08class;

class Triangle {
	double setB, setH;
	
	void init(int num1, int num2) {
		setB = num1;
		setH = num2;
	}
	
	double getArea() {
		return setB * setH  / 2;
	}
	
	void setBottom(int num) {
		setB = num;
	}
	
	void setHeight(int num) {
		setH = num;
	}
}
public class QuTriangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}

}
