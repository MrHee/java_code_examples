//Mr. Hee (put your name at the top).
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Sample INPUT using a Scanner.

        System.out.println("Let's try some input.\nPlease enter your name.");

        //A scanner is used just like any variable.
        Scanner INPUT = new Scanner(System.in);

        //INPUT.nextLine();    This is just like input() from Python. The input is ignored.

            String NAME = INPUT.nextLine();

        System.out.println("Hello " + NAME);
        //Concatenation (combining Strings) works just like Python.

        System.out.println("Please enter your favorite food?");

        String favFood = INPUT.nextLine();

        if (favFood.toLowerCase().equals("burrito")) {
            System.out.println("That's just wrong.");
        }
        else {
            System.out.println("At least you don't like burritos.");
        }

        System.out.println("What is your favorite movie?");
        String favMovie = INPUT.nextLine();

        while( !favMovie.toLowerCase().equals("everything, everywhere, all at once")){

            System.out.println("That's not the correct answer. Please try again.");
            favMovie = INPUT.nextLine();
        }



    }
}