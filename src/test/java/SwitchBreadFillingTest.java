import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;

public class SwitchBreadFillingTest extends BaseTest{

    @Test
    @DisplayName("Switch bread - filling ")
    public void switchIngredient(){
        mainPage.openPage();
        mainPage.clickFilling();
        By fillingLocator = mainPage.getObjectFilling(); //забираем локатор с мейн пейдж
        WebElement fillingElement = driver.findElement(fillingLocator); //ищем вебэлемент
        assertTrue("Элемент Начинка отображается", fillingElement.isDisplayed());

    }
}
