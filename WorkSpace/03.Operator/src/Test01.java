
public class Test01 {
	public static void main(String[] args) {
		
		int sum1 ;  // 선언 ( 어떤 이름을 사용 하겠다고.. ) 후 값을 안넣어주면 사용x
		sum1 = 1;   // 할당 ( 값을 넣어줌 값=리터럴 )
		
		double num1 = 3.14; // 초기화 ( 선언과 동시에 할당)
		double dNum2, dNum3 ; // ..나열
		
		String str = "문자열";
		
		// -- 캐스팅 --
		String numStr = "123"; /// 123이라는 문자열을 숫자로 바꾸고 +10한 결과를 얻어보기
		
		int num = Integer.parseInt(numStr)+10;
		System.out.println(num);
		String numStr1 = ""+num;
		System.out.println(numStr1);
		
	}

}
