package pack02_switch;

public class Test01_Switch {
	public static void main(String[] args) {
		int score = 59;
		// 100 : A 따로
		// 90 ~ 99 A학점
		// 80 ~ 89 B
		// 70 ~ 79 C
		// 60 ~ 69 D
		// 그외에는 E
		
		
		switch (score/10) {
		case 100 : 
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("E");
		
		}
	}

}
