

import java.util.Scanner;

public class Converter
	{
		public static void main(String[] args)

{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter inches: ");
	double inches = scan.nextDouble();
	double rate = 2.54;
	System.out.println("Centimeters: " + rate * inches);



	}
}
