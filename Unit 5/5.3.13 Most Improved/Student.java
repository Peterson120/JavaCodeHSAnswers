import java.util.*;
public class Student
{
    private static final int NUM_EXAMS = 4;

    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    private int[] exams;
    private int numExamsTaken = 0;
    
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken++;
    }
    
    public int getExamRange()
    {
        Arrays.sort(exams);
        return exams[exams.length-1] - exams[1];
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}
