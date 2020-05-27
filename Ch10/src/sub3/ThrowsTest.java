package sub3;
/*
 * 날짜 : 2020/05/14
 * 이름 : 김보미
 * 내용 : 예외 떠넘기기 실습하기 교재 p440
 */
public class ThrowsTest {
	public static void main(String[] args){
		
		// 싱글톤 객체 얻어오기
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		int r4 =0;
		
		//에러가 발생할 throws가 선언된  메서드를 호출하는 쪽에서는 예외처리(try-catch)를 해야함
		//또는 다시 throws 선언으로 main을 호출하는 자바 JVM으로 예외를 던짐
		
		try {
			r4 = c.div(4, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("프로그램 종료...");
	}
}
