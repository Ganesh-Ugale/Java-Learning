/*
 * To Print the Fibonaci Series from 1 to 10
 */

import java.util.Scanner;
class P1_FibonacciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the range : ");
        int range = sc.nextInt();
        int num0 = 0, num1 = 1;

        System.out.print(num0 + " " + num1 + " ");

        for (int i = 2; i<=range; i++ ){
            int num3 = num0 + num1;
            System.out.print(num3 + " ");
            num0 = num1;
            num1 = num3;
        }
        System.out.println();
    }
}