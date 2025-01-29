
import java.util.Random;  // Random class to generate random numbers

public class passwordgen {

    public static void main(String[] args) {
        Random random = new Random();  // Create an object to generate random numbers

        // String with all the possible characters that can be in the password
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*";
        
        // Using StringBuilder to add characters to the password
        StringBuilder generatedPassword = new StringBuilder();
        
        // Loop to make a 10-character password
        for (int i = 0; i < 10; i++) {
            // Pick a random character from the string and add it to the password
            generatedPassword.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Output the generated password
        System.out.println("Generated password: " + generatedPassword.toString());
    }
}
