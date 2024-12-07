public class createArrays {
    public static void main(String[] args) {
        // creating an array.
        int[] numbers = new int[5]; // array with 5 elements.

        // Initializing with values.
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("Array after creation: ");
        printArray(numbers);
    }

    // Helper method to print the array.
    public static void printArray(int[] array) {
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}