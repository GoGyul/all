package ex06_pAndY;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PandY {

	public static void main(String[] args) {
		
		String s = "pPoooyY";
		int pCount = new PandY().process(s,"p");
		int sCount = new PandY().process(s,"y");
		boolean bool = new PandY().compare(pCount, sCount);
		
		//  정규식 활용 
		boolean bool2 = s.replaceAll("[^pP]", "").length() - s.replaceAll("[^yY]", "").length() == 0 ? true : false;
		System.out.println(bool2);
	}
	
	// Pattern , Matcher 써보기
	public int process(String s,String word) {
		
		s = s.toUpperCase();
		
		Pattern pattern = Pattern.compile(word.toUpperCase());
		Matcher matcher = pattern.matcher(s);
		
		int count = 0;
		while(matcher.find()) {
			count++;
		}
		
		System.out.println(count);
		
		return count;
		
	}
	
	public boolean compare(int n1, int n2) {
		
		if(n1 == 0 && n2 == 0) {
			return true;
		}
		
		if(n1 == n2) {
			return true;
		}
		
		return false;
		
	}

}
