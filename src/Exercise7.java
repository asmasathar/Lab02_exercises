import java.util.Scanner;

/**
 * Week 2, Exercise 7.
 * @author INSERT YOUR NAME HERE
 */
public class Exercise7 {

	public static void main(String[] args) {
		/* First, copy across the code from your
		   solution to Exercise 6. */
		final int DAYS_IN_A_YEAR=365;
		final int HOURS_IN_A_DAY=24;
		final int MIN_IN_AN_HOUR=60;
		Scanner input=new Scanner(System.in);
		System.out.print("enter your age:");
		
		int age=input.nextInt();
		int d=age*DAYS_IN_A_YEAR;
		int h=age*HOURS_IN_A_DAY*DAYS_IN_A_YEAR;
		int m=age*MIN_IN_AN_HOUR*HOURS_IN_A_DAY*DAYS_IN_A_YEAR;

		
		// Then add code to print them out below here
		System.out.println("you are "+age+" year old,which is the same as "+d+" days,or "+h+" hours,or "+m+" minutes");
				
	}

}
