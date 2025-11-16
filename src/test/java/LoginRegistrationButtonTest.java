import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static data.DataTest.EMAIL_OLD;
import static data.DataTest.PASSWORD_OLD;
import static junit.framework.TestCase.assertTrue;

public class LoginRegistrationButtonTest extends BaseTest {

    @Test
    @DisplayName("User logs in registration form")
    public void loginRegistrationButton(){
        mainPage.openPage();     //открыть главную страницу
        stepGoToRegistration.stepGoToRegistration(); // шаг в step - перейти на страницу регистрации
        registerPage.clickButtonEnterPageRegister();  //кликнуть кнопка Войти
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginPage.getButtonInput()));
        stepLoginBurger.stepLogin(); // шаг в step - залогиниться под существующим паролем
        assertTrue("Кнопка Оформить заказ отображается - ", driver.findElement(mainPage.getButtonPlaceOrder()).isDisplayed());
    }
}
