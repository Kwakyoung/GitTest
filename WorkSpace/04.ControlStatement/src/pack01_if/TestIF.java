package pack01_if;

public class TestIF {
	public static void main(String[] args) {
		// 1. int형 변수 code를 만든다. code의 값이 1이면 '남자' 2이면 '여자' 3이면 '남자' 4이면 '여자' 그외값은 '오류'가 출력되게
		
		// 2. int random = (int)(Math.random() *6)+1 ; <= 해당코드가 실행되고나면 1~6까지의 수가 랜덤하게 할당이됨.
		// 조건문을 이용해서 random의 숫자가 몇인지 출력하기.
		// 조건문을 꼭 이용해서 6개의 조건을 만들기.
		// ex) random(1) : 1이 출력이 되었습니다 .... ~6 까지
		
		int code = 1;
		 if(code == 1 || code == 3) {
			 System.out.println("남자");
		}else if (code ==2 || code == 4){
			 System.out.println("여자");
		 }else if(code != 1 && code !=2 && code !=3 && code !=4 ){
			 System.out.println("오류");
		  }
		
		
		
		
		int random = (int)(Math.random() * 6)+1;
		
		if(random == 1) {
			System.out.println("1입니다");
		}else if(random == 2) {
			System.out.println("2입니다");
		}else if(random == 3) {
			System.out.println("3입니다");
		}else if(random == 4) {
			System.out.println("4입니다");
		}else if(random == 5) {
			System.out.println("5입니다");
		}else if(random == 6) {
			System.out.println("6입니다");
		}
		
		
		
		
		// 3. 주사위 게임 만들기
		// (int)(Math.random() *6)+1 <= 코드를 이용해서 첫번째로 나온 숫자는 나의 숫자 (사용자)
		// 두번째로 나온 숫자는 컴퓨터의 숫자입니다.
		
		// 누구의 주사위 수가 큰지 배틀하는 게임을 만드세요.
		// 나 : 1, 컴퓨터 : 6 => 결과 : 컴퓨터가 이겼습니다.

		int random1 = (int)(Math.random() *6)+1 ;
		int random2 = (int)(Math.random() *6)+1 ;
		
		if(random1 > random2) {
			System.out.println("나:"+random1 + "  컴퓨터:" + random2 + "  내가 이겼습니다.");
		}else if(random1 < random2) {
			System.out.println("나:"+random1 + " 컴퓨터:" + random2 + "  컴퓨터가 이겼습니다.");
		}else if(random1 == random2) {
			System.out.println("나:"+random1 + " 컴퓨터:" + random2 + "  비겼습니다.");
		}
		
		
	}

}
