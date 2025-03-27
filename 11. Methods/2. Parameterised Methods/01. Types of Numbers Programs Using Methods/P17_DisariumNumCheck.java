// import java.util.Scanner;
// class P17_DisariumNumCheck{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("\nEnter the Num :");
// 		int num = sc.nextInt();
// 		System.out.println(num + " is a Disarium num? : " + sumOfDigits(num));
// 	}
// 	// METHODS
// 	public static int count(int num){
// 		int cnt = 0;
// 		for (int i = num; i > 0; i /= 10)
// 			cnt++;		 	
// 		return cnt;
// 	}
// 	public static int pow(int base, int raise){
// 		int pow = 1;
// 		for (int i = 1; i <= raise; i++)
// 			pow *= base;
// 		return pow;
// 	}
// 	public static boolean sumOfDigits(int num){
// 		int sum = 0;
// 		for (int i = num; i > 0; i /= 10) { // removing last digit after each iteration
// 			int last = i % 10;  // fetch the last digit
// 			sum+=pow(last,count(i));  // each time get the pow of last digit with count of update num
// 		}
// 		return sum == num;  // check's the sum == original Num? true or False Returns
// 	}
// }



// Optimized Method

import java.util.Scanner;
class P17_DisariumNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the start Num :");
		int start = sc.nextInt();
		System.out.print("\nEnter the end Num :");
		int end = sc.nextInt();		

		for (int i = start; i <= end; i++)
			if (sumOfDigits(i))
				System.out.print(i + " ");
	}
	// METHODS
	public static int count(int num){
		int cnt = 0;
		for (int i = num; i > 0; i /= 10)
			cnt++;		 	
		return cnt;
	}
	public static int pow(int base, int raise){
		int pow = 1;
		for (int i = 1; i <= raise; i++)
			pow *= base;
		return pow;
	}
	public static boolean sumOfDigits(int num){
		long sum = 0;
		for (int i = num; i > 0; i /= 10) // removing last digit after each iteration
			sum+=pow(i % 10,count(i));  // each time get the pow of last digit with count of update num
		return sum == num;  // check's the sum == original Num? true or False Returns
	}
}