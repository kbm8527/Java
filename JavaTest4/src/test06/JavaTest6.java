package test06;

public class JavaTest6 {
	public static void main(String[] args) {
		
		JavaTest6 test = new JavaTest6();
		
		Apple apple = new Apple("한국",3000);
		Banana banana = new Banana("필리핀",2000);
		Grape grape = new Grape("미국",3000);
		
		test.showInfo(apple);
		test.showInfo(banana);
		test.showInfo(grape);
	}
	public void showInfo(Object fruit) {
		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			apple.show();
		}else if(fruit instanceof Banana) {
			Banana banana =(Banana) fruit;
			banana.show();
		}else if(fruit instanceof Grape) {
			Grape grape =(Grape) fruit;
			grape.show();
			
		}
	}
}
