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
//        numDefault = 0;  //you MUST set the value for a variable before accessing it, ie no dafault value.
//        System.out.println(numDefault);

        char firstLetterOfSantos = 'S';

        String message = "I'm a string!";
        String quote = "\"Better out than in.\" I alway say.";
        System.out.println(message);
        System.out.println(quote);
    }
}
