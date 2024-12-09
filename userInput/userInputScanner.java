import java.util.Scanner;

public class userInputScanner {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        // taking a single word value.
        System.out.println("Please enter a single word into the input:..");
        String str1 = scn.next();
        System.out.println("Enteres String str1 : " + str1);

        // taking a whole sentence input.
        System.out.println("Please enter a sentence into the input");
        String str2 = scn.nextLine();
        System.out.println("Enteres the sente str2: " + str2);

        // getting an integer value from input.
        System.out.println("Please enter an integer value: ");
        int x = scn.nextInt();
        System.out.println("Entered Integer : " + x);

        // Getting a float value from the input.
        System.out.println("Please type a float value: ");
        float f = scn.nextFloat();
        System.out.println("Entered float value : " + f);

    }
}
