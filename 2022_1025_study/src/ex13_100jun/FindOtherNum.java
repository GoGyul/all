package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class FindOtherNum {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] intArr = new int[10];
		int nanugi = 42;
		
		for(int i = 0; i<intArr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			intArr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int result = new FindOtherNum().process(intArr,nanugi);
		bw.write(result);
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public int process(int[] intArr, int num) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i : intArr) {
			set.add(i%42);
		}
		
		return set.size();
		
	}
	
}
