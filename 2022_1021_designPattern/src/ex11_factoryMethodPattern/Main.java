package ex11_factoryMethodPattern;

public class Main {

	public static void main(String[] args) {
		
		ShoesStore ss = new KoreanShoesStore();
		
		Shoes shoes = ss.orderShoes("blackShoes");
		
		System.out.println(shoes.getName());

	}

}
