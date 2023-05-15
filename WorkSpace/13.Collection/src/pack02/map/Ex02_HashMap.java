package pack02.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex02_HashMap {
	public static void main(String[] args) {
		// Map 컬렉션은 <Class , Class> : 클래스 타입이 두개가 들어감.
		// 첫번째것은 데이터를 식별하기위한 키값이고, 두번째것은 데이터이다.
		// Map<K,V> Key, Value 의미
		Map<String, Integer> map = new HashMap<>();
		map.put("신용권", 95);
		map.put("홍길동", 50);
		map.put("임꺽정", 60);
		map.put("신용권", 100);
		// Key는 데이터를 유일하게 식별할수있는 값이어야 한다. ex)동명이인이 있는 경우 이름은 Key로써 기능을 상실
		// 주민번호같은걸 Key값으로 줘야할거같다. - 내생각
		
		System.out.println("map Entry(객체) 수 : "+ map.size());
		System.out.println("신용권의 점수 : " + map.get("신용권"));
	
		// 자바코드로 데이터를 빼올일은 거의 없음.
		// 예제로 한번만 확인하고 넘어가면 됨.
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()){
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + "   value : "+ value);
		}
		
		for(String key : map.keySet() ) {
			Integer value = map.get(key);
			System.out.println("key : " + key + "   value : "+ value);
		}
		
		
		
		
		
		
		
	}
}