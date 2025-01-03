// Use of classes and objets in java.

import java.io.*;

class Numbers {
    // Properties.
    private int a;
    private int b;

    // Methods
    public void sum() {
        System.out.println(a+b);
    }

    public void sub() {
        System.out.println(a-b);
    }

    public static void main (String[] args) {
        // Creating Instance of Classes
        // Object.
        Numbers obj=new Numbers();

        // Assigning values to the properties.
        obj.a=1;
        obj.b=2;

        // Using the methods.
        obj.sum();
        obj.sub();
    }
}