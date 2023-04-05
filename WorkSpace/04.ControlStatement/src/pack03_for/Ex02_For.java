package pack03_for;

public class Ex02_For {
	public static void main(String[] args) {
		// 제어문은 무한하게 중첩이 가능하다.
		// 짝수만 출력
		// 짝수 ? %2 == 0 
		// 1 ~ 10 까지 10번 반복하는 반복문 안보고 만들어보기.
		
		// 1부터의 10까지의 누적합을 구하시오.
		for(int i = 1; i <= 10; i++) {
			//짝수, 홀수도 "홀수" + 숫자 
//			if(i%2==0) {
//				System.out.println("짝수"+i);
//			}else if (i%2==1) {
//				System.out.println("홀수"+i);
//			}
		}
		int num = 0;
		for(int i = 1; i <= 10; i++) {
			num += i;
		}
		System.out.println(num);
		
		
			
		
		
	} //main

} // class
