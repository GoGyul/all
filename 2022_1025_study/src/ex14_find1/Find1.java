package ex14_find1;

public class Find1 {

	public static void main(String[] args) {
		
		int n = 12;
		int f1 = new Find1().getResult(n);
		System.out.println(f1);
	}
	
	public int getResult(int n) {
		
		int result = 0;
		
		for(int i = 1; i<n/2; i++) {
			if(n%i==1) {
				result = i;
				break;
			}
		}
		
		if(result==0) {
			result = n-1;
		}
		
		return result;
		
	}

}
