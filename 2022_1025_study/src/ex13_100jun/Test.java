package ex13_100jun;

public class Test {

	public static void main(String[] args) {
		
		int count = 5;
		for(int i = 1; i<=count; i++) {
			for(int j = count; j>0; j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}

}
