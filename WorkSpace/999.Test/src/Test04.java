
public class Test04 {
	public static void main(String[] args) {
		// int(소숫점이 없는 정수) , double(소숫점이 있는 실수)
		// char (한글자 == 문자) , String (두글자이상의 문자열)
		// 변수를 선언하는 규칙 : 변수타입 네이밍(이름) ; --> int sum1 ;
		// 위의 4가지 변수 타입을 전부 선언해보기.
		// 메모리 (컴퓨터 저장공간)를 효율적으로 쓰기 위해서 데이터의 표현범위
		// 별로 또는 데이터의 유형에 따라 변수타입은 나눠져있음.
		
		int iNum ;
		double dNum ;
		char cChr ;
		String sStr ;
		
		// 변수에 값 저장 ( 할당 , 값 == 리터럴 ) : 변수명 = 해당타이벵 맞는 값;  ex) iNum = 10; 
		
		iNum = 10;   // int는 소숫점이 없는 숫자는 저장가능. (범위가있음 max 10억정도)
		dNum = 3.14; // double은 소숫점이 있는 숫자 저장가능.
		cChr = 'a';  // 한글자를 담을때씀 (유니코드) 규칙 == ' <-로 감싸주면됨.	 
		sStr = "영균";// 두글자 이상의 문자열을 담을때씀 규칙 == " <-로 감싸주면됨. 
		
		int iNum2 = 11; // 변수 선언과 동시에 값할당 ==> 초기화
		
		// 나열 == 같은 타입의 변수를 여러개 만들 때 사용함.
		
		int subject1 , subject2 , subject3 ;
		subject1 = 1;
		subject2 = 2;
		subject3 = 3;
		System.out.println(subject1);
	}

}
