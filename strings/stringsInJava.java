// Strings are immutable in java.

public class stringsInJava {
    public static void main(String args[]){
        // This is created in the stack memory and is less efficient as a new object is created.
        String str = new String("GeeksforGeeks");

        String demoString = "staticMemoryString";


        System.out.println(str);
        System.out.println(demoString);
    }
}
