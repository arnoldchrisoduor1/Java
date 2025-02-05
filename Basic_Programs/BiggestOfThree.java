import java.util.*;
import java.lang.*;

public class BiggestOfThree {
    // tertiary method to finding the largest of three numbers.
    static int tertaryMethod(int x, int y, int z) {
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
    // Using the if-else method.
    static int ifelseMethod(int x, int y, int z) {
        // comparing all the three numbers.
        if (x >= y && x >= z)
            return x;
        else if (y >= x && y >= z)
            return y;
        else
            return y;
    }
    // Using the Math.max()
    static int sumMathMethod(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }
    // Using the collections method.
    static int collectionsMethod(int x, int y, int z) {
        ArrayList<Integer> p = new ArrayList<>();
        p.add(x);
        p.add(y);
        p.add(z);
        return Collections.max(p);
    }

    public static void main(String[] args) {
        // Declaring the variables for 3 numbers.
        int a, b, c;
        // Variables holding the largest number.
        int largest;
        a = 5;
        b = 10;
        c = 3;
        // calling the tertiary method fuction.
        largest = tertaryMethod(a, b, c);
        // printing the largest digit.
        System.out.println(largest + " is the largest number.");

        // calling the if-else method.
        largest = ifelseMethod(a, b, c);
        // Printing out the result.
        System.out.println(largest + " is the largest number.");

        // Using the Math.max() method.
        largest = sumMathMethod(a, b, c);
        System.out.println(largest + " is the largest number.");

        // Using the collections method.
        largest = collectionsMethod(a, b, c);
        System.out.println(largest + " is the largest number.");
    }
}
