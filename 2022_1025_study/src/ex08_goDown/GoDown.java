package ex08_goDown;

import java.util.Arrays;
import java.util.Collections;

public class GoDown {

	public static void main(String[] args) {
		
		long l = 118372;
		
		int[] arr = new GoDown().process(l);
		String str = new GoDown().sort(arr);
		
		long result = Long.parseLong(str);

	}

	public int[] process(long l) {
		
		int[] arr = new int[String.valueOf(l).toString().length()];
		int cnt = 0;
		
		while(true) {
			arr[cnt] = (int) (l%10);
			l /= 10;
			cnt++;
			if(l==0) {
				break;
			}
		}
		return arr;
	}
	
	public String sort(int[] arr) {
		//  스트림으로 배열 복사.
		Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		String result  = "";
		
		// sort 메서드 사용할때 첫번째 인자가 원시형이면 오름차순으로 안된다고함
		// Integer[] 배열로 복사한뒤 해봄
		Arrays.sort(integerArr,Collections.reverseOrder());
		for(int i : integerArr) {
			result += String.valueOf(i).toString();
		}
		return result;
	}
	
}
