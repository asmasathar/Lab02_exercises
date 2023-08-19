

/**
 * Week 2, Exercise 6.
 * @author INSERT YOUR NAME HERE
 */
public class Exercise6 {

	public static void main(String[] args) {
		/* First, copy across the code from your
		   solution to Exercise 4. */
		final int DAYS_IN_A_YEAR=365;
		final int HOURS_IN_A_DAY=24;
		final int MIN_IN_AN_HOUR=60;
		
		int age=18;
		int daysInAge=age*DAYS_IN_A_YEAR;
		int hoursInAge=age*HOURS_IN_A_DAY*DAYS_IN_A_YEAR;
		int minInAge=age*MIN_IN_AN_HOUR*HOURS_IN_A_DAY*DAYS_IN_A_YEAR;

		
		// Then add code to print them out below here
		System.out.println("number of days lived="+daysInAge);
		System.out.println("number of hours lived="+hoursInAge);
		System.out.println("number of minutes lived="+minInAge);


	}

}
