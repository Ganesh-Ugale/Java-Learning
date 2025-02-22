/*
 The Indian Census Bureau projects population based on the following assumptions:
 - One birth every 7 seconds
 - One death every 13 seconds
 - One new immigrant every 45 seconds

 Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.
 */


class CensusCalculation
{
	public static void main(String[] args)
	{
		long curPop = 312032486;
		final long seconds = (365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long immg = seconds/45;

		long newPop = (curPop + birth + immg - death);
		System.out.println("Current Population: " + curPop);
		System.out.println("New Population: " + newPop);
	}
}