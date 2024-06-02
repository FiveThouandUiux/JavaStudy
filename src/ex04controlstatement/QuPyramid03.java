package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			if(i%5==0) {
				System.out.println("* * * * * * * * *");
			} else if(i%5==4) {
				System.out.println("  * * * * * * *");
			} else if(i%5==3) {
				System.out.println("    * * * * *");
			} else if(i%5==2) {
				System.out.println("      * * *");
			}else {
				System.out.println("        *");
			}
		}
	}

}
