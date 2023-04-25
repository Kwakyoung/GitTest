package pack04.extend;

public class ExamMainSmart {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(1, "파랑", "Iphone13pro", 5);
		sp.powerOn();     // CellPhone
		sp.turnOnDmb();   // DmbPhone
		sp.internetOne(); // SmartPhone
		
	}
}
