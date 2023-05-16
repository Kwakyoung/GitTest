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
					System.out.println("로그아웃 되었습니다.");
					break;
				}
				}
			}else if(select==2) {
				while(true) {
				System.out.println("1.내선수 검색\n2.스쿼드\n3.상점\n4.보유BP\n5.로그아웃");
				select = dao.inputInt();
				if(select==1) {
					dao.mylist();
				}else if(select==2) {
					
				}else if(select==3) {
					System.out.println("1.선수구매 2.선수판매");
					select = dao.inputInt();
					if(select==1) {
						dao.list();
						dao.buyPlayer();
					}else if(select==2) {
						dao.mylist();
						dao.sellPlayer();
					}
				}else if(select==4) {
					while(true) {
					System.out.println("===== 나의 보유BP =====");
					dao.myBP();
					System.out.println("\n1.충전하기 2.메뉴로 돌아가기");
					select = dao.inputInt();
					if(select==1) {
						System.out.println("충전할 금액을 입력해주세요.");
						dao.plusBP();
					}else if(select==2) {
						break;
					}
					}
				}else if(select==5) {
					System.out.println("로그아웃 되었습니다.");
					break;
				}
				}
			}else {
				System.out.println("보기의 숫자를 입력해주세요.");
			}
			
		}else if(select == 2) {
			
		}else if(select == 3) {
			System.out.println("종료되었습니다.");
			break;
		}else {
			System.out.println("보기에 숫자를 입력해주세요.");
		}
		
		
		
		}
	}
	
}
