package UserClass;

/*Задание 3.  (необязательное)

Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию */

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;

    }

    public boolean authenticate(String name, String password) {
        return false;
    }

}