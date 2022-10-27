package ex13_100jun;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
			
		int hour = 0;
		n2 = n2 + n3;
		while(true) {
			if(n2<60) {
				break;
			}
			n2 -=60;
			hour++;
			
		}
		
		if(hour>0) {
			n1 += hour;
		}

		if(n1>=24) {
			n1 -= 24;
		}

		System.out.println(n1+" "+n2);
		
		sc.close();

	}

}
