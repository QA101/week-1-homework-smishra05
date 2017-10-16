import java.util.Scanner;

public class SwapVariables3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//x=10 / y=5 / z=12 => swap to make x=12 / y=10 /z=5	
		
		int x;
		int y;
		int z;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 integers as follows :-");
		System.out.print("Enter x ");
		x= in.nextInt();
		System.out.print("Enter y ");
		y= in.nextInt();
		System.out.print("Enter z ");
		z= in.nextInt();
		in.close();
		System.out.println("Before Swapping  ");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		//swap x & z
		int temp=0;
		temp=x;
		x=z;
		z=temp;
		//swap y & z
		int temp1=0;
		temp1=y;
		y=z;
		z=temp1;
		System.out.println("After Swapping  ");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}

}
