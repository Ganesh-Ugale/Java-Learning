/*
To Print the Series 10 30 68 130 222 350 ..... 
*/

import java.util.Scanner;
class P2_Series_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Range : ");  // to take range of series
        int num = sc.nextInt();
        System.out.print("\nEnter the Pow : "); // to take the power of the num
        int pow = sc.nextInt();

        // outer loop for change the num form 2 to range, increase by 1 each time
        for (int i = 2; i<=num; i++){
            int result = 1; // initially result is 1, and after print the result each time it reset to 1;
            for (int j = 1; j<=pow; j++){ // inner loop is for the pow means the num is how many time multiply and to get a pow result
                result *= i;  // result = result * i, Ex: for num = 2 & pow = 3 result = 1 * 2, result = 2 * 2, result = 4 * 2----> result = 8
            }
            System.out.print((result+i) + " "); // for the series add num in result to get the series.
        }
        System.out.print("\n");
    }
}