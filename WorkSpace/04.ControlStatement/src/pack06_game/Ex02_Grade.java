package pack06_game;

import java.util.Scanner;

public class Ex02_Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0 , eng = 0 , mat = 0;
		while(true){
			System.out.println("국어점수를 입력하세요 : ");
			kor = Integer.parseInt(sc.nextLine());
			if(kor<=100 && kor > 0) {
				System.out.println("영어점수를 입력하세요 : ");
			}else {
				System.out.println("다시 입력하세요.");
			}
		while(true) {
				eng = Integer.parseInt(sc.nextLine());
				if(eng<=100 && eng >0) {
					System.out.println("수학점수를 입력하세요 : ");
				}else {
					System.out.println("다시 입력하세요");
				}
				
		while(true) {
					mat = Integer.parseInt(sc.nextLine());
					if(mat<=100 && mat > 0) {
						int sum = (kor + eng + mat);
						double avg = (double)sum/3;
						System.out.println("총점 :"+ sum);
						System.out.println("평균 :"+ avg);
						
					}else {
						System.out.println("다시 입력하세요.");
					}break;
		
		}
		}
		}
		
		
		
	

	
	
		
	 } // main
 } // class
