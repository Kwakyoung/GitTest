package pack01_Variable;

public class Ex01_Variable {
public static void main(String[] args) {
	//int a, String b ���� ���¸� ������� ��.
	//int <= ������ ��Ƽ� �����ϱ����� ���� Ÿ��
	//���� a��b��� �����̸��� ����ϰڴ� => ����
	int a;
	int b;
	int c;
	//intŸ���� ���� ���� �̸� c�� �����غ�����
	//���α׷��� ������ =�� ����(���)
	a = 10; // ���� �Ҵ� (���)
	// b���� 20, c���� 30�� ���� �Ҵ��غ���.
	b = 20; //<= �����ݷ�(;) java������ �౸��
	c = 30;
	System.out.println(c);
	System.out.println(b);
	// int <= (���� �Ҽ����� ���� ���ڸ� ǥ���ϱ� ���� Ÿ��)
	// ������ ����� ���ÿ� �� �Ҵ� : ������ �ʱ�ȭ
	// int a;
	// a=10;
	int d = 40; // ������ �ʱ�ȭ
	a = 50; //���� (���� ���Ѵ�) a�� 10 -> 50
	System.out.println(a);
	System.out.println(d);
}
}