package pack01_if;

public class Ex05_IfElseIf {
	public static void main(String[] args) {
		// if else 문으로는 어떤 조건을 줄때 true 인지와 false 인지 두가지 경우만 만들수가 있음. ex)짝수? Y(TRUE) else N(FALSE)
		// if (조건식A){
			// 조건식A가 TRUE일때 실행할 코드를 넣어줌..
		//} else if ( 조건식 B ) {
			// 조건식 A가 TRUE가 아니고 조건식 b일때 실행할 코드를 넣어줌.
		//} else if ( 조건식 C ) {
			// 조건식 A와 B가 TRUE가 아니고 조건식 C일때 실행할 코드를 넣어줌.
		//}else {
			//if와 elseif의 모든 조건이 TRUE가 아닐때 실행부. ( 규칙 : if문 블럭킹 끝에 붙여서 사용한다. )
		//}
		int score = 50; // 기존방식으로 score가 90점 이상이면 A, 80B, 70C 그외에는 D
		// if else 만 이용해서
		
		if(score >= 90) {
			System.out.println("A");
		}
		
		if(score >= 80 && score < 90) {  // 80점 이상이고 90보다 작으면
			System.out.println("B");
		}
		if(score >= 70 && score < 80) {  
			System.out.println("C");
		}
		if(score < 70) {  
			System.out.println("D");
		}
		
		if (score >= 90) { 
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70){
			System.out.println("C");
		}else if (score < 70) {
			System.out.println("D");
		}
		
	}

}
