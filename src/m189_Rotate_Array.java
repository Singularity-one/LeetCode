/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

*/

public class m189_Rotate_Array {
    public void rotate(int[] nums, int k) {
    	//#1 Time Limit Exceeded
//        for(int i = 0;i < k; i++){
//           for(int j = 0; j <nums.length;j++){
//               
//               if(j+1 <nums.length){
//                  int temp = nums[j+1];
//                  nums[j+1] = nums[0];
//                  nums[0] = temp;
//               }
//           }
//       }
    	
    	 k %= nums.length;
         reverse(nums, 0, nums.length - 1);
         reverse(nums, 0, k - 1);
         reverse(nums, k, nums.length - 1);
   }
    
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}

//參考:https://leetcode-cn.com/problems/rotate-array/solution/shu-zu-fan-zhuan-xuan-zhuan-shu-zu-by-de-5937/
