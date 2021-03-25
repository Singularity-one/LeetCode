/*
這題主要目的在於了解如何處理以排序陣列的快速方法：二元搜尋法。

Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 2
Output: 1

Input: nums = [1,3,5,6], target = 7
Output: 4

*/

public class e35_Search_Insert_Position {
	public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length ;++i) {
          if (nums[i] >= target) return i;
      }
      return nums.length;
  }
}
