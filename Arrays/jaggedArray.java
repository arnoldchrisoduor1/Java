import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of sub-arrays: ");

        int numberOfArrays = scan.nextInt();

        // Declaring the jagged array.
        int[][] jaggedArrayy = new int[numberOfArrays][];

        // allocation of memory to each subarray.
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.println("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfSubArray = scan.nextInt();
            jaggedArrayy[i] = new int[sizeOfSubArray];
        }

        // initilaizing the elements of each sub-Array.
        for(int i = 0; i < numberOfArrays; i++) {
            System.out.println("Enter the elements of sub-array " + (i + 1) + ": ");
            for (int j = 0; j < jaggedArrayy[i].length; j++) {
                jaggedArrayy[i][j] = scan.nextInt();
            }
        }

        System.err.println("The jagged array is: ");
        for (int i=0; i < numberOfArrays; i++) {
            for (int j = 0; j < jaggedArrayy[i].length; j++){
                System.out.println(jaggedArrayy[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
