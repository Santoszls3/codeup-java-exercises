import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        //2. Create a class named Bob with a main method for the following exercise.
        //
        //Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //
        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.
        //Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

        //Use the Scanner class to get input from the user. Import java.util.Scanner at the beginning of your file
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to Bob:");
        while (true) {
            String userInput = scanner.nextLine();

            //Implement Bob's Responses:
            //Now, you can implement the logic for Bob's responses based on the provided rules. Use if statements to
            // check the conditions and print the appropriate response.
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.trim().isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userInput.equals("Banana")){
                System.out.println("later, loser...");
                break;
            } else {
                System.out.println("Whatever...");
            }

        }
    }
}
