/*
 * Learn How Local Variables Work, What are the Rules of declaration of Local variables
 */

class LocalVariables
{
	public static void main(String[] args)
	{
		{ // Varible 'a' declared inside the block it can access only inside this block.
			byte a = 10;
			System.out.println(a);
		}

		{ // The Varibles of same name is not allowed to access in same block
			short var1 = 256; // var1
			//short var1 = 880; // CTE
			System.out.println(var1);
		}
		{ // we can have more than one local var of same name into 2 different blocks
			{// block-1
				byte var1 = 127;
				int var2 = 128;
				System.out.println(var1-var2);
			}
			{// block-2
				float var1 = 10000.50000f;
				double var2 = 50000000000.60d;
				System.out.println(var1);
			}
		}
		{ // We cannot use local var without initialization it gives CTE
			byte var;
			//System.out.println(var); // CTE
		}
	}
}