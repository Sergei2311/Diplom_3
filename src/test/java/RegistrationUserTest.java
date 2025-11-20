import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static data.DataTest.*;
import static junit.framework.TestCase.assertTrue;

public class RegistrationUserTest extends BaseTest{

    @Test
    @Description("Успешная регистрация пользователя")
    @Step("Успешно зарегистрироваться")
    public void registrationUserTest(){
        mainPage.openPage();     //открыть главную страницу
        stepGoToRegistration.stepGoToRegistration(); // шаг в step - перейти на страницу регистрации
        // ввод имени, email и пароля дляпроверки
        registerPage.inputName(NAME_REGISTER+"s");
        registerPage.inputEmail(EMAIL+"s");
        registerPage.inputPassword("123456");
        registerPage.clickRegister(); // клик на Зарегистрироваться
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(loginPage.getButtonInput()));
        assertTrue("Кнопка Войти отображается - ", driver.findElement(loginPage.getButtonInput()).isDisplayed());
    }

    @Test
    @Description("Ввод пользователем некорректного пароля, менее шести символов")
    @Step("Некорректный ввод пароля")
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
