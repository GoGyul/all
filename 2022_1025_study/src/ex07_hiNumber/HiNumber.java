package ex07_hiNumber;

public class HiNumber {

	public static void main(String[] args) {
		
		int x = 13;
		boolean bool = new HiNumber().process(x);
		System.out.println(bool);
	}
	
	public boolean process(int x) {
		int origin = x;
		int addNum = 0;
		
		while(true) {
			addNum += x%10;
			x /= 10;
			if(x==0) {
				break;
			}
		}
		boolean bool = false;
		if(origin % addNum ==0) {
			bool = true;
		}else {
			bool = false;
		}
		
		return bool;
		
	}

}
