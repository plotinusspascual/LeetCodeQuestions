
/** 66. Plus One
 * Given a non-empty array of decimal digits representing a non-negative 
 * integer, increment one to the integer.

The digits are stored such that the most significant digit is at the 
head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except 
the number 0 itself.
 */

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int x = digits.length;
        if (digits[0] == 0) {
            digits[0] = 1;
        }
        for (int i = x - 1; i >= 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne test = new PlusOne();
        int[] digits = { 1, 2, 3, 4, 5 };
        int[] result = test.plusOne(digits);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
