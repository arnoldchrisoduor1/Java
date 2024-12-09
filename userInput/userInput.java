import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userInput {
    public static void main(String[] args)
        throws IOException
    {
        // Creating a BufferrReader Object
        BufferedReader bfn = new BufferedReader(new InputStreamReader((System.in)));  // InputStreamReader converts bytes to stream character.

        System.out.println("Please enter a string: ..");
        String str = bfn.readLine();

        // Integer reading internally
        System.out.println("Please enter a number : ");
        int it = Integer.parseInt(bfn.readLine());

        // Print String
        System.out.println("Entered String : " + str);
        // Printing the Integer entered.
        System.out.println("Entered String : " + it);
    }
}
