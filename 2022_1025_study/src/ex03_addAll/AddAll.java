package ex03_addAll;

public class AddAll {

	public static void main(String[] args) {
		
		int n = 987;
		int result = new AddAll().process(n);
		
	}
	
	//10으로 나누어 나머지로 자릿수를 구한뒤 다 더해주기
	public int process(int n) {
		int num = n;
		int result = 0;
		while(true) {
			int nn = num%10;
			result += nn;
			num = num/10;
			if(num==0) {
				break;
			}
		}
		
		return result; 
		
	}

}
