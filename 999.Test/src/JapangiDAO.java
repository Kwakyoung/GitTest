import java.util.Scanner;

public class JapangiDAO {
	Scanner sc = new Scanner(System.in);
	void display(JapangiDTO dto) {
		System.out.println("�޴� :"+dto.menu);
		System.out.println("���� :"+dto.price);
		System.out.println("���� :"+dto.count);
		System.out.println("==============");
	}
	
	void display() {
		int coin = 0;
		System.out.println("���� �־��ּ���.");
		for(;;) {
			coin = Integer.parseInt(sc.nextLine());
			System.out.println(coin+"��");
			if(coin%10==0 || coin%50==0 || coin%500==0 || coin%1000==0) {
				System.out.println("���Ḧ �����ϼ���.");
				break;
			}else {
				System.out.println("�����Դϴ�.");
			}
		}
		
		
	}
	
	
	
	
	
	
}
