
public class Test06 {
	public static void main(String[] args) {
		// Test06 클래스를 하나 만들고 int형 변수를 나열하여 5개를 선언하고
		// 값을 각각 할당하고 출력해보기.
		// 변수명은 각각의 과목점수를 저장하기 위한 용도이다. 
		// 국어, 수학, 영어, 과학, 체육
		int korScore, mathScore, engScore, sinScore, helScore;
		korScore = 90;
		mathScore = 80;
		engScore = 70;
		sinScore = 60;
		helScore = 50;
		System.out.println(korScore);
		
		// 형변환(Casting) : 서로 다른 타입의 변수를 변환시켜 사용함.
		// ex) int <-> double , String <-> int
		// int < double
		int iValue = 10;
		double dValue = iValue + 0.5; //아무것도 한것없음 ==> 자동 형변환
		System.out.println(iValue);
		System.out.println(dValue);
		
		//더 큰 데이터타입을 작은 타입에 담을 때 오류가 발생함.
		//개발자가 어떤 타입으로 바꿀건지 명시를 해줘서 강제로 바꿈.
		//우리가 어떤 작업을 함 ==> 강제 형변환
		iValue = (int)dValue; // 문제가 발생함 = 소숫점 유실
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		String str ="1234"+ 12; // 답 : 123412
		//문자열에 어떤 값을 더하는 것 == 합x => 결합 (글자의 합침)
		int iData = 1234 + 12; // 답 : 1246
		//숫자형 데이터의 합은 == 합 => 값의 합침
		System.out.println(str);
		System.out.println(iData);
		
		//str에는 현재 123412라는 문자열이 저장되어 있음.
		//숫자로 바꾸려면 어떻게 해야할까? ("" <=제거)
		//123412의 값을 숫자로 바꾸고 +1한 결과를 출력해보기
		// int => ? , double => ? , wrapperClass 첫글자가 대문자
		int sum = Integer.parseInt(str)+1;
		System.out.println(sum);
		
		// boolean (부울형) true 또는 false 만 저장이 가능함.
		
		String sum1 = "" + 1234 + 5678 + "가나다라";
		System.out.println(sum1);
	}

}
