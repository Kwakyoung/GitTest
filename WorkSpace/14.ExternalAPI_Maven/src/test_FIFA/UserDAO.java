package test_FIFA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDAO {
	
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	Scanner sc = new Scanner(System.in);
	String id;
	String playerName;
	
	public Connection getConn()	{
		String url = "jdbc:oracle:thin:@211.223.59.99:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"hanul","0000");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void dbClose() {
		try {
			if(rs != null) {rs.close();}
			if(ps != null) {ps.close();}
			if(conn != null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void list()	{
		conn = getConn();
		try {
			ps = conn.prepareStatement("SELECT * FROM KOREA");
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("PLAYER_NAME")+ " 나이:"+rs.getInt("PLAYER_AGE")+
						"  "+rs.getString("HEIGHT")+"  "+rs.getString("MAIN_FOOT")+"  "+rs.getString("POSITION")+" "+rs.getInt("PLAYER_NUM")+"번");
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		dbClose();
	}
	
	public String selectlist(String choice)	{
		conn = getConn();
		try {
			
			ps = conn.prepareStatement("SELECT * FROM KOREA WHERE PLAYER_NAME = ?");
			ps.setString(1, choice);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("PLAYER_NUM")+"번 "+rs.getString("PLAYER_NAME")+ " 나이:"+rs.getInt("PLAYER_AGE")+
						"  "+rs.getString("HEIGHT")+"  "+rs.getString("MAIN_FOOT")+"  "+rs.getString("POSITION"));
				
				return choice;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		dbClose();
		return null;
	}
	
	public boolean selectLogin() {
		while(true) {
		System.out.println("ID 입력\n▼ ");
		id = sc.nextLine();
		System.out.println("PW 입력\n▼ ");
		String pw = sc.nextLine();
		try {
			conn = getConn();
			ps = conn.prepareStatement("SELECT * FROM USERKOREA WHERE USER_ID = ? AND USER_PW = ?");
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			if(rs.next()) {
				rs.getString("USER_ID");
				rs.getString("USER_PW");
				System.out.println("로그인 되었습니다.");
			}else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
				continue;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}return true;
		}
	}
	
	public int inputInt() {
		try {
			int select = Integer.parseInt(sc.nextLine());
			return select;
		} catch (Exception e) {
			System.out.println("숫자만 입력바람");
		}
		return 0;
	}
	
	
	public void mylist()	{
		conn = getConn();
		try {
			ps = conn.prepareStatement("SELECT PLAYER_NAME FROM FIFAMYMEMBER WHERE MEMBER_ID = '"+id+"'");
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("PLAYER_NAME"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		dbClose();
	}
	
	public void myBP() {
		conn = getConn();
		
		try {
			ps = conn.prepareStatement("SELECT BP FROM FIFAMYMEMBER WHERE MEMBER_ID = '"+id+"'");
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("BP"));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void buyPlayer() {
		conn = getConn();
		try {
			System.out.println("\n구매할 선수의 이름 입력바람");
			playerName = sc.nextLine();
			ps = conn.prepareStatement("INSERT INTO FIFAMYMEMBER (MEMBER_ID, PLAYER_NAME) "
					+ "VALUES (?, ?)");
			ps.setString(1, id);
			ps.setString(2, playerName);
			rs=ps.executeQuery();
			System.out.println(playerName+" 선수 구매가 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		
	}
	
	
	public void sellPlayer() {
		conn = getConn();
		try {
			System.out.println("\n판매할 선수의 이름 입력바람");
			playerName = sc.nextLine();
			ps = conn.prepareStatement("DELETE FROM FIFAMYMEMBER WHERE PLAYER_NAME = ? ");
			ps.setString(1,playerName);
			rs=ps.executeQuery();
			System.out.println(playerName+" 선수 판매가 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void plusBP() {
//		conn = getConn();
//
//		try {
//			ps = conn.prepareStatement("UPDATE FIFAMYMEMBER SET BP = ''");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
	
	
	
	
	
	
}
	

