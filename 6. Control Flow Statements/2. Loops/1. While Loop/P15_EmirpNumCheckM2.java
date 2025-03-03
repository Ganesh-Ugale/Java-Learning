/* Using Method 2
To Check Whether userNum is Emirp Num or Not,

Ex:
I/P = 17
O/P = 17 is a Emirp Num!
*/

import java.util.Scanner;
class EmirpNumCheckM2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num : ");
        int num = sc.nextInt();
        int revNum = 0; 
        int din1 = 2, din2 = 2; // for dinominator(din1 is for )

        for(int i = num; i > 0; i /= 10){''
            int rem = i % 10;
            revNum = (revNum * 10) + rem;
        }       

        while ((din1<num) && (din2<revNum)){
            if ((num % din1 == 0) || (revNum % din2 == 0)){
                break;
            }
            din1++;
            din2++;
        }
        
        if ((din1 == num) || (din2 == revNum)){
           System.out.println(num + " is a Emirp");
        }
        else{
            System.out.println(num + " is Not Emirp!");
        }
    }
}