package pack09_scanner;

import java.util.Scanner;

public class Ex02_Scanner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // 기억이 안나면 복붙 (암기)
	String inputData = sc.nextLine(); // 내가 엔터키 치기 전까지의 문자열을 가져옴
	String Data = sc.nextLine();
	System.out.println(inputData);
	System.out.println(Data);
	
	int sum = Integer.parseInt(inputData)+Integer.parseInt(Data);
	System.out.println(sum);
	
	System.out.println(Integer.parseInt(inputData)+Integer.parseInt(Data));
	
	

	
	
	
	
	

	
	
		
}
}
