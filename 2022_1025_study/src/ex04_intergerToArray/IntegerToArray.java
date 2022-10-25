package ex04_intergerToArray;

public class IntegerToArray {

	public static void main(String[] args) {
		
		Long n = 99999999999L;
		int[] arr = new IntegerToArray().process(n);
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	public int[] process(long n) {
		
		int idx = new IntegerToArray().findLength(n);
		int[] arr = new int[idx];
		
		for(int i = 0; i<arr.length; i++) {
			//형변환 주의
			arr[i] = (int)(n%10);
			n /= 10;
		}
		
		return arr;
		
	}
	
	// length 구하는 함수
	public int findLength(long n) {
		
		int result = 0;
		
		while(true) {
			n /= 10;
			result ++;
			if(n==0) {
				break;
			}
		}
		
		return result;
	}

}
