package ex03_strategyPattern;

public class GogoStrategy implements EncodingStrategy {

	@Override
	public String encode(String text) {
		return "GOGO"+text;
	}

	
	
}
