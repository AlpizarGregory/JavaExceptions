package cr.estudiantec.trymultiplecatchexception;
// This class takes an array and tries to show the second element on it

public class VerifyPositions {

    // This method makes a verification to know if the element exists.
    public void Verify (int[] newArray) {
        try {
            System.out.println("The element is: " + newArray[1]); // In case it exists, the program shows the element
        } // End of try block

        catch (NullPointerException e) { // In case the array has no elements
            System.out.println("Your array is null");
        } // End of catch block

        catch (ArrayIndexOutOfBoundsException e){ // In case the array has just one element
            System.out.println("Your index is out of bounds");
        } // End of catch block
    } // End of Verify method
} // End of VerifyPositions class
