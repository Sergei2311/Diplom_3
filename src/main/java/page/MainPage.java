package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static data.DataTest.BURGER_URL;

public class MainPage {
    private WebDriver driver;
    private By personCabinet = By.xpath("//p[text()='Личный Кабинет']"); // кнопка Личный кабинет
    private By buttonAccaunt = By.xpath("//button[text()='Войти в аккаунт']");// Кнопка входа в аккаунт
    private By buttonPlaceOrder = By.xpath("//button[text()='Оформить заказ']");// Кнопка оформить заказ
    private By buttonBread = By.xpath("//span[text()='Булки']"); //переключатель Булки
    private By buttonSauce = By.xpath("//span[text()='Соусы']"); //переключатель Соусы
    private By buttonFilling = By.xpath("//span[text()='Начинки']"); //переключатель Начинки
    private By objectBread = By.xpath("//img[@alt='Флюоресцентная булка R2-D3']"); //ингредиент Булки
    private By objectSauce = By.xpath("//img[@alt='Соус Spicy-X']");  //ингредиент Соусы
    private By objectFilling = By.xpath("//img[@alt='Мясо бессмертных моллюсков Protostomia']"); //ингредиент Начинки


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // геттер кнопки Оформить заказ
    public By getButtonPlaceOrder() {
        return buttonPlaceOrder;
    }

    // геттер Булка
    public By getObjectBread() {
        return objectBread;
    }

    // геттер Соус
    public By getObjectSauce() {
        return objectSauce;
    }

    // геттер Начинка
    public By getObjectFilling() {
        return objectFilling;
    }

    // Открыть главную страницу
    public void openPage() {
        driver.get(BURGER_URL);
    }

    // Нажать на Личный кабинет
    public void inputCabinet() {
        driver.findElement(personCabinet).click();
    }

    // Нажать на кнопку Войти в аккаунт
    public void clickButtonAccaunt() {
        driver.findElement(buttonAccaunt).click();
    }

    // Нажать на Булки
    public void clickBread() {
        driver.findElement(buttonBread).click();
    }

    // Нажать на Соусы
    public void clickSauce() {
        driver.findElement(buttonSauce).click();
    }

    // Нажать на Начинки
    public void clickFilling() {
        driver.findElement(buttonFilling).click();
    }

}
