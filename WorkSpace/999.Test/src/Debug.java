
public class Debug {
	public static void main(String[] args) {
		String str = "aaa";
		// breakpoint : �ߴ���
		// step Over : ���� �ٷ�
		// resume : ������� ( ���� �ߴ����� ���߸� �ٽ� ���� )
		GetterSetter gs = new GetterSetter();
		gs.setAge(10);
		
		
		// �ش� �� �ڵ尡 ���� �Ǳ� �� ������ ��. ( ����, ����, ȯ�� ����� Ȯ���ϰ� �� �� �ڵ带 �����ϰ� ���� )
		// �� ���� �����ϰ� ������ ������ ����.
		
		System.out.println("�ڵ�1"+ str);
		System.out.println("�ڵ�2");
		System.out.println("�ڵ�3");
		System.out.println("�ڵ�4");
		System.out.println("�ڵ�5");
		System.out.println("�ڵ�6");
		System.out.println("�ڵ�7");
		System.out.println("�ڵ�8");
		System.out.println("�ڵ�9");
		System.out.println("�ڵ�10");
	}
}