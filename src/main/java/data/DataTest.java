package data;

import com.github.javafaker.Faker;

import java.time.Duration;

public class DataTest {
    public static final String BURGER_URL = "https://stellarburgers.education-services.ru";

    public static Faker user = new Faker();
    public static final String EMAIL = user.regexify("[a-z]{8}")+"@test.ru";
    public static final String PASSWORD = user.regexify("[0-9]{6}");
    public static final String NAME_REGISTER = user.name().firstName();

    public static final String USER_DELETE = "/api/auth/user";
    public static final String USER_CREATE = "/api/auth/register";
}
