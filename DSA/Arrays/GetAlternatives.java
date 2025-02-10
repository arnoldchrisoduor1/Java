import java.util.ArrayList;

public record GetAlternatives() {
    static ArrayList<Integer> getAlternatives(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        // Iterate over all alternat elemnts.
        for(int i = 0; i < arr.length; i += 2) {
            res.add(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        ArrayList<Integer> res = getAlternatives(arr);
        for(int x : res) {
            System.out.println(x + " ");
        }
    }
}
