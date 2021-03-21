package ownexception.cr.estudiantec;
// This program verifies if a number belong to the interval [1,10]

import java.util.Scanner;

public class VerifyNumber {

    public static void main(String[] args) {

        // It allows the user to type the number
        Scanner entry = new Scanner(System.in);

        // New variable
        int newNumber;

        System.out.print("Type a number between 1 and 10: "); //Indicator

        try{
            newNumber = entry.nextInt(); // It assigns the user's number to the variable newNumber
            if (newNumber < 1 || newNumber > 10){ // In case that the number doesn't belong to the interval
                throw new InvalidNumberException(); // It throws the own-created exception
            } // End of if

            else{
                System.out.println("The number is correct");
            } // End of else
        } // End of try block

        catch (InvalidNumberException e){
            // It is made to print the default message in InvalidNumberException class
            System.out.println(e.getMessage());
        } // End of catch block
    } // End of main method
} // End of VerifyNumber class
