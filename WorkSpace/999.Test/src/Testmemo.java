import java.util.Scanner;

public class Testmemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] mbtiResult = new int[4];
		System.out.println("���� �ۿ��� �������� ��´�: 1. O 2. X");

		mbtiResult[0] = Integer.parseInt(sc.nextLine());

		System.out.println("���� ������� ����: 1. O 2. X");

		mbtiResult[1] = Integer.parseInt(sc.nextLine());

		System.out.println("���� ������ ��� ���� ���: 1. O 2. X");

		mbtiResult[2] = Integer.parseInt(sc.nextLine());

		System.out.println("���� ���� ��ȹ��� �귯���������� ��Ʈ������ �޴´�: 1. O 2. X");

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