package cookiesandheaders;
import static io.restassured.RestAssured.given;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TestHeaders {

	//@Test
	void testHeaders() {
		given()
		.when()
		.get("https://www.google.com/")
		.then()
		.header("content-type", "text/html; charset=ISO-8859-1")
		.header("content-encoding", "gzip")
		.header("server", "gws")
		.log().headers();
		
	}
	
	void getHeaders() {
		
		Response	res = given()
			.when()
			.get("https://www.google.com/");
			
//		get single header
		String headervalue = res.header("content-type");
		System.out.println("headervalue:"+headervalue);
		
//		get all headers info
		Headers myheaders= res.getHeaders();
		for(Header h:myheaders) {
			System.out.println(h.getName()+":"+h.getValue());
		}
			
	}
}
