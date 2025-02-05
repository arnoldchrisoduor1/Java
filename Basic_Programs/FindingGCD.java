public class FindingGCD {
    // Finding the GCD using recursive function.
    static int GCD(int x, int y)
    {
        // Everything is divisible by 0.
        if (x == 0)
            return y;
        if (y == 0)
            return x;

        // Both the numers are equal.
        if(x == y)
            return x;

        // X is greater.
        if (x > y)
            return GCD(x - y, y);
        return GCD(x, y - x);
    }

    // The driver method.
    public static void main(String[] args)
    {
        int x = 100, y = 88;
        System.out.println("GCD of " + x + " and " + y + " is " + GCD(x, y));
    }
}
