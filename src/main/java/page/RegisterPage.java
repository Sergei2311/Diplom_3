package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    private final WebDriver driver;

    private final By fieldName = By.xpath("//fieldset[1]/div/div/input[@name='name']"); // поле Имя при регистрации
    private final By fieldEmail = By.xpath("//fieldset[2]/div/div/input[@name='name']"); // поле Email при регистрации
    private final By fieldPassword = By.xpath("//input[@name='Пароль']"); // поле Пароль
    private final By buttonRegister = By.xpath("//button[text()='Зарегистрироваться']");
    private final By textIncorrectPassword = By.xpath("//p[text()='Некорректный пароль']"); //уведомление неправильный пароль
    private final By buttonEnterPageRegister = By.xpath("//a[text()='Войти']"); // кнопка войти

    @Step("Текст Неправильный пароль")
    public By getTextIncorrectPassword() {
        return textIncorrectPassword;
    }

    @Step("Кнопка зарегистрироваться")
    public By getButtonRegister() {
        return buttonRegister;
    }

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Ввести Имя в форме регистрации")
    public void inputName(String name) {
        driver.findElement(fieldName).sendKeys(name);
    }

    @Step("Ввести Email в форме регистрации")
    public void inputEmail(String email) {
        driver.findElement(fieldEmail).sendKeys(email);
    }

    @Step("Ввести Пароль в форме регистрации")
    public void inputPassword(String password) {
        driver.findElement(fieldPassword).sendKeys(password);
    }

    @Step("Нажать Зарегистрироваться на странице регистрации")
    public void clickRegister() {
        driver.findElement(buttonRegister).click();
    }

    @Step("Нажать Войти на странице регистрации")
    public void clickButtonEnterPageRegister() {
        driver.findElement(buttonEnterPageRegister).click();
    }

    @Step("Ожидание появления кнопки Зарегистрироваться")
    public void waitButtonRegister() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(buttonRegister)); // ждем появления кнопки Зарегистрироваться
    }
}
