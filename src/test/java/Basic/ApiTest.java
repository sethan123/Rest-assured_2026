package Basic;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTest {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/api";
		
		given()
		.when()
		.get("collections/products/records?project_id=13190")
		.then()
		.statusCode(200);
	}
}
