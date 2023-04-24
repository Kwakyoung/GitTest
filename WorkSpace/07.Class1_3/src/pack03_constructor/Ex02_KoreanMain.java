package pack03_constructor;

public class Ex02_KoreanMain {
	public static void main(String[] args) {
		Ex02_Korean ko = new Ex02_Korean("곽영균","123456-7891011");
		// 강제로 데이터의 정합성 : 이름과 주민등록번호가 없는 데이터 (객체) 하나는 실제하면 안됨. 
		System.out.println("국적 : "+ko.nation);
		System.out.println("이름 : "+ko.name);
		System.out.println("주민 : "+ko.ssn);
		
	}
}
