import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
public class e350_Intersection_of_Two_Arrays_II {
	public int[] intersect(int[] nums1, int[] nums2) {
		//#1 Runtime: 4 ms, faster than 24.36% 
//        List<Integer> result = new ArrayList<>();
//        Map<Integer, Integer> map1 = new HashMap<>();
//        Map<Integer, Integer> map2 = new HashMap<>();
//        for (int i : nums1) {
//            map1.put(i, map1.getOrDefault(i, 0) + 1);
//        }
//        for (int i : nums2) {
//            map2.put(i, map2.getOrDefault(i, 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
//            int key = entry.getKey();
//            if (map2.containsKey(key)) {
//                int value = Math.min(entry.getValue(), map2.get(key));
//                for (int i = 0; i < value; i++) {
//                    result.add(key);
//                }
//            }
//        }
//        int[] resultArray = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//            resultArray[i] = result.get(i);
//        }
//        return resultArray;
		
		//#2
		 Arrays.sort(nums1);
	     Arrays.sort(nums2);
	        int p1 = 0;
	        int p2 = 0;
	        List<Integer> result = new ArrayList<>();
	        while (p1 != nums1.length && p2 != nums2.length) {
	            if (nums1[p1] < nums2[p2]) {
	                p1++;
	            } else if (nums1[p1] > nums2[p2]) {
	                p2++;
	            } else {
	                result.add(nums1[p1]);
	                p1++;
	                p2++;
	            }
	        }
	        int[] resultArray = new int[result.size()];
	        for (int i = 0; i < result.size(); i++) {
	            resultArray[i] = result.get(i);
	        }
	        return resultArray;
    }
}
//https://iter01.com/301905.html
