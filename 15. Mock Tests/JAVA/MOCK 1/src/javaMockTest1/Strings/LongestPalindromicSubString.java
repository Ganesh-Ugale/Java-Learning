package javaMockTest1.Strings;


// FAIL LOGIC
public class LongestPalindromicSubString {

    // Method to expand around center and return palindrome
    public static String expandAroundCenter(String s, int left, int right) {
        // Expand as long as it’s a palindrome
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindromic substring
        return s.substring(left + 1, right);
    }

    // Method to find longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        String longest = "";

        // Try each index as center
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            String oddPal = expandAroundCenter(s, i, i);

            // Even length palindrome
            String evenPal = expandAroundCenter(s, i, i + 1);

            // Pick longer among odd, even and current longest
            if (oddPal.length() > longest.length()) {
                longest = oddPal;
            }
            if (evenPal.length() > longest.length()) {
                longest = evenPal;
            }
        }

        return longest;
    }

    // Main method
    public static void main(String[] args) {
        String str1 = "babad";
        System.out.println("Input: " + str1);
        System.out.println("Longest Palindrome: " + longestPalindrome(str1));

        String str2 = "cbbd";
        System.out.println("\nInput: " + str2);
        System.out.println("Longest Palindrome: " + longestPalindrome(str2));

        String str3 = "forgeeksskeegfor";
        System.out.println("\nInput: " + str3);
        System.out.println("Longest Palindrome: " + longestPalindrome(str3));
    }
}
