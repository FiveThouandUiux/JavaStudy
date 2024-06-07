package ex12inheritance;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardEndHandler;
import javax.xml.transform.stax.StAXSource;

class Computer {
	
	String owner;
	
	//public Computer() {}
	public Computer(String name) {
		owner = name;
	}
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 압력한");
	}
	private void Calculate() { 
		System.out.println("요청된 내용을 계산한다");
	}
	
	public void calculaterFunc() {
		keyboardTouch();
		Calculate();
	}
}

class NotenbookComputer extends Computer {
	
	int battary;
	
	public NotenbookComputer(String name, int initCharge) {
		super(name);
		battary=initCharge;
	}
	public void charging() {
		battary+=5;
	}
	public void movigCal() {
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		System.out.print("이동하면서 ");
//		KeyboardTouch();
//		calculate();
		calculaterFunc();
		
		battary -= 1; // 배터리 차감
	}
}

class TableNotebook extends NotenbookComputer {
	String registPencil;
	public TableNotebook(String name, int initCharge, String pen) {
	 super(name, initCharge);
	 registPencil=pen;
	}
	public void write(String penInfo) {
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("등록된 펜이 아닙니다");
			return;
		}
		movigCal();
		System.out.println("스크린에 펜으로 그림을 그린다");
		battary-=1;
	}
}
public class E04ISAInheritance {

	public static void main(String[] args) {
		
		NotenbookComputer notebooke=new NotenbookComputer("공유", 5);
		TableNotebook tablet=new TableNotebook("이동욱", 5, "ISE-1234");
		
		System.out.println("==노트북 컴퓨터 사용==");
		notebooke.movigCal();
		notebooke.movigCal();
		notebooke.movigCal();
		notebooke.movigCal();
		notebooke.movigCal();
		notebooke.movigCal();
		notebooke.movigCal();
		notebooke.movigCal();
		
		System.out.println("==ISE-1234 펜으로 테블렛 사용==");
		tablet.write("ISE-1234");
		
		System.out.println("==XYZ-9876 펜으로 타블렛 사용==");
		tablet.write("XYZ-9876");
	}

}
