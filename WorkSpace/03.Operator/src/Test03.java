import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		// 해당 문제가 어렵다면 복습 진행 & 노션 정리.
		// 다항연산자 또는 이항연산자를 이용해서 문제 풀어보기.
		// Scanner 이용해보기.
		Scanner sc = new Scanner(System.in);  // 스캐너 준비
		String Data = sc.nextLine();    //enter를 치기전까지의 데이터를 가져옴.
		// 콘솔창을 통해서 입력받아온 String 데이터를 int로 바꾼 후 해당 숫자가 짝수인지 또는 홀수인지를 판단하여
		// 콘솔창에 출력하세요. 1 ==> 홀수, 2 ==> 짝수...
		
		// 콘솔창을 통해서 String 데이터를 (숫자)두개 입력 받는다.
		// 각각의 숫자는 num1과 num2로 구분한다.
		// 두숫자의 더하기, 빼기, 곱하기, 나누기 한 결과를 출력하기.
		
		// 두 숫자중 더 큰 숫자가 어떤 숫자인지 표시하기.
		
		// Method (메소드) == 미리 만들어놓은 기능을 호출해서 사용한다 
		String result =Integer.parseInt(sc.nextLine())%2 ==1 ? "홀수" : "짝수";
		System.out.println(Integer.parseInt(sc.nextLine())%2 ==1 ? "홀수" : "짝수");
		
		int sum = Integer.parseInt(Data);
		String str1 = sum % 2 == 1 ? "홀수" : "짝수";
		System.out.println(str1);
		
		String Data1 = sc.nextLine();
		String Data2 = sc.nextLine();
		int num1 = Integer.parseInt(Data1);
		int num2 = Integer.parseInt(Data2);
		// ↓ 간단하게 표기하면
		int num3 = Integer.parseInt(sc.nextLine());
		
		System.out.println("num1 + mum2 =" +(num1 + num2));
		System.out.println("num1 - num2 =" +(num1 - num2));
		System.out.println("num1 * num2 =" +(num1 * num2));
		System.out.println("num1 / num2 =" +(num1 / num2));
		
		int kyg = num1 > num2 ? num1 : num2;       // String 으로 -> 왜냐하면 같은수를 넣을수도 있기 때문에
		System.out.println("더 큰 숫자는 " + kyg + " 입니다.");
		
	}

}
