package pack02.jdbc;

public class EmpDTO {
	// Database에서 조회된 SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME name, EMAIL FROM employees
	// 쿼리를 보고 DTO를 하나 만들어보기.
	private int employee_id;
	private String name , eamil;
	
	public EmpDTO(int employee_id, String name, String eamil) {
		
		this.employee_id = employee_id;
		this.name = name;
		this.eamil = eamil;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	
	
	
	
}
