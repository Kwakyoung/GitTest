package pack03_array2;

import java.util.Arrays;

public class TestLast {
	public static void main(String[] args) {
		// 2차원 배열을 만듬.
		// 2차원 배열의 크기와 타입은 자유롭게 하면됨.
		// 2차원 배열에 구구단 2~9단의 답을 저장하고 2차원 배열을 통해 출력까지 해보기.
		// {2,4,6..18} 
		// ※ for문을 이용해서 풀것 ※
		
		int[][] array = new int [8][9];
		
		for(int i = 2; i<10; i++) {
			for(int j = 1; j<10; j++) {
				array[i-2][j-1] = (i*j);
				System.out.print(i + " * " + j + " = " + array[i-2][j-1] +"  ");  //구구단:2,1~9  배열 : 0 , 0~8
																                  //구구단:3,1~9  배열 : 1 , 0~8
			}System.out.println();
		}
		
		
		
		// 1차원 배열이 2개가 있음.
		// arrA = { 1, 2, 3, 4}
		// arrB = { 4, 5, 6, 7}
		// arrA에 들어있는 내용과 arrB에 들어있는 내용을 바꾸세요.
		
		// 임시 배열을 만들어야 한다
		
		int[] arrA = {1,2,3,4};
		int[] arrB = {4,5,6,7};
		int[] temp = arrA;
		arrA = arrB;
		arrB = temp;
		System.out.println(Arrays.toString(arrA));
		
		
		
		
		
		
		// 심화) int[]arr = { 3, 4, 6, 7, 8, 9, 1, 2, 5}
		// 해당내용을 오름차순, 내림차순으로 정렬해서 보여주기
		// 작업후 => arr => { 1 ,~~~9 } { 9~~1 } 
		
		int[]arr = { 3, 4, 6, 7, 8, 9, 1, 2, 5 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int[][][] arr3a = new int [1][2][3]; // ...
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j = i+1; j<arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					int temps = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temps;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
