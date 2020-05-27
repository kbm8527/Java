package sub2;

import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2020/05/20
 * 이름 : 김보미
 * 내용 : TreeSet 실습하기 교재 p752
 */
public class TreeSetTest {
	public static void main(String[] args) {
		
		//Treeset 생성 및 숫자 데이터 저장
		Set<Integer> tree = new TreeSet<>();
		tree.add(23);
		tree.add(10);
		tree.add(48);
		tree.add(15);
		tree.add(7);
		tree.add(22);
		tree.add(56);
		
		for(int num : tree) {
			System.out.print(num+",");
		}
	}
}
