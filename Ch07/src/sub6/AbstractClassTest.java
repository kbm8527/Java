package sub6;
/*
 *  날짜 : 2020/05/13
 *  이름 : 김보미
 *  내용 : 추상클래스 실습하기 교재 p329
 *  
 *  추상클래스
 *  - 클래스에 추상메서드가 선언된 클래스
 *  - 추상클래스를 상속받아 통일성있는 구조를 갖는 클래스를 정의
	- 추상클래스를 상속받는 자식클래스의 타입선언은 다형성을 적용
 */
public class AbstractClassTest  {
	public static void main(String[] args) {
		
		//추상클래스는 객체생성 안됨
		//Unit unit = new Unit();
		Unit u1 = new Marine();
		Unit u2 = new Zergling();
		Unit u3 = new Zealot();
		
		u1.move();
		u1.attack();
		
		u2.move();
		u2.attack();
		
		u3.move();
		u3.attack();
	}
}
