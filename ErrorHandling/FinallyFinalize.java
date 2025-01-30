public class FinallyFinalize {
    // final is a constant value or method that cannot be overridden.
    final int MAX_VALUE = 100;

    // Method to demonstrate try-catch-finally
    // try catch block must be inside a constructor or a method
    public void execute() {
        try {
            System.out.println("Trying the code");
        } catch (Exception e) {
            System.out.println("Handling some exception");
        } finally {
            // Used for cleanup, such as closing files or database connections.
            System.out.println("Closing database connection now...");
        }
    }

    // finalize is called by the garbage collector before object destruction.
    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup code
            System.out.println("Finalizing resources...");
        } finally {
            super.finalize(); // Call the parent class finalize method
        }
    }

    public static void main(String[] args) {
        FinallyFinalize obj = new FinallyFinalize();
        obj.execute();
        
        // Suggest garbage collection (not guaranteed to call finalize)
        obj = null;
        System.gc();
    }
}
