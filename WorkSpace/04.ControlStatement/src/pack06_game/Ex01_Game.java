package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_Game  {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int random = new Random().nextInt(100)+1; //1~100까지의 수 채번
		while(true) {
			System.out.println("1부터 100사이의 정수를 입력하세요 ▶");
			int i = Integer.parseInt(sc.nextLine());
			a++;
			if (random<i) {
				System.out.println("더 작은수를 입력하세요");
			}else if (random>i){
				System.out.println("더 큰수를 입력하세요");
			}else{
				System.out.println("맞췃습니다!");
				
				System.out.println("시도 횟수는 : "+ a +"입니다.");
				break;
				
		
			}
		
	}

	}
}
