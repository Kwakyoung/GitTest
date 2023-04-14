package pack03_array2;

import java.util.Scanner;

public class Test_mbti {
	public static void main(String[] args) {
		// i내향 e외향
		// n보이는것믿음 현재중시 s상상, 직감
		// f감성 t이성
		// p즉흥 j계획
		
		Scanner sc = new Scanner(System.in);
		int[] result = new int[4];
		
		
		System.out.println("나는 쉬는날이면 밖에 나가 놀고싶다. 1. O || 2. X ");
		result[0]=Integer.parseInt(sc.nextLine());
		System.out.println("나는 좀비가 나올때를 대비해 생각해본적이 있다. 1. 0 || 2. X ");
		result[1]=Integer.parseInt(sc.nextLine());
		System.out.println("친구가 차 사고가 났다. 먼저 생각나는것은? / 1. 아이고 많이 다쳤으려나 || 2. 보험들었겠지?");
		result[2]=Integer.parseInt(sc.nextLine());
		System.out.println("친구들이랑 놀러가기로 했다. 계획은? / 1. 알빠노 || 2. 어디가서 뭐먹을지 검색해서 스케줄을 짠다. ");
		result[3]=Integer.parseInt(sc.nextLine());
		
		if(result[0] == 1) {
			System.out.print("내 MBTI는 E");
		}else {
			System.out.print("내 MBTI는 I");
		}
		
		if(result[1] == 1) {
			System.out.print("S");
		}else {
			System.out.print("N");
		}
		if(result[2]==1) {
			System.out.print("F");
		}else {
			System.out.print("T");
		}
		if(result[3]==1) {
			System.out.print("P");
		}else {
			System.out.print("J");
		}
		
		
	}

}
