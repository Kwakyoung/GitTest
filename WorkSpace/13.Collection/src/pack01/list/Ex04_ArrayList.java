package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		// 사용빈도가 높음. 배열의 단점을 보완하고 불필요한 체이닝, 멀티쓰레딩등의 기능이 없기 때문에 제일 많이 사용됨
		// List<E> list = new ArrayList<E>();
		// ArrayList<E> list = new ArrayList<E>();
		
		// String 타입을 묶어서 저장 가능한 Collection 자료구조 ArrayList를 생성하고 데이터 2건을 추가해보기.
		
		// 숫자형 데이터 타입을 묶어서 저장가능한 ... 2건 추가해보기
		
		// 부울형 데이터 타입을 묶어서 저장 가능한 ... 2건 추가해보기
		
		
		List<String> list = new ArrayList<String>();
		list.add("가");
		list.add("나");
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		
		List<Boolean> list2 = new ArrayList<Boolean>();
		list2.add(true);
		list2.add(false);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println("list :" + i + "번째 " + list.get(i));
		}
		
		// 향상된 for문
		// for문과 구조가 다름 : Collection이나 배열등의 자료구조 내부에 Element를 한건씩 빼주어서, 가독성을 높인 구조.
		// for (요소 : 자료구조) { 알아서 자료구조의 크기만큼 반복을 하며 : 기준 왼쪽요소에 아이템을 하나씩 빼면서 반복함.
		
		//}
		//            <=
		for(String str : list) {     // "java.lang.IndexOutOfBoundsException 나올일 없음
									 // 요소를 하나씩 해당타입으로 빼주기 때문에 for문보다 가독성이 높음.
									 // 개인 취향이므로 선택해서 사용.
			System.out.println(str);
		}
		
	}
}
