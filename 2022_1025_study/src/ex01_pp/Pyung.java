package ex01_pp;

import java.util.Arrays;

public class Pyung {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		double result = new Pyung().process(arr);
		double result2 = new Pyung().streamApi(arr);
		
		System.out.println(result);
		System.out.println(result2);
		
	}
	
	public double process(int[] arr) {
		
		double result = 0;
		
		for(int i : arr) {
			result += i;
		}
		
		result = result/arr.length;
		
		return result;
		
	}
	
	// stream api 사용
	public double streamApi(int[] arr) {
		
		int result = (int) Arrays.stream(arr).average().orElse(0);
		
		return Arrays.stream(arr).average().orElse(0);
		
	}

}
