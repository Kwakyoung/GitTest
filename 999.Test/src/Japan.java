import java.util.Scanner;

public class Japan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu[] = new String[3];
		int price[] = new int[3];
		int count[] = new int[3];
		menu[0]="1. 콜  라";
		menu[1]="2. 사이다";
		menu[2]="3. 환  타";
		price[0]= 800;
		price[1]=1000;
		price[2]= 900;
		count[0]=5;
		count[1]=4;
		count[2]=1;
		int coin = 0;
		
		try {
			for(int i=0; i<menu[i].length(); i++) {
				System.out.println("메뉴 : "+menu[i]);
				System.out.println("가격 : "+price[i]);
				System.out.println("재고 : "+count[i]);
				System.out.println("=============");

		}
		} catch (Exception e) {
			System.out.println("메뉴 번호를 눌러주세요.");
	}
		int select = Integer.parseInt(sc.nextLine());
		
	}
}
		

