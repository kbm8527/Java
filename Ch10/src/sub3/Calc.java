package sub3;


public class Calc {
	
	//�̱��� ��ü
	private static Calc instance =  new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	//�ܺο��� ��ü���� ���ϰ� ����
	private Calc() {
		
	}
	
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	
	
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	
	}
	// div �޼���� ������ �߻��� �� �ִٴ� ���ɼ��� throws ������ ���� ȣ���ϴ� �ʿ� �˸�
	public int div(int x, int y)throws Exception {
		
		if(y < 0) {
			//������ �߻��� �� �޼��带 ȣ���ϴ� ������ ������ ������.
			Exception e = new Exception("y�� ��� �̾�� �մϴ�.");
			throw e;
			//throw new Exception("y�� 1�̻� �̾�� �մϴ�.");
		}else if(y==1) {
			Exception e = new Exception("y�� 1�� �Ǹ� �ȵ˴ϴ� .");
			throw e;
			
		}
		
		int z = x / y; 
		return z;
		
	}
	
}