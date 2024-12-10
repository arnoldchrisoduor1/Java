import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class mathFuc {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mult(int a, int b) {
        return a * b;
    }

    static float div(int a, int b) {
        return a / b;
    }

    static float modul(int a, int b) {
        return a % b;
    }
}

public class Calculator {
    
    public static void main(String[] args) throws IOException
    {
        // we will create a buffer object to help us get the inputs.
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        String choice1 = "y";

        do {
            System.out.println("The Calculator was just started, to continue press (y) to exit press (q): ");
            choice1 = bfn.readLine();

            if(choice1.equals("q")){
                System.out.println("Exiting the calculator. Goodbye");
                break;
            }

            System.out.println("What di you want to do? add(a), subtract(s), multiply(m), divide(d), modulus(mod)");

            String choice2 = bfn.readLine();

            // Getting the values for the calculator.
            System.out.println("Enter the first value a:");
            int a = Integer.parseInt(bfn.readLine());
            System.out.println("Enter the secon digit b: ");
            int b = Integer.parseInt(bfn.readLine());

            // The switch logic.
            switch(choice2) {
                case "a":
                    int sum = mathFuc.add(a, b);
                    System.out.println("The sum is: " + sum);
                    break;
                case "s":
                    int sub = mathFuc.sub(a, b);
                    System.out.println("The subtraction result is: " + sub);
                    break;
                case "m":
                    int mul = mathFuc.mult(a, b);
                    System.out.println("The product of multiplication is: " + mul);
                    break;
                case "d":
                    if (b == 0) {
                        System.out.println("Division by 0 is not allowed");
                    }
                    else {
                        float div = mathFuc.div(a, b);
                        System.out.println("the answer for the division is: " + div);
                    }
                    break;
                case "mod":
                    float mod = mathFuc.modul(a, b);
                    System.out.println("The moduls is: " + mod);
                    break;
                default:
                    System.out.println("Choice does not exist, try again");
                    break;
            }
        }
        while (choice1.equals("y"));

    }
}