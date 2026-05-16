package Basic;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class createUser {
	
	@Test
	public void createUser() {
		String payload = "{\n" +
                "  \"name\": \"Chethan\",\n" +
                "  \"job\": \"QA\"\n" +
                "}";
		
		
		given()
		.header("content-type" , "application/json")
		.body(payload)
		.when()
				.post("https://jsonplaceholder.typicode.com/users")
		.then()
			.statusCode(201)
			.body("name", equalTo("Chethan"))
			.log().all();
	}
}

