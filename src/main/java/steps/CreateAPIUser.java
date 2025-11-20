package steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.UserModelAPI;

import static data.DataTest.*;
import static io.restassured.RestAssured.given;

public class CreateAPIUser {


    public void createUser(UserModelAPI user){         //user) {
        RestAssured.baseURI = BURGER_URL;
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(USER_CREATE);
    }

    public void userDelete() {
        given()
                .log().all()
                .contentType(ContentType.JSON)
                .when()
                .delete(USER_DELETE);
    }
}


