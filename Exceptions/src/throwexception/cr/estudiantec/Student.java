package throwexception.cr.estudiantec;

public class Student
{
    public void mathClass() //Student has to go to math classes
    {
        System.out.println("Mathematics class started");
    } // End of mathClass method

    public void lunch() //Later, he has to lunch
    {
        System.out.println("Lunch right now");
    } // End of lunch method

    public void resting() throws InterruptedException //exception for thread.slepp
    {
        Thread.sleep(1000); // It causes an unhandled exception
        System.out.println("You can't rest, go code!!"); // Everyone knows that we don't have so much time :c
    } // End of resting method
} // End of Student class
