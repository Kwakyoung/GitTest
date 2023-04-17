package pack03_constructor;

public class Ex03_Car {	
	// 필드(멤버)
	String company; 
	String model; 
	String color; 
	int maxSpeed;
	int Speed;
	
	// this <= 나 자신. ( 중괄호 기준으로 나 자신 )
	public Ex03_Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	
	
	// 제조사와 모델 그리고 색상은 필수로 입력이 되었을때만 생성이 가능한 규칙을 만든다.
	
	
}
