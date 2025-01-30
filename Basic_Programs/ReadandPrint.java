import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class ReadandPrint {
    public static void main(String[] args)
    {
        Random random = new Random();
        // generates a number between 1 and 10.
        int randomNumber = random.nextInt(10) + 1;
        // declaring the variable
        int num = -1;

        Scanner s = new Scanner(System.in);

        while(num != randomNumber) {
            // Reading the next integer from the screen.
            System.out.println("Enter your guess: ");
            num = s.nextInt();

            if (num < randomNumber) {
                System.out.println("The " + num + " is less than the random number");
            } else if (num > randomNumber) {
                System.out.println("The " +num + " is geater than the generated number");
            } else {
                System.out.println("Congratulations you win, Random number -> "+ randomNumber +" Your number ->  : "
                 + num + "");
            }
        }
        s.close();

        // Input the integer.
        System.out.println("Enter the integer: ");
    }
}
