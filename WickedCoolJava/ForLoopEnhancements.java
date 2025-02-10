import java.util.ArrayList;
import java.util.Iterator;

public class ForLoopEnhancements {
    @SuppressWarnings("removal")
    public static void main(String[] args) {

        ArrayList theList = new ArrayList();
        theList.add(new Integer(2));
        theList.add(new Integer(3));
        theList.add(new Integer(5));
        theList.add(new Integer(7));

        int sum = 0;
        // the old way to iterate.
        System.out.println("Printing the values using the old way of doing iteration");
        for (Iterator iter = theList.iterator(); iter.hasNext();) {
            Integer x = (Integer) iter.next();
            sum = sum + x.intValue();
        }
        System.out.println("The sum " + sum);

        // Using the modern way to do iteration.
        // sum = 0;
        // for (Integer item : theList) {
        //     sum = sum + item;
        // }
        // System.out.println("Adding using the modern example. " + sum);

        int[] newList = new int[] { 2, 3, 4, 7 };
        int newSum = 0;
        for (int x : newList) {
            newSum = newSum + x;
        }
        System.out.pritnln("The sum is " + newSum);
    }
}