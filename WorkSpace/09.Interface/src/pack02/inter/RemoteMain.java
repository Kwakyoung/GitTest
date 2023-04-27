package pack02.inter;

import java.rmi.Remote;

public class RemoteMain {
	public static void main(String[] args) {
		// RemoteControl == 인터페이스 ( 방법만 써놓은 것 )
		// Audio ↑ 방법을 상속받아 실제 메소드를 구현해놓은곳
		
		Audio ad = new Audio();
		ad.turnOn();
		ad.turnOff();
		ad.setVolume(100);  // 인터페이스 부분을 이용해서 audio의 최소 볼륨과 최대 볼륨을 10으로 기입함
		
		
		
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(100);
		
		// 다형성 : 인터페이스를 상속받은 객체 Audio & Television은 공통적으로 turnOn, turnOff, setVolume을 가지고 있음.
		// 따라서 RemoteControl(interface) == Audio == Television 
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0] = new Television();
		rcArr[1] = new Audio();
		for (int i = 0; i<rcArr.length; i++) {
			rcArr[i].turnOn();
		}
	}
}
