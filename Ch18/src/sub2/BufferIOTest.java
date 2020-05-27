package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2020/05/21
 * 이름 : 김보미
 * 내용 : 자바 파일 입출력 실습하기 교재 p1032
 */
public class BufferIOTest {
	
	public static void main(String[] args) throws Exception {
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg";
		
		//기본 파일 입출력 스트림 생성
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		//버퍼스트림 생성 및 연결
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		while(true) {
			//InputStream으로 데이터 읽어들이기
			value = bis.read();
			if(value == -1) { //-1=파일이 없다는 뜻
				break;
			}
			//OutputStream으로 데이터 내보내기
			bos.write(value);
		}
		//스트림 해제
		bis.close();
		bos.close();
	
		fis.close();
		fos.close();
		
		System.out.println("프로그램 종료");
	}
}
