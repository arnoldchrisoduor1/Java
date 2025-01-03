public class Employee {
    // Propeties Declared.
    static String Employee_name;
    static float Employee_salary;

    // Methods declared.
    static void set(String n, float p) {
        Employee_name = n;
        Employee_salary = p;
    }

    static void get() {
        System.out.println("Employee name is: " + Employee_name);
        System.out.println("Employee CTC is: " + Employee_salary);
    }

    // Main method.
    public static void main(String args[]) {
        Employee.set("Arnold Chris" ,125000.0f);
        Employee.get();
    }
}
