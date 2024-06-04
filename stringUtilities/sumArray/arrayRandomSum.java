package stringUtilities.sumArray;
import java.util.Random;

public class arrayRandomSum {
    public static void main(String[] args) {

        // creating a new array with the size of 10.
        int [] numbers = new int[10];

        // creating a random object to generate random numbers.
        Random random = new Random();

        // Filling in the array with random numbers between 1 and 100.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        // sum up the numbers in the array.
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }

        // Print the array and the sum.
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum: " + sum);
    }
}
