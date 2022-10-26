package ex11_jadenCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JadenCase {

	public static void main(String[] args) {
		
		String s = "for the last week ";
		boolean bool = new JadenCase().checkSpace(s);
		String strArr[] = new JadenCase().process(s);
		String str = new JadenCase().doJaden(strArr);
		if(bool) {
			str += " ";
		}
		
		
	}

	public String[] process(String s) {
		
		String[] strArr = s.split(" ");
		
		for(int i = 0; i<strArr.length; i++) {
			strArr[i] = strArr[i].toLowerCase();
		}
		return strArr;
	}
	
	// 문자열 재배치
	public String doJaden(String[] strArr) {
		String str = "";
		for(int i = 0; i<strArr.length; i++) {
			String[] strArr2 = strArr[i].split("");
			for(int j = 0; j<strArr2.length; j++) {
				// 문자열만 허용하는 패턴
				Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
				Matcher matcher = pattern.matcher(strArr2[j]);
				// 문장의 첫번째 인덱스만 문자열인지 확인후 문자열이면 대문자로 바꿔줌
				if(j == 0 && matcher.find()) {
					strArr2[j] = strArr2[j].toUpperCase();
				}
				str += strArr2[j];
			}
			str += " ";
		}
		str = str.substring(0, str.length() - 1);
		return str;
		
	}
	
	// 마지막 문자열에 공백이 있는지 확인
	public boolean checkSpace(String str) {
		
		boolean bool = false;
		String s = str.substring(str.length() - 1,str.length());
		if(s.equals(" ")) {
			bool = true;
		}
		return bool; 
	}
	
}
