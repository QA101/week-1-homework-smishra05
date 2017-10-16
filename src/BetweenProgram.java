import java.util.Scanner;

public class BetweenProgram {

	/*
	 * Write a program that determine if a number x is between 2 numbers y and z
	 * if x is between y and z, print TRUE otherwise print FALSE
	 * 
	 * example:
	 * x = 150
	 * y = 100
	 * z = 200
	 * should print TRUE
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=0;
		int z=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 Numbers as follows :-");
		System.out.println("Enter x");
		x=in.nextInt();
		System.out.println("Enter y");
		y=in.nextInt();
		System.out.println("Enter z");
		z=in.nextInt();
		in.close();
		if ((y>x && x>z) || (x<z && x>y))
		{
			System.out.println("True");
		}
		
	}
		

	}

