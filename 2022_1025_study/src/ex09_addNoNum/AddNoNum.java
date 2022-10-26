package ex09_addNoNum;

import java.util.Arrays;

public class AddNoNum {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6,7,8,0};
		int result = new AddNoNum().process(arr);
		
	}

	//stream 사용해보기
	public int process(int[] arr) {
		int count = 0;
		for(int i = 0; i<10; i++) {
			int n  = i;
			if(Arrays.stream(arr).filter(x->x==n).count()==0) {
				count += i;
			}
		}
		return count;
	}
	
}
