
public class JapangiDTO {

	String[] menu = {"콜라","사이다","환타"};
	int[] price = {800,1000,900};
	int[] count = {8,5,1};
	
	void display() {
		System.out.println("1. " + menu[0] + " 금액:" + price[0] + " 수량:" + count[0]);
		System.out.println("2. " + menu[1] + " 금액:" + price[1] + " 수량:" + count[1]);
		System.out.println("3. " + menu[2] + " 금액:" + price[2] + " 수량:" + count[2]);
	}


}
	
	

