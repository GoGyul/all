package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class OXFind {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());

		for(int i = 0; i<cnt; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			String str = st1.nextToken();
			int result = new OXFind().process(str);
			bw.write(result+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public int process(String str) {
		
		int result = 0;
		boolean bool = true;
		int count = 1;
		
		String[] strArr = str.split("");
		for(int i = 0; i<strArr.length; i++) {
			if(strArr[i].toUpperCase().equals("O")) {
				bool = true;
			}else {
				bool = false;
			}
			
			if(bool) {
				result += count;
				count++;
			}else {
				result += 0;
				count = 1;
			}
			
		}
		
		return result;
		
	}
	
}
