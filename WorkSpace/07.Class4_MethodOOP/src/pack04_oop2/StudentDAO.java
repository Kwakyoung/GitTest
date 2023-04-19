package pack04_oop2;

public class StudentDAO {
	
	void display(StudentDTO dto) {
		System.out.println("번호 : " + dto.num);
		System.out.println("이름 : " + dto.name);
		System.out.println("국어성적 : " + dto.getKor());
		System.out.println("수학성적 : " + dto.getMat());
		System.out.println("영어성적 : " + dto.getEng());
		System.out.println("총점 : " + dto.getSum());
		System.out.println("평균 : " + dto.getAvg());
	}
}
