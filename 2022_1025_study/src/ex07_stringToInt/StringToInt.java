package ex07_stringToInt;

public class StringToInt {

	public static void main(String[] args) {
		
		String s = "-1234";
		int n = new StringToInt().process(s);
		System.out.println(n);
	}

	// 정규식 써보기
	public int process(String s) {
		
		// 숫자를 제외한 문자를 "" 으로 치환.
		String intStr = s.replaceAll("[^0-9]", "");
		// 숫자를 "" 으로 치환.
		String plusOrMinus = s.replaceAll("[0-9]", "");
		
		int result = Integer.parseInt(intStr);
		
		if(plusOrMinus.equals("-")) {
			result = result * -1;
		}
		return result;
	}
	
}
