package pack01_Variable;

public class Test09_Variable {
// int num1, int num2
// ������ �������� ���� 1�� 2�� ����� ����.
// ���� ���Ҵ� x, �ΰ��� ���ڸ� �ٲ㺸��.
// ���ܰ� ����� �� ��밡���ϳ�. ���Ҵ� �Ұ�.
// �ʱ� : num1(1), num2(2)
// ��� : num1(2), num2(1)
// num1=2 <= �̹���� X
	public static void main(String[] args) {
	int num1 = 1;
	int num2 = 2;
	int num3 = 0;
	// SWAP
	num3 = num2;
	num2 = num1; 
	num1 = num3;
	
	
	
	System.out.println(num1);
	System.out.println(num2);
	}

}