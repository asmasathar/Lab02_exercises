/**
 * Week 2, Exercise 8.
 * @author Asma Sathar
 */
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=input.next();
		System.out.print("enter your height in metres:");
		double height=input.nextDouble();
		System.out.print("enter the number of siblings:");
		int siblings=input.nextInt();
		int length=name.length();
		System.out.println("hello "+name+" you are "+height+" metres tall,you have "+siblings+" siblings and your name is "+length+" letters long");
	}

}
