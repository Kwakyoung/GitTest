package pack02_byte;

public class Ex01_byte {
	public static void main(String[] args) {
		// { } <= main 지역
		// byte 타입의 변수를 선언해 보기 var1
//		byte var1; //변수타입 변수명; <=선언
//		var1 = 0;  //선언된 변수 = 값; <=할당
//		byte var2 = 10;
		// byte는 관련된 8개의 비트들로 구성되어있음.
		// bit 0또는 1 두가지 정보를 표현할 수 있는
		// 최소한의 정보 표현 단위 입니다.
		// -128 ~ 127 표현 가능
		// var1에는 -128을 재할당, var2에는 127을 재할당
		// 하고 출력 해보기.
		// ※변수는 표현 범위를 가지기 때문에 해당하는 범위안에서 사용※
		byte var1 = -128;
		byte var2 = 127;
		
		System.out.println(var1);
		System.out.println(var2);
		int num1 = 1234567890;
		
		
	}
}
