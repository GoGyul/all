package maple;

public class mapleChoose {
	
	public static int allCount = 0;
	
	public static void main(String[] args) {
		
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < 1; i ++) {
				int result = (int)(Math.random()*(100 - 1))+1;
				System.out.println(result);
				if(result <= 31) {
					allCount++;
				}
			}			
		}
		
		System.out.println("allCoutn = "+allCount);
		
	}

}
