package sub2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * 날짜 : 2020/05/21
 * 이름 : 김보미
 * 내용 : 자바 파일 입출력 실습하기 교재 p1018
 */
public class FileInputTest {
	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
			
		
		try {
		FileInputStream fis = new FileInputStream(file);
		int value =0;
		while(true) {
			
			value = fis.read();
			
			if(value == -1) {
				//더 이상 읽을 데이터가 없을 경우
				break;
			}
			char c = (char)value;
			System.out.print(c);
		}
		//입력스트림 해제
		
		fis.close();
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n 프로그램 종료");
	}
}
