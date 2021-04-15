import java.util.Arrays;
import java.util.HashSet;

/*
Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
public class e217_Contains_Duplicate {
	 public boolean containsDuplicate(int[] nums) {
		 //#1 faster than 49.68% of Java
//	        Arrays.parallelSort(nums);
//	   	    for(int i=0;i<nums.length-1;i++) {
//	    	    if( nums[i]==nums[i+1])return true;
//	   	    }
//	        return false;
		 
		 //#2 faster than 78.81%
		 if(nums==null || nums.length==0) {return false;}
		 
		 HashSet<Integer> set = new HashSet<Integer>();
		 for(int i: nums){
			 if(!set.add(i)){return true;}
		 }
		 return false;
	    }
}
//參考:https://medium.com/leetcode-%E6%BC%94%E7%AE%97%E6%B3%95%E6%95%99%E5%AD%B8/052-leetcode-217%E6%BC%94%E7%AE%97%E6%B3%95-contains-duplicate-%E5%8C%85%E5%90%AB%E9%87%8D%E8%A4%87%E5%80%BC-8e4efcc5475c
//https://www.programcreek.com/2014/05/leetcode-contains-duplicate-java/

