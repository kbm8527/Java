package sub2;
/*
 * ��¥ :2020/05/07
 * �̸� :�躸��
 * ���� :�ڹ� Class �ǽ��ϱ�
 */
public class ClassTest {
		
		public static void main(String[] args) {
			
			int num1 = 1;
			int num2 = 2;
			
			//�������� ��ü���� �� �ʱ�ȭ. kb�� �������� heap���ִ� account �ּҰ��� ����Ŵ
			Account kb = new Account("��������","121-12-1234","������",10000);
			
			//��ü �ʱ�ȭ
			//kb.bank = "��������";
			//kb.id = "121-12-1234";
			//kb.name = "������";
			//kb.money = 10000;
			
			// �Ա� , ���, ��ȸ�ϱ�
			kb.deposit(10000);
			kb.withdraw(5000);
			//kb.money--; ��ü�� ��������� ĸ��ȭ�� ���� ����ڵ� ����
			kb.info();
			
			//�������� ��ü���� �� �ʱ�ȭ
			Account sh = new Account("��������","121-11-1234","������",30000);
			
			//sh.bank = "��������";
			//sh.id ="121-11-1234";
			//sh.name = "������";
			//sh.money =30000;
			
			sh.deposit(10000);
			sh.withdraw(8000);
			sh.info();
			
		}
}
