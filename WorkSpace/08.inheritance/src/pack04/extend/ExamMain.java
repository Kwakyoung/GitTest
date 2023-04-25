package pack04.extend;

public class ExamMain {
	public static void main(String[] args) {
		DmbPhone dmbp = new DmbPhone(1, "하늘색", "삼성");
		dmbp.powerOn();
		dmbp.bell();
		dmbp.sendVoice("안녕하세요");
		dmbp.receiveVoice("혹시 보험 준비 되셨나요?");
		dmbp.hangUp();
		// cellPhone에서 구현 해놓은 기능
		dmbp.turnOnDmb();
		dmbp.changeChannel(10);
		dmbp.turnOffDmb();
		dmbp.powerOff();
	}
}
