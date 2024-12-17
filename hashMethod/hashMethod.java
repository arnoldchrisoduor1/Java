import java.lang.reflect.Method;

public class hashMethod {

    // creating a amethod name getSampleMethod
    public void getSampleMethod() {}

    // creating the main method.
    public static void main(String args[])
    {
        try{
            // creating a class bject for name GFG
        Class c = hashMethod.class;

        Method method = c.getDeclaredMethod("getSampleMethod", null);

        //get the hashnode of method using hashCode() methd
        int hashCode = method.hashCode();

        // print the hashcode with the hascode name.
        System.out.println("hascode of method "  + method.getName() + "is " + hashCode);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
