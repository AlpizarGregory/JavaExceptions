package throwexception.cr.estudiantec;
//Throw example code based on the journey of an student

public class Schedule
{
    public static void main(String[] args) throws InterruptedException //the exception works in resting method
    {
        //New instance of an CE Student
        Student engineeringStudent = new Student();

        engineeringStudent.mathClass();
        engineeringStudent.lunch();
        engineeringStudent.resting();
    } // End of main method
} // End of Schedule class
