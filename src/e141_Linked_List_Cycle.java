/*
給1串Linked List，檢查此Linked List是否有環 (Cycle)。

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

*/
public class e141_Linked_List_Cycle {
	public boolean hasCycle(ListNode141 head) {
		ListNode141 fast = head;
		ListNode141 slow = head;
	 
	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;
	 
	            if(slow == fast)
	                return true;
	        }
	 
	        return false;
	    }
}

class ListNode141 {
    int val;
    ListNode141 next;
    ListNode141(int x) {
        val = x;
        next = null;
     }
}

//參考http://glj8989332.blogspot.com/2019/08/leetcode-141-linked-list-cycle.html