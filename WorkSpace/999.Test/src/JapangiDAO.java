import java.util.Scanner;

public class JapangiDAO {
	Scanner sc = new Scanner(System.in);
	
	public void display(JapangiDTO[] dtoArr){
		int coin = 0;
		int select = 0;
		int money = 0;
		String retry;
		for(int i=0; i<dtoArr.length; i++) {
			System.out.println((i+1)+"." +dtoArr[i].menu +"  "+dtoArr[i].price+"원 "+" 재고:"+dtoArr[i].count+"개");
		}System.out.println();
		for(;;) {
			System.out.println("========금액 입력=========");
			coin = Integer.parseInt(sc.nextLine());
			if(coin%10==0 && coin>0) {
				System.out.println("현재 머니 : "+ coin + "원");
				System.out.println();
			}else {
				System.out.println("오류!");
				continue;
			}	
			System.out.println("음료숫자 입력바람");
			select = Integer.parseInt(sc.nextLine())-1;
			try {
				if(select>=0 && select<4) {
					System.out.println(dtoArr[select].menu +" "+ dtoArr[select].price+"원");
					
					}else {
						System.out.println("목록의 숫자를 해주세요.");
			} 
			}catch (Exception e) {
				System.out.println("목록의 숫자를 해주세요.");
			}
			
			if(coin>dtoArr[select].price) {
				System.out.println(dtoArr[select].menu+" 나왔음");
				System.out.println(dtoArr[select].menu+" 남은 재고:"+--dtoArr[select].count);
				System.out.println("잔돈 : "+(coin-dtoArr[select].price)+"원");
			}else {
				System.out.println(-(coin-dtoArr[select].price)+"원 부족함");
				continue;
			}
			if(coin-dtoArr[select].price>800) {
				System.out.println("추가 구매 희망하면 추가구매 입력, 그외 입력시 종료");
			}else {
				System.out.println("종료1");
				break;
			}
			retry = sc.nextLine();
			if(retry == "추가구매") {
				System.out.println("계속");
			}else {
				System.out.println("종료");
				break;
			}
			
	}
	

	}
}
	
	
	
	

