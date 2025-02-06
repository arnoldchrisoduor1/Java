public class PrimeNumbers {
    static void prime_N(int N)
    {
        int x, y, flg;

        // Printing the display message.
        System.out.println("All the numbers within 1 and " + N + " are: ");

        // Using the for loop to transvaers enumbers to N.
        for (x = 1; x <= N; x++) {
            if(x == 0 || x == 1)
                continue;

                // Using flag variable to check if x is prime or not.
            flg = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            //  If flag is 1 then x is prime.
            // If flag is 0 then x is not prime.
            if( flg == 1)
                System.out.print(x + " ");
            }
        }
    public static void main(String[] args) {
        int N = 20;
        prime_N(N);
    }
}
