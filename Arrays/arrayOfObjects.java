public class arrayOfObjects {
    
    static class Student {
        public int roll_no;
        public String name;

        Student(int roll_no, String name) {
            this.roll_no = roll_no;
            this.name = name;
        }
    }
        public static void main(String[] args) {
            // declaring an array of student.
            Student[] arr;
            

            // allocating memory of 5 objects of type student.
            arr = new Student[6];

            // initializing elements of the array.
            arr[0] = new Student(1, "aman");
            arr[1] = new Student(2, "vaibhav");
            arr[2] = new Student(3, "shikar");
            arr[3] = new Student(4, "dharmesh");
            arr[4] = new Student(4, "dharmesh");
            arr[5] = new Student(5, "mohit");

            for(int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + ": { roll_no: " + arr[i].roll_no + ", name: " + arr[i].name + " }");
        }
}
