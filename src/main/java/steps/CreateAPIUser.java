package steps;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.UserModelAPI;

import static data.DataTest.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreateAPIUser {
    private String authToken; // Инкапсуляция
    private String authTokenFresh;

    @Step("Создать пользователя")
    public Response createUser(UserModelAPI user) {

        RestAssured.baseURI = BURGER_URL;

        Response response = given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(USER_CREATE);

        // Извлекаем токен из ответа
        this.authToken = response.jsonPath().getString("accessToken");
        this.authTokenFresh = response.jsonPath().getString("refreshToken");
        return response;
    }

    @Step("Удалить пользователя")
    public void userDelete() {
        given()
                .log().all() // Логируем только при ошибке
                .header("Authorization", authToken)
                .contentType(ContentType.JSON)
                .when()
                .delete(USER_DELETE)
                .then()
                .statusCode(equalTo(202))
                .log().ifValidationFails();

    }
}


