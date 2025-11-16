import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static junit.framework.TestCase.assertTrue;

public class LoginPasswordRecoveryTest extends BaseTest{
    @Test
    @DisplayName("User logs n via password recovery")
    public void loginPasswordRecovery(){
        mainPage.openPage();     //открыть главную страницу
        mainPage.inputCabinet();  //вход в ЛК
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginPage.getButtonInput()));
        loginPage.clickButtonPassword();  // клик Восстановить пароль
        new WebDriverWait(driver, Duration.ofSeconds(10))
               .until(ExpectedConditions.elementToBeClickable(passwordRecoveryPage.getButtonRecover()));
        passwordRecoveryPage.clickButtonInput(); // клик на кнопку Войти
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginPage.getButtonInput()));
        stepLoginBurger.stepLogin(); // шаг в step - залогиниться под существующим паролем
        assertTrue("Кнопка Оформить заказ отображается - ", driver.findElement(mainPage.getButtonPlaceOrder()).isDisplayed());

    }
}
