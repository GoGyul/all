package ex13_100jun;

import java.util.Scanner;

public class Main {

	/*
	 	에제 입력
	 	472
		385
		
	    예제 출력
	    2360
		3776
		1416
		181720
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int n1 = 0;
		int result = 0;
		int count = 1;
		while(true) {
			
			n1 = a * (b%10);
			int nn = n1;
			nn *= count;
			b /= 10;
			result +=nn;
			count *= 10;
			
			System.out.println(n1);
			if(b==0) {
				break;
			}
		}
		System.out.println(result);
		sc.close();

	}

}
