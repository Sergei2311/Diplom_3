package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By fieldEmailInput = By.xpath("//fieldset[1]/div/div/input"); // поле Email при входе
    private By fieldPasswordInput = By.xpath("//fieldset[2]/div/div/input"); // поле Email при входе
    private By fieldRegister = By.xpath("//a[text()='Зарегистрироваться']"); // поле Зарегистрироваться
    private By buttonInput = By.xpath("//button[text()='Войти']"); // кнопка Войти
    private By buttonPassword = By.xpath("//a[text()='Восстановить пароль']"); //кннопка Восстановить пароль

    public By getButtonInput() {
        return buttonInput;
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // Ввести существующий Email при входе
    public void enterEmail(String email){
        driver.findElement(fieldEmailInput).sendKeys(email);
    }
    // Ввести существующий Пароль при входе
    public void enterPassword(String password){
        driver.findElement(fieldPasswordInput).sendKeys(password);
    }
    //нажать на зарегистрироваться
    public void clickRegister() {
        driver.findElement(fieldRegister).click();
           }
    //нажать на Войти
    public void clickButtonInput() {driver.findElement(buttonInput).click();}
    //нажать на Восстановление пароля
    public void clickButtonPassword(){
        WebElement element = driver.findElement(buttonPassword); // Найди вебэлемент Кнопку Восстановления
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element); // Прокрути страницу до кнопки
        driver.findElement(buttonPassword).click();
    }
}
