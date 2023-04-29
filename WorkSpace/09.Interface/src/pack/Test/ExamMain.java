package pack.Test;

import java.util.Scanner;

public class ExamMain extends DMB{
	
	public ExamMain(String color, String model, String call, String state, int channel) {
		super(color, model, call, state, channel);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = null;
		String voice = null;
		CellPhone cell = new CellPhone("검정", "벽돌", "여보세요?","종료");
		
		while(true) {
		System.out.println("핸드폰 기종을 골라주세요. 1. 1세대  2. 2세대 3. 3세대");
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
			break;
		}else if(select.equals("3")) {
			cell.sendVoice(cell.call);
			cell.receiveVoice(cell.call);
		}else if(select.equals("4")) {
			break;
		}
		
		}
		}
	
		
		if(select.equals("2")) {
		DMB dmb = new DMB("파랑", "아이폰3", "여보세요??", "종료", 10);
		dmb.give();
		
		}
		
		
		
			}
		}
		
		
		
		
		
		
		
		
		
		

}
