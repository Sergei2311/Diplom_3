package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.MainPage;
import page.RegisterPage;

import java.time.Duration;

public class StepLoginBurger {
    MainPage mainPage;
    LoginPage loginPage;
    RegisterPage registerPage;
    WebDriver driver;

    public StepLoginBurger(MainPage mainPage, LoginPage loginPage, RegisterPage registerPage, WebDriver driver) {
        this.mainPage = mainPage;
        this.loginPage = loginPage;
        this.registerPage = registerPage;
        this.driver = driver;
    }
    @Step("Залогиниться")
    public void stepLogin(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickButtonInput();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(mainPage.getButtonPlaceOrder()));

    }
}