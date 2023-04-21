package pack04_oop2;

public class StudentMain {
	public static void main(String[] args) {
		StudentDTO dto = new StudentDTO(1,"곽영균",80,100,90);
		StudentDAO dao = new StudentDAO();
		dao.display(dto);
		
		
		
		

		
	}

}
