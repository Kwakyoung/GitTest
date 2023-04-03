
public class Ex05_Oper {
	public static void main(String[] args) {
		int result = 0;
		// result에 10을 더한 결과를 다시 result에 할당.
		// 최종적으로는 20
		result = result+10;
		result = result+10;
		System.out.println(result);
		result+=10;  // result+10을 줄여서 쓴것 복합대입연산자라고함.
		result+=10;  // result+10을 줄여서 쓴것 복합대입연산자라고함.
		System.out.println(result + 10); // 50
		System.out.println(result); // ? 결과값 : 40
		
		
	}

}
