package pack01_Variable;

public class Test09_Variable {
// int num1, int num2
// 각각의 변수에는 숫자 1과 2가 담아져 있음.
// 값의 재할당 x, 두개의 숫자를 바꿔보기.
// 수단과 방법은 다 사용가능하나. 재할당 불가.
// 초기 : num1(1), num2(2)
// 결과 : num1(2), num2(1)
// num1=2 <= 이방식은 X
	public static void main(String[] args) {
	int num1 = 1;
	int num2 = 2;
	int num3 = 0;
	// SWAP
	num3 = num2;
	num2 = num1; 
	num1 = num3;
	
	
	
	System.out.println(num1);
	System.out.println(num2);
	}

}
