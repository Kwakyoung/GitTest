package pack01.list;

public class TestDTO {
	// DB에서 조회해온것 받아서 묶어서 저장하기위한 객체
	// hr (employees) : first_name, last_name, salary ... 
	private String firstName , lastName ; 
	// private으로 외부에서 변수에 바로 접근을 막았을때 만들어줘야하는것은 무엇인가?

	public TestDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String setFirstName(String firstName) {
		return this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
