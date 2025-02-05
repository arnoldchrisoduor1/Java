public class Finding_LCM {
    // The easiest way is to find all the factors and then get the union.
   static void findLCM(int a, int b) {
    int largest = (a > b) ? a: b;
    // chekcing for the smallest number that can be divided by both numbers.
    while(true) {
        if (largest % a == 0 && largest % b == 0 )
            break;
        largest++;
    }
    System.out.println("LCM of " + a + " and " + b + " : " + largest);
   }

   public static void main(String[] args) {
    int a = 15, b = 25;
    findLCM(a, b);
   }
}
