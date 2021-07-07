/* 
1470. Shuffle the Array
Given the array nums consisting of 2n elements 
in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/
public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[2 * n];
        int i, j = 0;

        for (i = 0; i < n; i++) { // [2,5,1,3,4,7] , n=3
            array[j] = nums[i]; // array[0] = 2, j++
            j++; // j=1
            array[j] = nums[n + i]; // array[1] = nums[3+0] -> nums[3] = 3
            j++; // j=2, i=1
        }
        return array;
    }

    public static void main(String args[]) {
        ShuffleArray test = new ShuffleArray();
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] cases = test.shuffle(nums, n);
        String outputArray = Arrays.toString(cases);
        System.out.println("Output: " + outputArray);
    }
}
