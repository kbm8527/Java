package sub1;
/*
 * 날짜 : 2020/05/20
 * 이름 : 김보미
 * 내용 : 제네릭 실습하기 교재 p654
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("대만",2000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
		
		a.show();
		b.show();
		
	}
}
