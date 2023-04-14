package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test02_Game {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("랜덤한 숫자 맞추기 게임!");
		System.out.println("난이도를 선택해주세요.");
		
		int level = Integer.parseInt(sc.nextLine());  // <= 오류가 나는 코드인지 알고있음. ( A=>예외 )
		
		int[] gameArray = new int[level];  
		String[] gameResults = new String[level];  // [null] [null] ... [null]
		for(int i = 0; i < gameResults.length; i++) {
			gameResults[i] = "?";
		}
		
		int random = new Random().nextInt(level); 
		
		
		gameArray[random] = 1; // [1] [0] [0]
		
		for(;;) {
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
		
	}

}
