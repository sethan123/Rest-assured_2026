package Feature;

import io.restassured.response.Response;
import users.users;

import static io.restassured.RestAssured.given;

public class Taskpojoclass {
    public static void main(String[] args) {


        users user = new users();

        user.setUsername("morpheus");
        user.setname("leader");
        user.setEmail("chethanjesi@gmail.com");



        Response response = given()
                .header("Content-Type","application/json")
                .body(user)
                .when()
                .post("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(201)
                .log().all()
                .extract()
                .response();

    }

}
