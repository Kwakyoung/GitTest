package pack09_scanner;

import java.util.Scanner;

public class Ex02_Scanner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // ����� �ȳ��� ���� (�ϱ�)
	String inputData = sc.nextLine(); // ���� ����Ű ġ�� �������� ���ڿ��� ������
	String Data = sc.nextLine();
	System.out.println(inputData);
	System.out.println(Data);
	
	int sum = Integer.parseInt(inputData)+Integer.parseInt(Data);
	System.out.println(sum);
	
	System.out.println(Integer.parseInt(inputData)+Integer.parseInt(Data));
	
	

	
	
	
	
	

	
	
		
}
}
