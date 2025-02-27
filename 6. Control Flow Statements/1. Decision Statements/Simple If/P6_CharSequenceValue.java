/**
To Print the Char value sequence like as follows:
Ex:
       I/P  ||   O/P
        A        1
        B        2
        C        3
        Z        26
        AA       27
        AB       28
        BA       53
        BZ       78
 */

import java.util.Scanner;
class CharSequenceValue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Characters : ");
        String str = sc.next().toUpperCase();  // to take i/p from user as in a Str

        int op = 0;  // initially op var is 0
        char ch = str.charAt(0);   // to store the char at index 0 in ch

        if (str.length()>2){ // if user entrs char more than 2 char then this condition stops the execution
            System.out.println("INVALID CHAR!");
            return;
        }

        op = ch - 64;   // substract the char(ch) from 64 i.e if i/p--> A then o/p--> 1
        if (str.length()==2){   // if length of str is 2 then executes a block
            char ch1 = str.charAt(1);  // fetch the char at index 1 & store in ch1
            op = (op*26) + (ch1-64); // calculates the double digit char AA/BB/AB/AZ etc
        }
        
        System.out.println(str + ":" + op);
    }
} 