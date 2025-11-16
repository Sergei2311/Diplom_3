import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static data.DataTest.*;
import static junit.framework.TestCase.assertTrue;

public class RegistrationUserTest extends BaseTest{

    @Test
    @DisplayName("User registers with correct accounts")
    public void registrationUserTest(){
        mainPage.openPage();     //открыть главную страницу
        stepGoToRegistration.stepGoToRegistration(); // шаг в step - перейти на страницу регистрации
        // ввод имени, email и пароля дляпроверки
        registerPage.inputName(NAME_REGISTER);
        registerPage.inputEmail(EMAIL);
        registerPage.inputPassword("123456");
        registerPage.clickRegister(); // клик на Зарегистрироваться
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginPage.getButtonInput()));
        assertTrue("Кнопка Войти отображается - ", driver.findElement(loginPage.getButtonInput()).isDisplayed());

    }
}
