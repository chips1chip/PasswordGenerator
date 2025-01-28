
import java.util.Random;
public class passwordgen {
    public static void main(String[] args) {
        Random rand = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            password.append(characters.charAt(rand.nextInt(characters.length())));
        }
        System.out.println("Generated password: " + password.toString());
        }
    }
