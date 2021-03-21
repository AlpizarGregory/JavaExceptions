package tryexception.cr.estudiantec;
// https://www.youtube.com/watch?v=iFcVmezVw84&ab_channel=cajametal
// This code change ID format from String to Integer

public class UpdateID {

    public static void main(String[] args) {

        // Variables to use the software, use only 1 string in each run
        String textID = "201110333";
        //String textID = "ARB-321";
        //String textID = "Hello";

        int numberID; // The new ID format

        // It tries to do the convertion
        try{
            numberID = Integer.parseInt(textID); // Converts string to integer
            System.out.printf("Your ID: %d, has changed format from string to integer", numberID); // Notify success
        } // End of try

        // In case convertion fails, it throws an exception
        catch (NumberFormatException e){
            System.out.println("Your ID is not a number");
        } // End of catch
    } // End of main method
} // End of UpdateID class
