package p431;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		try {
			Class calzz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
