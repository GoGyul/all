package ex13_100jun;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
			
		n2 = n2 +15;
		if(n2>=60) {
			n2 = n2-60;	
		}else {
			n1 = n1-1;
			if(n1<0) {
				n1=23;
			}
		}

		System.out.println(n1+" "+n2);
		
		sc.close();

	}

}
