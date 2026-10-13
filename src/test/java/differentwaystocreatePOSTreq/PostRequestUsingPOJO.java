package differentwaystocreatePOSTreq;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class PostRequestUsingPOJO {
//http://localhost:3000/students
	
	@Test(priority = 1)
	void createPostRequestUsingPOJO() {
		POJO data = new POJO();
		data.setName("sunil");
		data.setLocation("cmy");
		data.setPhone("1234567");
		String coursesArr[] = {"java","selenium"};
		data.setCourses(coursesArr);
		
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("http://localhost:3000/students")
		
		.then()
		.statusCode(201)
		.body("name",equalTo("sunil"))
		.body("location",equalTo("cmy"))
		.body("phone",equalTo("1234567"))
		.body("courses[0]",equalTo("java"))
		.body("courses[1]",equalTo("selenium"))
		.header("Content-Type","application/json")
		.log().all();
	}
	
	void testDelete() {
		given()
		.when()
		.delete("http://localhost:3000/students/1")
		.then()
		.statusCode(200);
	}
}
