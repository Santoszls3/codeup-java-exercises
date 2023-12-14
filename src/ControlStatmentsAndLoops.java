import java.util.Scanner;

public class ControlStatmentsAndLoops {
    public static void main(String[] args) {
        boolean isThisTrue = 5.0 == 5;
        boolean thisIsNotTrue = 5.0 != 5;

        System.out.println(isThisTrue);
        System.out.println(thisIsNotTrue);

        System.out.println(19 > 55);
        System.out.println(19 < 55);
        System.out.println(55 <= 55);
        System.out.println(55 >= 55);

        System.out.println(true && false);
        System.out.println(true || false);

        System.out.println(!true);

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

// Don't do this!
        boolean confirmation = userInput.equalsIgnoreCase("y");

        if (confirmation) {
            System.out.println("Thanks, here's more about Java.");
        } else if (userInput.equalsIgnoreCase("n")) {
            System.out.println("THAT'S TOO DANG TOO BAD! KEEP DIGGIN'!");
        } else {
            System.out.println("YOU'VE UNLOCKED THE RUBY COURSE.");
        }

        int caseSwitch = 0;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        int j = 0;
        while (j < 10) {
            System.out.println("j is " + j);
            j++;
        }

        for(int i = 0; i < 10; i += 1) {
            System.out.println("i is " + i);
        }

        do {
            System.out.println("You will see this despite the condition!");
        } while (false);

        // print the numbers 1 through 5

        for(int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i == 5) {
                break; // --------------+
            } //                        |
        } //                            |
        // <----------------------------+

        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }
    }
}
