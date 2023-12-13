public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("This is an example of a statement!");
        System.out.println("When we creat statement: they must end with a semicolon");

////        This is a multiline comment
//        today
        int smallNum = 19;
        System.out.println(smallNum);
        smallNum = 127;
        smallNum++;
        System.out.println(smallNum);

//        int numDefault;
//        numDefault = 0;  //you MUST set the value for a variable before accessing it, ie no default value.
//        System.out.println(numDefault);

        char firstLetterOfSantos = 'S';

        String message = "I'm a string!";
        String quote = "\"Better out than in.\" I alway say.";
        System.out.println(message);
        System.out.println(quote);

        byte tinyNum = 22;
        short stillSmallNum = (short) (tinyNum + 3);
        System.out.println(stillSmallNum);
        float almostPi = 3.14F;
        int almostAlmostPi = (int) almostPi;
        System.out.println(almostPi);
        System.out.println(almostAlmostPi);
        long bigNum = 200L;


//     -----------------------------------------   Exercise!
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        String myString = "Merry Christmas!";
//        myString ='S';
//        myString = "37";
        System.out.println(myString);

        float myNumber;
          myNumber = 3.14F; //(float) 3.14;
//          myNumber = 123L;
//          myNumber = 123;
        System.out.println(myNumber);

//        int x = 5;
////        System.out.println(x++);
//        System.out.println(++x);
//        System.out.println(x);

//        int class = 9;

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) 0;

//        int three = (int) "three";

        int x = 4;
        x = x + 5;

        int x = 3;
        int y = 4;
        y = y * x; //    y*=x  Rewrite the following expressions using the relevant shorthand assignment

        int x = 10;
        int y = 2;
        x = x / y;  //    x/=y  Rewrite the following expressions using the relevant shorthand assignment
        y = y - x; //     y-=x  Rewrite the following expressions using the relevant shorthand assignment

        System.out.println(x);
        System.out.println(y);

        int biggerInt = Integer.MAX_VALUE + 1;
        System.out.println(biggerInt);

    }
}
