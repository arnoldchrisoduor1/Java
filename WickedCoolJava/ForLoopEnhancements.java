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
        for (Iterator iter = theList.iterator(); iter.hasNext();) {
            Integer x = (Integer) iter.next();
            sum = sum + x.intValue();
        }
        System.out.println("The sum " + sum);
    }
}