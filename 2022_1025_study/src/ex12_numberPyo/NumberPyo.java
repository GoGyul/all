package ex12_numberPyo;

public class NumberPyo {

	public static void main(String[] args) {
		
		int n = 15;
		
        int result = new NumberPyo().process(n);
        int result2 = new NumberPyo().study(n);

	}
	
	public int process(int n) {
		
		//슬라이딩 윈도우 알고리즘
		
		if (n < 3)
            return 1;
        int answer = 1, left = 1, right = 2;
        int sum = left + right;
        while (right < n) {
            if (sum < n) {
            	//	right를 먼저 증가시킨후 sum에 더해준다.
                sum += ++right;
                continue;
            }
            if (sum == n)
                answer++;
            //	1,2,3,4,5 를 더한값인 15 - 1 (최초 숫자 ) = 14
            //	14 = 2,3,4,5 를 더한 값이므로 right는 6부터 시작해도된다.
            sum -= left++;
        }
        return answer;
		
	}
	
	public int study(int n) {
		
		// 3이하는 가치가 없다.
		if(n<3) {
			return 1;
		}
		//	리턴값
		int result = 1;
		//	시작값
		int left = 1;
		//	등차값
		int right = 2;
		//	최초 1과 2를 더한값
		int sum = left+right;
		
		
		return result;
		
	}

}
