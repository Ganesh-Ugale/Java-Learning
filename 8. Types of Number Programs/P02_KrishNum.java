/*
 * Check wheather the enter num is Krishnamurthi Num or Not
 Ex: 145
 O/P- it is an Krishnamurthi Num
*/

import java.util.Scanner;
class P02_KrishNum{
    public static void main(String[] args){

        System.out.print("\nEnter the num : ");
        int num = new Scanner(System.in).nextInt();

        int len = 0, sum = 0, dup = num;
        
        for(int i = num; i>0; i /= 10){
            len++;
        }

        //System.out.println(len);

        while (num>0){
            int rem = num % 10;

            int fact = 1;
            for (int i = 1; i <= rem; i++){
                fact *= i;
            }
            sum += fact;
            num /= 10;  
        }
        System.out.print
        (sum == dup ? dup + " is Krishnamurthi Num!" : dup + " is not a Krishnamurthi Num!");
        System.out.println("\n");
    } 
}