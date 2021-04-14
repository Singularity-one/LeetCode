/*


*/
public class m198_House_Robber {
	 public int rob(int[] nums) {
		 //#1 
//	        if(nums==null||nums.length==0)
//	        return 0;
//	 
//	        if(nums.length==1)
//	        return nums[0];
//	 
//	        int[] dp = new int[nums.length];
//	        dp[0]=nums[0];
//	        dp[1]=Math.max(nums[0], nums[1]);
//	 
//	        for(int i=2; i<nums.length; i++){
//	            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
//	        }
//	 
//	        return dp[nums.length-1];
		 
		 //#2
		 int even = 0;
		 int odd = 0;
		 
		 if(nums==null || nums.length == 0) {return 0;}
		 
		 for (int i = 0; i < nums.length; i++) {
				if (i % 2 == 0) {
					even += nums[i];
					even = even > odd ? even : odd;
				} else {
					odd += nums[i];
					odd = even > odd ? even : odd;
				}
		}
		 
		 return even > odd ? even : odd;
	    }
}
//參考:https://www.programcreek.com/2014/03/leetcode-house-robber-java/
