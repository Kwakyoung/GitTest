package pack03.mysqlplus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class SqlDAO {
	Connection conn;		 // sqlplus에서 실제로 사용자명과 비밀번호를 입력받았을때 접속을 시도하는 연결객체
	PreparedStatement ps; 	 // 쿼리를 전송하고 실행하는 객체
	ResultSet rs; 			 // 결과를 받아오기위한 객체
	
	public boolean checkConnection(String user, String password) {
		// 메인에서 입력한 사용자명과 비밀번호를 여기 메소드까지 가지고 와야함.
		// SqlPlusMain에서 checkConnection 메소드를 호출하는데 사용자명과 비밀번호가 출력될수있게 해보기
		System.out.println("check : "+user+" "+password);
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// oracle.jdbc.driver.OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,password);
			if(!conn.isClosed()) {
				System.out.println("다음에 접속됨." + conn.getMetaData().getDatabaseProductVersion());
				return true;
			}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("오라클 드라이버가 준비가 안되어서 사용이 불가능한 PC입니다.");
			} catch (Exception e) {
				System.out.println("알수없는 오류발생! 개발자에게 문의");
			}
			
		return false;
	}
	
	public void sendSql(String sql){
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {  // 데이터를 조회할때 컬럼의 별청이나 이름을 모르는 상태로 조회를 하면
								 // DTO에 담을수가 없기 때문에 이런 방법은 사용을 안한다.
				
				int test = rs.getMetaData().getColumnCount();
				
				for (int i = 1; i<rs.getMetaData().getColumnCount(); i++) {
				System.out.println(rs.getString(i)); // 컬럼의 헤드(별칭)을 따로 반복문을 통해서 추출하고 또 데이터 건수만큼
				}									 // 반복처리가 필요한데 거기까지는 우리가 작업을 할필요가 없음.
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("kygSqlplus Exception : "+e.getMessage());
		}
	}
	
}
