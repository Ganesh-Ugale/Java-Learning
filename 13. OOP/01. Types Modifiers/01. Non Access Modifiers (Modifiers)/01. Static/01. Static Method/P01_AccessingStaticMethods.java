class P01_AccessingStaticMethods{
	public static void main(String[] args) {
		// Accessing a Static methods from another class
		// Addition.add(5,10);  // This add method we access it from the Addition class that is present in the same dir but not in this program class
		System.out.println(PalindromicPrimeNumCheck.isPrime(5));  // Accessing isPrime() Method from PalindromicNumCheck Class, that is present in anoth java class file
		System.out.println(PalindromicPrimeNumCheck.reverse(1234)); // Accessing reverse Method From Another Class
	}
}    