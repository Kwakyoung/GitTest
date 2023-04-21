import java.util.Scanner;

public class JapangiDAO {
	Scanner sc = new Scanner(System.in);
	void display(JapangiDTO dto) {
		System.out.println("메뉴 :"+dto.menu);
		System.out.println("가격 :"+dto.price);
		System.out.println("수량 :"+dto.count);
		System.out.println("==============");
	}
	
	void display() {
		int coin = 0;
		System.out.println("돈을 넣어주세요.");
		for(;;) {
			coin = Integer.parseInt(sc.nextLine());
			System.out.println(coin+"원");
			if(coin%10==0 || coin%50==0 || coin%500==0 || coin%1000==0) {
				System.out.println("음료를 선택하세요.");
				break;
			}else {
				System.out.println("오류입니다.");
			}
		}
		
		
	}
	
	
	
	
	
	
}
