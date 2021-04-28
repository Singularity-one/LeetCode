/*
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Input: nums = [0]
Output: [0]

 */
public class e283_Move_Zeroes {
	public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

       while (j < nums.length) {
           if (nums[j] != 0) {
               nums[i++] = nums[j];
           }
           j++;
       }

       while (i < nums.length) {
           nums[i++] = 0;
       }
   }
}
