/*
A Duck Number is a number that contains at least one '0' in it, but the zero should not be at the beginning.

Example:
203 → Contains '0' (✅ Duck Number)
4507 → Contains '0' (✅ Duck Number)
0823 → Starts with '0' (❌ Not a Duck Number)
123 → No '0' (❌ Not a Duck Number)

*/

import java.util.Scanner;
class P6_DuckNumCheck{
	public static void main(String[] args) {

		System.out.print("\nEnter the Num : ");
		String str = new Scanner(System.in).next(); // get i/p as a String
		int len = str.length();  // take the len of string
		int cnt = 0;  // initially cnt is 0

		if (str.charAt(0) != '0') {  // if 1st char is != 0 then only check the 0 is present in the string or not

			// to check the whole str is any digit is == 0 then cnt++
			for (int i = 0; i < len ; i++) { 
				if (str.charAt(i) == '0') // if anyone i==0 then cnt++
					cnt++;	
			}
			if (cnt != 0) // if cnt is not zero means 1 or 2 or 3 many more 
				System.out.println(str + " is a Duck Num!");
			else  // if that num is not contains 0 
				System.out.println(str + " is not a Duck Num!");
		}
		else  // if 1st char is == 0 then follows
			System.out.println(str + " is not a Duck Num!");
	}	
}