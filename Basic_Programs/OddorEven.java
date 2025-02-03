import java.io.*;
import java.util.Scanner;

public class OddorEven {
    // 1. Brute force approach checking the remainder after dividing by two.
    static void BruteForce(int n) {
        if (n % 2 == 0){
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd.");
        }
    }
    // 2. Using the bitwise OR operator.
    static void BitwiseOr(int n) {
        if((n | 1) > n) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
    // 3. Using the bitwise AND operator.
    static void BitwiseAnd(int n) {
        if((n & 1) == 1) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }
    // 4. Bitwise XOR increments even by 1 else decrements by 1.
    static void BitwiseXOR(int n) {
        if(( n ^ 1) == n + 1) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number id Odd");
        }
    }
    // 5. Checking the least significant bit of the number.
    // LSB of an even number is always 0 and that of odd is always 1.
    static void LSBapproach(int n) {
        if(n != 0) {
            if(Integer.toBinaryString(n).endsWith("0")) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } else {
            System.out.println("Zero digit");
        }
    }

    public static void main(String[] args) {
        int m = 22;
        // Testing the Brute force approach.
        System.out.println("\nTesting the brute force approach:__");
        BruteForce(m);
        // Testing the bitwise or operator method
        System.out.println("\nTesting the bitwise OR operator____");
        BitwiseOr(m);
        // Testing the bitwise and operator method.
        System.out.println("\nTesting the bitwise AND operator____");
        BitwiseAnd(m);
        // Testing the LSB approach method.
        System.out.println("\nTesting the LSB approach___");
        LSBapproach(m);
    }
}
