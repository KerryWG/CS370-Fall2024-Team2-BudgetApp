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

    /**
     * Hashing algorithm using SHA-256.
     * Plain text gets hashed and returns as a Base64 encoded
     * of the hash.
     *
     * @param password
     * @return hashed password as a Base64 encoded string
     */

    public String hashPassword(String password) {
        try {
            //start to initialize the md object to use SHA-256 algorithm
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            //hash bytes
            byte[] hashedBytes = md.digest(password.getBytes());
            //encode bytes to Base64 string for storage and return
            return Base64.getEncoder().encodeToString(hashedBytes);
        } catch (NoSuchAlgorithmException e) {
            //handle error or exceptions with error message
            System.out.println("SHA-256 algorithm unavailable. \nERROR");
            return null;
        }
    }

    public boolean checkPassword(String password) {
        return this.passwordHash.equals(hashPassword(password));
    }
}

