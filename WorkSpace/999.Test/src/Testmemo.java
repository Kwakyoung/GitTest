import java.util.Scanner;

public class Testmemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] mbtiResult = new int[4];
		System.out.println("나는 밖에서 에너지를 얻는다: 1. O 2. X");

		mbtiResult[0] = Integer.parseInt(sc.nextLine());

		System.out.println("나는 잡생각이 많다: 1. O 2. X");

		mbtiResult[1] = Integer.parseInt(sc.nextLine());

		System.out.println("나는 남들이 울면 같이 운다: 1. O 2. X");

		mbtiResult[2] = Integer.parseInt(sc.nextLine());

		System.out.println("나는 일이 계획대로 흘러가지않으면 스트레스를 받는다: 1. O 2. X");

		mbtiResult[3] = Integer.parseInt(sc.nextLine());



		if(mbtiResult[0] == 1) {

			System.out.print("E");

		}else {

			System.out.print("I");

		}

		if(mbtiResult[1] == 1) {

			System.out.print("N");

		}else {

			System.out.print("S");

		}

		if(mbtiResult[2] == 1) {

			System.out.print("F");

		}else {

			System.out.print("T");

		}

		if(mbtiResult[3] == 1) {

			System.out.print("J");

		}else {

			System.out.print("P");

		}
	}
}
