package pack01_base;

public class Const {
	// 생성자 <= 객체(Object) : 우리가 만들고 있는 모든 클래스
	// 모든 클래스는 Object로부터 만들어졌음.
	
	// 반드시 필요한 정보가 있다면 객체 생성시 해당하는 정보를 가지고 생성하기 위해서 필요함.
	int field;
	
	public Const(int field) {   // 별도로 생성자 '메소드'를 만들지 않으면 class 의 이름으로 생성자가 메소드가 존재한다. (JVMx) 
		// 메소드인데 클래스의 이름과 완전히 똑같은것 ==> 클래스를 변수형태로 인스턴스화 할때 사용하는 메소드
		this.field = field;	
	}
	
	int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Const con = new Const(10);   // () 앞에 있는 곳을 클릭하면 이동하는 곳이 생성자
		System.out.println(con.sum(10, 20));
	}
	
	
	
}
