import java.util.Scanner;

public class ControlStatmentsAndLoops {
    public static void main(String[] args) {
        boolean isThisTrue = 5.0 == 5;
        boolean thisIsNotTrue = 5.0 != 5;

        System.out.println(isThisTrue);
        System.out.println(thisIsNotTrue);

        System.out.println(19 > 55);
        System.out.println(19 < 55);
        System.out.println(19 <= 55);
        System.out.println(19 >= 55);

        System.out.println(true && false);
        System.out.println(true || false);

        System.out.println(!true);

        for(int i = 0; i < 10; i += 1) {
            System.out.println("i is " + i);


            // print the numbers 1 through 5
            for(int q = 1; q < 100; q++) {
                System.out.println(q);
                if (q == 5) {
                    break; // --------------+
                } //                        |
            } //                            |
// <----------------------------+


            for(int q = 1; q <= 10; q++) { // <--+
                if(q % 2 == 1) { //              |
                    continue; // ----------------+
                }
                System.out.println(q);
            }

        }
    }
}
