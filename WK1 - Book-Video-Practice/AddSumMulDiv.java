public class AddSumMulDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Write a program that will find sum, subtraction, multiplication and division
		and if one number bigger than other true or false for:
		1) x = 175 / y =255
		2) x = 25.75 / y = 17.34
		 */
		//1) x = 175 / y =255
		int x = 175;
		int y = 255;
		System.out.println("Sum");
		System.out.println(x+y);
		System.out.println("Subtraction");
		System.out.println(x-y);
		System.out.println("Multiplication");
		System.out.println(x*y);
		System.out.println("Division");
		System.out.println(x/y);
		if(x>y||y>x)
		System.out.println("True");
		else
			System.out.println("False");
		
		//x = 25.75 / y = 17.34
		double a = 25.75;
		double b = 17.34;
		System.out.println("Sum");
		System.out.println(a+b);
		System.out.println("Subtraction");
		System.out.println(a-b);
		System.out.println("Multiplication");
		System.out.println(a*b);
		System.out.println("Division");
		System.out.println(a/b);
		if(a>b||b>a)
		System.out.println("True");
		else
			System.out.println("False");
		}

}
