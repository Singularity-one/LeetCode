
/*
給你一個排序過的陣列,輸出去掉重複陣列的長度

Input: nums = [1,1,2]
Output: 2, nums = [1,2]

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]

*/


public class e26_Remove_Duplicates_from_Sorted_Array {
	public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
