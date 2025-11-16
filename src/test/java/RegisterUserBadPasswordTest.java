import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.MainPage;
import page.RegisterPage;
import steps.StepGoToRegistration;

import java.time.Duration;

import static data.DataTest.EMAIL;
import static data.DataTest.NAME_REGISTER;
import static junit.framework.TestCase.assertTrue;

public class RegisterUserBadPasswordTest extends BaseTest {

    @Test
    @DisplayName("User registers with an incorrect password")
    public void registerUserBadPasswordTest(){
        mainPage.openPage();     //открыть главную страницу
        stepGoToRegistration.stepGoToRegistration(); // шаг в step - перейти на страницу регистрации
        // ввод имени, email и пароля дляпроверки
        registerPage.inputName(NAME_REGISTER);
        registerPage.inputEmail(EMAIL);
        registerPage.inputPassword("12345");
        registerPage.clickRegister();  // клик на Зарегистрироваться
        assertTrue("Отображается текст Некорректный пароль - ", driver.findElement(registerPage.getTextIncorrectPassword()).isDisplayed());
    }
}
