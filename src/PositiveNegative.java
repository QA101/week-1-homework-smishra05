import java.util.Scanner;

public class PositiveNegative {

	/*
	 * define a program that finds if a number is positive or negative.
	 * 
	 * The program should print positive if the number is positive, negative if it is negative
	 */
	public static void main(String args[]){
		
		int X=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		System.out.println("Enter X");
		X=in.nextInt();
		in.close();
		if(X>0)
		{
			System.out.println("the number is positive");
		}
		else if(X<0)
		{
			System.out.println("the number is negative");
		}
	}
}