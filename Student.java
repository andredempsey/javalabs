/**
* @(#)Student.java
*
*
* @author
* @version 1.00 2016/10/15
*/


public class Student
{
    // All attributes MUST be private
    public int id;
    private int grade1;
    private int grade2;
    private int grade3;
    private int avg;

    // Create a student class.

    Student()
    {
        // Each student should have and ID number, 3 test grades, and a test average.

        // This constructor does not require any parameters on instantiation
        id = (int)(Math.random() * 10001);
        grade1 = (int)(Math.random() * 41+60);
        grade2 = (int)(Math.random() * 41+60);
        grade3 = (int)(Math.random() * 41+60);
    }

    Student(int g1, int g2, int g3)
    {
        // This constructor takes 3 parameters and randomly creates id
        id = (int)(Math.random() * 10001);
        grade1 = g1;
        grade2 = g2;
        grade3 = g3;
    }

    Student(int i, int g1, int g2, int g3)
    {
        // This constructor takes all 4 parameters
        id = i;
        grade1 = g1;
        grade2 = g2;
        grade3 = g3;
    }
    // all methods public.
    public void displayGrades()
    {
        System.out.println	(id+" - Test 1: " + grade1 +"(" +getLetterGrade(grade1) +")\t\tTest 2: " + grade2 +"(" +getLetterGrade(grade2) +")\t\tTest 3: " + grade3 +"(" +getLetterGrade(grade3) +")\t\t-- Average: " + calculateAvg()+"("+getLetterGrade(calculateAvg())+")");

    }

    public int getStudentId()
    {
        return this.id;
    }

    public int getGradeOne()
    {
        return this.grade1;
    }

    public int getGradeTwo()
    {
        return this.grade2;
    }

    public int getGradeThree()
    {
        return this.grade3;
    }
    
    public int calculateAvg()
    {
        // The average should be calculated.

        return (grade1 + grade2 + grade3)/3;
    }

    public void updateGrades()
    {
        grade2 += (int)(Math.random() * 6 + 5);
    }

    public String getLetterGrade(int grade)
    {
    	// Determine letter grade for each grade
        if (grade >= 90)
        {
            return "A";
        }
        else if (grade >= 80)
        {
            return "B";
        }
        else if (grade>= 70)
        {
            return "C";
        }
        else if (grade >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
}