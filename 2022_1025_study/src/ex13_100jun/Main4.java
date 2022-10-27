package ex13_100jun;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
			
		int[] arr = {n1,n2,n3};
		int[] arr2 = new int[10];
		int result = 0;
		for(int i = 0; i<arr.length; i++) {
				arr2[arr[i]]++;
		}
		
		for(int i =0; i<arr2.length; i++) {
			
			if(arr2[i]==3) {
				result = 10000+(i*1000);
				break;
			}
			if(arr2[i]==2) {
				result = 1000+(i*100);
				break;
			}
			if(arr2[i] == 1) {
				result = i*100;
			}
		}
		
		System.out.println(result);
		
		sc.close();

	}

}
