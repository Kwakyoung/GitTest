package pack09_scanner;

import java.util.Scanner;

public class Ex01_scanner {
	public static void main(String[] args) {
		// Scanner(�Է�)=> �ڹ� (���) => �ܼ�â
		Scanner sc = new Scanner(System.in); //Ŭ������ �ʱ�ȭ�� (5��)
		// �ܺο��� ������ �����͸� ����غ������ؼ� �ܿ��� ����غ���
		System.out.println("����Ҳ���?");
		String inputData = sc.nextLine();
		System.out.println("������� �Դ���?");
		//1. �ܺο��� �Է��� ���ڴ� String���·� inputData��� ������ ���´�.
		//�����Ϳ� +10�� �Ѱ���� ����غ�����.
		//System.out.println(inputData+10);
		
		int sum1 = Integer.parseInt(inputData);
		System.out.println(sum1+10);
		
		int sum = Integer.parseInt(inputData)+10;
		System.out.println(sum);
		
		//Ex02_Scanner�� �����, ���ڸ� �Է¹޾� + 20�� ����� �������ϱ�.
		
		
		
		
	}

}