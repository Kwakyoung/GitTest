package pack02_static;

import java.util.Scanner;

public class Test01_MethodMain {
	public static void main(String[] args) {
		// 1. 사용자로 부터 콘솔창을 통해 ID와 PW를 입력받는다.
		// 2. id와 pw를 Test01_Method의 login이라는 메소드에 전송하여
		// id가 master, pw가 master1234이면 true, 그외에는 false를 리턴하게 만든다.
		// 3. 해당 결과에 따라서 로그인 되었습니다, 로그인 실패가 콘솔창에 나오게 만들어보기.
		
		// 4. Scanner 자체를 Test01_Method 내부에 메소드 구현을 통해서 생성받아 사용하게끔 처리
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();
		System.out.println("패스워드를 입력하세요.");
		String pw = sc.nextLine();
		
		Test01_Method tm = new Test01_Method();
		if(tm.login(id, pw)) {
			System.out.println("회원님 환영합니다. 메인컨텐츠");
		}else {
			System.out.println("Alert! 아이디 또는 비밀번호 확인");
		}
		
		
		
		
	
	
	}
}
