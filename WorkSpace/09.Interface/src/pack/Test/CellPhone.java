package pack.Test;

import java.util.Scanner;

public class CellPhone {
	String color;
	String model;
	String state;
	int select;

	Scanner sc = new Scanner(System.in);
	
	public CellPhone(String color, String model, String state, int select) {
		this.color = color;
		this.model = model;
		this.state = state;
		this.select = select;
	}
	
	public void powerOn() {
		System.out.println(model+" 전원이 켜졌습니다. "+" 상태:"+state);
	}
	public void powerOff() {
		System.out.println(model+" 전원이 꺼졌습니다. "+" 상태:"+state);
	}
	
	public void made() {
		System.out.println("(색상:"+color+", 모델명:"+model+", 상태:"+state+")가 지급되었습니다.");
		while(true) {
			System.out.println("전원 켜기:1 , 전원 끄기:2");
			select = Integer.parseInt(sc.nextLine());
			if(select == 1) {
				state="전원켜짐";
				powerOn();
				
			}else {
				state="전원꺼짐";
				powerOff();
				break;
			}
			
		}
	}
	
}
