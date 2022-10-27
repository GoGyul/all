package ex13_100jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TotalPrice2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<count; i++) {
			String str =  br.readLine();
			String[] strArr = str.split(" ");
			int n1 = Integer.parseInt(strArr[0]);
			int n2 = Integer.parseInt(strArr[1]); 
//			int add = n1+n2;
			bw.write(n1+n2+"\n");
		}
		
		
		bw.flush();
		bw.close();
		
	}

}
