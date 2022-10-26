package ex10_findReturnNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindReturnNum {

	public static void main(String[] args) {
		
		int[] arr = {2, 36, 1, 3};
		int div = 1;
		int[] result = new FindReturnNum().process(arr, div);

	}

	public int[] process(int[] arr, int num) {
		//반환받을 값 넣어줄 리스트 
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%num == 0) {
				list.add(arr[i]);
			}
		}
		
		if(list.size()==0) {
			int[] result = {-1};
			return result;
		}
		
		//리스트에서 정렬
		Collections.sort(list);
		
		//포문으로 그냥 꺼내쓰기
		int[] result = new int[list.size()];
		for(int i = 0; i<list.size(); i++) {
			result[i] = list.get(i);
		}
		
		/*
		 	스트림
		  	int[] arr5 = list.stream().mapToInt(i->i).toArray();
		 */
		
		return result;
		
	}
	
}
