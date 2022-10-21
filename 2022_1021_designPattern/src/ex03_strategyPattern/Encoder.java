package ex03_strategyPattern;

public class Encoder {

	private EncodingStrategy encodingStrategy;
	
	public String getMessage(String massage) {
		return this.encodingStrategy.encode(massage);
	}
	
	public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
		this.encodingStrategy = encodingStrategy;
	}
	
}
