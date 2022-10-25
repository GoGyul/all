package ex05_findDouble;

public class FindDouble {
	
	public static void main(String[] args) {
		long n = 3;
		long result = new FindDouble().process(n);
		System.out.println(result);
	}
	
	//	함수 안쓰고 풀기
	public long process(long n) {
		
		long answer = 0;
		
		for(long i = 1; i<=n; i++) {
			if(i*i==n) {
				answer = (i+1) * (i+1);
				break;
			}
			if(i*i>n) {
				answer = -1;
				break;
			}
		}
		return answer;
	}
	
	
	
}
