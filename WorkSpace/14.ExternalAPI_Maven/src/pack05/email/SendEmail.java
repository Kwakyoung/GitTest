package pack05.email;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void main(String[] args) {
		SendEmail send = new SendEmail();
//		send.sendSimple();
		send.sendSimple();
	}
	// 1. 단순하게 텍스트만 있는 이메일 : SimpleEmail
	// 2. 첨부파일이나 url등으로 이미지가 있는 이메일 : MultiPartEmail
	// 3. 모든 기능을 가지고 html 태그까지 사용가능한 이메일 : HtmlEmail
	
	public void sendSimple() {
		SimpleEmail mail = new SimpleEmail();
		// smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); 	// 한글깨짐방지
		mail.setDebug(true); 		// 오류를 찾아서 개발을 하고있는 과정인지.
		
		mail.setAuthentication("rhkrdudrbs13", "pw");
		mail.setSSLOnConnect(true);
		// ==================== 고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할수있는 고객인증
		
		//송신인
		try {
			mail.setFrom("rhkrdudrbs13@naver.com" , "해킹");
			
			mail.addTo("rhkrdudrbs13@naver.com", "ㅇㅇ");  //여러개하면 여려명한테 전송
			
			mail.setSubject("회원가입 축하 메시지");
			mail.setMsg("안녕");
			
			// mail객체가 모든 정보를 가지고 전송할준비를 마침. ↑ 
			
			mail.send();
			
			
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌거" + e.getMessage());
		}
		
		
		
		
	}
	
	
	public void sendMulti() {
		MultiPartEmail mail = new MultiPartEmail();
		// smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); 	// 한글깨짐방지
		mail.setDebug(true); 		// 오류를 찾아서 개발을 하고있는 과정인지.
		
		mail.setAuthentication("rhkrdudrbs13", "pw");
		mail.setSSLOnConnect(true);
		// ==================== 고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할수있는 고객인증
		
		//송신인
		try {
			mail.setFrom("rhkrdudrbs13@naver.com" , "경찰서");
			
			mail.addTo("rhkrdudrbs13@naver.com", "곽영균");  //여러개하면 여려명한테 전송
			
			mail.setSubject("범인검거");
			
			mail.setMsg("ㅎㅇ");
			
			EmailAttachment file = new EmailAttachment();
//			file.setPath("D:\\Study_view\\pepsi\\images");  // 이미지 파일 경로를 넣어줌. (경로를 찾을수없습니다 오류나오면 주석할꺼임)
//			mail.attach(file);
			
			file = new EmailAttachment();
			file.setURL(new URL("https://m.blog.naver.com/theworkscompany/221633822873?view=img_1"));
			mail.attach(file);
			// mail객체가 모든 정보를 가지고 전송할준비를 마침. ↑ 
			
			mail.send();
			
			
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌거" + e.getMessage());
		}
		
		
		
		
	}
	
	
	public void sendHtml() {
		HtmlEmail mail = new HtmlEmail();
		// smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8"); 	// 한글깨짐방지
		mail.setDebug(true); 		// 오류를 찾아서 개발을 하고있는 과정인지.
		
		mail.setAuthentication("rhkrdudrbs13", "pw");
		mail.setSSLOnConnect(true);
		// ==================== 고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할수있는 고객인증
		
		//송신인
		try {
			mail.setFrom("rhkrdudrbs13@naver.com" , "영균");
			
			mail.addTo("rhkrdudrbs13@naver.com", "한울");  //여러개하면 여려명한테 전송
			
			mail.setSubject("한울");
			
			// 메일의 내용이 일반 글자가 아니라 html형태로 보낼꺼이기 때문에 바꿈.
			StringBuffer msg = new StringBuffer();  // "A" , "A" + "B" 
			// html String으로 만들기 경연대회
			msg.append("<html>");   // 
			msg.append("<body>");
			msg.append("<h1> 점심메뉴 추천받아요 </h1>");
			msg.append("<ul>");
			msg.append("<li> <a href = \"https://blog.naver.com/coconina7/220604984499\">수유리우동</a> </li>");
			msg.append("<li> <a href = \"https://map.naver.com/v5/search/%EA%B4%91%EC%A3%BC%20%EC%97%B0%EA%B2%BD/place/1082130463?placePath=%3Fentry=pll%26from=nx%26fromNxList=true&c=15,0,0,0,dh\"> 연경 </a> </li>");
			msg.append("<li> 백반 </li>");
			msg.append("<li> 마라탕 </li>");
			msg.append("</ul>");
			
			
			msg.append("</body>");
			msg.append("</html>");
			
			mail.setHtmlMsg(msg.toString());
			
			EmailAttachment file = new EmailAttachment();
//			file.setPath("D:\\Study_view\\pepsi\\images");  // 이미지 파일 경로를 넣어줌. (경로를 찾을수없습니다 오류나오면 주석할꺼임)
//			mail.attach(file);
			
//			file = new EmailAttachment();
//			file.setURL(new URL("https://m.blog.naver.com/theworkscompany/221633822873?view=img_1"));
//			mail.attach(file);
			// mail객체가 모든 정보를 가지고 전송할준비를 마침. ↑ 
			
			mail.send();
			
			
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌거" + e.getMessage());
		}
		
		
		
		
	}
	
	
	
}


