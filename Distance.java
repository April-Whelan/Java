


import java.util.Scanner;
class Distance
{
	public static void main(String arg[])
	{
	     Scanner scan = new Scanner(System.in);
       System.out.println("Input distance in miles: ");
       double miles = scan.nextDouble();
      	System.out.println("Input time travelled in hours: ");
      	double time = scan.nextDouble();
      	System.out.println("Enter gallons: ");
      	double gallons = scan.nextDouble();
	       double Distance= miles/gallons;
      	System.out.println("miles per gallon = "+ Distance);
				double Total = miles/time;
			System.out.println("miles per hour = "+ Total);
	}
}
