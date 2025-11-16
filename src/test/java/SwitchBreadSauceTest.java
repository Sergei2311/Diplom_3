import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;

public class SwitchBreadSauceTest extends BaseTest {
    @Test
    @DisplayName("Switch bread - sauce ")
    public void switchIngredient() {
        mainPage.openPage();
        mainPage.clickSauce();
        By sauceLocator = mainPage.getObjectSauce(); //забираем локатор с мейн пейдж
        WebElement sauceElement = driver.findElement(sauceLocator); //ищем вебэлемент
        assertTrue("Элемент Соус отображается", sauceElement.isDisplayed());  //проверяем что вебэлемент отображается

    }
}