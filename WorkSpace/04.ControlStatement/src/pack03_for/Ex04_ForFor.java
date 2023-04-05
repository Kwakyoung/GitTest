package pack03_for;

public class Ex04_ForFor {
	public static void main(String[] args) {
		// 제어문은 무한하게 중첩이 가능하다. ( 순서x )
		// 1~10까지 반복하게 for문 만들어보기

//		for (int i = 1; i <= 10; i++) {
//			System.out.println("i"+i);
//			// for문을 하나 더 넣을 수 있을까?
//
//			for (int j = 10; j <= 12; j++) {
//				System.out.println("j" +j);
//			}
//		}
		
		// 구구단을 출력해보기. print와 println을 적절히 사용하여.
		// 2x1 = 2
		// 2x2 = 4
		// ...
		// 9x9 = 81
		
		
			for(int i = 2; i <= 9; i++) {
				System.out.println();
				for(int u = 1; u <= 9; u++) {
					System.out.print(i + "x" + u + " = " + (i*u)+"  ");
				}
				System.out.println();
			 		}
			
			
			
				
		
			
	
		
		
		
		
	} //main

} // class
