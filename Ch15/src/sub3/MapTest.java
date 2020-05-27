package sub3;

import java.util.HashMap;
import java.util.Map;

import sub1.Apple;

/*
 * 날짜 : 2020/05/20
 * 이름 : 김보미
 * 내용 : Map 실습하기 교재 p740
 */
public class MapTest {
	public static void main(String[] args) {
		
		//맵 생성 및 문자열 데이터 저장
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "김유신");
		map1.put(102, "김춘추");
		map1.put(103, "장보고");
		map1.put(104, "강감찬");
		map1.put(105, "이순신");
		
		//전체 데이터 갯수
		System.out.println("map1 데이터 갯수 : "+map1.size());
		
		//맵 원소 출력
		String value = map1.get(102);
		System.out.println("map1의 102번 키 값: "+value);
		
		//맵 생성 및 사과 데이터 저장
		//Apple a1 = new Apple("한국",3000);
		//Apple a2 = new Apple("미국",2000);
		//Apple a3 = new Apple("일본",2500);
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(101,new Apple("한국",3000));
		map2.put(102,new Apple("미국",2000));
		map2.put(103,new Apple("일본",2500));
		
		//한국 사과 출력
		Apple korApple = map2.get(101);
		korApple.show();
		//미국 사과 출력
		map2.get(102).show();
	}
}
