import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159; //question 1 ------------------------
//        Write some Java code that uses the variable pi to output the following:
//        The value of pi is approximately 3.14.
//                Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
        System.out.format("The Value of pi is approximately %.2f.%n", pi);


// 2 Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("User entered: " + num);
//What happens if you input something that is not an integer?


// 3. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        //
        //What happens if you enter less than 3 words?
        //What happens if you enter more than 3 words?
        System.out.print("Enter the first word: ");
        String word1 = scanner.next();

        System.out.print("Enter the second word: ");
        String word2 = scanner.next();

        System.out.print("Enter the third word: ");
        String word3 = scanner.next();

        System.out.println("You entered:");
        System.out.println("--> \"" + word1 + "\" <--");
        System.out.println("--> \"" + word2 + "\" <--");
        System.out.println("--> \"" + word3 + "\" <--");

// 4. Prompt a user to enter a sentence, then store that sentence in a String
// variable using the next method. Then, display that sentence back to the user.

        System.out.print("Enter a sentence: ");
        // Use next() to store the entire sentence until the first whitespace
        String userSentence = scanner.next();

        System.out.println("You entered: " + userSentence);

// 5. Rewrite the above example using the nextLine method
        System.out.print("Enter a new sentence: ");

        String userSentenceTwo = scanner.nextLine();

        System.out.println("You entered: " + userSentenceTwo);

// 6.Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the
// length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//Assume that the rooms are perfect rectangles.
//Assume that the user will enter valid numeric data for length and width.

        System.out.print("Enter the Room Length ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the width of your room?");
        int width = Integer.parseInt(scanner.nextLine());

//        System.out.print("The lenght of the room is %d.%nThe width of the room is %d.%nThe perimter of the" +
//                " room is %d.%nThe area of the room is %d.%n ", length, width, (2 * length) + (2 * width), length * width);
//        String widthInput = scanner.nextLine();
//
//        double length = Double.parseDouble(lengthInput);
//        double width = Double.parseDouble(widthInput);
//
//        double area = length * width;
//        System.out.println("You entered the following info:");
//        System.out.println("Length: " + length + " units");
//        System.out.println("Width: " + width + " units");
//        System.out.println("Area: " + area + " square units");

    }
}

