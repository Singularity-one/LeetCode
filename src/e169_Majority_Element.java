import java.util.Arrays;

/*
Boyer–Moore majority vote algorithm(摩爾投票算法)

Example 1:
Input: [3,2,3]
Output: 3

Example 2:
Input: [2,2,1,1,1,2,2]
Output: 2

*/
public class e169_Majority_Element {
	public int majorityElement(int[] nums) {
		//1 Wrong Answer
//		 int res = nums[0], cnt = 1;
//	        
//	        // Boyer-Moore Voting Algorithm
//	        for (int i = 1; i < nums.length; ++i) {
//	            if (res == nums[i])
//	                cnt++;
//	            else if (cnt > 0)
//	                cnt--;
//	            else
//	                res = nums[i];
//	                cnt++;
//	        }
//	        return res;
		
		//#2
		 if (nums.length == 1) {
	           return nums[0];
	       }
	        Arrays.sort(nums);
	        return nums[nums.length / 2];
	    }
}

//參考https://ithelp.ithome.com.tw/articles/10213285 (Wrong Answer)
//https://www.programcreek.com/2014/02/leetcode-majority-element-java/
/*


Example 1:
Input: [6,5,5]
Output: 6
Expected:5

*/

