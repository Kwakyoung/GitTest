package pack01_if;

import java.util.Scanner;

public class Test_DiceGame {
	public static void main(String[] args) {
		// ex) 사용자가 어떤 동작을 진행했을때 게임이 진행되는 것 == 조작
		System.out.println("주사위 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다. 그외 숫자입력시에는 게임시작");
		Scanner sc = new Scanner(System.in);
		// -1은 종료가 출력되고 그외에는 게임시작이 콘솔에 출력되게 조건문을 이용해서 만들어보기.
		String Data = sc.nextLine();
		int sum = Integer.parseInt(Data);
		if(sum == -1) {
			System.out.println("종료합니다.");
		}else {
			System.out.println("게임시작!");
		}
		System.out.println("사용자가 주사위를 굴릴 차례입니다. (굴리기 ENTER)");
		sc.nextLine();  // enter key를 누를때까지 대기 (여기서 나온 입력 데이터는 쓸모x)
		int userNum = (int)(Math.random() *6)+1;  // 1~6까지의 수 랜덤하게 뽑는 기능(메소드)
		System.out.println("사용자의 수"+ userNum);
		System.out.println(" 컴퓨터가 주사위를 굴릴 차례입니다. (진행 ENTER)");
		sc.nextLine();
		int comNum = (int)(Math.random() *6)+1;
		System.out.println("컴퓨터의 수" + comNum);
		
		if(userNum > comNum) {
			System.out.println("사용자가 이겼습니다.");
		}else if (userNum < comNum){
			System.out.println("컴퓨터가 이겼습니다.");
		}else {
			System.out.println("비겼습니다.");
		} // 나의 승률을 20% 정도 조작해서 상승시키려면 어떻게 해야할까? 6숫자를 뺀다 ㅋ.ㅋ
		
		
	}

}
