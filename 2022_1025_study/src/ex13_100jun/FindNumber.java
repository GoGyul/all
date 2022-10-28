package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FindNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int allCount = Integer.parseInt(br.readLine());
		int[] intArr = new int[allCount];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<intArr.length; i++) {
			intArr[i] = Integer.parseInt(st.nextToken());
		}
		int findNum = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i : intArr) {
			if(i==findNum) {
				cnt++;
			}
		}
		
		bw.write(cnt+"\n");
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
