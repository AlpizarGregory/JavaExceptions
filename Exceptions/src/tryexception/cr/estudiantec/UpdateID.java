package tryexception.cr.estudiantec;
// https://www.youtube.com/watch?v=iFcVmezVw84&ab_channel=cajametal
// This code change ID format from String to Integer

public class UpdateID {

    // Method to change the ID format, receives the string format ID
    private void formatConverter(String textID){

        int numberID; // The new ID format

        numberID = Integer.parseInt(textID); // Converts string to integer
        System.out.printf("Your ID: %d, has changed format from string to integer\n", numberID); // Notify success
    }

    public static void main(String[] args) {

        // Variables to use the software, use only 1 string in each run
        String textID = "201110333";
        //String textID = "ARB-321";
        //String textID = "Hello";

        // It tries to do the convertion
        try{
            UpdateID userID = new UpdateID(); // New instance

            userID.formatConverter(textID); // It calls formatConverter method and gives the string format ID to it
        } // End of try block

        // In case convertion fails, it throws an exception
        catch (NumberFormatException e){
            System.out.println("Your ID is not a number");
        } // End of catch block

        // No matter if the process ends successfully or not, always will execute finally
        finally {
            System.out.println("Finished");
        } // End of finally block
    } // End of main method
} // End of UpdateID class
