package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FindNumber2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
		
        
        int[] arr = new int[n1];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<n1; i++) {
        	arr[i] = Integer.parseInt(st2.nextToken());
        	if(arr[i]<n2) {
        		bw.write(String.valueOf(arr[i]) + " ");
        	}
        }
		bw.flush();
		br.close();
		bw.close();
		
	}
}
