/*
 * Print the Series A C F J O U ....
*/
class ACFJOU_Series
{
	public static void main(String[] args)
	{
		int a = 1;
		for (char ch = 'A';ch<='Z';ch+=a)
		{
			System.out.print(ch + " ");
			a++;
		}
	}
}