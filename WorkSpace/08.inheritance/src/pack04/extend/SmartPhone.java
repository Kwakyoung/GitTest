package pack04.extend;

public class SmartPhone extends DmbPhone{
	
	int internet;  // <= SmartPhone 생성 시 입력받아 생성하게 생성자 메소드를 만들고 싶음.
	// DmbPhone dmb = new DmbPhone(param...)
	
	// Override : 재정의 : ① 부모클래스의 기능을 그대로 두고 기능을 새로 추가하는 방식.
	@Override
	void powerOn() {
		System.out.println("삼성 로고가 움직임");
		super.powerOn();
	}
	
	public SmartPhone(int channel, String color, String model, int internet) {
		super(channel, color, model);  // 부모 클래스가 별도의 생성자 메소드를 가지고 있다면
		 							   // 해당하는 부모 클래스가 인스턴스화 되어야지만, 자식 객체도 생성이 가능하다.
		this.internet = internet;
	}
	
	
	public void internetOne() {
		System.out.println("인터넷을 합니다.");
	}
	public void color( ) {
		System.out.println(color);
	}
	
}
