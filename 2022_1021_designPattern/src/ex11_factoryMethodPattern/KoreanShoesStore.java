package ex11_factoryMethodPattern;

public class KoreanShoesStore extends ShoesStore {

	@Override
	Shoes makeShoes(String name) {
		
		if(name.equals("blackShoes")) {
			return new KRStyleBlackShoes();
		}
		if(name.equals("brownShoes")) {
			return new KRStyleBrownShoes();
		}
		if(name.equals("redShoes")) {
			return new KRStyleRedShoes();
		}
		
		return null;
	}

}
