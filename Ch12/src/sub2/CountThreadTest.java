package sub2;
/*
 * ��¥ : 2020/05/19
 * �̸� : �躸��
 * ���� : ������ Ȱ�� �ǽ��ϱ� ����p576
 */ 
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start(); //�񵿱������� ����
		ct2.start(); //���Ľ��� ,�ᱣ�� ����
		ct3.start();
		
		//���ξ����忡�� �Ļ��� ���꾲������ �۾��� �Ϸ�� �� �ٽ� ���ξ������ �շ��Ǵ°��� ����
		//start ������ �� ������ �ٽ� ���ν������� �շ�
		ct1.join();  //�ٸ� �������� ���Ḧ ��ٸ�
		ct2.join(); //ct1,ct2,ct3 start �� ���ÿ� ����Ǹ鼭 �����Ǵ� �����߻�
		ct3.join(); //�ϳ��� ��������ֱ���� ���๮�� ����ȭ �ʿ�(Synchronized)
		
		
		//ct1.run(); run-���ξ������ ����
		//ct2.run();
		//ct3.run(); ��� �� :3000
		
		System.out.println("��� : "+count.getNum());
	}
}
