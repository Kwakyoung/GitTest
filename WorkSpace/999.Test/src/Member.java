
public class Member {
	
	public Member(int field) {
		System.out.println(field);     // �Ķ���� �Ǵ� ��������(�޼ҵ� ���ο��� ����)�� �ǹ�
		System.out.println(this.field); // �� �ڽ�(this).field 
	}
	
	// ��ŷ : ������ ���۰� �� , ���ο� ����ִ� ���͵��� ���
	// static ����.
	int field=1; // �ν��Ͻ� ���
	static int sField=2; // ����ƽ ���
	
	// �ν��Ͻ�ȭ : Ŭ������ �������ִ� ����߿� �ν��Ͻ� ������� �޸𸮿� �÷���
	// 				(�ν��Ͻ�ȭ ������ ���������� ��ü ����� ��� ������ , �ܺο��� private ����)
	// ��밡���ϰ� �ϴ� ����
	// ������(Constructor) : Ŭ������ �޸𸮿� �ö󰥶� ����� ������ == Ŭ������ �̸��� ��ҹ��ڰ� ��Ȯ�� ����
	
	public static void main(String[] args) {
		Member mem = new Member(100); // new 'Member();'  << ������ �޼ҵ�
		System.out.println(mem.field);
	}
}
