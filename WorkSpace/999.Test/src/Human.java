
public class Human {
	// ���� ������ : �ٸ�Ŭ�������� ���� �������� ���ϰ� ������ �����ϴ�? 
	// public  (���� ������Ʈ ������)
	// default (���� ��Ű�� ������)
	// private (Ŭ���� ���ο�����)
	
	public String ask;  // ������ ����
	String look;  // ������ ������ ���Ѻ���
	private String river;  // �� (����)
	
	public String getRiver(boolean isDoctor) {
		if(isDoctor) {
			return river;
		}else {
			return "����� �ǻ簡 �ƴϱ⶧���� ������ �Ұ���";
		}
	}
	public void setRiver(String river) {
		if(river.equals("�̽��� ��")) {
			this.river = river;			
		}else {
			System.out.println("�ٲܼ� ����");
		}
	}
	
	
	
	
	
	
}
