package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FindNoHuman {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] intArr = new int[30];
		
		
		for(int i = 0; i<intArr.length-2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			intArr[n-1]++;
		}
		
		for(int i = 0; i<intArr.length; i++) {
			if(intArr[i]==0) {
				bw.write((i+1)+"\n");
			}
		}
		
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
