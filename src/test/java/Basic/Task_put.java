package Basic;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Task_put {
    public static void main(String[] args) {
        String payload = "{\n" +
                "  \"name\": \"rahul\",\n" +
                "  \"job\": \"API Tester\"\n" +
                "}";


        given()
                .header("content-type", "application/json")
                .body(payload)
                .when()
                .put("https://jsonplaceholder.typicode.com/users/1")
                .then()
                .statusCode(200)
                .body("name", equalTo("don"))
                .log().all();
    }


}
