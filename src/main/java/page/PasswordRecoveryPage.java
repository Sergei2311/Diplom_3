package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage {
    private WebDriver driver;

    private By buttonRecover = By.xpath("//button[text()='Восстановить']"); // кнопка Восстановить
    private By buttonInput = By.xpath("//a[text()='Войти']"); // кнопка Войти, переход в окно логина пароля

    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getButtonRecover() {
        return buttonRecover;
    }

    public void clickButtonInput() {
        driver.findElement(buttonInput).click();
    }
}
