package test10;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class JavaTest10 {
	public static void main(String[] args) throws Exception {
		
		Apple apple1 = new Apple("한국",3000);
		Apple apple2 = new Apple("미국",3000);
		
		FileOutputStream fos = new FileOutputStream("./apple.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(apple1);
		oos.writeObject(apple2);
		
		oos.close();
		fos.close();
		
		System.out.println("현재 폴더에 apple.txt 객체파일 생성 완료!");
	}
}
