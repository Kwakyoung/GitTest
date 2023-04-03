
public class Test02 {
	public static void main(String[] args) {
		// 선행연산, 후행연산 차이 생각해보기.
		
		int x = 1 ;
		int y = 1 ;
		int result1 = ++x + 10;  // 12 연산 후 명령 실행.
		int result2 = y++ + 10;  // 11 명령 후 연산 실행.
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
