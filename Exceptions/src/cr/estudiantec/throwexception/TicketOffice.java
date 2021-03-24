package cr.estudiantec.throwexception;
// Code to buy concert tickets (execute this class)

import java.util.Scanner;

public class TicketOffice {

    public static void main(String[] args) {

        // This entry allows user to type its age
        Scanner entry = new Scanner(System.in);

        // User's age
        int age;

        System.out.print("Type your age (numbers) to buy a concert ticket: "); // Indicator for user
        age = entry.nextInt(); // Appears next to indicator (user should type numbers)

        // Instantiation to verify user's age
        AgeVerification currentClient = new AgeVerification();

        // Calls the method with the parameter "age"
        currentClient.buyTickets(age);
    } // End of main method
} // End of TicketOffice class
