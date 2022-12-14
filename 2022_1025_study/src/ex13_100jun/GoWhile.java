package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GoWhile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			st = new StringTokenizer(str," ");
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			bw.write((n1 + n2) + "\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}
