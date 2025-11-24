package model;

import io.qameta.allure.Step;

public class UserModelAPI {

    private String email;
    private String password;
    private String name;

    public UserModelAPI(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public UserModelAPI() {
    }

    @Step("Взять email")
    public String getEmail() {
        return email;
    }

    @Step("Указать email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Step("Взять пароль")
    public String getPassword() {
        return password;
    }

    @Step("Указать пароль")
    public void setPassword(String password) {
        this.password = password;
    }

    @Step("Взять имя")
    public String getName() {
        return name;
    }

    @Step("Указать имя")
    public void setName(String name) {
        this.name = name;
    }
}
