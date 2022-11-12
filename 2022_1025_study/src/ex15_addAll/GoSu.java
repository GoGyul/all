package ex15_addAll;

public class GoSu {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		long result = new GoSu().solution(a, b);
		System.out.println(result);
		
	}
	
    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
	
}
