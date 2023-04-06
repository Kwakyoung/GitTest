package pack04_while;

public class Test01_While {
	public static void main(String[] args) {
		//for문 => while
		//구구단 출력하기 2~9단
		// 1.일자로 밑으로 쭉 나오게 하기
		// 2. 단별로 줄바꿈을 줘서 옆으로 나오게 하기.
		// ※ while문의 중첩 ※
		
		int i = 1;
		while(i<9) {
			i++;
			int u = 0;
			while(u<9) {
				u++;
				
			
				System.out.print(i+"x"+u+"= "+ (i*u) + "  ");
			}
			System.out.println();
		}
			

				
				
			
			
			
			
			
		
		
	}

}
