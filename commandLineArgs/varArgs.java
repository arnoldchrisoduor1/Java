public class varArgs {
    static void fun(String str, int... a) {
        System.out.println("String: "+ str);
        System.out.println("The number of argements in the commandline are: " + a.length);

        // using the for each to loop through a.
        for(int i : a)
            System.out.println(i + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        // Calling the fun method with different parameters.
        fun("Geeks for geeks", 100, 200);
        fun("CSPortal", 1, 2, 3, 4);
        fun("Arnold", 20, 0);
    }
}
