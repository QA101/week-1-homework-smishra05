import java.util.Scanner;

public class DivisibleProgram {

	/*
	 * Define a program that determines whether a number x is divisible by a number y.
	 * 
	 * If x is divisble by y, the program will print TRUE otherwise FALSE
	 * 
	 * Such as:
	 * x -> 10
	 * y -> 5
	 * 10 divided by 5 is 2 with 0 remainder. The program would print true
	 */
	public static void main(String args[]){
		
		int x=0;
		int y=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 positive Numbers as follows :-");
		System.out.println("Enter x");
		x=in.nextInt();
		System.out.println("Enter y");
		y=in.nextInt();
		in.close();
		if(y==0)
		{
			System.out.println("Invalid Input (Cant enter 0 or negative number)");
		}
		else if (x%y==0)
		{
			System.out.println("True");
		}
		
		
	}
}