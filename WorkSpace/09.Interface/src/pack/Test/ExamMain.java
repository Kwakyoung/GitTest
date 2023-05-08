package pack.Test;

import java.util.Scanner;

public class ExamMain extends SmartPhone{
	
	public ExamMain(String color, String model, String call, String state, int channel, int internet, String WebToon, String state2) {
		super(color, model, call, state, channel, internet, WebToon, state2);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = null;
		String voice = null;
		CellPhone cell = new CellPhone("검정", "벽돌", "여보세요?","종료");
		DMB dmb = new DMB("파랑", "햅틱", "여보세요", "종료", 10);
		SmartPhone smart = new SmartPhone("그레이", "아이폰13", "여보세요", "종료", 5, 10, "웹툰","켜짐");
	
		while(true) {
		System.out.println("핸드폰 기종을 골라주세요. 1. 1세대\t2. 2세대\t3. 3세대\t4. 종료");
		select = sc.nextLine();
		
		if(select.equals("1")) {
			while(true) {
				cell.give();
				System.out.println("1.전원켜기 2.전원끄기 3.전화받기 4.기기선택으로 돌아가기");
				select = sc.nextLine();
					if(select.equals("1")) {
						cell.powerOn();
					}else if (select.equals("2")) {
						cell.powerOff();
						continue;
					}else if(select.equals("3")) {
						cell.sendVoice(cell.call);
						cell.receiveVoice(cell.call);
						cell.hangUp();
					}else if(select.equals("4")) {
						break;
					}else {
						System.out.println("보기의 숫자만 입력해주세요.");
					}
		
			}
		}
	
		
		if(select.equals("2")) {
		dmb.give();
		while(true) {
		System.out.println("1.전원켜기 2.전원끄기 3.전화받기 4.DMB 5.기기선택으로 돌아가기");
		select = sc.nextLine();
			if(select.equals("1")) {
				dmb.powerOn();
			}else if(select.equals("2")) {
				dmb.powerOff();
			}else if(select.equals("3")) {
				dmb.sendVoice(cell.call);
				dmb.receiveVoice(cell.call);
				dmb.hangUp();
			}else if(select.equals("4")) {
				dmb.trunOnDmb();			
			}else if(select.equals("5")) {
				break;
			}else {
				System.out.println("보기의 숫자만 입력해주세요.");
			}
		}
		}
		
		
		
		if(select.equals("3")) {
			smart.give();
			while(true) {
				System.out.println("1.전원켜기 2.전원끄기 3.전화받기 4.DMB 5.인터넷켜기 6.웹툰켜기 7.기기선택으로 돌아가기");
				select = sc.nextLine();
					if(select.equals("1")) {
						smart.powerOn();
					}else if(select.equals("2")) {
						smart.powerOff();
					}else if(select.equals("3")) {
						smart.sendVoice(cell.call);
						smart.receiveVoice(cell.call);
						smart.hangUp();
					}else if(select.equals("4")) {
						smart.trunOnDmb();			
					}else if(select.equals("5")) {
						smart.InternetOn();
					}else if(select.equals("6")) {
						smart.webToonOn();
					}else if(select.equals("7")){
						break;
					}else {
						System.out.println("보기의 숫자만 입력해주세요.");
					}
				}
				
		}else if(select.equals("4")){
			break;
		}
				
				
				
		
		
			
			
			
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}

