import java.util.Scanner;

public class Japan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu[] = new String[3];
		int price[] = new int[3];
		int count[] = new int[3];
		menu[0]="1. ��  ��";
		menu[1]="2. ���̴�";
		menu[2]="3. ȯ  Ÿ";
		price[0]= 800;
		price[1]=1000;
		price[2]= 900;
		count[0]=5;
		count[1]=4;
		count[2]=1;
		int coin = 0;
		
		try {
			for(int i=0; i<menu[i].length(); i++) {
				System.out.println("�޴� : "+menu[i]);
				System.out.println("���� : "+price[i]);
				System.out.println("��� : "+count[i]);
				System.out.println("=============");

		}
		} catch (Exception e) {
			System.out.println("�޴� ��ȣ�� �����ּ���.");
	}
		int select = Integer.parseInt(sc.nextLine());
		
	}
}
		

