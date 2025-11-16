package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    private By fieldName = By.xpath("//fieldset[1]/div/div/input[@name='name']"); // поле Имя при регистрации
    private By fieldEmail = By.xpath("//fieldset[2]/div/div/input[@name='name']"); // поле Email при регистрации
    private By fieldPassword = By.xpath("//input[@name='Пароль']"); // поле Пароль
    private By buttonRegister = By.xpath("//button[text()='Зарегистрироваться']");
    private By textIncorrectPassword = By.xpath("//p[text()='Некорректный пароль']"); //уведомление неправильный пароль
    private By buttonEnterPageRegister = By.xpath("//a[text()='Войти']"); // кнопка войти

    public By getTextIncorrectPassword() {
        return textIncorrectPassword;
    }

    public By getButtonRegister() {
        return buttonRegister;
    }

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputName(String name) {
        driver.findElement(fieldName).sendKeys(name);
    }

    public void inputEmail(String email) {
        driver.findElement(fieldEmail).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(fieldPassword).sendKeys(password);
    }

    public void clickRegister() {
        driver.findElement(buttonRegister).click();
    }

    public void clickButtonEnterPageRegister() {
        driver.findElement(buttonEnterPageRegister).click();
    }

}
