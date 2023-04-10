package pack02_array;

public class Ex03_Array {
	public static void main(String[] args) { 
		// args => arguments ( 인수, 파라미터 ) : main메소드 실행전 필요한 것
		// 예) 버전정보
		// args[0]을 출력하면 오류가 발생한다.
		// args = new String[1];  // 코드로 푸는 방법
		 System.out.println(args[0]);
		// 내가 만든 배열로 똑같은 오류를 만들어보기.
		
//		String[] str = new String[0];
//		System.out.println(str[0]);
		
		// 데이터타입[] 배열이름 = new 데이터타입[크키];
		// 내가 알고 있는 모든것들 <=
		// String 타입을 가지는 배열 크기는 10으로 만들어보기
		
		// int[0]에 무슨값이 초기에 있었는지? 초기값 : 0 <- 숫자형태의 변수타입은 전부 0 ex) double,long... 
		// String[0] <= 어떤 값이 들어있을까? null ( 참조형 변수들의 초기값 )
		// String[] animals = new String[5];
		String[] animals = {"강아지", "고양이", "비둘기"};
		System.out.println(animals[0]);
		
		int[] i = {1,2,3};
		System.out.println(i[2]);
		// {} <= 배열을 초기화 하는 방법중에 값의 갯수에 따라서 배열의 크기를 가변적을 사용가능한 방법이 있다.
		// 이방법은 많이 사용이 안됨. 이유는 뭘까? => 가독성이 떨어짐, 수가 커졌을때 불편함
		
	
		
		
		
		
	}

}
