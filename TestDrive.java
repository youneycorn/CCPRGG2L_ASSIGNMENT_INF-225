import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        car("driving");
        scan.close();
    }

    static void car(String driving) {

        System.out.println("DRIVING!");
        taste(driving);

        String feedback = getFeedBack(driving);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixthedriving(driving);

            // Recursive callno
            car(driving);
        } else if (feedback.equals("yes")) {
            drove(driving);
        }
    }

    static void taste(String drive) {
        System.out.println("You are now driving");
    }

    static String getFeedBack(String drive) {
        System.out.println("Is my " + drive + " good? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixthedriving(String drive) {
        System.out.print("What's my problem? ");
        String ingredient = scan.next();
        System.out.println("Fixing my driving. Added " + ingredient);
    }

    static void drove(String drive) {
        System.out.println("You PASSED the " + drive);
    }

}
