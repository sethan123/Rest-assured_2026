package Basic;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class GetUserTest {
	
	@Test
	public void getUserTest() {
		 given()
        .header("x-api-key", "reqres_31e4a018090d4ab8a5627a44cf1f0b8b")
    .when()
        .get("https://reqres.in/api/users/2")
    .then()
        .statusCode(200)
        .log().all();
		
	}
	
	}

