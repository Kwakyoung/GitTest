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
		System.out.println("채널" + channel + " 번 DMB 방송 수신 시작.!");
	}
	
	public void trunOffDmb() {
		System.out.println("DMB 방송 수신 종료.!");
	}
	
	
	
	
	
	
	
	
	
}
