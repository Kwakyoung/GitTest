package pack02_static;

public class Ex02_Calculator {
	// Ex02_CalculatorMain을 만들고 Ex02_Calculator에 있는 메소드를 전부 호출하는 것
	// Main클래스에서는 인스턴스화 과정이 없습니다.
	
	// 메소드(기능)은 다음과 같습니다.
	// plus <- 두 수를 입력받아 합을 return하는 static 메소드
	// minus (차)
	// mul (곱)
	// div (나)
	
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int minus(int a, int b) {
		return a-b;
	}
	
	static int mul(int a, int b) {
		return a*b;
	}
	
	static int div (int a, int b) {
		return a/b;
	}
	
	
	
}
