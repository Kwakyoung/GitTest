package extend.imp;

public class ChildClass extends SuperParent{
	// extends : ��� ����� ��� ( private ���� ) + Ŭ������ ���
	
	public static void main(String[] args) {
		ChildClass ch = new ChildClass();
		System.out.println(ch.superField);
		ch.superMethod();
		ch.testMethod();
		ch.testMethod2();
		// ch.interField = 10; �� ���ԺҰ�
		System.out.println(ch.interField);
		ch.cameraShot();
	}
}
