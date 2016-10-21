
/**
 * @(#)Lab11.java
 *
 *
 * @author
 * @version 1.00 2016/10/15
 */
import java.util.*;

public class Lab11
{

	  /**
     * Creates a new instance of Lab11
     */
    public Lab11()
    {

    }
    //Sets size of array to hold students
	public static int numberOfStudents = classSize();
	public static ClemensStudent [] array = new ClemensStudent[numberOfStudents];

	public static void printHeader()
	{
        // Print header
        System.out.println("Lab 11");
        System.out.println("Mr. Burton");
        System.out.println("Lab 11 - 10 point version");
        System.out.println("============================");
	}

	public static void showMenu()
	{
		// Show menu options
		System.out.println("");
		System.out.println("1 - Load students");
		System.out.println("2 - Show a student");
		System.out.println("3 - Change student name");
		System.out.println("4 - Shallow Copy student");
		System.out.println("5 - Deep Copy student");
		System.out.println("6 - Compare two students");
		System.out.println("7 - Display all students");
		System.out.println("8 - Quit");
	}

	public static int pickFromMenu(String message)
	{
		// Get input from user for menu item
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		return input.nextInt();
	}

	public static int processMenuItem(int menu)
	{
		// Take action based on menu item
        switch (menu)
        {
            case 1:  System.out.println("Loading " + numberOfStudents + " students ...");
            		 loadStudents();
                     break;
            case 2:  System.out.println("Showing student ...");
            		 array[showStudents("Which student to display ")-1].display();
                     break;
            case 3:  System.out.println("Changing student name ...");
            		 changeStudentName();
                     break;
            case 4:  System.out.println("Copying a student ...");
            		 shallowCopyStudent();
                     break;
            case 5:  System.out.println("Cloning a student ...");
            		 deepCopyStudent();
                     break;
            case 6:  System.out.println("Comparing two students ...");
            		 compareStudents();
                     break;
            case 7:  System.out.println("Displaying all students ...");
            		 showAllStudents();
                     break;
            case 8:  System.out.println("Quitting ...");
     				 break;
     		default: System.out.println("Not a valid selection, try again");
                     break;
		}
		return menu;
	}

	public static int classSize()
	{
		// Gets input from user to determine size of array
		Scanner input = new Scanner(System.in);
		System.out.print("How many students are in the class? ");
		return input.nextInt();
	}

	public static void loadStudents()
	{

		// Populate array with ClemensStudent objects
    	for (int n=0; n<numberOfStudents; n++)
    	{
			// 1.	fills an array[5] of type ClemensStudent with random ID numbers
			// and grades.
    		int id = (int)(Math.random() * 10001);
        	int g1 = (int)(Math.random() * 41+60);
        	int g2 = (int)(Math.random() * 41+60);
        	int g3 = (int)(Math.random() * 41+60);
    		array[n] =  new ClemensStudent();
    		array[n].setName("first");
    		array[n].setName("last");
    		array[n].display();
    	}
	}

	public static int showStudents(String message)
	{
		// Create a looping menu that:
    	for (int n=0; n<numberOfStudents; n++)
    	{
    		System.out.print((n + 1) + " - ");
    		array[n].displayName();
    		System.out.println();

    	}
    	return pickFromMenu(message + " (1 - " + numberOfStudents + ")-> ");
	}
	public static void changeStudentName()
	{
		// 2.	changes the name of a selected clemensStudent in the array.
		int pos;
		pos = showStudents("Select student to change name") - 1;
		array[pos].setName("first");
		array[pos].setName("last");
 		array[pos].displayName();
	}

	public static void shallowCopyStudent()
	{
		// 3.	copies the values of one clemensStudent to another clemensStudent.*
		// * if you copy VALUES from student A to clemensStudent B then if
		// clemensStudent's name changes, it should not affect clemensStudent B.
		int origin, dest;
		origin = showStudents("Select student to copy from") - 1;
		dest = showStudents("Select student to replace") - 1;
		array[dest] = array[origin];
	}

	public static void deepCopyStudent()
	{
		// 4.	duplicates a clemensStudent from one index to another.**
		// ** if you duplicate a clemensStudent from index A to index B
		// then if either clemensStudent's attributes change, then they both change.
		int origin, dest;
		origin = showStudents("Select student to copy from") - 1;
		dest = showStudents("Select student to replace") - 1;
		array[dest] = new ClemensStudent(array[origin].getStudentId(), array[origin].getGradeOne(), array[origin].getGradeTwo(), array[origin].getGradeThree(),array[origin].getFirstName(),array[origin].getLastName());
	}

	public static void compareStudents()
	{
		// 5.	tests to see if a clemensStudent object is the same as another
		int origin, dest;
		origin = showStudents("Select student to copy from") - 1;
		dest = showStudents("Select student to replace") - 1;
			array[origin].displayName();
			System.out.print(" and ");
			array[dest].displayName();
		if (array[origin] == array[dest])
		{
			System.out.println(" reference the SAME object.");
		}
		else
		{
			System.out.println(" reference DIFFERENT objects.");
		}
	}

	public static void showAllStudents()
	{
		// Displays all students
    	for (int n=0; n<numberOfStudents; n++)
    	{
    		array[n].display();
    	}
	}
 	private static void pressAnyKeyToContinue()
 	{
        System.out.println("Press any key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
 	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    	printHeader();
    	int retValue = 0;
    	// Loop until user selects exit option from menu
    	while (retValue != 8)
    	{
    		showMenu();
			retValue = processMenuItem(pickFromMenu("Select an item from the menu -> "));
			pressAnyKeyToContinue();
    	}
    }
}