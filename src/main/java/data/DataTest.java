package data;

import com.github.javafaker.Faker;

import java.time.Duration;

public class DataTest {
    public static final String BURGER_URL = "https://stellarburgers.education-services.ru/";
    public static final String EMAIL_OLD = "SergTester@test.ru";
    public static final String PASSWORD_OLD = "123456";

    static Faker user = new Faker();
    public static final String EMAIL = user.regexify("[a-z]{8}")+"@test.ru";
    public static final String PASSWORD = user.regexify("[0-9]{4}");
    public static final String NAME_REGISTER = user.name().firstName();

    int waitTime = 9;
    Duration DURATION = Duration.ofSeconds(waitTime);
}
