
public class Member {
	
	public Member(int field) {
		System.out.println(field);     // 파라메터 또는 지역변수(메소드 내부에서 만든)를 의미
		System.out.println(this.field); // 나 자신(this).field 
	}
	
	// 블럭킹 : 지역의 시작과 끝 , 내부에 들어있는 모든것들을 멤버
	// static 여부.
	int field=1; // 인스턴스 멤버
	static int sField=2; // 스태틱 멤버
	
	// 인스턴스화 : 클래스가 가지고있는 멤버중에 인스턴스 멤버들을 메모리에 올려서
	// 				(인스턴스화 과정이 끝나고나서는 전체 멤버가 사용 가능함 , 외부에서 private 제외)
	// 사용가능하게 하는 과정
	// 생성자(Constructor) : 클래스가 메모리에 올라갈때 사용할 생성식 == 클래스와 이름이 대소문자가 정확히 같음
	
	public static void main(String[] args) {
		Member mem = new Member(100); // new 'Member();'  << 생성자 메소드
		System.out.println(mem.field);
	}
}
