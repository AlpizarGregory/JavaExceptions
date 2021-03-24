package cr.estudiantec.trymultiplecatchexception;
// https://youtu.be/ceGnVDrMy1A
// This code shows the elements on different positions of an array

public class ShowArray {

    public static void main(String[] args) {
        VerifyPositions checker = new VerifyPositions(); // New instatiation from VerifyPosition class (to use exceptions)

        // This array is gonna be checked by the program (use only one in each try)
        int[] newArray = {4};
        //int[] newArray = null;
        //int[] newArray = {4,6,5};

        try {
            checker.Verify(newArray); // Calls VerifyPositions class
        } // End of try block

        catch(Exception e) { // In case of any other generics exceptions
            System.out.println("Something went wrong");
        } // End of catch block
    } // End of main method
} // End of ShowArray class
