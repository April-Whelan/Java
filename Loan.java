

import java.util.Scanner;
class Loan
{
	public static void main(String arg[])
	{
	     Scanner scan = new Scanner(System.in);
       System.out.println("Input loan amount: ");
       double amount = scan.nextDouble();
      	System.out.println("Input interest rate: ");
      	double rate = scan.nextDouble();
      	System.out.println("Input years: ");
      	double years = scan.nextDouble();
	       double result = amount / 100 * rate;
				 double time = result * years;
				 double end = time + amount;
      	System.out.println("Amount to be repaid = "+ end);

	}
}
