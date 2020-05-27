package sub2;
/*
 *  날짜 : 2020/05/18
 *  이름 :  김보미
 *  내용 :  String 클래스 실습하기 교재 p496
 *  
 *  String 클래스
 *   - 문자열을 저장하는 데이터 타입
 *   - 문자열 저장을 배열과 같은 구조를 갖는다.
 *   - 문자열 비교는 equals 메서드를 호출한다.
 */ 
public class StringTest {
	public static void main(String[] args) {
		//문자열 = 문자 + 배열
		String str = "Hello";
		char[] arr = {'H','e','l','l','o'};
		
		//문자열 객체생성
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";//literal생성
		String str4 = "Hello";//literal생성
		
		if(str1 == str2) {
			System.out.println("str1과 str2의 참조값(주소값)이 같다");
		}else {
			System.out.println("str1과 str2의 참조값(주소값)이 다르다");
		}
		if(str3 == str4) {
			System.out.println("str3과 str4의 참조값(주소값)이 같다");
		}else {
			System.out.println("str3과 str4의 참조값(주소값)이 다르다");
		}
		//문자열 비교
		if(str1.equals(str3)) {
			System.out.println("str1과 str3의 문자열 값이 같다");
		}else {
			System.out.println("str1과 str3의 문자열값이 다르다");
		}
	}
}
