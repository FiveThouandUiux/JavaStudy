package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			if(i%6==1) {
				System.out.println("*");
			} else if(i%5==2) {
				System.out.println("**");
			} else if(i%5==3) {
				System.out.println("***");
			} else if(i%5==4) {
				System.out.println("****");
			} else {
				System.out.println("*****");
			} 
		}
		for(int j=4; j>=1; j--) {
			if(j%4==0) {
				System.out.println("****");
			} else if(j%4==3) {
				System.out.println("***");
			} else if(j%4==2) {
				System.out.println("**");
			} else {
				System.out.println("*");
			}
		}
	}
}


