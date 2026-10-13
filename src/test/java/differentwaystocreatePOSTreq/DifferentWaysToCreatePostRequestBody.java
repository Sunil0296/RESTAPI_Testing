package differentwaystocreatePOSTreq;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;
import java.util.HashMap;

import org.testng.annotations.Test;

public class DifferentWaysToCreatePostRequestBody {
//HashMap
//	Org.JSON
//	POJO Class
//	External json file data
	
	@Test (priority = 1)
	void postRequestUsingHashMap() {
		HashMap data = new HashMap();
		data.put("name", "scott");
		data.put("location", "cmy");
		data.put("phone", "1234567");
		String courseArr[] = {"c","c++"};
		data.put("courses", courseArr);
		
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("http://localhost:3000/students")
		
		.then()
		.statusCode(201)
		.body("name", equalTo("scott"))
		.body("location",equalTo("cmy"))
		.body("phone",equalTo("1234567"))
		.body("courses[0]",equalTo("c"))
		.body("courses[1]",equalTo("c++"))
		.header("Content-Type","application/json; charset=utf-8")
		.log().all();
		
	}
	
	@Test(priority = 2)
	void testDelete() {
		given()
		
		.when()
		.delete("http://localhost:3000/students/1")
		
		.then()
		.statusCode(200);
		
	}
	
}
