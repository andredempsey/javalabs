
/**
 * @(#)ClemensStudent.java
 *
 *
 * @author
 * @version 1.00 2016/10/15
 */
import java.util.*;

public class ClemensStudent extends Student
{
    private String firstName;
    private String lastName;

	public ClemensStudent()
    {

    }

    public ClemensStudent(int id, int gradeOne, int gradeTwo, int gradeThree)
    {
    	super(id, gradeOne, gradeTwo, gradeThree);

    }
    public ClemensStudent(int id, int gradeOne, int gradeTwo, int gradeThree, String fname, String lname)
    {
        super(id, gradeOne, gradeTwo, gradeThree);
        firstName = fname;
        lastName = lname;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getStudentId()
    {
        return super.id;
    }

    public int getGradeOne()
    {
        return super.getGradeOne();
    }

    public int getGradeTwo()
    {
        return super.getGradeTwo();
    }
    public int getGradeThree()
    {
        return super.getGradeThree();
    }

    public static String getName(String name)
    {
    	// Get name of student
        Scanner input = new Scanner(System.in);
        System.out.print("What is the student's " + name + "? ");
        return input.nextLine();
    }
    public void setName(String name)
    {
    	if (name == "first")
    	{
    		this.firstName = this.getName(name);
    	}
    	else
    	{
    		this.lastName = this.getName(name);
    	}
    }
		public void displayGrades()
    {
    	super.displayGrades();
    }

    public void displayName()
    {
		System.out.print(this.firstName + " " + this.lastName);
    }

    public void display()
    {

		this.displayName();
        System.out.print("\t\tId: ");
		this.displayGrades();
    }
}