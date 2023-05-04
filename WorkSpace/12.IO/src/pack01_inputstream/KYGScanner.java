package pack01_inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class KYGScanner {
	// BufferReader를 사용해서 스캐너와 비슷한 구조를 만들어보기.
	// Scanner sc = new Scanner(System.in);
	
	private BufferedReader br;
	
	public KYGScanner(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
	}
	
	public String nextLine(){
		String inputData;
		try {
			inputData = br.readLine();
			return inputData;  // 오류없으면 입력된것
			
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;	// 오류발생시 return
		}
		
	}
	
	// 기존 스캐너 nextint는 숫자 외에값을 입력하면
	// 오류가 발생했음. 우리가 만들 nextint는
	// 숫자 외에값이 입력되면 -1을 return하는 메소드를 만드세요.
	
	public int nextint() {
		int i;
		try {
			i = Integer.parseInt(br.readLine());
			return i;
		} catch (Exception e) {
			// e.printStackTrace(); // 오류 출력이 필요할시
			return -1;
	}
	
	}
}
