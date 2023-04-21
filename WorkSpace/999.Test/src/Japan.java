import java.util.Scanner;

public class Japan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu[] = new String[3];
		int price[] = new int[3];
		int count[] = new int[3];
		menu[0]="콜  라";
		menu[1]="사이다";
		menu[2]="환  타";
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
				System.out.println("메뉴 : "+(i+1)+" "+menu[i]);
				System.out.println("가격 : "+price[i]);
				System.out.println("재고 : "+count[i]);
				System.out.println("=============");

		}
		} catch (Exception e) {
			System.out.println("메뉴 번호를 눌러주세요.");
	}
		
		for(;;) {
		select = Integer.parseInt(sc.nextLine())-1;
		if(select>=0&&select<4) {
			System.out.println(menu[select]);
			break;
		}else {
			System.out.println((select+1)+"번 메뉴는 없습니다. 다시 입력해주세요.");
		}
		}System.out.println("가격은 "+price[select]+"입니다.");
		System.out.println("돈을 입력해주세요.");
		
		for(;;) {
			coin = Integer.parseInt(sc.nextLine());
			
			if(coin%10==0) {
				System.out.println(coin+"원");
				if(coin>=price[select]) {
					count[select]--;
					System.out.println("음료 나왔습니다. 거스름돈은 "+(coin-price[select])+"원입니다.");
					System.out.println("남은 재고 : "+count[select]);
					break;
				}else {
					System.out.println("돈이 부족합니다 다시 입력해주세요");
				}
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
			
	
	}
}
		

