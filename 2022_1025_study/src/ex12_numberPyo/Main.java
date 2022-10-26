package ex12_numberPyo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		
		int[] peace = {1,1,2,2,2,8};
		int[] input = new int[peace.length];
		
		for(int i = 0; i< peace.length; i++) {
			input[i] = peace[i] - (sc.nextInt());
		}
		for(int i = 0; i<peace.length; i++) {
			System.out.println(input[i]);
		}
		sc.close();

	}

}
