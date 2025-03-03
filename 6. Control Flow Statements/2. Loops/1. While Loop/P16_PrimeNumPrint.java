/*
To Print the Prime Num from start num to End num that user gives range, with Counts of prime num only.
Ex
I/P: Start Num = 1
     Enter the Range = 10
O/P = 2  3  5  7
      Counts: 4
*/

import java.util.Scanner;
class PrimeNumPrint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Start num : ");
        int num = sc.nextInt();
        System.out.print("\nEnter the range : ");
        int range = sc.nextInt();
        int cnt = 0;
        
        while (num<=range){  // for updates the num upto range
            int din = 2;  // always reset the din if the num updates
            while (din<num){  // to updates din from din to num 
                if (num % din == 0){  // Checks the num is divisible by din
                    break;  // if yes then breaks the inner while loop
                }
                din++;  // if num is not divisible then din++;
            }
            if (din == num){  // checks if the din == num
                cnt++; // cnt++ updates
                System.out.print(num + " ");
            }
            num++;  // num updates from num upto range by 1
        }
        System.out.print("\nCounts: " + cnt + "\n");  // prints the count of prime Num
    }
} 