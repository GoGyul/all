package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class FindPyung {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		int[] intArr = new int[cnt];
		int maxNum = 0;
		
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<intArr.length; i++) {
			intArr[i] = Integer.parseInt(st1.nextToken());
			if(maxNum < intArr[i]) {
				maxNum = intArr[i];
			}
		}
		
		double result = new FindPyung().process(intArr, maxNum);
		System.out.println(result);
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public double process(int[] intArr, int num) {
		
		double result = 0;
		
		for(double i : intArr) {
			double nn = (i/num) * 100;
			result += nn; 
		}
		
		result /= intArr.length;
		
		return result;
		
	}
	
}
