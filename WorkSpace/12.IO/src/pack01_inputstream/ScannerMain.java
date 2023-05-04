package pack01_inputstream;

public class ScannerMain {
	public static void main(String[] args) {
		// KYGScanner를 인스턴스화 하여 문자열을 입력받아 출력해보기.
		
		KYGScanner kyg = new KYGScanner(System.in);
//		String inputData = kyg.nextLine();
//		System.out.println(inputData);
		
		int i = kyg.nextint();
		System.out.println(i);
		
	}
}
