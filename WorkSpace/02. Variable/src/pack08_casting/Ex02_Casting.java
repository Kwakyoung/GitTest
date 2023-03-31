package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		// 문자열 = "12" + 34 = 답은? 1234
		// String + int 답DataType은? String
		// Why? 문자열 + 어떤값 = 문자열 규칙
		// KYG(문자열) + 10 = 
		// 문자열 결합의 법칙 ↑
		// "1" == 1 ? 다르다
		// "1" (String) 다르다 1 (숫자)
		
		String sum = "12" + 34;
		System.out.println(sum);
		// 어떤 값을 String으로 바꾸는 것은 엄청나게 간단하다.
		String sum2 = ""+1234;
		System.out.println(sum2);
		System.out.println(sum+sum2);
		
		
		// String sum , sum2 변수에 문자열로 숫자를 저장해둠.
		// 두개의 합을 알고싶다. "1234" + "1234" = ?
		// sum + sum2 =? 12341234
		// 숫자 1234 + 1234 = 2468의 결과를 얻어야 한다.
		// String => int ? 
		// int , double 등의 보라색으로 글씨 바뀌는것 => 기본타입
		// 대문자로 시작하는 것들 => 대부분 Class타입
		// 기본형 데이터 타입은 Wrapper class라는것을 가지고 있다.
		// int => ※integer※ , double Double
		// String을 해당하는 타입으로 바꿔주는 행위를 하는 것
		// String에 있는 ""<=를 제거한다.
		int num = Integer.parseInt(sum) + 1234;
		// num2에 sum2를 숫자로 바꿔서 넣어보기.
		System.out.println(num);
		
		int num2 = Integer.parseInt(sum2); 
		System.out.println(num+num2);
		String sAvg = "88.6";
		// ↑ + 10을 한 결과를 얻고싶음. (98.6)
		// sAvg <= double형태로 바꾸는것 해보기.
		double dAvg = Double.parseDouble(sAvg)+10; 
		System.out.println(dAvg);
		//WrapperClass.parseDataTupe(String); => DataType
		//ex) Integer.parsInt(String);
		
		//Float.parseFloat(sAvg)
		//Long.parseLong(sAvg)
		//Byte.parseByte(sAvg)
		
		String str = "곽영균";
		// ↑ 해당 데이터를 숫자로 바꿀수 있을까? wrapperClass이용
		// 1. 시도해보기
		// 2. 어떤 오류가 발생하는지 체크해보기.
		int kyg = Integer.parseInt(str) + 10;
		System.out.println(kyg);
		// 콘솔창을 확인하기 ( 빨간색 줄 == 오류 )
		
			}

}
