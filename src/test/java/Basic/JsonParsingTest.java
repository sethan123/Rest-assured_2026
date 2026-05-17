package Basic;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class JsonParsingTest {
    public static void main(String[] args) {
        Response response = given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users/1");

        String name = response.jsonPath().get("username");
        String email = response.jsonPath().get("phone");
        String website = response.jsonPath().get("website");
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("website: " + website);
        String city = response.jsonPath().get("address.city");
        System.out.println("City: " + city);
        String companyName = response.jsonPath().get("company.name");
        System.out.println("companyName:" +companyName);

    }

}
