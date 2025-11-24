import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class SwitchFillingSauceBreadTest extends BaseTest{

    @Test
    @Description("Проверка разделоа при переключении с хлеба на начинку")
    public void switchFilling()  {
        mainPage.openPage();
        mainPage.clickFilling();
        assertTrue("Элемент Начинка отображается", mainPage.findFilling().isDisplayed());
    }

    @Test
    @Description("Проверка разделоа при переключении с хлеба на соус")
    public void switchSauce()  {
        mainPage.openPage();
        mainPage.clickSauce();
        assertTrue("Элемент Соус отображается", mainPage.findSauce().isDisplayed());  //проверяем что вебэлемент отображается
    }
    @Test
    @Description("Проверка разделоа при переключении с хлеба на соус и обратно")
    public void switchBreadt() {
        mainPage.openPage();
        mainPage.clickSauce();
        mainPage.clickBread();
        assertTrue("Элемент Булка отображается", mainPage.findBread().isDisplayed());
    }


}
