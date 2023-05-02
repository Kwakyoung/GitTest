package pack.Test;

import java.util.Scanner;

public class CellPhone {
	String color;
	String model;
	String call;
	String state;

	Scanner sc = new Scanner(System.in);
	
	public CellPhone(String color, String model, String call, String state) {
		this.color = color;
		this.model = model;
		this.call = call;
		this.state = state;
	}
	public void give() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("색상:"+color+"\t모델명:"+model+"\t상태:"+state);
		System.out.println("---------------------------------------------------------------");
	}

	
	public void powerOn() {
		state="전원 켜짐";
		System.out.println(model+" 전원이 켜졌습니다. "+" 상태:"+state+"\n");
	}
	public void powerOff() {
		state="전원 종료";
		System.out.println(model+" 전원이 꺼졌습니다. "+" 상태:"+state+"\n");
	}
	public void sendVoice(String call) {
		if(state.equals("전원 켜짐")) {
		state="전화중";
		System.out.println("내용입력");
		call=sc.nextLine();
		System.out.println("나 :"+call);
		}else {
			System.out.println("전원이 꺼져있어 전화를 할수없음.");
		}
	}
	public void receiveVoice(String call) {
		if(state.equals("전화중")) {
		System.out.println("내용입력");
		call=sc.nextLine();
		System.out.println("상대방: "+call);
		}
	}
	public void hangUp ( ) {
		if(state.equals("전화중")) {
		state="전원 켜짐";
		System.out.println("전화를 끊습니다.");
		}
	}
	
	public int inputInt() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				int rtnInt = Integer.parseInt(sc.nextLine());
				return rtnInt;
			} catch (Exception e) {
				System.out.println("숫자 값만 입력해주세요.");
			}
		}
	}
	
	
	
	int select = 0;
	public void made() {
		System.out.println("(색상:"+color+", 모델명:"+model+", 상태:"+state+")가 지급되었습니다.");
		
		while(true) {
			powerOn();
			System.out.println("전화가 옵니다. 받는다=1 , 거절=2");
			select = inputInt();
			
				if(select == 1) {
					System.out.println("전화를 받았습니다. 내용을 입력하세요. " + "상태:"+state);
					sendVoice(sc.nextLine());
					System.out.println("수신내역");
					receiveVoice(sc.nextLine());
				while(true) {	
					System.out.println("1.전화끊기 2.전화계속");
					select = inputInt();
					if(select == 1) {
						hangUp();
						powerOff();
						break;
					}else if(select == 2) {
						System.out.println("내용을 입력하세요.");
						sendVoice(sc.nextLine());
						System.out.println("수신내역");
						receiveVoice(sc.nextLine());
					}
				}break;
				
				}else {
					System.out.println("통화를 거절합니다");
					powerOff();
					break;
				}
			}
			
		
			
			
			
		}
	}
	


