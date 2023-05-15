package pack07.last.jdbc;

import java.util.Scanner;

public class BoardMain {
	// main => html, jsp, android app화면 등의 실제 사용자 눈에 보이는 메인화면

	public void displayMenu() {
		System.out.println("게시판 프로그램");
		System.out.println("===== 메뉴 =====");
		System.out.println("게시글 추가 : I"); // insert  => CREATE
		System.out.println("게시글 조회 : S"); // select  => Read
		System.out.println("게시글 수정 : U"); // update
		System.out.println("게시글 삭제 : D"); // delete
		System.out.println("종료 : E");
		System.out.println("================");
	}
	// static 멤버는 먼저 메모리에 로딩되어야 하기 때문에 같은 static 멤버로 만들거나,
	// 아니면 클래스를 인스턴스화하여 static 멤버의 메모리 공간에 올려서 사용한다.
	
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		// 사용자가 검색한 내용을 토대로 목록을 보여주기
//		Scanner sc = new Scanner(System.in);
//		dao.selectList(sc.nextLine());
//		dao.insertBoard();
//		dao.selectList();
		dao.selectList("titlE2");
		
		
		
		
		
//		BoardMain main = new BoardMain();
//		main.displayMenu();
		
		// Scanner sc = new Scanner(System.in);
		// String testMenu = sc.nextLine();
		// System.out.println(testMenu);
		// ===== 나중에 기능 완료 후 재사용이 가능하게 반복문을 통해서 반복시킴.
	}
}
