public class AddComplexNumbers {
    // Creating encapsulated fields (private).
    private int real;
    private int image;

    // No args constructor defaults to (0+0i).
    public AddComplexNumbers()
    {
        this.real = 0;
        this.image = 0;
    }
    // parameterized constructor.
    public AddComplexNumbers(int r, int i)
    {
        this.real = r;
        this.image = i;
    }
    // getters and setters for encapsulaton.
    public int getReal(){
        return real;
    }
    public void setReal(int real){
        this.real = real;
    }
    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }
    // Method to display the complex numbers.
    public void showC() {
        System.out.println(this.real + " + i" + this.image);
    }
    // Static method to add to complex numbers.
    public static AddComplexNumbers add(AddComplexNumbers n1, AddComplexNumbers n2) {
        // null check for robustness.
        if (n1 == null || n2 == null) {
            throw new IllegalArgumentException("Complex numbers cannot be null.");
        }
        // Directly use the constructor to create the result.
        return new AddComplexNumbers(n1.getReal() + n2.getReal(), n1.getImage() + n2.getImage());
    }

    public static void main(String[] args) {
        // Creating two complex numbers.
        AddComplexNumbers c1 = new AddComplexNumbers(4, 5);
        AddComplexNumbers c2 = new AddComplexNumbers(10, 5);

        // Printing complex numbers.
        System.out.print("First Complex number: ");
        c1.showC();
        System.out.print("Second Complex number: ");
        c2.showC();

        // Calling add to perform addition.
        AddComplexNumbers res = add(c1, c2);

        // Displaying the addition.
        System.out.print("Addition is: ");
        res.showC();
    }
}
