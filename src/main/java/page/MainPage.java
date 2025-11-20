package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static data.DataTest.BURGER_URL;

public class MainPage {
    private final WebDriver driver;
    private final By personCabinet = By.xpath("//p[text()='Личный Кабинет']"); // кнопка Личный кабинет
    private final By buttonAccaunt = By.xpath("//button[text()='Войти в аккаунт']");// Кнопка входа в аккаунт
    private final By buttonPlaceOrder = By.xpath("//button[text()='Оформить заказ']");// Кнопка оформить заказ
    private final By buttonBread = By.xpath("//div[contains(@class, 'tab_tab__1SPyG') and .//span[text()='Булки']]"); //переключатель Булки
    private final By buttonSauce = By.xpath("//div[contains(@class, 'tab_tab__1SPyG') and .//span[text()='Соусы']]"); //переключатель Соусы
    private final By buttonFilling = By.xpath("//div[contains(@class, 'tab_tab__1SPyG') and .//span[text()='Начинки']]"); //переключатель Начинки
    private final By objectBread = By.xpath("//div[contains(@class, 'tab_tab__1SPyG') and contains(@class, 'tab_tab_type_current__2BEPc') and .//span[text()='Булки']]"); //ингредиент Булки выделен
    private final By objectSauce = By.xpath("//div[contains(@class, 'tab_tab__1SPyG') and contains(@class, 'tab_tab_type_current__2BEPc') and .//span[text()='Соусы']]");  //ингредиент Соусы выделен
    private final By objectFilling = By.xpath("//div[contains(@class, 'tab_tab__1SPyG') and contains(@class, 'tab_tab_type_current__2BEPc') and .//span[text()='Начинки']]"); //ингредиент Начинки выделен

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // геттер кнопки Оформить заказ
    public By getButtonPlaceOrder() {
        return buttonPlaceOrder;
    }


    @Step("Открыть главную страницу")
    public void openPage() {
        driver.get(BURGER_URL);
    }

    @Step("Нажать на кнопку Личный кабинет")
    public void inputCabinet() {
        driver.findElement(personCabinet).click();

    }

    @Step("Нажать на кнопку Войти в аккаунт")
    public void clickButtonAccaunt() {
        driver.findElement(buttonAccaunt).click();
    }

    @Step("Нажать на Булки")
    public void clickBread() throws InterruptedException {
        driver.findElement(buttonBread).click();
        Thread.sleep(1000);  //  увидеть переключение
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(objectBread));
    }

    @Step("Нажать на Соусы")
    public void clickSauce() throws InterruptedException {
        driver.findElement(buttonSauce).click();
        Thread.sleep(1000);  //  увидеть переключение
         new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(objectSauce));
    }

    @Step("Нажать на Начинки")
    public void clickFilling() throws InterruptedException {
        driver.findElement(buttonFilling).click();
        Thread.sleep(1000);  //  увидеть переключение
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(objectFilling));
    }

    @Step("Найти веб-элемент начинка")
    public WebElement findFilling(){
    WebElement fillingElement = driver.findElement(objectFilling);
    return fillingElement;//ищем вебэлемент
    }
    @Step("Найти веб-элемент соус")
    public WebElement findSauce(){
        WebElement sauceElement = driver.findElement(objectSauce);
        return sauceElement;//ищем вебэлемент
    }
    @Step("Найти веб-элемент булка")
    public WebElement findBread(){
        WebElement breadElement = driver.findElement(objectBread);
        return breadElement;//ищем вебэлемент
    }
}
