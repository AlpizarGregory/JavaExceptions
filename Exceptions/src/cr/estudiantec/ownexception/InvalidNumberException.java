package cr.estudiantec.ownexception;
// This is the manual-created exception

public class InvalidNumberException extends Exception{

    public InvalidNumberException() {
        super ("Invalid number. It should be between 1 and 10"); // To print the message in the terminal
    } // End of InvalidNumberException method

    // This allows getMessage() in VerifyNumber class to take the message write above
    public InvalidNumberException(String message){
        super(message);
    }
} // End of InvalidNumberException class
