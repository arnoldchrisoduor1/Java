public class commLineArgs {
    public static void main(String[] args){

        // Checking if the length of the args array is greater than 0.
        if(args.length > 0) {
            System.out.println("The command line" + " arguemenrs are: ");
            // iterating the arges array using the for each loop.
            for(String val: args)
            System.out.println(val);
        }
        else
            System.out.println("No command line arguements found");
    }
}
