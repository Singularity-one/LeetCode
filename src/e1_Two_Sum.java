import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
給定一個整數數組和一個目標值，找出數組中和為目標值的兩個數。

你可以假設每個輸入只對應一種答案，且同樣的元素不能被重複利用。

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/


public class e1_Two_Sum {
	 public int[] twoSum(int[] nums, int target) {
		    //雙迴圈
//	        int len = nums.length;
//	        int[] result = new int[2];
//	        for(int i=0; i<len;i++){
//	            for(int j = i+1 ; j < len ; j++ ){
//	            if(nums[i] + nums[j] == target){
//	                result[0] = i;
//	                result[1] = j;
//	                return result;
//	            }
//	            }
//	        }
//	        return result;   
		 
//		 int len = nums.length;
//	        int[] result = new int[2];
//	        List list = new ArrayList<>();
//	        for(int i = 0; i < len; i++){ 
//	            int v = nums[i]; 
//	            int id = list.indexOf(target-v); if(id >= 0){
//	            result[0] = id ;
//	            result[1] = i;
//	            return result;
//	        }else {
//	            list.add(nums[i]);
//	        }
//	    }
//	    return result;
//	    }
		 
		 
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        int[] result = new int[2];
	        for (int i = 0; i < nums.length; i++) {
	            if (map.containsKey(nums[i])) {
	                int index = map.get(nums[i]);
	                result[0] = index ;
	                result[1] = i;
	                return result;
	            } else {
	                map.put(target - nums[i], i);
	            }
	        }
	        return result;
	 
}
}
