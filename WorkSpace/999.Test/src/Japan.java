import java.util.Scanner;

public class Japan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu[] = new String[3];
		int price[] = new int[3];
		int count[] = new int[3];
		menu[0]="��  ��";
		menu[1]="���̴�";
		menu[2]="ȯ  Ÿ";
		price[0]= 800;
		price[1]=1000;
		price[2]= 900;
		count[0]=5;
		count[1]=4;
		count[2]=1;
		int coin = 0;
		int select = 0;
		
		
		try {
			for(int i=0; i<menu[i].length(); i++) {
				System.out.println("�޴� : "+(i+1)+" "+menu[i]);
				System.out.println("���� : "+price[i]);
				System.out.println("��� : "+count[i]);
				System.out.println("=============");

		}
		} catch (Exception e) {
			System.out.println("�޴� ��ȣ�� �����ּ���.");
	}
		
		for(;;) {
		select = Integer.parseInt(sc.nextLine())-1;
		if(select>=0&&select<4) {
			System.out.println(menu[select]);
			break;
		}else {
			System.out.println((select+1)+"�� �޴��� �����ϴ�. �ٽ� �Է����ּ���.");
		}
		}System.out.println("������ "+price[select]+"�Դϴ�.");
		System.out.println("���� �Է����ּ���.");
		
		for(;;) {
			coin = Integer.parseInt(sc.nextLine());
			
			if(coin%10==0) {
				System.out.println(coin+"��");
				if(coin>=price[select]) {
					count[select]--;
					System.out.println("���� ���Խ��ϴ�. �Ž������� "+(coin-price[select])+"���Դϴ�.");
					System.out.println("���� ��� : "+count[select]);
					break;
				}else {
					System.out.println("���� �����մϴ� �ٽ� �Է����ּ���");
				}
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
			
	
	}
}
		

