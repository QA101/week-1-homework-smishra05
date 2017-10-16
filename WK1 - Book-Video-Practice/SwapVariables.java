import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Write a program that will change values of variables:
			x=10 and y=5 => swap to make x=5 and y=10
				 
 
		 * */
		//******************x=2.5 and y=7.5 => swap to make x=7.5 and y=2.5************************
		int a;
		int b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 integers as follows :-");
		System.out.print("Enter a ");
		a= in.nextInt();
		System.out.print("Enter b ");
		b= in.nextInt();
		in.close();
		System.out.println("Before Swapping  ");
		System.out.println("A="+a);
		System.out.println("B="+b);
		int temp1=0;
		temp1=a;
		a=b;
		b=temp1;
		System.out.println("After Swapping  ");
		System.out.println("A="+a);
		System.out.println("B="+b);
		
	}
	
}
