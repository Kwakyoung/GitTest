package dao.dto.method;

public class HumanMain {
	public static void main(String[] args) {
		
		HumanDTO human = new HumanDTO();
		System.out.println(human.eye);
		System.out.println(human.ear);
		
		
		HumanDTO[] humanArr=new HumanDTO[5]; // null, null , null .. ÃÑ 5°³
		for(int i =0; i<humanArr.length; i++ ) {
			humanArr[i]=new HumanDTO();	
			
		}
		
		
		
		System.out.println(humanArr[0].ear);
		
		
	}
}
