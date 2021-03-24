package cr.estudiantec.throwexception;
// This class takes the user's age and verify is it's underage or not

public class AgeVerification {

    public void buyTickets(int age){
        if (age >= 18)
            System.out.println("Your transaction was completed successfully!!");

        else if (age < 18)
            if (age > 0) // Doesn't exist people with negative age
                System.out.println("Transaction failed. Underages are not allowed in this concert.");

        else // When age is a negative number
            throw new IllegalArgumentException("You need to specify your age.");
    }
}
