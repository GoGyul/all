package ex03_strategyPattern;

public class NormalStrategy implements EncodingStrategy {

	/*
	  원본 텍스트로 변환함
	 */
	@Override
	public String encode(String text) {
		return text;
	}
}
