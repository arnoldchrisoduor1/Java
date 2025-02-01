public class SwappingValues {
    // Swapping memory using a third variable.
    static void swapValuesUsingThirdVariable(int m, int n) {
        // swapping the values.
        System.out.println("The Initial Values values of m is: " + m + " and n is : " + n);
        int temp = m;
        m = n;
        n = temp;
        System.out.println("The new values of m is: " + m + " and n is : " + n);
    }

    static void swapUsongSumDifferenceConcepts(int[] values) {
        // Difference of the second and the first stored in the first variable.
        System.out.println("Initial S/D Value of m is " + values[0] + " and Value of n is " + values[1]);
        values[0] = values[0] - values[1];
        // sum is stored in the second variable.
        values[1] = values[0] + values[1];
        // Difference of 1st from 2nd is replaced in te first variable.
        values[0] = values[1] - values[0];
        // Print swapped values
        System.out.println(" Swap S/D Value of m is " + values[0] + " and Value of n is " + values[1]);
    }

    // Swapping using the XOR operator.
    static void swapValuesUsingXOROperator(int x, int y) {
        System.out.println("Initial XOR Value of m is " + x + " and Value of n is " + y);
        // Logic of XOR operator.
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(" Swapped XOR Value of m is " + x + " and Value of n is " + y);
    }

    public static void main(String[] args) {
        // Random integer values.
        int m = 9, n = 5;
        // Using third variable.
        swapValuesUsingThirdVariable(m, n);

        // Using sum differences concept.
        int[] values = {9, 5};
        swapUsongSumDifferenceConcepts(values);

        // Swapping using the XOR bitwise operator.
        int x = 9, y = 5;
        swapValuesUsingXOROperator(x, y);
    }
}
