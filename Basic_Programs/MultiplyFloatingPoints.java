import java.io.*;
import java.util.Scanner;

public class MultiplyFloatingPoints {
    public static void main(String[] args) {
        String choice = "";
        float a;
        float b;
        Scanner s = new Scanner(System.in);
        while(!choice.equalsIgnoreCase("no")) {

            System.out.println("Enter the first number:__");
            a = s.nextFloat();

            System.out.println("Enter the second digit:__");
            b = s.nextFloat();

            System.out.println("Calculating product:");

            float result = a * b;

            System.out.println("The answer is: " + result);
            s.nextLine();

            System.out.println("Type (yes) to continue, (no) to exit:__");
            choice = s.nextLine();

            if(choice.equalsIgnoreCase("no")) {
                System.out.println("Exiting program...");
            }
        }

        s.close();
    }
}
