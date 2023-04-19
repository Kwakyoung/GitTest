import java.util.Scanner;

public class Japangi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menu = { "콜라", "환타", "사이다"};
		int[] price = {800, 1000, 900};
		int[] count = {8, 5, 1};
		
		
		for(int i = 0; i<3; i++) {
			System.out.println((i+1)+". " + menu[i] + " 금액:" + price[i] + " 수량:" + count[i]);
		}
		
		
	}
}
