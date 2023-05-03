package extend.imp;

public class SuperParent implements TestInterface, Camera{
	// interface는 구조의 상속 ( implements vs extends ) (구조 Interface) vs (멤버 Class)
	// 무조건 상속을 받게 해야겠다 하는것들은 인터페이스로 만들고 상속해주기 !! 변수는 상수임
	
	// 1세대로 만드는 클래스
	int superField = 10;
	
	void superMethod() {
		System.out.println("SuperParent 부모클래스");
	}
	
	

	@Override
	public void testMethod() {
		System.out.println("테스트 메소드 구현");
		
	}

	@Override
	public int testMethod2() {
		System.out.println("테스트 메소드2 구현");
		return 2;
	}



	@Override
	public void cameraShot() {
		System.out.println("카메라");
		
	}
	
}
