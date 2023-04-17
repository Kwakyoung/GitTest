package pack01_base;

import java.util.Scanner;

public class Ex04_CarMain {
	public static void main(String[] args) {
		Ex04_Car car= new Ex04_Car(10);
		System.out.println(car.isLeftGas());
		
//		car.gas=0;
//		System.out.println(car.isLeftGas());
		
		if(car.isLeftGas()) {
			while(car.isLeftGas()) {
				System.out.println("자동차 달립니다. 가스잔량 : "+ car.gas + "L");
				car.gas--;
			}
		}else {
			
		}
		
		
		
		
	}
}
