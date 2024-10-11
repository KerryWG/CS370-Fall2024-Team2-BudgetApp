import java.util.ArrayList;
import java.util.Scanner;

//user class
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUser() {
        return username;
    }
    public String getPass() {
        return password;
    }
}

//class to manage user registration and login
class User