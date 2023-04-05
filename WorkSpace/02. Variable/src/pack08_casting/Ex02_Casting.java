package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		// ���ڿ� = "12" + 34 = ����? 1234
		// String + int ��DataType��? String
		// Why? ���ڿ� + ��� = ���ڿ� ��Ģ
		// KYG(���ڿ�) + 10 = 
		// ���ڿ� ������ ��Ģ ��
		// "1" == 1 ? �ٸ���
		// "1" (String) �ٸ��� 1 (����)
		
		String sum = "12" + 34;
		System.out.println(sum);
		// � ���� String���� �ٲٴ� ���� ��û���� �����ϴ�.
		String sum2 = ""+1234;
		System.out.println(sum2);
		System.out.println(sum+sum2);
		
		
		// String sum , sum2 ������ ���ڿ��� ���ڸ� �����ص�.
		// �ΰ��� ���� �˰��ʹ�. "1234" + "1234" = ?
		// sum + sum2 =? 12341234
		// ���� 1234 + 1234 = 2468�� ����� ���� �Ѵ�.
		// String => int ? 
		// int , double ���� ��������� �۾� �ٲ�°� => �⺻Ÿ��
		// �빮�ڷ� �����ϴ� �͵� => ��κ� ClassŸ��
		// �⺻�� ������ Ÿ���� Wrapper class��°��� ������ �ִ�.
		// int => ��integer�� , double Double
		// String�� �ش��ϴ� Ÿ������ �ٲ��ִ� ������ �ϴ� ��
		// String�� �ִ� ""<=�� �����Ѵ�.
		int num = Integer.parseInt(sum) + 1234;
		// num2�� sum2�� ���ڷ� �ٲ㼭 �־��.
		System.out.println(num);
		
		int num2 = Integer.parseInt(sum2); 
		System.out.println(num+num2);
		String sAvg = "88.6";
		// �� + 10�� �� ����� �������. (98.6)
		// sAvg <= double���·� �ٲٴ°� �غ���.
		double dAvg = Double.parseDouble(sAvg)+10; 
		System.out.println(dAvg);
		//WrapperClass.parseDataTupe(String); => DataType
		//ex) Integer.parsInt(String);
		
		//Float.parseFloat(sAvg)
		//Long.parseLong(sAvg)
		//Byte.parseByte(sAvg)
		
		String str = "������";
		// �� �ش� �����͸� ���ڷ� �ٲܼ� ������? wrapperClass�̿�
		// 1. �õ��غ���
		// 2. � ������ �߻��ϴ��� üũ�غ���.
		int kyg = Integer.parseInt(str) + 10;
		System.out.println(kyg);
		// �ܼ�â�� Ȯ���ϱ� ( ������ �� == ���� )
		
			}

}