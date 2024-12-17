import java.util.Scanner;

public class arrayCRUD {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // fixed-size array.
        Scanner scanner = new Scanner(System.in);

        // initializing the array (Create)
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Array after creation:");
        printArray(numbers);

        // Reading the element.
        System.out.print("Enter index to read: ");
        int readIndex = scanner.nextInt();
        if(readIndex >= 0 && readIndex < numbers.length) {
            System.out.println("Value at index " + readIndex + ": " +  numbers[readIndex]);
        } else {
            System.out.println("Invalid index");
        }

        // Updating an element.
        System.out.print("Enter index to update: ");
        int updateIndex = scanner.nextInt();
        if(updateIndex >= 0 && updateIndex < numbers.length) {
            System.out.print("Enter new value: ");
            numbers[updateIndex] = scanner.nextInt();
            System.out.println("Array after update: ");
            printArray(numbers);
        } else {
            System.out.println("Invalid index");
        }

        // Deleting an element.
        System.out.print("Enter index to delete: ");
        int deleteIndex = scanner.nextInt();
        if(deleteIndex >= 0 && deleteIndex < numbers.length) {
            for (int i = deleteIndex; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = 0; // Default value for int.
            System.out.println("Array after doing the updates:");
            printArray(numbers);
        } else {
            System.out.println("Invalid index.");
        }
        scanner.close();
    }
    public static void printArray(int[] array) {
        for(int num : arrray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
