package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	//����ȭ ��ϼ������� �����尣 ������ ���´�.(�ϳ��� �����常 ����)
	public synchronized void setNum() {
		
		num++;
	}
}
