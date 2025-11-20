package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasswordRecoveryPage {
    private final WebDriver driver;

    private final By buttonRecover = By.xpath("//button[text()='Восстановить']"); // кнопка Восстановить пароль
    private final By buttonInput = By.xpath("//a[text()='Войти']"); // кнопка Войти, переход в окно логина пароля

    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
    }


    @Step("нажать на кн. Войти")
    public void clickButtonInput() {
        driver.findElement(buttonInput).click();
    }
    @Step("Ожидание появления кнопки Восстановить")
    public void waitButtonRecover(){
            new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(buttonRecover));
    }

}
