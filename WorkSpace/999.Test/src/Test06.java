
public class Test06 {
	public static void main(String[] args) {
		// Test06 Ŭ������ �ϳ� ����� int�� ������ �����Ͽ� 5���� �����ϰ�
		// ���� ���� �Ҵ��ϰ� ����غ���.
		// �������� ������ ���������� �����ϱ� ���� �뵵�̴�. 
		// ����, ����, ����, ����, ü��
		int korScore, mathScore, engScore, sinScore, helScore;
		korScore = 90;
		mathScore = 80;
		engScore = 70;
		sinScore = 60;
		helScore = 50;
		System.out.println(korScore);
		
		// ����ȯ(Casting) : ���� �ٸ� Ÿ���� ������ ��ȯ���� �����.
		// ex) int <-> double , String <-> int
		// int < double
		int iValue = 10;
		double dValue = iValue + 0.5; //�ƹ��͵� �Ѱ;��� ==> �ڵ� ����ȯ
		System.out.println(iValue);
		System.out.println(dValue);
		
		//�� ū ������Ÿ���� ���� Ÿ�Կ� ���� �� ������ �߻���.
		//�����ڰ� � Ÿ������ �ٲܰ��� ��ø� ���༭ ������ �ٲ�.
		//�츮�� � �۾��� �� ==> ���� ����ȯ
		iValue = (int)dValue; // ������ �߻��� = �Ҽ��� ����
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		String str ="1234"+ 12; // �� : 123412
		//���ڿ��� � ���� ���ϴ� �� == ��x => ���� (������ ��ħ)
		int iData = 1234 + 12; // �� : 1246
		//������ �������� ���� == �� => ���� ��ħ
		System.out.println(str);
		System.out.println(iData);
		
		//str���� ���� 123412��� ���ڿ��� ����Ǿ� ����.
		//���ڷ� �ٲٷ��� ��� �ؾ��ұ�? ("" <=����)
		//123412�� ���� ���ڷ� �ٲٰ� +1�� ����� ����غ���
		// int => ? , double => ? , wrapperClass ù���ڰ� �빮��
		int sum = Integer.parseInt(str)+1;
		System.out.println(sum);
		
		// boolean (�ο���) true �Ǵ� false �� ������ ������.
		
		String sum1 = "" + 1234 + 5678 + "�����ٶ�";
		System.out.println(sum1);
	}

}
