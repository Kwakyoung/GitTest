package pack03_for;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// print, println 잘 활용
		// 다중 for문을 이용해서 별찍기
					//★
					//★★
					//★★★
		
		// 응용문제 Scanner를 이용해서 숫자입력받기.
		// 입력받은 숫자까지의 구구단을 출력하는 for문을 만들어보기
		// 2 미만의 숫자를 입력하면 구구단을 출력x => 잘못된숫자라고 콘솔에 출력하기
		// 2 이상의 숫자가 입력되면 해당하는 단까지의 구구단을 출력하기.
		
		
		for (int i = 1; i <= 5; i++) {
			for(int u = 1; u <= i; u++) {     // 1<= 5 , 2<= 5 , ...
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		System.out.println("===================================");
		
		
		// 2~9 반복 = <= 사용자가 입력한 횟수
		// 1~9 반복 
		// 스캐너 사용해서
		// 2미만의 숫자를 입력하면 구구단을 출력x => 잘못된숫자 라고 콘솔창에 출력만함.
		// 2이상의 숫자가 입력 되면 해당하는 단까지의 구구단을 출력하기. 
		
		System.out.println("2이상의 수를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int num = Integer.parseInt(st);
		if (num<2) {
			System.out.println("잘못된 숫자");
		}else {
			System.out.println("원하는 단의 숫자를 입력해주세요");
		}
		Scanner sd = new Scanner(System.in);
		String sk = sd.nextLine();
		int num1 = Integer.parseInt(sk);
		for(int i = 1; i <= 9; i++) {
			System.out.println(num1 + "x" + i + "=" + (num1*i));
		}
		
		
			
		
		
			
			
		
		
		
		
		
	}

}
