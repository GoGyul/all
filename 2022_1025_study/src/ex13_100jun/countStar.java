package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class countStar {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 1; i<=count; i++) {
			for(int j = count; j>0; j--) {
				if(j>i) {
					bw.write(" ");
				}else {
					bw.write("*");
				}
				
			}
			bw.newLine();
		}
	
		br.close();
		bw.flush();
		bw.close();
		
	}

}
