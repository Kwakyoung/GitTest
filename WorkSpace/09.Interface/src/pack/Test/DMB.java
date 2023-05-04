package pack.Test;

import java.util.Scanner;

public class DMB extends CellPhone{
	int channel;
	
	public DMB(String color, String model, String call,String state ,int channel ) {
		super(color, model, call, state);
		this.channel=channel;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void trunOnDmb() {
		while(true) {
		if(state.equals("전원 켜짐")) {
			System.out.println("원하는 채널을 입력해주세요.");
			try {
				channel = inputInt();
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}
		System.out.println("채널 " + channel + " 번 DMB 방송 수신 시작.!");
		System.out.println("1.채널바꾸기 2.DMB종료");
		    channel = inputInt();
			if(channel==1) {
				trunOnDmb();
			}else if(channel==2) {
				trunOffDmb();
			}else {
				System.out.println("그냥 나가");
				break;
			}
			break;
		}
		}
		
	}
	
	public void trunOffDmb() {
		System.out.println("DMB 방송 수신 종료.!");
		
	}
	
	
	
	
	
	
	
	
	
}
