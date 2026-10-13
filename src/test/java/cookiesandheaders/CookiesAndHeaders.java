package cookiesandheaders;
import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesAndHeaders {

	@Test(priority = 1)
	 void testCookies() {
		 
		given()
		
		.when()
			.get("https://www.google.com/")
		.then()
		.cookie("AEC","AdJVEasykkNM8I0cKV4g-2dUBqQCy5jNl-6OBYxw7WdVd0V6ZywrV4mTjo4")
		.log().all();
	 }
	
	@Test(priority = 2)
	void getAllCookies() {
	Response res =	given()
		
		.when()
		.get("https://www.google.com/");
	
//	get single cookie
	/*String cookie_value = res.getCookie("AEC");
	System.out.println("The value of cookie is :"+cookie_value);
		*/
	
//	get all cookies
	Map<String,String> cookies_value = res.getCookies();
	//System.out.println(cookies_value.keySet().);
	
	for(String k :cookies_value.keySet()) {
		String cookievalue = res.getCookie(k);
		System.out.println(k);
	}
	}
}
