package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    private final By fieldEmailInput = By.xpath("//fieldset[1]/div/div/input"); // поле Email при входе
    private final By fieldPasswordInput = By.xpath("//fieldset[2]/div/div/input"); // поле Email при входе
    private final By fieldRegister = By.xpath("//a[text()='Зарегистрироваться']"); // поле Зарегистрироваться
    private final By buttonInput = By.xpath("//button[text()='Войти']"); // кнопка Войти
    private final By buttonPassword = By.xpath("//a[text()='Восстановить пароль']"); //кннопка Восстановить пароль

    public By getButtonInput() {
        return buttonInput;
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Ввод существующего Email при входе")
    public void enterEmail(String email) {
        driver.findElement(fieldEmailInput).sendKeys(email);
    }

    @Step("Ввод существующего Пароля при входе")
    public void enterPassword(String password) {
        driver.findElement(fieldPasswordInput).sendKeys(password);
    }

    @Step("Нажать на зарегистрироваться")
    public void clickRegister() {
        driver.findElement(fieldRegister).click();
    }

    @Step("Нажать на кнопку Войти в окне входа в аккаунт")
    public void clickButtonInput() {
        driver.findElement(buttonInput).click();
    }

    @Step("нажать на Восстановление пароля")
    public void clickButtonPassword() {
        WebElement element = driver.findElement(buttonPassword); // Найди вебэлемент Кнопку Восстановления
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element); // Прокрути страницу до кнопки
        driver.findElement(buttonPassword).click();
    }

    @Step("Ожидание появления кнопки Войти")
    public void checkLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(buttonInput));
    }
}
