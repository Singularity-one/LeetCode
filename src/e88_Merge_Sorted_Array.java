/*
兩個排序過的的整數陣列nums1與nums2，將nums2合併入nums1

注意：
nums1可以塞入兩個陣列(nums1.length = m+n)，m為nums1的元素數量，n為nums2的元素數量

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
*/

public class e88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
	    //nums2放nums1
	    for(int i = m ; i < m+n ; i++){
	            nums1[i] = nums2[index];
	            index++;
	    }

	    //泡沫排序法
	    for(int j = 0 ; j < nums1.length - 1 ; j++){
	        for(int k = j + 1 ; k < nums1.length ; k++){
	            if(nums1[j] > nums1[k]){
	                int temp = nums1[j];
	                nums1[j] = nums1[k];
	                nums1[k] = temp;
	            }
	        }
	    }
    }
}
