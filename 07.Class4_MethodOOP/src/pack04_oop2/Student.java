package pack04_oop2;

	// Student Class : 학생의 성적정보를 관리할 수 있게 만든 설계도
public class Student {
	// 필드부를 직접 구현하고 StudentMain에서 Student 객체를 생성하고 내용을 할당하고 출력해보기.
	// 멤버(필드) : 학생의 번호, 이름, 국어성적, 수학성적, 영어성적, 총점, 평균
	int num;
	String name;
	int kor,mat,eng,sum;
	double avg;
	
	public Student(int num, String name, int kor, int mat, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		this.sum = kor+mat+eng;
		this.avg = sum/3;
	}
	// DTO와 DAO로 나눠서 main에서 똑같은 동작이 되게 처리해보기
	void display() {
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("국어성적 : " + kor);
		System.out.println("수학성적 : " + mat);
		System.out.println("영어성적 : " + eng);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
	
	
	

}
