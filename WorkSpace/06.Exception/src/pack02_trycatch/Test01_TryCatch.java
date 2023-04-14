package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		// 배열의 랜덤한 공간에 숫자 숨기기 게임.
		// 기존 로직 그대로 사용하면 됨.
		// 단, 사용자의 입력은 자유로운데 잘못입력시 "잘못된 입력입니다. 숫자범위 ?~? 까지만 입력해주세요."
		// 가 나오고 프로그램은 강제로 종료되는 경우가 없다. (게임 끝까지.)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("랜덤한 숫자 맞추기 게임!");
		System.out.println("난이도를 선택해주세요.");
		int level=0;
		int[] gameArray = new int[0];
		String[] gameResults = new String[0];
		
		while (level<2) {
			try {
			level = Integer.parseInt(sc.nextLine());  // <= 숫자 외에 값 입력 오류!
			gameArray = new int[level];  
			}catch (Exception e) {
				System.out.println("2이상의 숫자를 입력하세요.");
				level = Integer.parseInt(sc.nextLine());
			}
		}
		gameResults = new String[level];
		for(int i = 0; i < gameResults.length; i++) {
			gameResults[i] = "?";
		}
		
		int random = new Random().nextInt(level); // <= -값 들어오면 오류
		
		
		gameArray[random] = 1; // [1] [0] [0]
		
		
		for(;;) {
			try {
			System.out.println("1부터" + gameArray.length+ "사이 값을 입력!");
			for(int i = 0; i < gameResults.length; i++) {
				System.out.print(i+1+"["+gameResults[i]+"] "); 
			}System.out.println();
			
			int userNum = Integer.parseInt(sc.nextLine())-1; 
			if(gameArray[userNum] == 1) {
				System.out.println("정답!!");
				break;
			}else {
				gameResults[userNum] = "X";
				System.out.println("오답!!");
			}	
		}
		catch (Exception e) {
			System.out.println("잘못된 입력입니다. 숫자범위 "+1+"~"+level+"까지만 입력해주세요.");
			
		}

		
			
		
		}
	}
}
