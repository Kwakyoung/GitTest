package pack02_static;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		// 인스턴스 멤버 : 인스턴스화 한 객체에 . 찍으면 나옴
		// 스태틱 멤버 : 클래스에 . 찍으면 나옴
		
	System.out.println(Ex02_Calculator.sum(10,5));
	System.out.println(Ex02_Calculator.minus(10,5));
	System.out.println(Ex02_Calculator.mul(10,5));
	System.out.println(Ex02_Calculator.div(10,5));
	
	String str = new String("A");
	
	
	}
}
