package pack01_if;

public class Ex03_IfIf {
	public static void main(String[] args) {
		// 블럭킹 ==> { } (지역)
		// int num1 = 10; (변수를 초기화 시키면 메모리 어느 부분에 값이 저장되고 우리는 변수명으로 찾아서 쓴다.)
		// 변수는 언제까지 메모리에 저장이 되어 있을까?? ==> 블럭킹 { } 안에서만 저장되어있다.
		int num1 = 10;
		System.out.println(num1);
		if( num1 == 10 ) {
			//int num1 = 10;  // 1. 여기는 왜 오류일까?
			int num2 = 10;    // 2. 언제까지 사용이 가능할까?
		}
		
		{
			// main 내부에 다른지역을 만듬.
			// num2 라는 변수는 이미 같은 이름으로 사용이 된 적이 있음.
			// 그렇다면 변수 선언이 오류가 나야하는데 안나오고있음. 왜일까?
			int num2 = 10; }
		
		
		
		
		
		
	} // main
}// class
