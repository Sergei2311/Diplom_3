import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static junit.framework.TestCase.assertTrue;

public class LoginManePageTest extends BaseTest {

    @Test
    @DisplayName("User logs in on the main page")
    public void loginManePageTest() {
        mainPage.openPage();  //открыть главную страницу
        mainPage.clickButtonAccaunt();  //кликнуть на Войти в аккаунт
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginPage.getButtonInput()));
        stepLoginBurger.stepLogin(); // шаг в step - залогиниться под существующим паролем
        assertTrue("Кнопка Оформить заказ отображается - ", driver.findElement(mainPage.getButtonPlaceOrder()).isDisplayed());

    }
}
