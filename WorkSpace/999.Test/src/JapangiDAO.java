import java.util.Scanner;

public class JapangiDAO {
	Scanner sc = new Scanner(System.in);
	
	public void display(JapangiDTO[] dtoArr){
		int coin = 0;
		int select = 0;
		int money = 0;
		String retry;
		for(int i=0; i<dtoArr.length; i++) {
			System.out.println((i+1)+"." +dtoArr[i].menu +"  "+dtoArr[i].price+"�� "+" ���:"+dtoArr[i].count+"��");
		}System.out.println();
		for(;;) {
			System.out.println("========�ݾ� �Է�=========");
			coin = Integer.parseInt(sc.nextLine());
			if(coin%10==0 && coin>0) {
				System.out.println("���� �Ӵ� : "+ coin + "��");
				System.out.println();
			}else {
				System.out.println("����!");
				continue;
			}	
			System.out.println("������� �Է¹ٶ�");
			select = Integer.parseInt(sc.nextLine())-1;
			try {
				if(select>=0 && select<4) {
					System.out.println(dtoArr[select].menu +" "+ dtoArr[select].price+"��");
					
					}else {
						System.out.println("����� ���ڸ� ���ּ���.");
			} 
			}catch (Exception e) {
				System.out.println("����� ���ڸ� ���ּ���.");
			}
			
			if(coin>dtoArr[select].price) {
				System.out.println(dtoArr[select].menu+" ������");
				System.out.println(dtoArr[select].menu+" ���� ���:"+--dtoArr[select].count);
				System.out.println("�ܵ� : "+(coin-dtoArr[select].price)+"��");
			}else {
				System.out.println(-(coin-dtoArr[select].price)+"�� ������");
				continue;
			}
			if(coin-dtoArr[select].price>800) {
				System.out.println("�߰� ���� ����ϸ� �߰����� �Է�, �׿� �Է½� ����");
			}else {
				System.out.println("����1");
				break;
			}
			retry = sc.nextLine();
			if(retry == "�߰�����") {
				System.out.println("���");
			}else {
				System.out.println("����");
				break;
			}
			
	}
	

	}
}
	
	
	
	

