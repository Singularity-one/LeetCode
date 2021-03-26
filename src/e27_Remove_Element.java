/*

一格陣列nums和一個數值 val
nums陣列內移除相等 val的元素再輸出答案
不得使用額外空間
時間控制O(1)
陣列內順序可以改變

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3]

*/


public class e27_Remove_Element {
	 public int removeElement(int[] nums, int val) {
	        int i=0;
		    int j=0;
		 
		    while(j < nums.length){
		        if(nums[j] != val){
		            nums[i] = nums[j];
		            i++; 
		        }
		        j++;
		    }
		    return i;
	 }
}
