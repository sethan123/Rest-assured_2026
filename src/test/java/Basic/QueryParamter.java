package Basic;

import static io.restassured.RestAssured.given;

public class QueryParamter {

    public static void main(String[] args) {

        given()
                .when()
                .pathParam("id",1)
                .get("https://jsonplaceholder.typicode.com/users/{id}")
                .then()
                .statusCode(200)
                .log().all();


    }
}
