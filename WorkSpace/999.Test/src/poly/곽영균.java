package poly;

public class 곽영균 implements 사람{

	@Override
	public void 호흡() {
		System.out.println("호흡한다.");
		코딩();
	}

	@Override
	public boolean 생사여부() {
		System.out.println("살아있다.");
		return false;
	}

	public void 코딩() {
		System.out.println("코딩한다.");
	}
}
