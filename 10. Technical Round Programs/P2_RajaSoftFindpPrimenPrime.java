/* RajaSoft Comapny Question
To Find the prime num's with previous prime form user num and next prime from user num, and print only least distance prime num from user num, if previous and next primes are both are in eqivalent distance so print both with user prime

Ex:
input = 11 ||OR|| 6
Output 11 13 ||OR 5 6 7
 */

import java.util.Scanner;
class P2_FindpPrimenPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Num : ");
        int num = sc.nextInt();
        int pPrime = 0; // for storing the previous prime
        int nPrime = 0; // for storing the next Prime

        // outer for loop going to reverse direction from num one by one
        for (int i = num-1; i >= 2; i--){
            boolean flag = true; // assuming that num is prime
            for (int j = 2; j < i; j++){ // inner for loop for divides the num(i) that take from outer for loop, starts from 2 to upto num-1(j<i)
                if (i % j == 0){   // to check the num(i) is divisible by num(j)
                    flag = false;  // now assumption false
                    break;  // break only inner loop
                }
            }
            if (flag){  // if flag true always then the condition is true
                pPrime = i;  // i (num) is stored in the pPrime
                break; // breaks the outer Loop
            }
        }

        // outer for loop going to forward direction from num one by one
        for (int i = num+1; ; i++){  
            boolean flag = true;  // assuming that num is prime
            for (int j = 2; j < i; j++){ // inner for loop for divides the num(i) 
                if (i % j == 0){  // to check the num(i) is divisible by num(j)
                    flag = false;  // now assumption false
                    break; // break only inner loop
                }
            }
            if(flag){  // if flag true always then the condition is true
                nPrime = i; // i (num) is stored in the nPrime
                break;  // breaks the outer Loop
            }
        }

        if(num-pPrime<nPrime-num){  // compares the both pPrime and nPrime distance and print only if the pPrime has least distance
            System.out.println(pPrime +" " +num);
        }else if(num-pPrime>nPrime-num){ // compares the both pPrime and nPrime distance and print only if the nPrime has least distance
            System.out.println(num + " " + nPrime);
        }else if(num-pPrime==nPrime-num){  // compares the both pPrime and nPrime distance and print if the both distance are eqivalent
            System.out.println(pPrime + " " + num + " " + nPrime);
        }
    }
}