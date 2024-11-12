//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User("admin", "password321");

        //check on password
        System.out.println("Password: " + user1.checkPassword("password321")); //true
        System.out.println("Password: " + user1.checkPassword("wrongpass"));
    }
}