import java.util.Scanner;

/**
 * Week 2, Exercise 4.
 * @author Michael Lones
 */
public class Exercise4 {

	public static void main(String[] args) {
		/* First, copy across the code in the main method
		   from your solution to Exercise 1. */
		int daysInAYear=365;
		int hoursInADay=24;
		int minInAnHour=60;
		
		int age=18;
		int daysInAge=age*daysInAYear;
		int hoursInAge=age*hoursInADay*daysInAYear;
		int minInAge=age*minInAnHour*hoursInADay*daysInAYear;

		
		// Then add code to print them out below here
		System.out.println("number of days lived="+daysInAge);
		System.out.println("number of hours lived="+hoursInAge);
		System.out.println("number of minutes lived="+minInAge);

	}

}
