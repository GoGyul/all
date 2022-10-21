package ex03_strategyPattern;

public class Main {

	public static void main(String[] args) {
		
		Encoder encoder = new Encoder();
		
		String messege = "HELLO JAVA";
		
		encoder.setEncodingStrategy(gogoEncoding());
		System.out.println(encoder.getMessage(messege));
		
	}
	
	public static EncodingStrategy normalEndocing() {
		return new NormalStrategy();
	}
	
	public static EncodingStrategy base64Encoding() {
		return new Base64Strategy();
	}
	
	public static EncodingStrategy gogoEncoding() {
		return new GogoStrategy();
	}

}
