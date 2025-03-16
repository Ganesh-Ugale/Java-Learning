/**
 * Check Whether the give num is Amstrong num or Not(Hint: Find the num length, 
 * Find the pow of digit upto length, here len = 3, So Find the sum of pow of 
 * digit 1^3 + 5^3 + 3^3 if sum == num, then the given num is amstrong num)

 * Ex: 153
 it is an Amstrong Num
 */

import java.util.Scanner;
class P01_ArmstrongNumCheck{
    public static void main(String[] args){

        System.out.print("\nEnter the Num : ");
        int num = new Scanner(System.in).nextInt(); 
        int len = 0, sum = 0, dup = num;

        for (int i = num; i > 0; i /= 10) // for find out the length of num
            len++;

        while (num>0){  // for to fetch the one by one digit from the num
            int rem = num % 10;  // to fetch the last digit of num
            int pow = 1;  // reset the pow by 1 each time for each digit
            for (int i = 1; i<=len; i++) // for to find the pow of digit 
                pow *= rem;  // find the pow of rem

            sum += pow;  // sum = sum + pow---> Ex: 0 + 27 = 27 each time old sum remains as it is
            num /= 10;  // updates the num i.e remove last digit of num to update the num
        }

        System.out.println  // using Conditional Operator/ Ternary Operator check the dup == sum, if yes then it is a amstrong num
        ((dup == sum)? (dup + " is a Amstrong Num!") : (dup + " is not a Amstrong Num!"));
    }
}