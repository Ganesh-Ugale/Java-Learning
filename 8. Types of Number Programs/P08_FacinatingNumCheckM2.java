/* To Check Wether the given num is Facinating Num or Not Using String
Hint: A Fascinating Number is a number that, when multiplied by 2 and 3, and the
      results are concatenated with the original number, contains all digits from 1 to 9 exactly once (excluding 0).
Ex:
Take an input number (num). 192
Multiply num by 2 and 3, then concatenate these values with num.
Check if the concatenated number contains all digits (1-9) exactly once. i.e frequncy of all digits
If all digits are present exactly once, print "Fascinating Number!", else print "Not a Fascinating Number!".
*/

import java.util.Scanner;
class P8_FacinatingNumCheckM2{
	public static void main(String[] args) {
		
		// for (int k = 1; k <= 100000; k++){  
		// 	int num = k;

		System.out.print("\nEnter the Num : ");
		int num = new Scanner(System.in).nextInt();

			int dup = num;
			boolean flag = true; // Initially Num assunme Facinating Num

			// Loop is for multiply the num by 2 and 3 and add concat into origianl Num
			for (int i = 2; i <= 3; i++) {
				num = (num * 1000) + ( dup * i);
			}

			// To Check digit from 1 to 9 is a present in the num or Not
			for (int i = 1; i <= 9; i++) {
				int cnt = 0; // initially each time count is 0
				for (int j = num; j > 0; j /= 10) { // to fetch the last digit and checks the each num
					int rem = j % 10;
					if (rem==i) // check the digit is comes only once in num?,
						cnt++;
				}
				if (cnt != 1) {  // if num is != 1 then loop stops and declare num is not facinating num.
					flag = false;
					break;
				}
			}

			System.out.println
			(flag ? dup + " is Facinating Num!" : dup + " is not Facinating Num!");

			// if (flag)
			// 	System.out.println(dup + " is a Facinating Num!");

		// } // Extra Loop ends
	
	}
}