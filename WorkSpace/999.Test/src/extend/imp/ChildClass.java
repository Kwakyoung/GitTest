package extend.imp;

public class ChildClass extends SuperParent{
	// extends : 모든 멤버의 상속 ( private 제외 ) + 클래스의 상속
	
	public static void main(String[] args) {
		ChildClass ch = new ChildClass();
		System.out.println(ch.superField);
		ch.superMethod();
		ch.testMethod();
		ch.testMethod2();
		// ch.interField = 10; 값 대입불가
		System.out.println(ch.interField);
		ch.cameraShot();
	}
}
