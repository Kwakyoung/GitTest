import java.util.Scanner;

public class Japangi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menu = { "�ݶ�", "ȯŸ", "���̴�"};
		int[] price = {800, 1000, 900};
		int[] count = {8, 5, 1};
		
		
		for(int i = 0; i<3; i++) {
			System.out.println((i+1)+". " + menu[i] + " �ݾ�:" + price[i] + " ����:" + count[i]);
		}
		
		
	}
}
