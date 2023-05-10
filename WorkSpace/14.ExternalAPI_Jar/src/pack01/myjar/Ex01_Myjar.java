package pack01.myjar;

import java.util.ArrayList;
import java.util.List;

import pack01.list.BoardDAO;
import pack01.list.BoardDTO;
import pack01.list.Ex01_List;
import pack01_base.Ex01_Car;

public class Ex01_Myjar {
	public static void main(String[] args) {
		// 자바프로젝트를 계속해서 만들고 있는데 해당하는 프로젝트가 기능을 가지고,
		// 완성이 되어서 외부에서 사용이 되어야할때 여러가지 확장자로 추출이 될수있다. (export)
		// Scanner, Random등은 사실 자바프로젝트로 이미 만들어 놓고 추출되어 기본 Java 언어에
		// 포함되어있는 기능들이다.
		
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		Ex01_Car car = new Ex01_Car(); // 07. 자바프로잭트꺼
		
		
		// 내가 만들었던 자바프로젝트중에 재밌었던것을 jar파일로 만들어서
		// 14번째 프로젝트에서 사용가능하게 해보기.
		
		
		
		
		
		
		
		
		
		
		
	}
}
