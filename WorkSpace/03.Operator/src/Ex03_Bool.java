
public class Ex03_Bool {
	public static void main(String[] args) {
		// true 와 false만 저장이 가능한 변수타입이 있었는데 그게 뭘까??!
		// 변수 두개를 만들고 하나에는 true 하나에는 false를 할당하고 출력해보기.
		// true (1) , false (0)
		
		// AND 연산자는 논리곱 true(1) * false(0) = false (논리곱은 모든 조건이 true 일때만 true 임)
		// 로그인 ( 아이디가 맞고(TRUE) * 비밀번호가 맞고(TRUE) => 로그인 TRUE )
		
		
		// OR  연산자는 논리합 TRUE(1) + FALSE(0) = TRUE (논리합은 하나의 TRUE가 전체 조건식을 TRUE로 만듬)
		// 한가지의 조건만 만족을 시키면 TRUE로 뺄때..
		// 좋아하는 과일을 1가지 이상 선택해주세요. (과일1=선택 , 과일2 , 과일3 )
		
		// AND 연산자 & , OR 연산자 |
		
		// NOT => ! 
		// 어떤 true , false(bool)앞에 붙이면 해당 결과를 반전시킴.
		
		boolean bTrue = true;
		boolean bFalse = false;
		System.out.println(!bTrue);
		System.out.println(!bFalse);
	}

}
