package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {
		int i = 1;
		while (i<=5) {
			if(i%5==0) {
				System.out.println("*****");
			} else if(i%5==4) {
				System.out.println("****");
			} else if(i%5==3) {
				System.out.println("***");
			} else if(i%5==2) {
				System.out.println("**");
			}else {
				System.out.println("*");
			}
			i++;  
		}
	}

}
