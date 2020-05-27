package sub5;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 : 2020/05/19
 * 이름 : 김보미
 * 내용 : Date 클래스 실습하기 교재p538
 */
public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("date : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String now = sdf.format(date);
		System.out.println("now : "+now);
	}
}
