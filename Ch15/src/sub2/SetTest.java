package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 날짜 : 2020/05/20
 * 이름 : 김보미
 * 내용 : 컬렉션 프레임워크 Set 실습하기 교재 p724
 */
public class SetTest {
	public static void main(String[] args) {
		
		Set<Double> set = new HashSet<>();
		
		set.add(1.1);
		set.add(1.12);
		set.add(1.3);
		set.add(1.1);
		set.add(0.15);
		
		System.out.println("집합 원소 갯수 : "+set.size());
		
		//반복자를 이용한 집합원소 출력
		Iterator<Double> iter = set.iterator();//iter=반복자
		
		while(iter.hasNext()) {
			System.out.println("원소: "+iter.next());
		}
		
		
		
	}
}
