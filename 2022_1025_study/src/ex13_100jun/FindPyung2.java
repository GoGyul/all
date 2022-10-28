package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class FindPyung2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());

		for(int i = 0; i<cnt; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine()," ");

			double result = new FindPyung2().process(st1);
			bw.write(String.format("%.3f%%\n", result));
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public double process(StringTokenizer str) {
		int count = 0;
		int[] arr = new int[Integer.parseInt(str.nextToken())];
		double pyung = 0;
		
		while(str.hasMoreTokens()) {
			arr[count] = Integer.parseInt(str.nextToken());
			pyung += arr[count];
			count++;
		}	
		count = 0;
		double b = arr.length;
		pyung /= b;
		
		for(int i : arr) {
			if(i>pyung) {
				count++;
			}
		}
//		(double)count/(double)arr.length*100;
		double d = count;
		double per = d/b*100; 
		return per;
		
	}
	
}
