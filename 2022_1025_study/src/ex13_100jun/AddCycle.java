package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AddCycle {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
//		StringTokenizer st;
		
		int result = new AddCycle().process(count);
		System.out.println(result);
		bw.write(result);
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	public int process(int num) {
		int n = num;
		int cnt=0;
		while(true) {
			
			int a = num/10;
			int b = num%10;
			int c = (a+b) %10;
			num = (b*10) +c;
			cnt++;
			if(n==num) {
				break;
			}

		}
		
		return cnt;
		
	}

}
