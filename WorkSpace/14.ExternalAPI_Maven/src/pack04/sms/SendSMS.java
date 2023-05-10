package pack04.sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SendSMS {
	public static void main(String[] args) {
		// Git-hub 샘플 : https://github.com/coolsms-java-examples/
		// github예제가 interface와 여러 class로 분리해놔서 현재는 보기가 힘듬.
		
		
		final String APIKEY = "NCSH13DCMLNNS9RX";
		final String APISECRET = "IYQWWWAORGX5O7XWDY2JUVALWEXTKMIY";
		
		Message sms = new Message(APIKEY, APISECRET);
		
		HashMap<String, String> params = new HashMap<>();
		params.put("to", "01034481720");
		params.put("from", "01034481720");
		params.put("type", "SMS"); //SMS, LMS, MMS...
		params.put("text", "문자 자바로 보내기 테스트중");
		params.put("app_version", "JAVA SDK v1.2");
		
		try {
			JSONObject obj = sms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			e.printStackTrace();
		}
		
	
	
	
	
	
	}
}
