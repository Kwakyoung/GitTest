package pack01_base;

import java.util.Scanner;

public class Ex06_Method {
	// return 이 없는 메소드 2개 (파라메터가 있음, 없음)
	// return 이 있는 메소드 2개 (파라메터가 있음, 없음)
	
	// 이름 타입 형태 전부 자유.
	// 리턴타입 메소드명 (파라메터부) {
	
	//}
	
	void sum() {
		System.out.println(" method1 ");
	}
	
	void sum1(String data) {
		if(data == null) {
			return;  // 메소드를 중지시키고 블럭킹끝으로 이동
		}
		System.out.println(" method2 " + data);
	}
	
	boolean isMethod3() {
		System.out.println(" method3 ");
		return true;
	}
	
	boolean isMethod4(String data1) {
		System.out.println();
		return true;
	}
	
	
	String sMethod() {
		return "a";
	}
	
	double dMethod() {
		return 3.14;
	}
	
	int[] aMethod() {
		return new int[1];
	}
	
	
	Scanner scanMethod() {
		return new Scanner(System.in);
	}
	
	
}
