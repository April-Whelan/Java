

import java.util.Scanner;
class Calculator
{
	public static void main(String arg[])
	{


Scanner scan = new Scanner(System.in);
System.out.println("Input first number: ");
double NumOne = scan.nextDouble();
double OneOne = NumOne + 0;
System.out.println("The sum is = " + OneOne);
double OneTwo = NumOne * 1;
System.out.println("The product is = " + OneTwo);
double OneThree = NumOne / 1;
	System.out.println("The average is = " + OneThree);

	System.out.println("Input second number: ");
	double NumTwo = scan.nextDouble();
	double TwoOne = NumOne + NumTwo;
	System.out.println("The sum is = " + TwoOne);
	double TwoTwo = NumOne * NumTwo;
	System.out.println("The product is = " + TwoTwo);
	double TwoThree = TwoOne / 2;
		System.out.println("The average is = " + TwoThree);


			System.out.println("Input third number: ");
			double NumThree = scan.nextDouble();
			double ThreeOne = NumOne + NumTwo + NumThree;
			System.out.println("The sum is = " + ThreeOne);
			double ThreeTwo = NumOne * NumTwo * NumThree;
			System.out.println("The product is = " + ThreeTwo);
			double ThreeThree = ThreeOne / 3;
				System.out.println("The average is = " + ThreeThree);

}
	}
