import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;

public class SwitchFillingSauceBreadTest extends BaseTest{

    @Test
    @Description("Переключение булка - начинка ")
    @Step("Проверка разделоа при переключении с хлеба на начинку")
    public void switchFilling() throws InterruptedException {
        mainPage.openPage();
        mainPage.clickFilling();
        assertTrue("Элемент Начинка отображается", mainPage.findFilling().isDisplayed());
    }

    @Test
    @Description("Переключение булка - соус ")
    @Step("Проверка разделоа при переключении с хлеба на соус")
    public void switchSauce() throws InterruptedException {
        mainPage.openPage();
        mainPage.clickSauce();
        assertTrue("Элемент Соус отображается", mainPage.findSauce().isDisplayed());  //проверяем что вебэлемент отображается
    }
    @Test
    @Description("Переключение булка-соус-булка")
    @Step("Проверка разделоа при переключении с хлеба на соус и обратно")
    public void switchBreadt() throws InterruptedException {
        mainPage.openPage();
        mainPage.clickSauce();
        mainPage.clickBread();
        assertTrue("Элемент Булка отображается", mainPage.findBread().isDisplayed());
    }


}
