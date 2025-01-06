public class Encapsulation1 {
    static class Programmer {
        private String name;

        // Getter and setter for name.
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) { // Moved here
        Programmer p = new Programmer();
        p.setName("Geek");
        System.out.println("Name: " + p.getName());
    }
}
