package ex11_jadenCase;

public class JadenCase2 {

	public static void main(String[] args) {
		
		// 좆	고수의 풀이
		
		String s = "for the last week ";
		
        String answer = "";
        //	소문자로 전부 치환해 준뒤.
        String[] sp = s.toLowerCase().split("");
        //	초기값을 true로 주고
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            //	공백이 올때마다 플러그를 바꿔준다
            flag = ss.equals(" ") ? true : false;
        }

        System.out.println(answer);

	}

}
