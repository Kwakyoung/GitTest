package pack01_base;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		// 멤버 : 클래스를 인스턴스화 하고 . 찍으면 나오면 모든것들
		Ex02_Calculator cal = new Ex02_Calculator();
		cal.powerOn(0);
		// cal.powerOff(); 
		
		
		
		int result = cal.test()+10; // int타입을 무조건 return함. ==> int형 변수랑 같이 취급
		System.out.println(result);
		System.out.println(1+cal.test());
		// String inputData = sc.nextLine(); // <= nextLine() == String을 return하는 메소드
		
		
		System.out.println(cal.plus(5, 10));
		
		
		int result1 = cal.plus3(10, 20, 30);
		double avg = cal.plus3(10, 20, 30)/3;
		System.out.println(result1);
		System.out.println(avg);
		
		
	}
}
