/* 9. Palindrome Number
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. 
For example, 121 is palindrome while 123 is not.
*/

public class Palindrome {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        int remainder;

        if (x < 0) {
            return false;
        }
        while (x != 0) {
            remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        if (original == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Palindrome test = new Palindrome();
        int x = 1001;
        boolean result = test.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
    }
}
