import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.Test;

import static data.DataTest.EMAIL;
import static data.DataTest.PASSWORD;
import static junit.framework.TestCase.assertTrue;

public class UserLoginTest extends BaseTest {

    @Test
    @Step("Вход через Личный кабинет")
    @Description("Проверяет переход к форме входа через Личный кабинет и успешную авторизацию")
     public void loginPrivateCabinet() {
        mainPage.openPage();     //открыть главную страницу
        mainPage.inputCabinet();  //нажать кн. Личный кабинет
        loginPage.checkLoginButton();  // открылась форма входа, появилась кнопка Войти
        stepLoginBurger.stepLogin(EMAIL,PASSWORD);
        assertTrue("Кнопка Оформить заказ отображается - ", driver.findElement(mainPage.getButtonPlaceOrder()).isDisplayed());
    }

    @Test
    @Step("Вход через восстановление пароля")
    @Description("Проверяет переход к форме входа через ссылку 'Восстановить пароль' и авторизацию")
    public void loginViaPasswordRecovery() {
        mainPage.openPage();     //открыть главную страницу
        mainPage.inputCabinet();  //нажать кн. Личный кабинет
        loginPage.checkLoginButton();  // открылась форма входа, появилась кнопка Войти
        loginPage.clickButtonPassword(); //нажать на восстановление пароля
        passwordRecoveryPage.waitButtonRecover(); // открылась форма восстановления пароля, появилась кнопка Восстановить
        passwordRecoveryPage.clickButtonInput();// кликнуть на кн.Войти на странице Восстановления пароля
        loginPage.checkLoginButton();  // открылась форма входа, появилась кнопка Войти
        stepLoginBurger.stepLogin(EMAIL,PASSWORD);
        assertTrue("Кнопка Оформить заказ отображается - ", driver.findElement(mainPage.getButtonPlaceOrder()).isDisplayed());
    }

    @Test
    @Step("Вход через страницу регистрации")
    @Description("Проверяет переход к форме входа через страницу регистрации и авторизацию")
    public void loginViaRegistrationPage(){
        mainPage.openPage();     //открыть главную страницу
        mainPage.inputCabinet();  //нажать кн. Личный кабинет
        loginPage.checkLoginButton();  // открылась форма входа, появилась кнопка Войти
        loginPage.clickRegister(); // нажать на зарегистрироваться
        registerPage.waitButtonRegister(); // открылась форма регистрации, появилась кнопка Зарегистрироваться
        registerPage.clickButtonEnterPageRegister(); //нажать на кн Войти на странице регистрации
        loginPage.checkLoginButton();  // открылась форма входа, появилась кнопка Войти
        stepLoginBurger.stepLogin(EMAIL,PASSWORD);
        assertTrue("Кнопка Оформить заказ отображается - ", driver.findElement(mainPage.getButtonPlaceOrder()).isDisplayed());
    }
    @Test
    @Step("Вход через кнопку 'Войти в аккаунт'")
    @Description("Проверяет переход к форме входа через кнопку 'Войти в аккаунт' и авторизацию")
    public void loginViaAccountButton() {
        mainPage.openPage();
        mainPage.clickButtonAccaunt();  //кликнуть на 'Войти в аккаунт'
        loginPage.checkLoginButton();  // открылась форма входа, появилась кнопка Войти
        stepLoginBurger.stepLogin(EMAIL,PASSWORD); //Залогиниться
        assertTrue("Кнопка Оформить заказ отображается - ", driver.findElement(mainPage.getButtonPlaceOrder()).isDisplayed());
    }


}


