package Basic;

import static io.restassured.RestAssured.given;

public class task_delete {
    public static void main(String[] args) {
        given()
                .when()
                .delete("https://jsonplaceholder.typicode.com/users/5")
                .then()
                .statusCode(200)
        .log().all();


    }
}
