package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle22
{
     	//멤버변수 : 가로, 세로 길이를 표현
	int width;
	int height;
	
	//생성자 
	public Rectangle22(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public void showAreaInfo() {
		//멤버변수 사용시 this는 항상 붙이도록 한다
		System.out.println("직사각형 넓이 : " + (this.width*this.height));
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square2 extends Rectangle22
{
     	/*
     	 직사각형은 가로, 세로 부 변의 길이가 서로 다르므로 2개의 멤버변수가 필요하다
     	 하지만 정사각형은 길이가 동일하므로 1개의 값을 2개의 멤버변수를 초기화 할 수 있다
     	 해당 클래스는 멤버변수의 확장이 필요하지 않다
     	 */
	public Square2(int w) {
		super(w, w);
	}
	
	public void showAreaInfo() {
		//부모의 멤버변수를 통해 사각형의 넓이를 계산한다
		System.out.println("정사각형 넓이 : "+(super.width*super.height));
	}
} 
class QuRectangle22Main {
	public static void main(String[] args) {
		
			//부모클래스의 인스턴스(직사각형)
	       	Rectangle22 rec = new Rectangle22(4, 3);
	       	rec.showAreaInfo();
	       	
	       	//자식클래스의 인스턴스(정사각형)
     		Square2 sqr = new Square2(7);
	       	sqr.showAreaInfo();
 	}
}

