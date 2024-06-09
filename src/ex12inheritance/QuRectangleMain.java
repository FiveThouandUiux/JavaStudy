package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle
{
	int bottom, top, height;
	Rectangle(int bottom, int top) {
		this.bottom = bottom;
		this.top = top;
	}
	void showAreaInfo() {
		int recArea = bottom * top;
		System.out.println("직사각형 면적 : " + recArea);
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	Square(int height) {
     super(height, height);
	}
	void showAreaInfo() {
		int recArea = bottom * top;
		System.out.println("직사각형 면적 : " + recArea);
} 
	
class QuRectangleMain {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.showAreaInfo();

     		Square sqr = new Square(7);
	       	sqr.showAreaInfo();
		}
	}
}

