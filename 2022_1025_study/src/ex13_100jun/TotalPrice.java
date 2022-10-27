package ex13_100jun;

import java.util.Scanner;

public class TotalPrice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int totalPrice = sc.nextInt();
		int count = sc.nextInt();
		int[] arr = new int[count];
		int resultPrice = 0;
		String resultStr = "";
		
		for(int i = 0; i<count; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			arr[i] = n1*n2;
		}
		
		for(int i : arr) {
			resultPrice += i;
		}
		
		if(totalPrice == resultPrice) {
			resultStr = "Yes";
		}else {
			resultStr = "No";
		}
		System.out.println(resultStr);
		
		
		sc.close();

	}

}
