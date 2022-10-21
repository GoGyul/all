package ex02_strategyPattern;

public class CafelatteStrategy implements CoffeeStrategy {

	private static final String CAFE_LATTE = "카페라떼";
	
	@Override
	public String brew() {
		return CAFE_LATTE; 
		
	}
		
	
	
}
