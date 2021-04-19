import java.util.HashMap;
import java.util.HashSet;

/*
給一個陣列nums跟一個整數k，判斷能不能在陣列中找到nums[i] = numsj，而且i跟j的距離不能比k還大。

Input: nums = [1,2,3,1], k = 3
Output: true
 i,j距離為4比k還大，因此為false nums = [1,2,3,4,1] k=4; nums[0] = nums[4] = 1 , j=4, i=0, 
 i,j距離為4沒有比k大，因此為true

Input: nums = [1,0,1,1], k = 1
Output: true

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/
public class e219_Contains_Duplicate_II {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		//#1
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//           for(int i=0; i<nums.length; i++){
//           if(map.containsKey(nums[i])){
//               int pre = map.get(nums[i]);
//               if(i-pre<=k)
//                   return true;
//           }
//
//           map.put(nums[i], i);
//       }
//
//       return false;
		
		//#2
		if(nums==null || nums.length<2 || k==0) {return false;}
        
		int i=0; 
 
        HashSet<Integer> set = new HashSet<Integer>();
 
        for(int j=0; j<nums.length; j++){
            if(!set.add(nums[j])){
                return true;
            }            
 
            if(set.size()>=k+1){
                set.remove(nums[i++]);
            }
        }
 
        return false;
   }
}
