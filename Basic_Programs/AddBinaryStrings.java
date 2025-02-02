public class AddBinaryStrings {
    static String add_Binary(String x, String y) {
        // Converting the binary string into integer.
        int num1 = Integer.parseInt(x, 2);
        // Converting the other binary string into integer.
        int num2 = Integer.parseInt(y, 2);
        // Adding the two decimal numbers and storing in sum.
        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        return result;
    }

    static String addBinaryTwoPointer(String x, String y) 
    {
        int i = x.length() - 1, j = y.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if(i >= 0) {
                sum += x.charAt(i) - '0';
            }
            if (j >=0 ) {
                sum += y.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                result.append("0");
                carry = 1;
            }
            else {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            result.append("1");
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String x = "011011", y = "1010111";

        // Calling the add Binary method.
        System.out.println(add_Binary(x, y));

        // Calling the addBinaryTwoPointer method.
        System.out.println(addBinaryTwoPointer(x, y));
    }
}
