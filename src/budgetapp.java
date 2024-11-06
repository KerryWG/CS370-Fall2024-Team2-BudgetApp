import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Base64;

//user class
class User {
    private String username;
    private String passwordHash;

    public User(String username, String password) {
        this.username = username;
        this.passwordHash = hashPassword(password);
    }

    public String getUser() {
        return username;
    }
    public String hasingPass(String password) {

    }
}

