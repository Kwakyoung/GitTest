package pack02_array;

public class Ex02_Array {
	public static void main(String[] args) {
		// 1. 크기가 10의 크기를 가진 int형 배열을 만들고 값을 10~100까지 할당하고 출력해보기.
		// 출력 결과 : 배열이름[인덱스] : 10 ... 100
		int[] index = new int[10];
//		index[0] = 10;
//		index[1] = 20;
//		index[2] = 30;
//		index[3] = 40;
//		index[4] = 50;
//		index[5] = 60;
//		index[6] = 70;
//		index[7] = 80;
//		index[8] = 90;
//		index[9] = 100;
		int num = 0;
		for (int j = 0; j<10; j++) {
			// 값 할당도 for문에서 할당해보기
			
			index[j]=(j+1)*10;
			System.out.println(index[j]);
			
			num += index[j];
		} System.out.println(num);
		double sum = (num/10);
		System.out.println(sum);
		// 현재 배열에는 10~100까지의 수가 담아져있음.
		// => 배열의 누적합을 구해보기. 10~100까지 더한값 (누적합) :
		
		
	
		
		
		
		
		
	}

}
