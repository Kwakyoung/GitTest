package pack03.mysqlplus;

import java.util.Scanner;

public class SqlPlusMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("KYG Sqlplus 입니다.");
		System.out.println("사용자명을 입력 : ");
		String user = sc.nextLine();
		System.out.println("비밀번호를 입력 : ");
		String password = sc.nextLine();
		
		System.out.println(user+" "+password);
		SqlDAO dao = new SqlDAO();
//		boolean aa = dao.checkConnection(user, password); 불리언 리턴이기때문에 여기서도 불리언으로 가능
		// 따라서 if 조건문 안에 사용 한것
		if ( dao.checkConnection(user, password) == true ) {
			System.out.println("sql문을 입력을 받으면 된다.");
			String sql = sc.nextLine();
			dao.sendSql(sql);
		}else {
			System.out.println("종료가 되면 된다.");
		}
		
		
		
	}
}
