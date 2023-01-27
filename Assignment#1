import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scan = new Scanner(System.in);
        Pattern pattern = null;
        Matcher match = null;
        boolean isValid = false;

        // ============================================================
        System.out.println("Enter NU Students email address: ");
        String email = scan.nextLine();

        pattern = Pattern.compile("(?=.*[A-Za-z]).{8,}");
        match = pattern.matcher(email);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Email Address is Valid!");
        } else {
            System.out.println("Email Address is Invalid!");
        }

        // ============================================================
        System.out.println("Enter Philippine mobile phone number: ");
        String num = scan.nextLine();

        pattern = Pattern.compile("(?=.*\\d)(?=.*\\+).{11,}");
        match = pattern.matcher(num);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Mobile Phone number is Valid!");
        } else {
            System.out.println("Mobile Phone number is Invalid!");
        }
    }
}
