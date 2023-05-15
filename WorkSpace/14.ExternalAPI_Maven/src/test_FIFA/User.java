package test_FIFA;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO dao = new UserDAO();
//		dao.getConn();
//		dao.selectlist();
//		dao.selectLogin("kyg", "123");
		
		while(true) {
		System.out.println("1.로그인 2.회원가입 3.종료");
		int select = dao.inputInt();
		
		if(select == 1) {
			dao.selectLogin();
			System.out.println("1.관리자모드 2.사용자모드");
			select = dao.inputInt();
			if(select==1) {
				while(true) {
				System.out.println(" 1.선수검색 \n 2.선수전체목록 \n 3.선수등록 \n 4.선수삭제 \n 5.로그아웃");
				select = dao.inputInt();
				if(select==1) {
					System.out.println("검색하려는 선수의 이름 입력\n▼");
					String name = sc.nextLine();
					dao.selectlist(name);
					System.out.println();
					continue;
				}else if(select==2) {
					dao.list();
				}else if(select==3) {
					
				}else if(select==4) {
					
				}else if(select==5) {
					
				}
				}
			}else if(select==2) {
				System.out.println("사용자 모드");
			}else {
				System.out.println("보기의 숫자를 입력해주세요.");
			}
			
		}else if(select == 2) {
			
		}else if(select == 3) {
			break;
		}else {
			System.out.println("보기에 숫자를 입력해주세요.");
		}
		
		
		
		}
	}
	
}
