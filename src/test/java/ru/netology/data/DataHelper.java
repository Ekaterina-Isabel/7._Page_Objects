package ru.netology.data;

import lombok.Value;

public class DataHelper {

    //@Value - аннотация, которая генерирует геттеры, ToString, Equals, Data
    //класс, который генерирует данные
    @Value

    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        //сейчас данные захардкожены, в дальнейшем сюда можно добавить запрос к БД, вызов API сервиса или создание рандомных значений через Faker
        //в качестве валидных, приложение готово принять эти данные
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }
}
