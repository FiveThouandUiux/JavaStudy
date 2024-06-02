package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {
		int i = 1;
		do {
			if(i%5==0) {
				System.out.println("*");
			} else if(i%5==4) {
				System.out.println("**");
			} else if(i%5==3) {
				System.out.println("***");
			} else if(i%5==2) {
				System.out.println("****");
			}else {
				System.out.println("*****");
			}
			i++;  
		} while(i<=5);
	}

}
