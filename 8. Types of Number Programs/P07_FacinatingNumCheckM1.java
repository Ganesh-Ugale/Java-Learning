/* To Check Wether the given num is Facinating Num or Not or Not Without Using String
Hint: A Fascinating Number is a number that, when multiplied by 2 and 3, and the
      results are concatenated with the original number, contains all digits from 1 to 9 exactly once (excluding 0).
Ex:
Consider 192
Multiply by 2: 192 × 2 = 384
Multiply by 3: 192 × 3 = 576
Concatenate: "192" + "384" + "576" = "192384576"
Check digits: "192384576" contains all digits 1-9 exactly once → ✅ Fascinating Number.
*/

import java.util.Scanner;
class P7_FacinatingNumCheck{
	public static void main(String[] args) {

		// for (int num = 1; num<= 1000; num++){ // Extra Loop for to Check the Facinating Num from 1 to 1000

			System.out.print("\nEnter the Num : ");
			int num = new Scanner(System.in).nextInt();  // Ex: 219 

			String str = num + "" + (num*2) + (num*3); // Concatinate this num
			boolean flag = true; // Consider the Given num always Facinating Num

			for (char i = '1'; i<='9'; i++) { // Starts Loop from 1 to 9
				int cnt = 0; // Initially Count is 0 it checks for all digits and reset after 1 digit complete check.
				for (int j = 0; j<str.length(); j++) { // iterate loop num len time and check each position contains the each digit
					char ch = str.charAt(j);
					if(ch==i)
						cnt++;  // if char matches cnt++
				}
				if(cnt!=1){  // if that num cnt is not euqal to 1 only then it is not a Facinating num
					flag = false;
					break;
				}
			}

			System.out.println  // if flag is stay true then it is a Facinating Num other wise not
			(flag ? num + " is a Facinating Num!" : num + " is not Facinating Num!");

			// if (flag)
			// 	System.out.println(num + " is a Facinating Num!");

			// else
			// 	System.out.println(num + " is Not Facinating Num!");

		// } // Extra Loop end here
	}
}