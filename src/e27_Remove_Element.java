/*
给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

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
