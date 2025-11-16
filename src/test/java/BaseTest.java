import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.LoginPage;
import page.MainPage;
import page.PasswordRecoveryPage;
import page.RegisterPage;
import steps.StepGoToRegistration;
import steps.StepLoginBurger;

public class BaseTest {
    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    RegisterPage registerPage;
    PasswordRecoveryPage passwordRecoveryPage;
    StepGoToRegistration stepGoToRegistration;
    StepLoginBurger stepLoginBurger;

    public void startBrowseChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void startBrowserYandex() {
        System.setProperty("webdriver.chrome.driver", "F:/Users/stala/Downloads/yandexdriver-25.8.0.1872-win64/yandexdriver.exe");
        driver = new ChromeDriver();
    }

    @Before
    public void startUp() {

        final String browser = "chrome"; // или "Yandex"
        if (browser.equals("chrome")) {
            startBrowseChrome();
        } else if (browser.equals("Yandex")) {
            startBrowserYandex();
        }

        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        passwordRecoveryPage = new PasswordRecoveryPage(driver);
        stepGoToRegistration = new StepGoToRegistration(driver, mainPage, loginPage, registerPage);
        stepLoginBurger = new StepLoginBurger(mainPage, loginPage, registerPage, driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
