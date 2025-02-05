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

    static int GCD2(int x, int y) {
        if(y==0)
            return x;
        return GCD2(y, x % y);
    }

    // The driver method.
    public static void main(String[] args)
    {
        int x = 100, y = 88;
        System.out.println("GCD of " + x + " and " + y + " is " + GCD(x, y));
        System.out.println("GCD2 of " + x + " and " + y + " is " + GCD2(x, y));
    }
}
