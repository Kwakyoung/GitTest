package dao.dto.method;

public class Method {
	public static void main(String[] args) {
		Method mt = new Method();
		mt.�������׿뵷(10000);
		
		int money = mt.���ɺθ�(100000);
		System.out.println("�ɺθ� ������ ���� �����ݾ� " + money);
	}
	// void : x  : ���ǿ��� � ���ø� ������ �� ����� �ʿ���� ��� :  
	// return : ���ǿ��� � ���ø� ������ �� ����� �ʿ��� ���  :  ��� �ɺθ��� �������� �������� ���
	public void �������׿뵷(int money)	{
		money = 20000;  // � ��ɿ� ���ؼ� ���� �ٲ�
		System.out.println(money + "�������� �뵷��. �˾Ƽ� ���⶧���� ����� �ʿ����.");
		System.out.println(money + "�� �� �޼ҵ� ���ο����� �����ϰ� �� �ܿ����� �޸𸮿� ����x");
	}
	public int ���ɺθ�(int money) {
		System.out.println("�������� ��� �ɺθ� ��Ŵ"+money+"���� ��");
		System.out.println("������� ���� ���� 50000");
		money-=50000;
		return money;
	}
	
}