package sub2;

/*
 * 	��¥:2020/04/29
 * 	�̸�:�躸��
 * 	����:������ �ڷ���(DataType) �ǽ��ϱ� 
 */
public class DataTypeTest {
	public static void main(String[] args) {
		//������
		byte  var1 = 127; //1byte=8bit 127��������
		short var2 = 2; 
		int   var3 = 2147483647; //4byte=32bit 2147483647��������   *
		long  var4 = 4;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		
		//�Ǽ���
		float  var5 = 1.123456789f;  //7��°�ڸ�������µǰ� ������ �� �ݿø�
		double var6 =1.23456789;    //16��°�ڸ����� ��� *
		
		System.out.println("var5 : "+var5 );
		System.out.println("var6 : "+var6 );


		//����*
		boolean var7 = true;
		boolean var8 = false;
		
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
		
		//������
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		
		
		//���ڿ�(�ܾ�)*
		
		String str1 = "Apple";
		String str2 = "Hello";
		String str3 = "�ȳ�";
		
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		System.out.println("str3 :"+str3);
		
		
	}
}
