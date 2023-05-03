
public class Human {
	// 접근 제한자 : 다른클래스에서 값을 변동하지 못하게 접근을 제한하는? 
	// public  (같은 프로젝트 내에서)
	// default (같은 패키지 내에서)
	// private (클래스 내부에서만)
	
	public String ask;  // 같은반 내부
	String look;  // 같은조 옆에서 지켜보기
	private String river;  // 간 (나만)
	
	public String getRiver(boolean isDoctor) {
		if(isDoctor) {
			return river;
		}else {
			return "당신은 의사가 아니기때문에 접근이 불가능";
		}
	}
	public void setRiver(String river) {
		if(river.equals("싱싱한 간")) {
			this.river = river;			
		}else {
			System.out.println("바꿀수 없음");
		}
	}
	
	
	
	
	
	
}
