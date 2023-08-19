import java.util.Scanner;

/**
 * Week 2, Exercise 3.
 * @author Asma Sathar
 */
public class Exercise3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter the temperature in degree celcius:");
		double tempInC=input.nextDouble();
		double tempInF=tempInC*9/5+32;
		System.out.println("temperature converted from degree celcius to degrees farenheit ="+tempInF);
		
		
	}

}
