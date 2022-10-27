package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TotalPrice3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 1; i<=count; i++) { 
			st = new StringTokenizer(br.readLine(), " ");
			int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+n1+" + "+n2+" = "+(n1+n2));
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}
