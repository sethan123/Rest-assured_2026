package Basic;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PathParamTest {
    public static void main(String[] args) {
        given()
                .pathParam("id",1)
                .when()
                .get("https://jsonplaceholder.typicode.com/users/{id}")
                .then()
                .statusCode(200)
                .body("id",equalTo(1))
                .log().all();

    }


}
