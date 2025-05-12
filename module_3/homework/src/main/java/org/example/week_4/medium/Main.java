package org.example.week_4.medium;
/*Вам нужно создать возможность получения данных пользователя через UserData
из сети и сохранения данных в кэше, по такой же логике как MyData и GeoData.
Нужно реализовать классы
    - UserData
        • id (int) – уникальный идентификатор пользователя.
        • name (String) – имя пользователя.
        • email (String) – адрес электронной почты.
        • Переопределить метод toString(), чтобы удобно выводить данные о пользователе.
    - UserRepository
    - UserDataCloudDataSource
Проверить логику в Main.*/
public class Main {
    public static void main(String[] args) {
        DataSource<UserData> myUserData = new UserRepository<>(
                new CachedDataSource<>(), new UserDataCloudDataSource());
        UserData userData = myUserData.getUserData();
        System.out.println(userData.toString());

        System.out.println();

        UserData userData2 = myUserData.getUserData();
        System.out.println(userData2.toString());
    }
}
