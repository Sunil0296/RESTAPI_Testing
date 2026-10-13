package differentwaystocreatePOSTreq;



import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;


public class CreatePostUsingOrgJson {

	@Test(priority = 1)
	void postUsingJsonLibrary() {
		JSONObject data = new JSONObject();
		data.put("name", "suhas");
		data.put("location", "chintamani");
		data.put("phone", "2323232323");
		String courseArr[] = {"ruby","appium"};
		data.put("courses", courseArr);
		
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("http://localhost:3000/students")
		
		.then()
		.statusCode(201)
		.body("name",equalTo("suhas"))
		.body("location",equalTo("chintamani"))
		.body("phone",equalTo("2323232323"))
		.body("courses[0]",equalTo("ruby"))
		.body("courses[1]",equalTo("appium"))
		.header("Content-Type","application/json;charset=utf-8")
		.log().all();
		
	}
	
	//@Test(priority = 2)
	void testDelete() {
		given()
		.when()
		.delete("http://localhost:3000/students")
		.then()
		.statusCode(200);
	}
	
	
}
