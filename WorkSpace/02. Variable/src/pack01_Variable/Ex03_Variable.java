package pack01_Variable;

public class Ex03_Variable {
//	 ctrl + shift + f = 줄정리
//	 ctrl + / = 선택한 행에 대해서 모두 주석 처리.
	public static void main(String[] args) {
		int value = 30;
		int result = value + 10;
		System.out.println(result);
		// 숫자형 변수들은 사칙연산이 가능하다.
		// 재할당. (변수를 계속 만드는게 아니라 값을 다시 줘서 바꿈)
		result = 1+182+21;
		// result에 나머지 사칙연산의 결과를 저장하고 각각
		// 출력해보기. -,*,/
		System.out.println(result);
		
		result = 8-2;
		System.out.println(result);
		
		result = 50*11;
		System.out.println(result);
		
		result = 20/2;
		System.out.println(result);
		
		
	}

}
