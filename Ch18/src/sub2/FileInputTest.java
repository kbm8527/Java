package sub2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * ��¥ : 2020/05/21
 * �̸� : �躸��
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018
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
				//�� �̻� ���� �����Ͱ� ���� ���
				break;
			}
			char c = (char)value;
			System.out.print(c);
		}
		//�Է½�Ʈ�� ����
		
		fis.close();
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n ���α׷� ����");
	}
}
