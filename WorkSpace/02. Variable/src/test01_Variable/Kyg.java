package test01_Variable;

public class Kyg {
	public static void main(String[] args) {
			// 변수 : 어떤 값을 저장해놓기 위한것 (메모리)
			// 변수는 타입이 있음
			// 1. 숫자- int(정수) <  long(정수)
			//		  float(실수) < double(실수)
			// 변수 규칙 :
			// 1.선언 : 변수타입 변수명 ;  ->  int kyg;
			// 2.할당 : 변수명 = 변수타입에 담을수있는 값;
			// 3.초기화 : ↑ 두가지를 한번에 하는 것
			// 변수타입 변수명 = 값;    ->  int kyg = 10;

		int iNum ;
		iNum = 10;
		long lNum ;
		lNum = 10;
		float fNum = 3.14F;
		double dNum = 3.14;
		System.out.println(iNum);
		// 왜 오류일까? : 변수값이 없어서 -> 변수 값 할당이 필요하다. 초기화가 필요
		// initialized (초기화)
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		
		
			
	}

}
