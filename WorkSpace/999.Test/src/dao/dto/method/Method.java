package dao.dto.method;

public class Method {
	public static void main(String[] args) {
		Method mt = new Method();
		mt.동생한테용돈(10000);
		
		int money = mt.라면심부름(100000);
		System.out.println("심부름 끝나고 내가 받은금액 " + money);
	}
	// void : x  : 현실에서 어떤 지시를 했을때 그 결과가 필요없는 경우 :  
	// return : 현실에서 어떤 지시를 했을때 그 결과가 필요한 경우  :  라면 심부름을 시켰을때 가져오는 라면
	public void 동생한테용돈(int money)	{
		money = 20000;  // 어떤 기능에 의해서 값이 바뀜
		System.out.println(money + "동생한테 용돈줌. 알아서 쓰기때문에 결과는 필요없음.");
		System.out.println(money + "원 은 메소드 내부에서만 존재하고 그 외에서는 메모리에 존재x");
	}
	public int 라면심부름(int money) {
		System.out.println("동생한테 라면 심부름 시킴"+money+"원을 줌");
		System.out.println("수고비와 재료비가 깍임 50000");
		money-=50000;
		return money;
	}
	
}
