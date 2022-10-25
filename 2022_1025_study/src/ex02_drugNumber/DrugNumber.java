package ex02_drugNumber;

public class DrugNumber {

	public static void main(String[] args) {
		
		int n = 16;
		int result = new DrugNumber().process(n);
		int result2 = new DrugNumber().detail(n);
		System.out.println(result);
		System.out.println(result2);
	}
	
	//제곱근을 이용한 방법
	public int process(int n) {
		
		int result = 0;
		// 인수 n 의 제곱근을 구한뒤 
		// 해당 제곱근 만큼 루프를 실행한다.
		// 제곱근의 약수를 구해서 n/제곱근의 약수 를 구한뒤 더해도 된다.
		for(int i = 1; i<= Math.sqrt(n); i++) {
			if(n%i==0) {
				// 중복 제거를 위한 조건
				if(i*i == n) {
					result += i;
				}else {
					result += i;
					result += n / i;
				}
			}
		}
		return result;
	}
	
	public int detail(int n) {
		
		int result = 0;
		double root = Math.sqrt(n);
		for(int i = 1; i<=root; i++) {
			// 제곱근의 약수 일때만
			if(n%i==0) {
				
					// 중복을 제거하지 않는다면
					result += i;
					result += n / i;
				
				
			}
		}
		
		
		return result;
		
	}
	
}
