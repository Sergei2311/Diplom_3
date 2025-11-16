package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.MainPage;
import page.RegisterPage;

import java.time.Duration;

import static data.DataTest.EMAIL_OLD;
import static data.DataTest.PASSWORD_OLD;

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
    public void stepLogin() {
        loginPage.enterEmail(EMAIL_OLD);
        loginPage.enterPassword(PASSWORD_OLD);
        loginPage.clickButtonInput();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(mainPage.getButtonPlaceOrder()));

    }
}