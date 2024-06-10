package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			int total = 1;
				for(int x=1; x<10; x++) {
					total *= i;
					System.out.print(i);
					if(x==1) {
						System.out.println(" X 1 = "+ i );
					} else {
						for(int j=1; j<x; j++) {
							System.out.print(" X "+i);
						}
						System.out.println(" = "+ total);
				}
			}
		}
	}
}


