package pack03.extend;

public class SubClass extends SuperClass{
	// 두수의 곱하기 return, 나누기 return, 나누고 나머지 return 하는 메소드 3개를 구현해보기.
	// Sub클래스에서 부모클래스의 기능을 그대로 사용하는게 아니라 달리하고 싶음.
	// 오버 라이드 ( Override ), 재정의
	// 부모클래스의 메소드 형태는 유지하되, 내용을 바꿔 정의하는 것
	// super <- 부모클래스의 ~
	@Override  //annotation (어노테이션) : 주석 , 컴퓨터가 해석하는 주석
	public int sum(int i, int j) {
		return i+j+3; // 부모클래스의 기능을 바꾸는 것
	}
	
	public int mu(int i, int j) {
		return i*j;
	}
	public int div(int i, int j) {
		return i/j;
	}
	public int vo(int i, int j) {
		return i%j;
	}
	
	
	
	
}
