package pack06.go.data;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class JsoupAPI_1 {
	public static void main(String[] args) {
		// https://apis.data.go.kr/B551232/OAMS_PRKPLCE_01/GET_OAMS_PRKPLCE_01?serviceKey=UkUTi2n%2BNLdNqvBJFRqgeFly1VdCmE6yItwmsTTm6UDFXP0VPZGCI7dwygVXZyTFUBktwhgGzXzEHlja575i%2BQ%3D%3D&pageNo=1&numOfRows=10&apiType=json&STATION_NAME=%EA%B8%88%EB%82%A8%EB%A1%9C4%EA%B0%80
		String url ="https://apis.data.go.kr/B551232/OAMS_PRKPLCE_01/GET_OAMS_PRKPLCE_01";		
		String doc = null;
		try {
			doc = Jsoup.connect(url).data("serviceKey", "UkUTi2n+NLdNqvBJFRqgeFly1VdCmE6yItwmsTTm6UDFXP0VPZGCI7dwygVXZyTFUBktwhgGzXzEHlja575i+Q==").data("pageNo", "1").data("numOfRows", "10").data("apiType", "json").data("STATION_NAME", "금남로4가")
							  .timeout(1000 * 20)
							  .userAgent("Chome")
							  .ignoreContentType(true)
							  .execute().body();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(doc);
		
	}
}
