package sub1;
/*
 *  날짜 : 2020/05/18
 *  이름 :  김보미
 *  내용 : Object 클래스 실습하기 교재 p457
 *  
 *  Object 클래스
 *   - 자바의 최상위 클래스
 *   - 모든클래스의 부모 클래스로 다형성 적용에 활용된다.
 */
public class ObjectTest {
	public static void main(String[] args) {
		//다형성에 활용되는 Object 클래스
		Object obj1 = new Apple("한국",3000);
		Object obj2 = new Apple("일본",2000);
		Object obj3 = new Banana("대만",2500);
		Object obj4 = new Banana("중국",1500);
		
		//toString메서드를 재정의하면 다운캐스팅 x
		obj1.toString();
		obj2.toString();
			
		// 다운 캐스팅
		Apple a1 = (Apple)obj1;
		Banana b3 = (Banana)obj3;
	
		a1.info();
		b3.info();
		
	 Object	fruit[] = {obj1,obj2,obj3,obj4};
		
	 	Apple a2 = (Apple)fruit[1];
		Banana b4 = (Banana)fruit[3];
	
		a2.info();
		b4.info();
		
	}
}
