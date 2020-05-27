package sub3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/*
 * 날짜 : 2020/05/20
 * 이름 : 김보미
 * 내용 : 리스트와 맵 컬렉션 응용 실습하기 
 */
public class ListMapTest {
	public static void main(String[] args){
		
		List<Map<Integer,Apple>> list = new ArrayList<>();
		
		
		Map<Integer, Apple> map1 = new HashMap<>();
		map1.put(101, new Apple("한국",3000));
		map1.put(102, new Apple("중국",2500));
		map1.put(103, new Apple("일본",2000));
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(201, new Apple("미국",3000));
		map2.put(202, new Apple("영국",2500));
		map2.put(203, new Apple("호주",2000));
		
		Map<Integer, Apple> map3 = new HashMap<>();
		map3.put(301, new Apple("대만",3000));
		map3.put(302, new Apple("태국",2500));
		map3.put(303, new Apple("홍콩",2000));
		
		//리스트에 맵 저장
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		//한국사과 출력
		Map<Integer,Apple> m1 = list.get(0);
		Apple a1 = m1.get(101);
		a1.show();
		
		//호주사과 출력
		list.get(1).get(203).show();
		
		//태국사과 출력
		list.get(2).get(302).show();
	}
}
