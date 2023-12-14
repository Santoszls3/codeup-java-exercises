import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

        //1. Loop Basics
        //While loop
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        int j = 5;
        while (j <= 15) {
            System.out.println(j++);
        }

        //2. Do While
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int n = 0;
        do {
            System.out.println(n);
            n += 2;
        } while (n <= 100);

        //3. Alter your loop to count backwards by 5's from 100 to -10.
        int num = 100;
        do {
            System.out.println(num);
            num -= 5;
        } while (num >= -10);

        //4. Create a do-while loop that starts at 2, and displays the number squared on each
        // line while the number is less than 1,000,000. Output should equal:

        long number = 2;

        do {
            System.out.println(number);
            number *= number; // this squares the number
        } while (number < 1000000);

        //5. Refactor the previous two exercises to use a for loop instead.
        // this is number 4
        for (long numberI = 2; numberI < 1_000_000; numberI *= numberI) {
            System.out.println(numberI);
        }

        // this is number 3
        for (int numI = 100; numI >= -10; numI -= 5) {
            System.out.println(numI);
        }

        //6. One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by
        // Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // If the number is a multiple of both 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                // If the number is a multiple of 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                // If the number is a multiple of 5
                System.out.println("Buzz");
            } else {
                // If the number is not a multiple of 3 or 5
                System.out.println(i);
            }
        }

        //7. Display a table of powers.
        //
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        //Example Output
        //
        //What number would you like to go up to? 5
        //
        //Here is your table!
        //
        //number | squared | cubed
        //------ | ------- | -----
        //1      | 1       | 1
        //2      | 4       | 8
        //3      | 9       | 27
        //4      | 16      | 64
        //5      | 25      | 125

        Scanner scanner = new Scanner(System.in);
        String userChoice;

        do {
            System.out.print("What number would you like to go up to? ");
            int maxValue = scanner.nextInt();

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= maxValue; i++) {
                System.out.printf("%-6d | %-7d | %-5d%n", i, i * i, i * i * i);
            }

            System.out.print("\nDo you want to continue? (yes/no): ");
            userChoice = scanner.next().toLowerCase();
        } while (userChoice.equals("yes"));



        //8. Convert given number grades into letter grades.
        //Prompt the user for a numerical grade from 0 to 100.
        //Display the corresponding letter grade.
        //Prompt the user to continue.
        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        //Grade Ranges:
        //
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0


        do {
            System.out.print("Enter a numerical grade (0-100): ");
            int numericalGrade = scanner.nextInt();

            char letterGrade;

            if (numericalGrade >= 88 && numericalGrade <= 100) {
                letterGrade = 'A';
            } else if (numericalGrade >= 80) {
                letterGrade = 'B';
            } else if (numericalGrade >= 67) {
                letterGrade = 'C';
            } else if (numericalGrade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Letter grade: " + letterGrade);

            System.out.print("Do you want to continue? (yes/no): ");
            userChoice = scanner.next().toLowerCase();
        } while (userChoice.equals("yes"));

        scanner.close();
    }
}
