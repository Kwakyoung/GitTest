package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 1234567890;
		System.out.println(i);
		//int �̻��� ���� ���� �� �ִ� ������ ������Ÿ���� ������.
		//long�� l1�̶�� ������ �����ϱ�.
		//long�� l2��� ������ �ʱ�ȭ ��Ű��.12345678901
		
		long l1;
		long l2 = 1234567890112312312L; // ���� + longŸ���̶�� ������ 
		System.out.println(l2);
		
		//�Ǽ��� ������ Ÿ�� : float, double
		//�Ǽ����� �Ҽ����� �ִ°��� ǥ���ϱ� ���� ����
		//float�� long�� ���������� ������ F�� �ٿ���߸� ��.
		//����) ������Ÿ�� float�� ����Ͽ� ���� ����, �Ҵ�, �ʱ�ȭ �غ���
		//����) ������Ÿ�� double�� �̿��Ͽ� ��
		//������ Ǯ �� �Ҽ����� �ִ� ���� ��� (�Ҵ�)
		float num1;
		num1 = 3.14F;
		float num2 = 3.15F;
		
		double kw1;
		kw1 = 10.1;
		double kw2 = 10.5;
		// �ڿ� �����ڰ� �ٴ� long, float ���ϴ�??
		// ��ǥ�� : �� int, double ��
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(kw1);
		System.out.println(kw2);
		
	}

}