import java.io.BufferedReader;
import java.io.InputStreamReader;

class mathFuc { // Removed 'public'
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mult(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int modul(int a, int b) {
        return a % b;
    }
}

public class mathUtils {
    
    public static void main(String[] args) 
    {
        // we will create a buffer object to help us get the inputs.
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        String choice1 = "y";

        do {
            System.out.println("The Calculator was just started, to continue press (y) to exit press (q): ");
            choice1 = bfn.readLine();

            // Getting the values for the calculator.
            System.out.println("Enter the first value a:");
            int a = Integer.parseInt(bfn.readLine());
            System.out.println("Enter the secon digit b: ");
            int b = Integer.parseInt(bfn.readLine());
        }
        while (choice1 == "y");

    }
}
