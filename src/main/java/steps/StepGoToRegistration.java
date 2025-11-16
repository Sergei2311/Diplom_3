package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.MainPage;
import page.RegisterPage;

import java.time.Duration;

public class StepGoToRegistration {
    MainPage mainPage;
    LoginPage loginPage;
    RegisterPage registerPage;
    WebDriver driver;

    public StepGoToRegistration(WebDriver driver, MainPage mainPage, LoginPage loginPage, RegisterPage registerPage) {
        this.driver = driver;
        this.mainPage = mainPage;
        this.loginPage = loginPage;
        this.registerPage = registerPage;
    }

    public void stepGoToRegistration(){
    mainPage.inputCabinet();  //вход в ЛК
        loginPage.clickRegister();//кликнуть зарегистрироваться
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(registerPage.getButtonRegister())); // ждем появления кнопки Зарегистрироваться
    }
}
