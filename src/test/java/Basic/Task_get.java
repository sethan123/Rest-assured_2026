package Basic;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class Task_get {
	
	
	@Test
	public void task() {
		given()
		.when().get("https://jsonplaceholder.typicode.com/users/1")
		.then()
		  .statusCode(200)
		  .body("username",equalTo("Bret"))
		  .body("email",equalTo("Sincere@april.biz"));
		  
	}

}
