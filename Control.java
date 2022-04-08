import java.util.Scanner;
import java.util.Arrays;

class Compare
{
public static void main (String args[])
{
Scanner scan = new Scanner(System.in);

System.out.print("\nEnter a number: ");

int first = scan.nextInt();

System.out.print("\nEnter another number: ");

int second = scan.nextInt();

System.out.print("\nEnter a final number: ");

int third = scan.nextInt();

findSmallest(first,second,third);

}

static void findSmallest(int first,int second, int third)
{
    if(first<=second && first<=third){
        System.out.println(first +" \nis the smallest number.");

    }
    else if(second<=first && second<=third){
        System.out.println(second +" \nis the smallest number.");

    }
    else{
        System.out.println(third +" \nis the smallest number.");

    }

  }
}


class Sort
{
  public static void main(String[] args)

  {

int[] order = new int[3];

System.out.print("\nEnter three numbers: ");

  Scanner scan = new Scanner(System.in);
  for(int i=0; i<3; i++) order[i] = scan.nextInt();
  Arrays.sort(order);
  System.out.print("\nOrder: ");
    for(int i=0; i<3; i++) System.out.print(order[i]+" ");
  }

}

class Month
{
    	public static void main( String[] args )
    	{
		Scanner month = new Scanner(System.in);

		int number;
		System.out.print("\n Please enter a number of a month: ");
		number = month.nextInt();

		switch(number)
   		{
			case 1:
      		 		System.out.print("\n The first month is January.");
      		 		break;
			case 2:
      	  	 		System.out.print("\n The second month is February.");
      	         		break;
			case 3:
      		 		System.out.print("\n The third month is March.");
      		 		break;
			case 4:
      		 		System.out.print("\n The fourth month is April.");
      		 		break;
			case 5:
      		 		System.out.print("\n The fifth month is May.");
      	         			break;
			case 6:
      		 		System.out.print("\n The sixth month is June.");
      		 		break;
			case 7:
      		 		System.out.print("\n The seventh month is July.");
      		 		break;
			case 8:
      		 		System.out.print("\n The eighth month is August.");
      	         			break;
			case 9:
      		 		System.out.print("\n The ninth month is September.");
      	         			break;
			case 10:
      		 		System.out.print("\n The tenth month is October.");
      		 		break;
			case 11:
      		 		System.out.print("\n The eleventh month is November.");
      		 		break;
			case 12:
      		 		System.out.print("\n The twelfth month is December.");
      		 		break;

    		}
    	}

}


class Even
{
  public static void main( String[] args )
  {
    int number;
    System.out.print("\nEnter number: ");
    Scanner even = new Scanner(System.in);
    number = even.nextInt();

    for(int i=0; i<=number; i=i+2)
    {
      System.out.print (i + " ");

    }

  }

}

class Menu
{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nPlease choose from the menu:");


	while(true){
			System.out.println("\n1. Fahrenheit to Celsius ");
			System.out.println("\n2. Celsius to Fahrenheit");
      System.out.println("\n3. Inches to centimetres");
      System.out.println("\n4. Centimetres to inches");
      System.out.println("\n5. Pounds to Kilograms");
      System.out.println("\n6. Kilograms to Pounds");
			System.out.println("\nTo Exit, Press 0");

			System.out.println("\nEnter the number of the converter you want:");
			int menu = scan.nextInt();

			switch(menu){

case 1:

    break;

case 2:
        System.out.println("\nEnter Celsius: ");
        double cel = scan.nextDouble();
        double formulaC = cel * 9/5;
        System.out.println("\nFahrenehit: " + formulaC + 32);
		break;

case 3:
        System.out.println("\nEnter inches: ");
        double inches = scan.nextDouble();
        double rate = 2.54;
        System.out.println("\nCentimeters: " + rate * inches);
    break;

case 4:
        System.out.print("\nEnter centimetres: ");
        double input = scan.nextDouble();
        double conversion = 0.3937;
        System.out.print("\nInches: " + input * conversion);
    break;

case 5:
        System.out.println("\nEnter pounds: ");
        double pounds = scan.nextDouble();
        double maths = 2.205;
        System.out.println("\nKilograms: " + pounds / maths);
    break;

case 6:
        System.out.println("\nEnter Kilograms: ");
        double kg = scan.nextDouble();
        double convert = 2.205;
        System.out.println("\nPounds: " + kg * convert);
    break;

	case 0:

      System.out.println("\nThank you! Goodbye!");
			System.exit(0);

			}
		}

	}

}
