import java.util.Scanner;

public class FindMax {

	/*
	 * Define a program that finds the maximum number when 2 numbers are given.
	 */
	public static void main(String[] args) {
		int X=0;
		int Y=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 numbers as follows :-");
		System.out.println("Enter X");
		X=in.nextInt();
		System.out.println("Enter Y");
		Y=in.nextInt();
		if(X==Y)
		{
			System.out.println("X=Y");
		}
		else if(X>Y)
		{
			System.out.println("X is the max number");
		}
		else
		{
			System.out.println("Y is the max number");
		}
		in.close();

	}

}