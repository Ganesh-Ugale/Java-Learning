// Print the Series 3 4 8 26 122 722 5042 40322 ......

import java.util.Scanner;
class Series_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the num : ");
        int num = sc.nextInt();
        
        for (int j = 1; j<=num; j++){
            int fact = 1, fact1 = 0;
            for (int i = j; i>=1; i--){
                fact *= i;
                for (int k = 2; k > 1; k--){
                    fact1 = fact + k; 
                }
            }
            System.out.print(fact1 + " ");
        } 
    } 
}