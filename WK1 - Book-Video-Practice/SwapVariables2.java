import java.util.Scanner;

public class SwapVariables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//x=2.5 and y=7.5 => swap to make x=7.5 and y=2.5
		
		
		double x;
		double y;
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter 2 double values as follows :-");
		System.out.print("Enter x ");
		x= in1.nextDouble();
		System.out.print("Enter y ");
		y= in1.nextDouble();
		in1.close();
		System.out.println("Before Swapping  ");
		System.out.println("X="+x);
		System.out.println("Y="+y);
		double temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping  ");
		System.out.println("X="+x);
		System.out.println("Y="+y);

	}

}
