package pack03_constructor;

public class Test01 {
	// 1. 이름, 아이디, 패스워드, 나이를 필드로 사용하는 Member 클래스를 생성 후 Member클래스필드값에
	//    값을 할당하고 출력해보기.
	
	// 2. 이름, 아이디, 패스워드, 나이를 필드로 사용하는 MemberDTO 클래스를 생성 후
	//    필수로 입력이 되어야 할 것 같은 필드는 생성자를 통해서 입력을 받게 만들고.
	//    해당 내용을 출력한다.
	
	public static void main(String[] args) {
		Test01_Member member = new Test01_Member();
		member.id ="kyg";
		member.pw = "123";
		member.name = "곽영균";
		member.age = 27;
		System.out.println(member.name);
		System.out.println(member.id);
		System.out.println(member.pw);
		System.out.println(member.age);
		
		Test01_MemberDTO dto = new Test01_MemberDTO("곽영균", "kyg", "pw", 27);
		System.out.println(member.name);
		System.out.println(member.id);
		System.out.println(member.pw);
		System.out.println(member.age);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
