/*
Make a Small Mini Application Using All Covered Topic
Create a Mini Application of Celcius to Other Units
 */

import java.util.Scanner;
class CelciusToOtherUnits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n==========================|| WELCOME TO TEMPRATURE CONVERSION APPLICATION ||==========================\n");
		System.out.print("\nEnter the temperature(Degree Celcius) : ");
		double celcius = sc.nextDouble();

		System.out.println("\n1. Kelvin : ");
		System.out.println("2. Fahrenheit : ");
		System.out.println("3. Rankine : ");
		System.out.println("4. Newton : ");
		System.out.println("5. Romer : ");
		System.out.println("6. Reaumur : ");
		System.out.println("7. Delisle : ");

		System.out.print("\nSelect Option Num : ");
		byte option = sc.nextByte();
		
		switch (option)
		{
		case 1:
			{
				System.out.println("\nUsed in science; absolute temperature scale.\n");
				double kelvin = celcius + 273.15;
				System.out.println(celcius + " degree celcius = " + kelvin + "K\n");
				break;
			}

		case 2:
			{
				System.out.println("\nCommon in the U.S. and some Caribbean countries.\n");
				double fahrenheit = celcius * (9/5) + 32;
				System.out.println(celcius + " degree celcius = " + fahrenheit + "F\n");
				break;
			}

		case 3:
			{
				System.out.println("\nUsed in thermodynamics (similar to Kelvin but in Fahrenheit).\n");
				double rankine = celcius + 273.15 * (9/5);
				System.out.println(celcius + " degree celcius = " + rankine  + "Ra\n");
				break;
			}

		case 4:
			{
				System.out.println("\nCreated by Isaac Newton, rarely used.\n");
				double newton = (celcius * 33)/100;
				System.out.println(celcius + " degree celcius = " + newton  + "N\n");
				break;
			}

		case 5:
			{
				System.out.println("\nHistorical Danish scale.\n");
				double romer = celcius * (21/40) + 7.5;
				System.out.println(celcius + " degree celcius = " + romer  + "Ro\n");
				break;
			}

		case 6:
			{
				System.out.println("\nUsed historically in Europe.\n");
				double reaumur = celcius * (4/5);
				System.out.println(celcius + " degree celcius = " + reaumur  + "Re\n");
				break;
			}

		case 7:
			{
				System.out.println("\nUsed in Russia in the past.\n");
				double delisle  = (100 - celcius) * (3/2);
				System.out.println(celcius + " degree celcius = " + delisle  + "D\n");
				break;
			}
		default:System.out.println("\n INVALID TEMPERATURE. PLEASE TRY AGAIN\n");
		}
	}
}