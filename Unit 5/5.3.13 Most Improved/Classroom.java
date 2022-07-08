public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getMostImprovedStudent()
    {
        int improved = students[0].getExamRange();
        int index = 0;
        for(int i = 1; i < students.length; i++)
        {
            if(students[i] != null)
            {
                if(students[i].getExamRange() > improved)
                {
                    index = i;
                }
            }
        }
        return students[index];
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
