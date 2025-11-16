import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;

public class SwitchSauceBreadTest extends BaseTest{
    @Test
    @DisplayName("Switch bread - sauce - bread")
    public void switchIngredient() {
        mainPage.openPage();
        mainPage.clickSauce();
        mainPage.clickBread();
        By breadLocator = mainPage.getObjectBread(); //забираем локатор с мейн пейдж
        WebElement breadElement = driver.findElement(breadLocator); //ищем вебэлемент
        assertTrue("Элемент Булка отображается", breadElement.isDisplayed());
    }
}
