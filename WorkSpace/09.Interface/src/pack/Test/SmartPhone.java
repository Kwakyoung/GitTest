package pack.Test;

public class SmartPhone extends DMB{

	int internet ;
	String WebToon;
	String state2;
	public SmartPhone(String color, String model, String call, String state, int channel, int internet, String WebToon, String state2) {
		super(color, model, call, state, channel);
		this.internet = internet;
		this.WebToon = WebToon;
		this.state2= state2;
	}
	
	public void InternetOn() {
		if(state.equals("전원 켜짐")) {
		System.out.println("인터넷을 켭니다.");
		state2="인터넷켜짐";
		}else {
			System.out.println("전원을 킨 후에 다시 실행해주세요.");
		}
	}
	
	public void webToonOn() {
		while(true) {
		if(state2.equals("인터넷켜짐")){
			System.out.println("웹툰을 켭니다.");
			break;
		}else {
			System.out.println("인터넷을 킨 후에 다시 실행해주세요.");
			break;
		}
		}
	}

	
	
	
	
	
	
}
