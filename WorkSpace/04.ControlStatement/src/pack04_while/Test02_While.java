package pack04_while;

import java.util.Scanner;

public class Test02_While {
	public static void main(String[] args) {
		// 별찍기
		// 2미만은 오류 그외에는 해당숫자만큼 구구단
		
		int i = 1;
		while(i<=5) {
			int j = 1;
			while(j<=i) {
				System.out.print("★");
				j++;
			}System.out.println();
			i++;
			
		}		
			
		
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt((sc.nextLine()));
		
		while(k<=9) {
			k++;
			if(k<3) {
				System.out.println("출력안함");
				k++;
				int o = 0;
				while(o<=9)  
					o++;}
					
		else{
				System.out.println(k+"x"+"="+(k));
			}
			
			
				
			
		 }
	}
}

		




		
	
//	for(int k = 1; k <= 5; k++ ) {
//		for(int u = 1; u<=k; u++) {
//			System.out.print(u);
//		}
//		System.out.println();
//	}
		
	
		

	


