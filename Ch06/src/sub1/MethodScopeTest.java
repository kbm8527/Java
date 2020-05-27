package sub1;
/*
 *  날짜:2020/05/06
 *  이름:김보미
 *  내용: 자바 Method(함수) 실행영역과 메모리 실습하기
 */
public class MethodScopeTest {
	//전역변수 - 모든 메서드에서 참조가 가능하다
	//int result = 0;
		
		public static void main(String[] args) {
			// 지역변수
			int result = 0;
			int start = 1;
			int end = 10;
			
		result = sum(start,end);
		System.out.println("result : "+result);
			
		}// main end
		
		public static int sum(int s, int e) {
			// 지역변수
			int sum = 0;
			
			for(int k=s; k<=e;k++) {
				sum += k;
			}
			return sum;
		}
		
		
		
}
