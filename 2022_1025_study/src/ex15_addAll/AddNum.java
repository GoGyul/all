package ex15_addAll;

public class AddNum {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		long result = new AddNum().getAddNumResult(a, b);
		System.out.println(result);
		
	}
	
	public long getAddNumResult(int a, int b) {
		
		long result = 0;
		int startNum = 0;
		int lastNum = 0;
		
		if(a==b) {
			result = a;
			return result;
		}
		
		if(a>b) {
			startNum = b;
			lastNum = a;
		}else {
			startNum = a;
			lastNum = b;
		}
		
		for(int i = startNum; i<=lastNum; i++) {
			result += i;
		}
		
		return result;
		
	}

}
