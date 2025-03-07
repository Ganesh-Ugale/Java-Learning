/* Using Method 1
To Check Whether userNum is Emirp Num or Not,

Ex:
I/P = 17
O/P = 17 is a Emirp Num!
*/

import java.util.Scanner;
class EmirpPrimeNumCheckM1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num : ");
        int num = sc.nextInt();

        int dup = num, din = 2, revNum = 0; // declare needed variables with initialize

        // To Check the num is prime or Not
        while (din<num){ // Check din is smaller than the num
            if (num % din == 0){ // if true then check the num is divisible by din, if yes then break, if no then din++.
                break;
            }
            din++; // updates the din++;
        }
        if (din==num){ // compare the din with num if yes 
          //  System.out.println(num + " is a Prime");
            din = 2; // reset din = 2 for to check rev prime num 
            for (int i = num; i > 0; i /= 10 ){ // reverse the prime num
                int rem = i % 10;  // fetch the last digit
                revNum = (revNum * 10) + rem;  // store the rev num into revNum
            }

            // To check the revNum is prime or Not! and check same as the above while loop for num.
            while (din < revNum){
                if ( revNum % din == 0){
                    break;
                }
                din++;
            }
            if (din==revNum){  // if din is same as revNum it is Empire
                System.out.println(num + " is Empire Num!");
            }
            else{ // if the din =! revNum
                System.out.println(num + " is Prime Num!\nBut, reverse " + revNum + " is not Prime Num!");
            }
        }
        else{ // if the num is not prime
            System.out.println(num + " is Not Prime!");
        }
    }
}