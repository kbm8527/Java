package sub3;
/*
 *  날짜 : 2020/05/18
 *  이름 :  김보미
 *  내용 :  Wrapper 클래스 실습하기 교재 p527
 */  
public class WrapperTest {
	public static void main(String[] args) {
		//기본변수
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		char var4 = 'A';
		
		//Wrapper클래스 =  기본타입 변수를 객체로 만들어준다
		Integer w1 = new Integer(var1);
		Double w2 = new Double(var2);
		Boolean w3 = new Boolean(var3);
		Character w4 = new Character(var4);
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		System.out.println("w4 : "+w4);
		
		//문자열 - > 기본타입 변환
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "false";
		
		int     value1 = Integer.parseInt(str1);
		double  value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
		
		// 문자열 ->Wrapper 변환
		Integer wr1 = Integer.valueOf(str1);
		Double  wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		
		System.out.println("wr1 : "+wr1);
		System.out.println("wr2 : "+wr2);
		System.out.println("wr3 : "+wr3);
		
		//Wrapper -> 문자열 변환
		String s1 = w1.toString();
		String s2 = w2.toString();
		String s3 = w3.toString();
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		
	}
}
