package sub1;

/*
 * ��¥ : 2020/05/14
 * �̸� : �躸��
 * ���� : ��øŬ���� �ǽ��ϱ� ���� p390
 */

import sub1.Outer.Inner;

public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(10);
		out.info();
		
		Inner inner = out.new Inner(20);
		inner.info();
	}
}
